
package com.chandra.groceries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class groceriescontroller {

	
	
	ArrayList<groceries> groceries = new ArrayList<>(Arrays.asList(
			new groceries (1210, "suger", 45 , 2),
			new groceries (1220, "redchilly", 100, 3),
			new groceries (1230, "salt", 20 , 1)
			));
	
	//fetch all users
	
	@GetMapping("/groceries")
	List<groceries> getAllgroceries(){
		return groceries;
	}
//	Add a new Learner
	@PostMapping("/groceries")
	void addNewLearner(@RequestBody groceries thegroceries) {
		groceries.add(thegroceries);
	}
			
			
}
