package com.highlapp.restserver.web;

import com.highlapp.restserver.classes.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ServerController {
    private static final Logger log = LoggerFactory.getLogger(ServerController.class);

    @RequestMapping("/api")
    public List<Response> onRequest(@RequestParam(value = "ncname", defaultValue = "User") String name) {
        log.info("REST API requested!");
        Response response1 = new Response(name);
        Response response2 = new Response("Stachu");

        return Arrays.asList(response1, response2);
    }
}
