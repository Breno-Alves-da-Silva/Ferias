package com.mycompany.ferias;
public class Voo {
    private int assentosDisponiveis;

    public boolean verificarDisponibilidade(int numeroPassageiros) {
        return assentosDisponiveis >= numeroPassageiros;
    }

    public void reservarAssentos(int numeroAssentos) {
        assentosDisponiveis -= numeroAssentos;
    }

    public void liberarAssentos(int numeroAssentos) {
        assentosDisponiveis += numeroAssentos;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    
}


