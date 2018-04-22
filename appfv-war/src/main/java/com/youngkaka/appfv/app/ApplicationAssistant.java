package com.youngkaka.appfv.app;

import java.util.List;

import com.youngkaka.appfv.entities.Video;
import com.youngkaka.appfv.managers.VideoManager;

public class ApplicationAssistant {
	private static final ApplicationAssistant instance = new ApplicationAssistant();

	public static ApplicationAssistant getInstance() {
		return instance;
	}
	
	public ApplicationAssistant() {
		
	}

	
	private VideoManager videoManager = VideoManager.getInstance();
	
	
	@SuppressWarnings("unchecked")
	public List<Video> getAllVideos() {
		return (List<Video>) (List<?>) videoManager.all();
	}

	public boolean deleteVideo(String id) {
		return videoManager.delete(id);
	}

	public Video getVideo(String id) {
		// TODO Auto-generated method stub
		return (Video) videoManager.get(id);
	}

	public boolean updateVideo(Video video) {
		// TODO Auto-generated method stub
		return videoManager.update(video);
	}

	public boolean addVideo(Video video) {
		// TODO Auto-generated method stub
		return videoManager.add(video);
	}

	public boolean saveVideo() {
		// TODO Auto-generated method stub
		return videoManager.save();
	}
	
	
}
