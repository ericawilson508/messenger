package org.erica.restful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message {
	
	private long id;
	private String author;
	private String message;
	private Date datecreated;
	
	public Message() {
		
	}
	
	public Message(long id,String author,String message) {
		this.id=id;
		this.author=author;
		this.message=message;
		this.datecreated=new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

}
