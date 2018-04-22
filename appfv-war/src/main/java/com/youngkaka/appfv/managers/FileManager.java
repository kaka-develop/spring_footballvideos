package com.youngkaka.appfv.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class FileManager {

	private static final FileManager instance = new FileManager();
	private ApplicationContext appContext;

	public static FileManager getInstance() {
		return instance;
	}

	private FileManager() {
		appContext = new ClassPathXmlApplicationContext();

	}

	public static void main(String[] args) throws IOException {
		FileManager manager = new FileManager();
		manager.writeTextToFile(FileManager.FILE_NAME, "Hello world");
		String text = manager.readTextFromFile(FileManager.FILE_NAME);
		System.out.println(text);
	}

	public final static String FILE_PATH = "classpath:com/youngkaka/appfv/data/";
	// public final static String FILE_PATH =
	// "src/main/java/com/youngkaka/appfv/data/";
	public final static String FILE_NAME = "videos.json";

	private boolean writeTextToFile(String fileName, String text) {
		String path = FILE_PATH + fileName;
		Resource resource = appContext.getResource(path);

		try {
			PrintWriter writer = new PrintWriter(resource.getFile(), "UTF-8");
			writer.print(text);
			writer.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private String readTextFromFile(String fileName) throws IOException {

		String text = "";
		String path = FILE_PATH + fileName;
		Resource resource = appContext.getResource(path);
		try {
			InputStream is = resource.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			text = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public boolean saveJson(String json, String fileName) {
		return writeTextToFile(fileName, json);
	}

	public String loadJson(String fileName) throws IOException {
		return readTextFromFile(fileName);
	}

}
