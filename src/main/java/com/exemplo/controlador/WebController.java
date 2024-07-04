package com.exemplo.controlador;

import com.exemplo.modelo.PensamentoDisfuncional;
import com.exemplo.servico.PensamentoDisfuncionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @Autowired
    private PensamentoDisfuncionalService service;

    @PostMapping("/formulario")
    public String formulario(Model model) {
        model.addAttribute("pensamento", new PensamentoDisfuncional());
        return "formulario";
    }

    @PostMapping("/salvarPensamento")
    public String salvarPensamento(@ModelAttribute PensamentoDisfuncional pensamento, Model model) {
        service.salvar(pensamento);
        model.addAttribute("pensamentos", service.listarTodos());
        return "resultado";
    }

    @GetMapping("/pensamentos-web")
    public String listarPensamentos(Model model) {
        model.addAttribute("pensamentos", service.listarTodos());
        return "resultado";
    }
}
