package com.github.nurs.service;

import com.github.nurs.model.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.nurs.mappers.MessageMapper;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;

	public Messenger getMessageById(String msgId) {
		Messenger student = messageMapper.getMessageById(msgId);
		
		if(student != null) {
			return student;
		}
		return null;
	}
}
