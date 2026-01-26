package utility;

//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	private Properties prop;

	public ReadProperties() throws IOException {

		prop = new Properties();

		// FileInputStream fis=new FileInputStream("config.properties");
		// //config.properties

		FileReader fr = new FileReader("config.properties");

		prop.load(fr);

	}

	public String getConfigProperty(String key) {

		return prop.getProperty(key);

	}



}
