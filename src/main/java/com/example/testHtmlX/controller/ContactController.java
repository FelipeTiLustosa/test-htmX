package com.example.testHtmlX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    private String firstName = "Joe";
    private String lastName = "Blow";
    private String email = "joe@blow.com";

    @GetMapping("/contact")
    public String getContact(Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        return "contact"; // Retorna o template de contato
    }

    @GetMapping("/contact/1/edit")
    public String editContact(Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        return "editForm"; // Retorna o template do formulário de edição
    }

    @PutMapping("/contact/1")
    public String updateContact(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        return "contact"; // Retorna o template de contato atualizado
    }
}
