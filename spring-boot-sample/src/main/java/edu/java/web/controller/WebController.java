package edu.java.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	private final static Logger logger = Logger.getLogger(WebController.class);

	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request) {
		logger.info("User access from " + request.getRemoteAddr() + "-agent: " + request.getHeader("User-Agent"));
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}
