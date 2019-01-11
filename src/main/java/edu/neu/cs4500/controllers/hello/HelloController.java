package edu.neu.cs4500.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the '/aip/hello/' API, returns data related to the Hello World part of the
 * application.
 */
@RestController
public class HelloController {

    /**
     * Returns a String literal for the API below.
     * @return The String saying hello
     */
    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello CS4500!";
    }

    /**
     * Returns a Java Object with a hello message for the API below.
     * @return The Java HelloObject
     */
    @RequestMapping("/api/hello/object")
    public HelloObject sayHelloObject() {
        HelloObject obj = new HelloObject("Hello Object CS4500!");
        return obj;
    }
}
