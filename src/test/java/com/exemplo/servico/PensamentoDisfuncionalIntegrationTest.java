package com.exemplo.servico;

import com.exemplo.modelo.PensamentoDisfuncional;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@Transactional
public class PensamentoDisfuncionalIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PensamentoDisfuncionalService pensamentoDisfuncionalService;

    @Test
    public void testSalvarPensamento() throws Exception {
        PensamentoDisfuncional pensamento = new PensamentoDisfuncional();
        pensamento.setSituacao("Exemplo de situação");
        pensamento.setEmocao("Exemplo de emoção");

        // Converte o objeto para JSON manualmente
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonPensamento = objectMapper.writeValueAsString(pensamento);

        // Realize a chamada POST para salvar
        mockMvc.perform(post("/api/pensamentos")
                        .contentType("application/json")
                        .content(jsonPensamento))
                .andExpect(status().isOk());

        // Verifique se o objeto foi salvo corretamente no banco de dados
        PensamentoDisfuncional savedPensamento = pensamentoDisfuncionalService.listarTodos().get(0);
        assertEquals("Exemplo de situação", savedPensamento.getSituacao());
        assertEquals("Exemplo de emoção", savedPensamento.getEmocao());
    }
}
