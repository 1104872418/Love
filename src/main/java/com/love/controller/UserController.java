package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制层
* @ClassName: UserController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Mr.Dong
* @date 2017年7月25日 下午3:32:10
 */
@Controller
public class UserController {

	@ResponseBody
	@RequestMapping("/")
	public String sayHi(){
		return "Hello,World!";
	}
}
