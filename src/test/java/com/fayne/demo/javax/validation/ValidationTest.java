package com.fayne.demo.javax.validation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ValidationConfig.class)
public class ValidationTest {

    @Autowired
    WebApplicationContext context;

    ObjectMapper mapper = new ObjectMapper();


    private MockMvc mockMvc;



    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testValidationConstraints() {

        MockHttpServletRequestBuilder builder = post("/validation/persion");
        builder.contentType(MediaType.APPLICATION_JSON_UTF8);

        Person info = new Person();
        info.setName("the name");
        info.setAge(102);
        info.setStudent(true);

        try {
            builder.content(mapper.writeValueAsString(info));
        } catch (JsonProcessingException e) {
            String error = e.getMessage();
        }

        ResultActions actions = null;
        try {
            actions = mockMvc.perform(builder);
        } catch (Exception e) {
            String error = e.getMessage();
        }
        int status = actions.andReturn().getResponse().getStatus();
        Assert.assertTrue(status == HttpStatus.BAD_REQUEST.value());
    }
}
