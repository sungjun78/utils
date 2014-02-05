package com.whereami.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whereami.web.utils.JSONParser;
import com.whereami.web.vo.WhereamiInfoVO;
import com.whereami.web.service.WhereamiService;

@RequestMapping ("/")
@Controller
public class whereamicontroller {
	
	//@Autowired
	//private WhereamiService whereamiService;
	
	@RequestMapping ("/whereami")
	public String whereami() {
		return "whereami";
	}
	
	/**
	 * getLogin
	 * 
	 */
	@RequestMapping(value="/test")
	@ResponseBody
	public String test(@RequestParam("whereamiinfo") String whereamiinfo)throws Exception{
		
		String result = "";
		
		Map<String, Object> arg = new HashMap<String, Object>();
		
		
		// 쿼리 성공
		arg.put("return", "F");
		arg.put("fail_code", "-3");
		result = JSONParser.marshallingJson(arg);
		
		System.out.println("JSON RESULT : ");
		System.out.println(result);		

		return result;
	}		
	
	
	/**
	 * getLogin
	 * 
	 */
	/*
	@RequestMapping(value="/getLogin")
	@ResponseBody
	public String getLogin(@RequestParam("whereamiinfo") String whereamiinfo)throws Exception{
		
		WhereamiInfoVO naiVO = JSONParser.unmarshallingJson(whereamiinfo, WhereamiInfoVO.class);
		
		WhereamiInfoVO naVO = whereamiService.logincheckInfo(naiVO);
		
		String result = "";
		
		Map<String, Object> arg = new HashMap<String, Object>();
		
		
		// 쿼리 성공
		if ( naVO != null)
		{
			// 암호 확인
			if ( naVO.getPWD().equals(naiVO.getPWD()) ) { 
				arg.put("return", "S");
				arg.put("fail_code", "1");
				
			}
			else
			{
				arg.put("return", "F");
				arg.put("fail_code", "-6");			
			}

			result = JSONParser.marshallingJson(arg);		
		}
		else
		{
			arg.put("return", "F");
			arg.put("fail_code", "-3");
			result = JSONParser.marshallingJson(arg);
		}
		
		System.out.println("JSON RESULT : ");
		System.out.println(result);		

		return result;
	}		
	*/

}
