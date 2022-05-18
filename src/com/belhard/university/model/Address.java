package com.belhard.university.model;

public class Address {

	private String City;
	private String Street;
	private int House;
	private int Flat;
	private String Address;

	public Address(String City, String Street, int House, int Flat) {
		this.City = City;
		this.Street = Street;
		this.House = House;
		this.Flat = Flat;
		this.Address = new String(City + " " + Street + " " + House + "-" + Flat);
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getHouse() {
		return House;
	}

	public void setHouse(int house) {
		House = house;
	}

	public int getFlat() {
		return Flat;
	}

	public void setFlat(int flat) {
		Flat = flat;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}

