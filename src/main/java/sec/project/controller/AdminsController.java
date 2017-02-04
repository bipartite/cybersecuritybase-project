package sec.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sec.project.repository.AdminsRepository;
import org.springframework.ui.Model;
import sec.project.repository.SignupRepository;

@Controller
public class AdminsController {

    @Autowired
    private AdminsRepository adminsRepository;
    
    @Autowired
    private SignupRepository signupRepository;

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public String loadForm(Model model) {
        model.addAttribute("Admins", adminsRepository.findAll());
        model.addAttribute("Signup", signupRepository.findAll());
        return "admins";
    }



}