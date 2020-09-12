package com.lhfff.cardealerapi.model;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document( collection = "Post")
@Data
public class Post {

	@Getter
	private Car car;
	private ArrayList<String> images;
	private ArrayList<String> highlights;
	private String description;
	private Long price;
	private ArrayList<Long> priceHistory;
}
