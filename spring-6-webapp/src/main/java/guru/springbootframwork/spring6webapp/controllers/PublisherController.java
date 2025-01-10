package guru.springbootframwork.spring6webapp.controllers;

import guru.springbootframwork.spring6webapp.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController
{
    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/publishers")
    public String getPublishers(Model model)
    {
       model.addAttribute("publisher", publisherService.findAll());
       return "publishers";
    }

}
