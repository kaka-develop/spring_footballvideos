package com.youngkaka.appfv.managers;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.youngkaka.appfv.entities.Video;

public class VideoManager extends AbstractManager{
	
	public static void main(String[] args) {
		VideoManager manager = VideoManager.getInstance();
	
	}
	
	private static final VideoManager instance = new VideoManager();

	public static VideoManager getInstance() {
		return instance;
	}
	
	private VideoManager() {
		super();
	}


	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return "videos.json";
	}

	@Override
	Type getListType() {
		Type listType = new TypeToken<Map<String,Video>>() {
		}.getType();
		return listType;
	}

	@Override
	boolean validateID(String id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	void loadDefaultData() {
		// TODO Auto-generated method stub
		add(new Video("V001","Chelsea", "Really","ssss",8, "C001", "8.1", "ss"));
		add(new Video("V002","Chelsea", "Really","ssss",8, "C001", "8.1", "ss"));
	}
	
}
