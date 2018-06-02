package org.erica.restful.messenger.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.erica.restful.model.Profiles;
import org.erica.restful.service.ProfileService;

@Path("/profiles")
public class ProfileResource {
	
	@GET
	public List<Profiles> getallprofiles(){
		
		return ProfileService.getallprofiles();
		
	}
	
	
	

}
