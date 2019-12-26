package com.hh.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Api(value="Hello控制器配置",tags="xxx")
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	@ApiOperation(value ="测试json",notes ="无输入参数" )
	public String sayHello() {
		return "login";
	}
	@RequestMapping("/json")
	@ResponseBody
	public Map<String,String> getJson(){
		Map<String,String> map=new HashMap<>();
		map.put("name","小明");
		map.put("age","23");
		return map;
	}
}
