package com.cts.project.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.user.dao.UserRepository;
import com.cts.project.user.email.EmailService;
import com.cts.project.user.pojos.User;
@CrossOrigin(origins="*") 
@RequestMapping("/user")
@RestController
public class UserController 
{
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/getAllUsers")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	 @Autowired

	   private EmailService emailService;

	 @PostMapping("/saveUser")

	 public User saveUser(@RequestBody User user) {

	 System.out.println(user);

	 userRepository.save(user);



	 StringBuffer mailContain= new StringBuffer();

	 mailContain.append("Hi "+user.getUsername()+"\n");

	 mailContain.append("Please Click on Below Click to Confirm Your Email With Us\n");

	 mailContain.append("<a href='http://localhost:8081/user/confirmEmail/"+user.getEmail()+">Click</a>\n");

	 mailContain.append("Thanks And Regards\n CTS Participant\n");



	 emailService.sendMail(user.getEmail(),"Email Confirmation", mailContain.toString());



	    //emailService.sendPreConfiguredMail("Ho ho ho");




	 return user;

	 }
	 @GetMapping("/confirmEmail/{emailId}")

	 public User confirmEmail(@PathVariable("emailId") String emailId)

	 {

	 Optional<User> user= userRepository.findByEmail(emailId);

	 if(user!=null && user.get()!=null)

	 {

	  User u=user.get();

	  u.setConfirm("yes");

	  userRepository.save(u);

	  return u;



	 }

	 return user.get();

	 }
	@PutMapping("/updateUser/{username}")
	public User updateUser(@RequestBody User user, @PathVariable("username") String username)
	{
		user.setUsername(username);
		System.out.println(user);
		userRepository.save(user);
		return user;	
	}
	@DeleteMapping("/deleteUser/{username}")

	public Boolean deleteCompany( @PathVariable("username") String username) {



		 System.out.println(username);

		 userRepository.deleteById(username);

		 return true;

		 }



	 @GetMapping("/findOneInAll6/{username}")

	 public User findoneinall(@PathVariable("username") String username) {



	 Optional<User> user = userRepository.findById(username);

	 return user.get();



	 }
	 
	 
	 @GetMapping("/findByUsernameAndPassword/{username}/{password}")

	 public User findByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password)

	 {

		 User user= userRepository.findByUsernameAndPasswordAndConfirm(username, password,"yes");

		 
	 return user;

	 }
}
