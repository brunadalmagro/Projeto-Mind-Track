package com.exemplo.servico;

import com.exemplo.modelo.PensamentoDisfuncional;
import com.exemplo.repositorio.PensamentoDisfuncionalRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PensamentoDisfuncionalServiceTest {

    @InjectMocks
    private PensamentoDisfuncionalService service;

    @Mock
    private PensamentoDisfuncionalRepository repository;

    public PensamentoDisfuncionalServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvar() {
        PensamentoDisfuncional pensamento = new PensamentoDisfuncional();
        pensamento.setSituacao("Teste");
        pensamento.setEmocao("Teste");
        // Definir outros campos...

        when(repository.save(pensamento)).thenReturn(pensamento);

        PensamentoDisfuncional salvo = service.salvar(pensamento);
        assertNotNull(salvo);
    }
}
