package com.xhl.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhl.springmvc.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg,DemoObj obj) {
		throw new IllegalArgumentException("�ǳ���Ǹ����������/"+"����@ModelAttribute:"+msg);
	}
}
