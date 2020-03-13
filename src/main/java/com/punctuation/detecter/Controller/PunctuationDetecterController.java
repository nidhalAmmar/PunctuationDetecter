package com.punctuation.detecter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.punctuation.detecter.Service.PunctuationDetecterService;

@RestController
@RequestMapping("/PunctuationDetecter")
public class PunctuationDetecterController {


	@Configuration
	public static class Config{
		@Bean
		public PunctuationDetecterService PunctuationDetecterServiceController(){

			return new PunctuationDetecterService();
		}
	}

	@Autowired
	public PunctuationDetecterService Service;
	
	 @GetMapping("/Count")
	    public ResponseEntity<String> PunctuationDetecterCount(
	            @RequestParam("paraghraph")String paraghraph
	    ){

	 		if(paraghraph.equals("")){
				return new ResponseEntity<>(
						String.format("Please insert a paraghraph "),
						HttpStatus.OK
				);
			}else {
				int Total = Service.getTotalPunctuationCount(paraghraph);

				return new ResponseEntity<>(
						String.format("the total count of Punctuation marks "
								+ "in your paraghraph is  %s ", Total),
						HttpStatus.OK
				);
			}


	    }
	
}
