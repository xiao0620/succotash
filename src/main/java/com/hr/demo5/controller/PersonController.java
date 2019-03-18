package com.hr.demo5.controller;

import com.hr.demo5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/text")
public class PersonController {

    @Autowired
    private PersonService personService;
    @RequestMapping("/findAll")
    //查询
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/person/list");
        mv.addObject("personList",personService.findAll());

        return mv ;
    }

}
