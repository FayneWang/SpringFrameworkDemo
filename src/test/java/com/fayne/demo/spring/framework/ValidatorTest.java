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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ValidatorConfig.class)
public class ValidatorTest {

    @Autowired
    WebApplicationContext context;

    ObjectMapper mapper = new ObjectMapper();


    private MockMvc mockMvc;



    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testValidator() throws Exception {
        MockHttpServletRequestBuilder builder = post("/validator/persion");
        builder.contentType(MediaType.APPLICATION_JSON_UTF8);

        PersonInfo info = new PersonInfo();
        info.setName("the name");
        info.setAge(-1);

        builder.content(mapper.writeValueAsString(info));
        ResultActions actions = mockMvc.perform(builder);
        int status = actions.andReturn().getResponse().getStatus();
    }
}
