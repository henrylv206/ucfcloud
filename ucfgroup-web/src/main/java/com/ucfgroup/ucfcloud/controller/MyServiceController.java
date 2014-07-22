/**
 * 
 */
package com.ucfgroup.ucfcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * My Service Controller
 * 
 * @author HenryLv
 *
 * @since 2014-7-17
 */
@Controller
@RequestMapping("/myservice")
public class MyServiceController {

	@RequestMapping("/listTemplateType")
	@ResponseBody
	public String listTemplateType() {
		
		
		return null;
	}
}
