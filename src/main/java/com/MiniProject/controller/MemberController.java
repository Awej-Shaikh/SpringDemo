package com.MiniProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.Service.MemberService;
import com.MiniProject.entityClasses.Members;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberservice;

	/*
	 * @RequestMapping("/login") public String showLogin() { return "show"; }
	 * 
	 * @RequestMapping(value = "/check", method = RequestMethod.POST) public String
	 * saveTheLogin(@ModelAttribute("Members") Members members) {
	 * memberservice.saveMember(members); return "showTheLogin"; }
	 */
	// Getting All data
	@GetMapping("/getAll")
	public List<Members> gettingAllData() {
		return memberservice.getttingData();

	}

	// POsting or save data
	@PostMapping("/posting")
	public Members saveingData(@RequestBody Members m) {
		return memberservice.savingData(m);
	}

	@GetMapping("/userone")
	public String getUser()
	{
		return"User one Hiiiii";
	}
	@GetMapping("/usertwo")
	public String gettwo()
	{
		return"User two Hiiiii";
	}
	
	
	// Delete Data
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable Long id) {
		memberservice.deleteRecord(id);
		System.out.println("Deleted");
		return "Deleted";
	}

	@GetMapping("/address/{name}")
	public List<Members> addDataGet(@PathVariable String name) {
		return memberservice.gettingData(name);

	}

}
