package com.github.nurs.mappers;

import com.github.nurs.model.Messenger;
import org.apache.ibatis.annotations.Select;

public interface MessageMapper {
		
	@Select("SELECT message FROM messenger WHERE id = 1")
	public Messenger getMessageById(String msgId);

}
