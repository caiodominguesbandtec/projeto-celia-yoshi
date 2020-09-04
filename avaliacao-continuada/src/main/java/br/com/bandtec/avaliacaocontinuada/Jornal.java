package br.com.bandtec.avaliacaocontinuada;

public class Jornal implements Programa {

    private String nomeJornal, ancora, tema;
    private Double budget, propaganda;
    private Integer duracaoHorasJornal;

    public Jornal(String nomeJornal, String ancora, String tema, Double budget, Double propaganda, Integer duracaoHorasJornal) {
        this.nomeJornal = nomeJornal;
        this.ancora = ancora;
        this.tema = tema;
        this.budget = budget;
        this.propaganda = propaganda;
        this.duracaoHorasJornal = duracaoHorasJornal;
    }

    @Override
    public Double calculaLucro() {
        return budget+duracaoHorasJornal*propaganda;
    }

    public String getNomeJornal() {
        return nomeJornal;
    }

    public String getAncora() {
        return ancora;
    }

    public String getTema() {
        return tema;
    }

    public Double getPropaganda() {
        return propaganda;
    }

    public Integer getDuracaoHorasJornal() {
        return duracaoHorasJornal;
    }

    public void setNomeJornal(String nomeJornal) {
        this.nomeJornal = nomeJornal;
    }

    public void setAncora(String ancora) {
        this.ancora = ancora;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setPropaganda(Double propaganda) {
        this.propaganda = propaganda;
    }

    public void setDuracaoHorasJornal(Integer duracaoHorasJornal) {
        this.duracaoHorasJornal = duracaoHorasJornal;
    }

    @Override
    public String toString() {
        return "Jornal{" +
                "nomeJornal='" + nomeJornal + '\'' +
                ", ancora='" + ancora + '\'' +
                ", tema='" + tema + '\'' +
                ", budget=" + budget +
                ", propaganda=" + propaganda +
                ", duracaoHorasJornal=" + duracaoHorasJornal +
                ", lucro=" + calculaLucro() +
                '}';
    }
}
