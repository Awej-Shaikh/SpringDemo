/*
 * package com.MiniProject.controller;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import com.MiniProject.Service.MemberService; import
 * com.MiniProject.entityClasses.Members;
 * 
 * @Controller public class LoginController {
 * 
 * @Autowired private MemberService memberService;
 * 
 * // Show login page
 * 
 * @RequestMapping("/loginlogin") public String showLoginPage() { return
 * "loginPage"; }
 * 
 * // After login attempt
 * 
 * @RequestMapping(value = "AfterLogin", method = RequestMethod.POST) public
 * String AfterLogin(@RequestParam Long id) { // Check if member exists with the
 * provided id Optional<Members> memberOptional =
 * memberService.getMemberById(id); if (memberOptional.isPresent()) { // Member
 * found, redirect to verified page return "verified"; } else { // Member not
 * found, redirect back to login page return "loginPage"; } } }
 */