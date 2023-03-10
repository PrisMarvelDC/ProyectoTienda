
package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import com.tienda_v1.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    
  
    @GetMapping("/")
    public String inicio(Model model){
   
        return "index";
       
    }
}
