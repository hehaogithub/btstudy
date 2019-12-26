package com.hh.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@Api(value="Hello控制器配置",tags="xxx")
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	@ApiOperation(value ="测试json",notes ="无输入参数" )
	public String sayHello() {
		return "login";
	}
}
