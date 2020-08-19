package com.keshav.covidcase.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "covidcase")
public class Covidcase {
	@Id
	private String id;
	private int sno;
	private String date;
	private String time;
	private String confirmedindiannational;
	private String confirmedforeignnational;
	private int cured;
	private int deaths;
	private int confirmed;
	private String state;

	public Covidcase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Covidcase(int sno, String date, String time, String confirmedindiannational, String confirmedforeignnational,
			int cured, int deaths, int confirmed, String state) {
		super();
		this.sno = sno;
		this.date = date;
		this.time = time;
		this.confirmedindiannational = confirmedindiannational;
		this.confirmedforeignnational = confirmedforeignnational;
		this.cured = cured;
		this.deaths = deaths;
		this.confirmed = confirmed;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getConfirmedindiannational() {
		return confirmedindiannational;
	}

	public void setConfirmedindiannational(String confirmedindiannational) {
		this.confirmedindiannational = confirmedindiannational;
	}

	public String getConfirmedforeignnational() {
		return confirmedforeignnational;
	}

	public void setConfirmedforeignnational(String confirmedforeignnational) {
		this.confirmedforeignnational = confirmedforeignnational;
	}

	public int getCured() {
		return cured;
	}

	public void setCured(int cured) {
		this.cured = cured;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
