package com.pedidosja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinalPedidoController {
    
    @GetMapping("/finalizarpedido")
    public String finalPedido(){
        return "/finalizarpedido";
    }
}
