package com.github.nurs.service;

import com.github.nurs.model.Messenger;

public interface MessageService {
	Messenger getMessageById(String msgId);
}
