package com.wadestevens.localevents.controller;

import com.wadestevens.localevents.data.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Welcome to Local Events!");
        model.addAttribute("events", eventRepository.findAll());
        return "events/index";
    }
}
