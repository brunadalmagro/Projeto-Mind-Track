package com.exemplo.servico;

import com.exemplo.modelo.PensamentoDisfuncional;
import com.exemplo.repositorio.PensamentoDisfuncionalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PensamentoDisfuncionalService {

    private final PensamentoDisfuncionalRepository repository;

    public PensamentoDisfuncionalService(PensamentoDisfuncionalRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public PensamentoDisfuncional salvar(PensamentoDisfuncional pensamento) {
        return repository.save(pensamento);
    }

    @Transactional(readOnly = true)
    public List<PensamentoDisfuncional> listarTodos() {
        return repository.findAll();
    }
}
