package com.nt.beans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Car {
	private String regNo;
	private String ownerName;
	private String color;
	private String type;
	private String engineCC;
	private String fuelType;
	private String makeCompany;
	private String modelName;
	private String variant;
}
