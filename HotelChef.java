package com.demo;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("chef")

public class HotelChef extends HotelManager{
	private String specialization;
	private int rating;
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public HotelChef(int id, String name, String specialization, int rating) {
		super(id, name);
		this.specialization = specialization;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "HotelChef [specialization=" + specialization + ", rating=" + rating + "]";
	}
	public HotelChef() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelChef(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	

}
