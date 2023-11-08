package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFetch {
//public static final String PropertyFetch = null;

public String fetchdata(String Key) throws Exception 
{
	FileInputStream fis=new FileInputStream("C:\\Users\\HX-31\\eclipse-workspace\\com.hxtra.hirextra\\src\\test\\resources\\properties\\credentials.PROPERTIES");
	Properties po=new Properties();
	po.load(fis);
	String data=po.getProperty(Key);
	return Key;
	}
}
