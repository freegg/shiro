package com.pack.controller;

import com.pack.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller  
public class UserController {
	   //在后台输出
	  private static Logger logger = Logger.getLogger(UserController.class);  
	    @Resource  
	    private UserService userService ;
	    @RequestMapping(value = "/first", method = RequestMethod.GET)
	    public String test1() {
		/*	System.out.println("JINRU");
			User user = userService.getUserById(1);
	        System.out.println(JSON.toJSONString(user));
	        logger.info(JSON.toJSONString(user));  */
		return "Login";
	    }
        @RequestMapping(value = "/tree", method = RequestMethod.GET)
        public  String tree()
        {
            return "angular";
        }
		@RequestMapping(value = "/student", method = RequestMethod.GET)
		public  String student()
		{
			return "tree";
		}
		@RequestMapping(value = "/teacher", method = RequestMethod.GET)
		public  String teacher()
		{
			return "tree";
		}
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public @ResponseBody String login(String username, String password)
		{
			System.out.println("-----------------"+username);
			System.out.println("-------------------"+password);
			Subject sub = SecurityUtils.getSubject();
			UsernamePasswordToken user = new UsernamePasswordToken(username,password);
			try {
				sub.login(user);
				return "1";
			}catch (Exception e){
				return "2";
			}
		}
}
