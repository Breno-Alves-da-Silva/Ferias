package com.mycompany.ferias;
public class PassagemAerea {
    private String origem;
    private String destino;
    private String data;
    private int numeroPassageiros;
    
    @Override
    public String toString() {
        return "PassagemAerea{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data='" + data + '\'' +
                ", numeroPassageiros=" + numeroPassageiros +
                '}';
    }

     public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
