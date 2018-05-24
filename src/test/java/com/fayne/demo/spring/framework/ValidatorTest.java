package com.fayne.demo.spring.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fayne.demo.spring.framework.validator.PersonInfo;
import com.fayne.demo.spring.framework.validator.ValidatorConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ValidatorConfig.class)
public class ValidatorTest {

    @Autowired
    WebApplicationContext applicationContext;

    MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void setupBefore(){
        mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
    }

    @Test
    public void testValidator() throws Exception {
        MockHttpServletRequestBuilder builder = post("/validator/persion");

        PersonInfo personInfo = new PersonInfo();
        personInfo.setAge(199);

        boolean b = objectMapper.canSerialize(personInfo.getClass());

        builder.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        builder.content(objectMapper.writeValueAsString(personInfo));
        ResultActions resultActions = mockMvc.perform(builder);
        int httpStatus = resultActions.andReturn().getResponse().getStatus();
    }
}
