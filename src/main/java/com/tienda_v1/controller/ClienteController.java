
package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("/")
    public String inicio(Model model){
        var saludo="Saludos desde el Back End";
            model.addAttribute("mensaje", saludo);
          Cliente cliente1= new Cliente("Luis","Perez","lp@gmail.com","89308230");
          Cliente cliente2= new Cliente("Jose","Perez","lj@gmail.com","79230230");
          Cliente cliente3= new Cliente("Maria","Perez","lm@gmail.com","93301230");
       
       var clientes=Arrays.asList(cliente1,cliente2,cliente3);  
          
        model.addAttribute("clientes", clientes);
        return "index";
       
    }
}
