package com.punctuation.detecter.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest
@RunWith(SpringRunner.class)
public class PunctuationDetecterControllerTest {

	@Autowired
	MockMvc mockMvc ; 
	
	
	@Test
    public void PunctuationDetecterTest200Ok() throws Exception {
        String para = "Bonjour,";

        mockMvc.perform(
                get("/PunctuationDetecter/Count")
                .param("paraghraph", para)
        ).andExpect(
                status().isOk()
        ).andExpect(
                content().string(containsString(
                        String.format(""+1)
                ))
        );

    }
	
}
