/***************************************************************************
 * Copyright 2016-2017 by HomeDirect -
 * All rights reserved. *
 **************************************************************************/
package edu.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author : Tran Hoang Hiep Email:
 * hiep.tranhoang@homedirect.com.vn Feb
 * 3, 2017
 */
@Controller
public class WebController {

  @RequestMapping("/hello")
  @ResponseBody
  public ModelAndView hello() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("index");
    return mav;
  }
}
