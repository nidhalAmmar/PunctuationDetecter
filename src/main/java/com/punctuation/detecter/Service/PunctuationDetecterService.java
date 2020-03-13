package com.punctuation.detecter.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PunctuationDetecterService {

	public int getTotalPunctuationCount(String paraghraph) {

		// the total number to be returned
		int TotalPunctuation= 0 ; 
		
		for(int i = 0; i < paraghraph.length(); i++) {
		    switch(paraghraph.charAt(i)) { 
		     case ',':
		    	 TotalPunctuation++;
		        break;
		     case '.':
		    	 TotalPunctuation++;
		        break;
		     case ';':
		    	 TotalPunctuation++;
		        break;
		     case ':':
		    	 TotalPunctuation++;
		        break;
		     case '!':
		    	 TotalPunctuation++;
		        break;
		     case '?':
		    	 TotalPunctuation++;
		        break;
		    }
		}
		
		return TotalPunctuation ; 
		
       
    }
	
}
