package org.erica.restful.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.erica.restful.messenger.database.Database;
import org.erica.restful.model.Message;

public class MessageService {
	
	public Map<Long,Message> messages=Database.getMessages();
	
	public MessageService() {
	
	messages.put(1L,new Message(1L,"Erica","Hello Chiti"));
	messages.put(2L,new Message(2L,"LUther","Hello puppy"));
	
	}

	
	public List<Message> getallmessages(){
		
		return  new ArrayList(messages.values());
		
		
	}
	
	
	public Message get(long id ) {
		
		return messages.get(id);
		
		
	}
	
	
	public Message addMessage(Message message) {
		message.setId((long) (messages.size()+1));
		
		messages.put(message.getId(), message);
		 return message;
		
	}

}
