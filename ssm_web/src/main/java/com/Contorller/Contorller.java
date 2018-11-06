package com.Contorller;

import com.domain.Kind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/kind")
public class Contorller {

    @Autowired
    private com.Service.kindService kindService;

    @RequestMapping("/findAll")
    public String Con1(Model model){
        List<Kind> all = kindService.findAll();
        model.addAttribute("list",all);
        return "success";
    }
}
