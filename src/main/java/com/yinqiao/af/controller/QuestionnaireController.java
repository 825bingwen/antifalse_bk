package com.yinqiao.af.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yinqiao.af.service.IAnnouncementService;

@Controller
@RequestMapping(value = "/questionnaire")
public class QuestionnaireController {
	
	@Autowired
	private IAnnouncementService announcementService;
	
	private static Logger logger = LoggerFactory.getLogger(QuestionnaireController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
//		request.setAttribute("announcements",announcementService.selectAll());
//		request.setAttribute("text","123");
		return "questionnaire/list";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String notice(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
//		request.setAttribute("announcements",announcementService.selectAll());
//		request.setAttribute("text","123");
		return "questionnaire/index";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	@ResponseBody
	public void save(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		//request.setAttribute("announcements",announcementService.selectAll());
		//request.setAttribute("text","123");
		//return "questionnaire/questionnaire";
	}
}
