package com.in28minutes.springboot.myfirstwebapplication.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {

	private int id;
	public String username;
	@Size(min=10, message="Enter atlist 10 chracter")
	private String Description;
	public LocalDate targetDate;
	public Boolean Done;

	public Todo(int id, String username, String description, LocalDate targetDate, Boolean done) {
		super();
		this.id = id;
		this.username = username;
		Description = description;
		this.targetDate = targetDate;
		Done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public Boolean getDone() {
		return Done;
	}

	public void setDone(Boolean done) {
		Done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", Description=" + Description + ", targetDate="
				+ targetDate + ", Done=" + Done + ", getId()=" + getId() + ", getUsername()=" + getUsername()
				+ ", getDescription()=" + getDescription() + ", getTargetDate()=" + getTargetDate() + ", getDone()="
				+ getDone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
