package com.exemplo.modelo;

import javax.persistence.*;

@Entity
public class PensamentoDisfuncional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String situacao;
    private String emocao;
    private int intensidadeEmocao;
    private String pensamentoAutomatico;
    private int conviccaoPensamento;
    private String respostaAlternativa;
    private int conviccaoResposta;
    private int reavaliacaoConviccao;
    private int reavaliacaoIntensidade;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEmocao() {
        return emocao;
    }

    public void setEmocao(String emocao) {
        this.emocao = emocao;
    }

    public int getIntensidadeEmocao() {
        return intensidadeEmocao;
    }

    public void setIntensidadeEmocao(int intensidadeEmocao) {
        this.intensidadeEmocao = intensidadeEmocao;
    }

    public String getPensamentoAutomatico() {
        return pensamentoAutomatico;
    }

    public void setPensamentoAutomatico(String pensamentoAutomatico) {
        this.pensamentoAutomatico = pensamentoAutomatico;
    }

    public int getConviccaoPensamento() {
        return conviccaoPensamento;
    }

    public void setConviccaoPensamento(int conviccaoPensamento) {
        this.conviccaoPensamento = conviccaoPensamento;
    }

    public String getRespostaAlternativa() {
        return respostaAlternativa;
    }

    public void setRespostaAlternativa(String respostaAlternativa) {
        this.respostaAlternativa = respostaAlternativa;
    }

    public int getConviccaoResposta() {
        return conviccaoResposta;
    }

    public void setConviccaoResposta(int conviccaoResposta) {
        this.conviccaoResposta = conviccaoResposta;
    }

    public int getReavaliacaoConviccao() {
        return reavaliacaoConviccao;
    }

    public void setReavaliacaoConviccao(int reavaliacaoConviccao) {
        this.reavaliacaoConviccao = reavaliacaoConviccao;
    }

    public int getReavaliacaoIntensidade() {
        return reavaliacaoIntensidade;
    }

    public void setReavaliacaoIntensidade(int reavaliacaoIntensidade) {
        this.reavaliacaoIntensidade = reavaliacaoIntensidade;
    }
}
