package com.demo;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity  
@Table(name = "hotel2025")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "hoteltype",discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue("manager")

public class HotelManager {
	@Id
	@GeneratedValue(generator="increment")
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public HotelManager(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "HotelManager [id=" + id + ", name=" + name + "]";
}
public HotelManager() {
	super();
	// TODO Auto-generated constructor stub
}

}
