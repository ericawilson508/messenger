package org.erica.restful.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.erica.restful.model.Message;
import org.erica.restful.model.Profiles;

public class Database {
	private static Map<Long, Message> messages=new HashMap<>();
	private static Map<Long, Profiles> profiles =new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
		
		public static Map<Long,Profiles> getProfiles(){
			return profiles;
		}
		
		public void TestDatabase() {


			System.out.println("values changed by mrchitiboy");

			System.out.println("values changed by erica and Luther");


			System.out.println("Testing it once more");
			System.out.println("learning to use git");
			System.out.println("add");
		}
	}

	

