package com.mycompany.ferias;

public class SistemaReserva {
    public boolean reservarPassagem(PassagemAerea passagem, Voo voo) {
        if (voo.verificarDisponibilidade(passagem.getNumeroPassageiros())) {
            voo.reservarAssentos(passagem.getNumeroPassageiros());
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelarReserva(PassagemAerea passagem, Voo voo) {
        voo.liberarAssentos(passagem.getNumeroPassageiros());
        return true;
    }

    public boolean realizarCheckIn(PassagemAerea passagem) {
         if (passagem != null && passagem.getNumeroPassageiros() > 0) {
            System.out.println("Check-in realizado para a passagem: " + passagem);
            return true;
        } else {
            System.out.println("Falha no check-in. Passagem inválida.");
            return false;
        }
    }
}

