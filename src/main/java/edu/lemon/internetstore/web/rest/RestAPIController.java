package edu.lemon.internetstore.web.rest;

import edu.lemon.internetstore.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/greet")
public class RestAPIController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping({"/{userName}"})
    public String greetingsPersonal(@PathVariable(name = "userName", required = false) String name){
        String username = greetingService.generateGreeting(name);
        return "Hello " + username;
    }

    @GetMapping("/")
    public String greetingsToUserList(@RequestParam(defaultValue = "World") List<String> userName){
        return "Hello " + userName;
    }

    @PostMapping("/details")
    public String greetingsToUserWithDetails(@RequestParam(defaultValue = "World") Map<String, String> name){
        return "Hello, user, your params are: " + name.entrySet();
    }

















}
