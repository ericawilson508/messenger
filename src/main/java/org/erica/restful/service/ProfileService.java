package org.erica.restful.service;

import java.util.ArrayList;
import java.util.List;

import org.erica.restful.model.Profiles;

public class ProfileService {
	public static List<Profiles> getallprofiles(){
		ArrayList<Profiles> pro=new ArrayList<Profiles>() ;
			
		pro.add(new Profiles(1,"Erica Wilson","San Jose"));
		pro.add(new Profiles(2,"Luther James","San Jose"));
		pro.add(new Profiles(3,"Smitha James","Connecticut"));
		pro.add(new Profiles(4,"Nigel Wilson","Belagaum"));
		pro.add(new Profiles(5,"Harsha Katriya","Banglore"));
		
		return pro;
		
	}
  public String profileService() {
	return "Hello Chiti";
}
}
