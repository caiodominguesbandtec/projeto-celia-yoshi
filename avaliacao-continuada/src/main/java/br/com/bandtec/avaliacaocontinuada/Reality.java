package br.com.bandtec.avaliacaocontinuada;

public class Reality extends Programa {

    private String nomeReality, apresentador;
    private Double budget, premio, patrocinio, propaganda;
    private Integer duracaoHorasReality, participantes;

    public Reality(String nomeReality, String apresentador, Double budget, Double premio, Double patrocinio, Double propaganda, Integer duracaoHorasReality, Integer participantes) {
        this.nomeReality = nomeReality;
        this.apresentador = apresentador;
        this.budget = budget;
        this.premio = premio;
        this.patrocinio = patrocinio;
        this.propaganda = propaganda;
        this.duracaoHorasReality = duracaoHorasReality;
        this.participantes = participantes;
    }

    @Override
    public Double calculaLucro() {
        return budget+patrocinio-premio/(participantes-1)+propaganda*duracaoHorasReality;
    }

    public String getNomeReality() {
        return nomeReality;
    }

    public String getApresentador() {
        return apresentador;
    }

    public Double getPremio() {
        return premio;
    }

    public Double getPatrocinio() {
        return patrocinio;
    }

    public Double getPropaganda() {
        return propaganda;
    }

    public Integer getDuracaoHorasReality() {
        return duracaoHorasReality;
    }

    public Integer getParticipantes() {
        return participantes;
    }

    public void setNomeReality(String nomeReality) {
        this.nomeReality = nomeReality;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setPremio(Double premio) {
        this.premio = premio;
    }

    public void setPatrocinio(Double patrocinio) {
        this.patrocinio = patrocinio;
    }

    public void setPropaganda(Double propaganda) {
        this.propaganda = propaganda;
    }

    public void setDuracaoHorasReality(Integer duracaoHorasReality) {
        this.duracaoHorasReality = duracaoHorasReality;
    }

    public void setParticipantes(Integer participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Reality{" +
                "nomeReality='" + nomeReality + '\'' +
                "," + '\n' + "apresentador='" + apresentador + '\'' +
                "," + '\n' + "budget=" + budget +
                "," + '\n' + "premio=" + premio +
                "," + '\n' + "patrocinio=" + patrocinio +
                "," + '\n' + "propaganda=" + propaganda +
                "," + '\n' + "duracaoHorasReality=" + duracaoHorasReality +
                "," + '\n' + "participantes=" + participantes +
                "," + '\n' + "lucro=" + calculaLucro() +
                '}' + '\n';
    }
}