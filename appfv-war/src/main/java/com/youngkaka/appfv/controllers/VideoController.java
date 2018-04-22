package com.youngkaka.appfv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.youngkaka.appfv.app.ApplicationAssistant;
import com.youngkaka.appfv.entities.Video;

@Controller
@RequestMapping("/admin/videos")
public class VideoController {
	
	private ApplicationAssistant assistant =ApplicationAssistant.getInstance();
	
	@RequestMapping(value="")
	public String videos(Model model){
		model.addAttribute("videos", assistant.getAllVideos());
		return "admin/videos";
	}
	
	@RequestMapping(value="/save")
	public ModelAndView saveVideos(@Validated Video video){
		assistant.saveVideo();
		return new ModelAndView("redirect:" + "/admin/videos");
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String newVideo(){
		return "admin/new-video";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ModelAndView newVideo(@Validated Video video){
		assistant.addVideo(video);
		return new ModelAndView("redirect:" + "/admin/videos");
	}
	
	@RequestMapping(path="/del/{id}", method=RequestMethod.GET)
	public ModelAndView deleteVideo(@PathVariable String id){
		assistant.deleteVideo(id);
		return new ModelAndView("redirect:" + "/admin/videos");
	}
	

	@RequestMapping(path="/videos/update/{id}", method=RequestMethod.GET)
	public String updateVideo(@PathVariable String id,Model model){
		model.addAttribute("video",assistant.getVideo(id));
		return "admin/update-video";
	}
	
	@RequestMapping(value="/videos/update", method=RequestMethod.POST)
	public ModelAndView updateVideo(@Validated Video video){
		assistant.updateVideo(video);
		return new ModelAndView("redirect:" + "/admin/videos");
	}
}
