package com.infocrafts.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonHelper {

	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private Date date = new Date();

	private static Properties masterProperty;

	public static String envName;

	private static String accessToken;

	public static void setMasterProperty(Properties property) {
		masterProperty = property;
		envName = masterProperty.getProperty("Environment");
	}

	public static Properties getMasterProperty() {
		return masterProperty;
	}

	public static String getBaseUrl() {
		return masterProperty.getProperty("baseURL");
	}

	public static String getResourceFolderPath() {
		return System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
				+ "resources" + File.separator + "pestreamJson" + File.separator;
	}

	public static String getPrettyJsonFormat(String jsonString) {
		JsonParser parser = new JsonParser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = "";
		if (jsonString.startsWith("{")) {
			JsonObject json = parser.parse(jsonString).getAsJsonObject();
			prettyJson = gson.toJson(json);
		} else if (jsonString.startsWith("[")) {
			JsonArray json = parser.parse(jsonString).getAsJsonArray();
			prettyJson = gson.toJson(json);
		} else {
			prettyJson = "Not in proper json format";
		}
		return prettyJson;
	}

	public static synchronized Map<String, String> readJsonElement(String jsonFileName, String elementName)
			throws Exception {
		String filePath = JsonHelper.getResourceFolderPath() + jsonFileName;
		JsonElement root = new JsonParser().parse(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
		JsonObject jsonObject = root.getAsJsonObject();
		JsonElement some = jsonObject.get(elementName);
		Type type = new TypeToken<Map<String, String>>() {
		}.getType();
		Gson gson = new Gson();
		Map<String, String> myMap = gson.fromJson(some, type);
		return myMap;
	}

	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)), "UTF-8");
		return data;
	}

	public String getCurrentDate() {
		return dateFormat.format(new Date()) + "T00:00:00.000";
	}

	public String getFutureDate(int daysInFuture) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, +daysInFuture);
		return dateFormat.format(calendar.getTime()) + "T00:00:00.000";
	}

	public String getPastDate(int daysInPast) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, +daysInPast);
		return dateFormat.format(calendar.getTime()) + "T00:00:00.000";
	}

	public static String getDateTimeStamp() {
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	public static String gettimestamp_MMM_dd_hh_mm_ampm_timezone() {
		String timeStamp = new SimpleDateFormat("MMM_dd_hh_mm_a_z").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

	public Boolean checkValidDate(String date, String dateFormat) {
		if (date == null) {
			return false;
		}
		if (dateFormat == null) {
			dateFormat = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
		try {
			sdf.parse(date);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public String getTodaysDate() {
		return dateFormat.format(new Date());
	}

	public String getPastorFutureDate(String actualDate, String days) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		if (actualDate == null) {
			calendar.setTime(date);
		} else {
			calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(actualDate));
		}
		calendar.add(Calendar.DATE, +Integer.parseInt(days));
		return dateFormat.format(calendar.getTime());
	}

	public static Map<String, String> overrideJSON(Map<String, String> allData, Map<String, String> dataToOverride) {
		for (Map.Entry<String, String> dataToOverrideKeys : dataToOverride.entrySet())
			allData.put(dataToOverrideKeys.getKey(), dataToOverride.get(dataToOverrideKeys.getKey()));
		return allData;
	}

	public static String getCurrentDate(String dateFormat) throws Exception {
		DateFormat format = new SimpleDateFormat(dateFormat);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 0);
		return format.format(calendar.getTime());
	}

	public Boolean isPastDate(String dateToCheck) throws ParseException {
		Date today = dateFormat.parse(dateFormat.format(new Date()));
		Date date = dateFormat.parse(dateToCheck);
		if (!date.after(today)) {
			return true;
		}
		return false;
	}

	public String firstDayOfCurrentMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		return dateFormat.format(calendar.getTime());
	}

	public String lastDayOfCurrentMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		return dateFormat.format(calendar.getTime());
	}

	public String firstDayOfLastMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return dateFormat.format(calendar.getTime());
	}

	public String firstDayOfPreviousMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return dateFormat.format(calendar.getTime());
	}

	public String firstDayOfPreviousTwoMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -2);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		return dateFormat.format(calendar.getTime());
	}

	public String lastDayOfNextMonth() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return dateFormat.format(calendar.getTime());
	}

	public List<Map<String, String>> createParticipantData(String name, String id) {
		List<Map<String, String>> listReturn = new ArrayList<Map<String, String>>();
		Map<String, String> participantMap = new HashMap<String, String>();
		participantMap.put("AccountName", name);
		participantMap.put("AccountId", id);
		participantMap.put("EffectiveStartDate", "programstartdate");
		participantMap.put("EffectiveEndDate", "programenddate");
		listReturn.add(participantMap);
		return listReturn;
	}

	public String updateDateFormat(String date, String seperator) {
		String updatedDate = null;
		String[] arrValues = date.split(seperator);
		for (String value : arrValues) {
			if (value.length() == 1) {
				value = "0" + value;
			}
			if (updatedDate == null) {
				updatedDate = value;
			} else {
				updatedDate = updatedDate + seperator + value;
			}
		}

		return updatedDate;
	}

}
