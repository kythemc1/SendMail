package com.example.sendmail2;

import com.example.sendmail2.Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/sendSimpleEmail")
    public String sendSimpleEmail() {
        service.sendmail();
        return "thanh cmn cong";
    }
}
