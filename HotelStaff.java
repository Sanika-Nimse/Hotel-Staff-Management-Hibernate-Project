package com.demo;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("staff")

public class HotelStaff extends HotelManager{
private String duration;
private String Shift;
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getShift() {
	return Shift;
}
public void setShift(String shift) {
	Shift = shift;
}
public HotelStaff(int id, String name, String duration, String shift) {
	super(id, name);
	this.duration = duration;
	Shift = shift;
}
@Override
public String toString() {
	return "HotelStaff [duration=" + duration + ", Shift=" + Shift + "]";
}
public HotelStaff() {
	super();
	// TODO Auto-generated constructor stub
}
public HotelStaff(int id, String name) {
	super(id, name);
	// TODO Auto-generated constructor stub
}

}