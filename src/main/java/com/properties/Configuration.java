package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static Properties p;
	public Configuration() throws IOException {
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\Open_Mrs\\src\\main\\java\\com\\properties\\OpenMrs.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getusername() {
	String username = p.getProperty("username");
	return username;
	}
	public String getpassword() {
	String password = p.getProperty("password");
	return password;
	}
	public String getgname() {
		String gname = p.getProperty("gname");
		return gname;
		}
	public String getfname() {
		String fname = p.getProperty("fname");
		return fname;
		}
	public String getgdate() {
		String date = p.getProperty("date");
		return date;
		}
	public String getmonth() {
		String month = p.getProperty("month");
		return month;
		}
	public String getyear() {
		String year = p.getProperty("year");
		return year;
		}
	public String getaddress() {
		String address = p.getProperty("address");
		return address;
		}
	public String getcity() {
		String city = p.getProperty("city");
		return city;
		}
	public String getstate() {
		String state = p.getProperty("state");
		return state;
		}
	public String getcountry() {
		String country = p.getProperty("country");
		return country;
		}
	public String getpin() {
		String pin = p.getProperty("pin");
		return pin;
		}
	public String getmobile() {
		String mobile = p.getProperty("mobile");
		return mobile;
		}
	public String getmessage() {
		String message = p.getProperty("message");
		return message;
		}
	public String getheight() {
		String height = p.getProperty("height");
		return height;
		}
	public String getweight() {
		String weight = p.getProperty("weight");
		return weight;
		}
	public String gettextmessage() {
		String textmessage = p.getProperty("textmessage");
		return textmessage;
		}
}
