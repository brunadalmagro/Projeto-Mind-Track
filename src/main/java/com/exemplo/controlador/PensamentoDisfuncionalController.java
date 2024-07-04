package com.exemplo.controlador;

import com.exemplo.servico.PensamentoDisfuncionalService;
import com.exemplo.modelo.PensamentoDisfuncional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pensamentos")
public class PensamentoDisfuncionalController {

    @Autowired
    private PensamentoDisfuncionalService service;

    @PostMapping
    public PensamentoDisfuncional adicionarPensamento(@RequestBody PensamentoDisfuncional pensamento) {
        return service.salvar(pensamento);
    }

    @GetMapping
    public List<PensamentoDisfuncional> listarPensamentos() {
        return service.listarTodos();
    }
}
