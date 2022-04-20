package com.blz.firstspringapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")

public class HelloWebController {

        @GetMapping("/message")
        public String message() {
            return "Hello From BridgeLabz";
        }

        @GetMapping("/query")
        public String sayHello(@RequestParam String name) {
            return "Hello "+name+" From BridgeLabz";
        }

    }

