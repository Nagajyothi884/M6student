package genricLibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesUtilorlib 
{
	public String getDatafromproperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstantutility.Propertiespath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info=pobj.getProperty(data);
		return info;
	}

}
