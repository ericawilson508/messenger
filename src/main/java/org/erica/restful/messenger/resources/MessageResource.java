package org.erica.restful.messenger.resources;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.erica.restful.model.Message;
import org.erica.restful.service.MessageService;
import org.erica.restful.service.ProfileService;


@Path("/messages")
public class MessageResource {
	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessageResource()
	{		
		
		return service.getallmessages();
		
		 
}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getSingleMessage(@PathParam("messageId")Long messageId) {
		
		return service.get(messageId);
		 
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return service.addMessage(message);
	}
	
	
	

}
