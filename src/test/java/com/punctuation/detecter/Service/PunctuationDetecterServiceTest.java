package com.punctuation.detecter.Service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class PunctuationDetecterServiceTest {

    @Configuration
    public static class Config{
        @Bean
        public PunctuationDetecterService PunctuationDetecterServiceTest(){

            return new PunctuationDetecterService();
        }
    }
	
	@Autowired
	PunctuationDetecterService Service;
	
	
	@Test
    public void whenParagraphIsEmptyTest(){
        int Total = Service.getTotalPunctuationCount("");
        Assert.assertEquals(0, Total);
    }
	
	@Test
    public void whenParagraphIsNotEmptyTest(){
        int Total = Service.getTotalPunctuationCount("Bonjour,");
        Assert.assertEquals(1, Total);
    }
	
	

	
}
