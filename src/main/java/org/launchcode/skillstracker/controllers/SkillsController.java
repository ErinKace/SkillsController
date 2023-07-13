package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping()
    public String displaySkills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScrip</li>" +
                "<li>CSS</li>" +
                "<li>HTML</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label for='name'>Name</label>"+
                "<input type='text' name='name'>" +
                "<label for='firstLanguage'>My First Favorite Language is:</label>" +
                "<select name='firstLanguage'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='css'>CSS</option>" +
                    "<option value='html'>HTML</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<label for='secondLanguage'>My Second Favorite Language is:</label>"+
                "<select name='secondLanguage'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='css'>CSS</option>" +
                    "<option value='html'>HTML</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<label for='thirdLanguage'>My Third Favorite Language is:</label>" +
                "<select name='thirdLanguage'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option>" +
                    "<option value='css'>CSS</option>" +
                    "<option value='html'>HTML</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "</form>" +
                "<input type='submit' value='Submit'>"+
                "</body>" +
                "</html>";
    }
    @PostMapping("/form")
    public String formResults(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"Skills Tracker</h1>" +
                "<ol>" +
                "<li>"+firstLanguage+"</li>" +
                "<li>"+secondLanguage+"</li>" +
                "<li>"+thirdLanguage+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}
