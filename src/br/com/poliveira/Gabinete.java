package br.com.poliveira;

/**
 * 
 * @author PatrickAOliveira
 */

public class Gabinete {

    private int id;
    private String nome;
    private String processador;
    private String fonte;
    private String placaVideo;
    private String memoriaRam;
    private String armazenamento;
    private String sistemaOperacional;
    private String placaMae;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    // Função que transforma o objeto em String
    @Override
    public String toString() {
        return "Gabinete {" +
                "\n  Id: " + getId() +
                "\n  Nome: " + getNome() +
                "\n  Processador: " + getProcessador() +
                "\n  Fonte: " + getFonte() +
                "\n  Placa de vídeo: " + getPlacaVideo() +
                "\n  Memória Ram: " + getMemoriaRam() +
                "\n  Armazenamento: " + getArmazenamento() +
                "\n  Sistema Operacional: " + getSistemaOperacional() +
                "\n  Placa mãe: " + getPlacaMae() +
                "\n}";
    }
}
