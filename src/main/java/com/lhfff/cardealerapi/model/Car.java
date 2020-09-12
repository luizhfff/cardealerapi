package com.lhfff.cardealerapi.model;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "Car")
@Data
public class Car {
	
	@Id @Getter private String id;
	@Getter private final String make;
	@Getter private final String model;
	@Getter private final Integer year;
	@Getter private final String bodyType;
	@Getter private final String color;
	@Getter private final Integer mileage;
	@Getter private final String drivetrain;
	@Getter private final String fuelType;
	@Getter private final String transmission;
	@Getter private final Integer seatingCapacity;
	@Getter private final Integer doors;
}
