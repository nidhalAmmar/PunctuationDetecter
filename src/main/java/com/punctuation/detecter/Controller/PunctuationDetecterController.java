package com.punctuation.detecter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	 	@RequestMapping(value = "/Count", method = RequestMethod.GET)
		@ResponseBody
	    public ResponseEntity<String> PunctuationDetecterCount(
	            @RequestParam("paraghraph")String paraghraph
	    ){


	 		if(paraghraph.equals("")){
				return new ResponseEntity<String>(
						String.format("Please insert a paraghraph"),
						HttpStatus.OK
				);
			}else {
				int Total = Service.getTotalPunctuationCount(paraghraph);

				return new ResponseEntity<String>(
						String.format(""+Total),
						HttpStatus.OK
				);
			}


	    }
	
}
