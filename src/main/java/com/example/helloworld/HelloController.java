package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World! 🌍";
    }

    @GetMapping("/api/hello/json")
    public Message helloJson() {
        return new Message("Hello World! 🌍", "Sora", "2026-09-20");
    }

    public static class Message {
        private String message;
        private String from;
        private String date;

        public Message(String message, String from, String date) {
            this.message = message;
            this.from = from;
            this.date = date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
