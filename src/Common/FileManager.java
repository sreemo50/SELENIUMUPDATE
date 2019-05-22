package Common;
public class FileManager {
	
	private static FileManager fileReaderManager = new FileManager();
	private static ConfigReader configFileReader;
 
	private FileManager() {
	}
 
	 public static FileManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public ConfigReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigReader() : configFileReader;
	 }

}
