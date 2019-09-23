package com.selftraining.springboot.MVCExample;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MVCSimpleControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(new MVCSimpleController()).build();
    }

    @Test
    public void basicTest() throws Exception {
        this.mockMvc
                .perform(
                        get("/welcome").accept(
                                MediaType.parseMediaType("Application/html; charset=UTF-8")
                            )
                        )
                .andExpect(status().isOk())
                .andExpect(content().contentType("Application/html; charset=UTF-8"))
                .andExpect(content().string("Welcome to SpringMVC - Simple Controller Demo"));
    }
}
