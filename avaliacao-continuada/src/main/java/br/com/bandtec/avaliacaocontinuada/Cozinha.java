package br.com.bandtec.avaliacaocontinuada;

public class Cozinha implements Programa {

    private String nomeCozinha, apresentador;
    private Double budget, patrocinio, propaganda;
    private Integer duracaoHorasCozinha;

    public Cozinha(String nomeCozinha, String apresentador, Double budget, Double patrocinio, Double propaganda, Integer duracaoHorasCozinha) {
        this.nomeCozinha = nomeCozinha;
        this.apresentador = apresentador;
        this.budget = budget;
        this.patrocinio = patrocinio;
        this.propaganda = propaganda;
        this.duracaoHorasCozinha = duracaoHorasCozinha;
    }

    @Override
    public Double calculaLucro() {
        return budget+patrocinio+propaganda*duracaoHorasCozinha;
    }

    public String getNomeCozinha() {
        return nomeCozinha;
    }

    public String getApresentador() {
        return apresentador;
    }

    public Double getPatrocinio() {
        return patrocinio;
    }

    public Double getPropaganda() {
        return propaganda;
    }

    public Integer getDuracaoHorasCozinha() {
        return duracaoHorasCozinha;
    }

    public void setNomeCozinha(String nomeCozinha) {
        this.nomeCozinha = nomeCozinha;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setPatrocinio(Double patrocinio) {
        this.patrocinio = patrocinio;
    }

    public void setPropaganda(Double propaganda) {
        this.propaganda = propaganda;
    }

    public void setDuracaoHorasCozinha(Integer duracaoHorasCozinha) {
        this.duracaoHorasCozinha = duracaoHorasCozinha;
    }
}
