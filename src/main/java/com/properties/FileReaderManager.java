package com.properties;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
	}

	public static FileReaderManager getInstanceFileReaderManager() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	public Configuration getInstanceConfiguration() throws IOException {
		Configuration cf = new Configuration();
		return cf;
	}


}
