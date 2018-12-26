package com.count.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.count.Service.HomeService;
import com.count.domain.Record;

@RequestMapping("/account")
public class HomeController {
	
	@Autowired HomeService homeService;
	
	@GetMapping(path="/login")
	public String login(@RequestParam String userName, @RequestParam String password, 
			HttpServletRequest request, HttpServletResponse response , Model model) {
		
		
		return "login";
	}
	
	@PostMapping(path="/login")
	public String loginPost(@RequestParam String userName, @RequestParam String password, 
			HttpServletRequest request, HttpServletResponse response , Model model) {
		
		//check the username and password here; this is only temporary check
		
		if(userName.equals("userName here") && password.equals("password here")) 
		
		return "home-page";
		else 
			return "redirect: /login";
	}
	
	
	/**
	 * To get all the list of records from the database.
	 * @return
	 */
	@GetMapping("/getlist")
	public String getRecords(HttpServletRequest request, HttpServletResponse response , Model model) {
		//once the credential is valid, call the database and get the records.
		//then put the records in to the modelattribute object and pass to the jsp page
		
		List<Record> recordList = homeService.getRecords();
		model.addAttribute("records", recordList);
		return "list";
	}

}
