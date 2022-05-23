package com.robin.springcloudconfigclient.controller;

import com.robin.springcloudconfigclient.configuration.DBConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope       //Tells Spring to Refresh when Actuator End Point for Refresh is called
public class GreetingsController {

    @Value("${my.greeting: default value}")
    private String greetingsMessage;

    @Value("Some Message")
    private String staticMessage;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Autowired
    private DBConfiguration dbConfiguration;

    @GetMapping("/greeting")
    public String greeting()
    {
        System.out.println("Greetings Message =" + greetingsMessage
                            + "Static Message =" + staticMessage
                            + "List Values =" + listValues.toString());
        return "my.greeting=" + greetingsMessage
                + "<br/> staticMessage=" + staticMessage
                + "<br/> databaseDetails =" + dbConfiguration.getConnection()
                + "<br/> List Values =" + listValues.toString();
    }
}