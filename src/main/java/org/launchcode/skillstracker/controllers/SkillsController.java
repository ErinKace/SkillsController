package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
                "<form action='form-result' method='post'>" +
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
                "<input type='submit' value='Submit'>"+
                "</form>" +
                "</body>" +
                "</html>";
    }
//    @PostMapping("/form")
    @RequestMapping(value="/form-result", method={RequestMethod.GET,RequestMethod.POST})
    public String formResults(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<table style='width=800px;border: 2px solid;font-size:20px'>" +
                "<tr>" +
                    "<td>First</td>" +
                    "<td>"+firstLanguage+"</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Second</td>" +
                    "<td>"+secondLanguage+"</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Third</td>"+
                    "<td>"+thirdLanguage+"</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }


}
