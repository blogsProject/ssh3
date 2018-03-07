package com.luotianyi.test3.web;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Welcome extends ActionSupport {

	public String index() {
		return "success";
	}
}
