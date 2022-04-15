package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Front.Details;


@Service 
public class Detail_service_impl implements Detail_service {

	
	List<Details> list; 
	public Detail_service_impl() {
		list  = new ArrayList<>(); 
		list.add(new Details("john_doe" , "john@xyz.com", "ABCD123" , "1353" , "AR"));
	}
    
@Override
	public Details add_details(Details details) {
		list.add(details); 
		return details;
	}

}
