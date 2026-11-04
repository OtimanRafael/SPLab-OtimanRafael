package ro.uvt.info.splabotimanrafael2026.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.info.splabotimanrafael2026.difexamples.ClientComponent;

@RestController
public class HelloController {

    private final ClientComponent clientComponent;

    @Autowired
    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot<br>Hello from ClientComponent = " + clientComponent.toString();
    }
}