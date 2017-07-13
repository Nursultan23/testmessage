package com.github.nurs.controller;

import com.github.nurs.model.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.nurs.service.MessageService;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/message")
public class MessagetController {
	
	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/getMessage")
	public @ResponseBody Messenger getMessage() {
		Messenger msg = messageService.getMessageById("1");
		System.out.println(msg.getMessage()+" ======================================");
		return msg;
	}

	@RequestMapping(value = "/test")
	public @ResponseBody List<String> getMsg(){
		return new ArrayList<String>();
	}
}



