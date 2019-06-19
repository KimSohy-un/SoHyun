package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HeloController 
{
	/**
	 * 	@fn		
	 *	@brief	
	 *	@details
	 *
	 *	@author	김소현
	 *	@date	2019-05-16
	 
	 *	@param
	 *	@remark
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam(value="sum", required=false)double sum,
			ModelAndView mav) {
		
		for(int i=0; i<=1000; i++) {
			if(i%2==1) {
				sum=sum+1;
			}
		}
		
		mav.addObject("res", sum);
		mav.setViewName("index");
		return mav;
	}
}
