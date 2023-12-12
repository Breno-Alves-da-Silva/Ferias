package com.mycompany.ferias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaReservaTest {
   
 @Test
    public void testeReservaBemSucedida() {
        Voo voo = new Voo();
        voo.setAssentosDisponiveis(50);

        PassagemAerea passagem = new PassagemAerea();
        passagem.setNumeroPassageiros(2);

        SistemaReserva sistema = new SistemaReserva();
        assertTrue(sistema.reservarPassagem(passagem, voo));
    }

    @Test
    public void testeDisponibilidadeAssentos() {
        Voo voo = new Voo();
        voo.setAssentosDisponiveis(50);

        PassagemAerea passagem = new PassagemAerea();
        passagem.setNumeroPassageiros(2);

        SistemaReserva sistema = new SistemaReserva();
        assertTrue(sistema.reservarPassagem(passagem, voo));
        assertEquals(48, voo.getAssentosDisponiveis());
    }

    @Test
    public void testeCancelamentoReserva() {
        Voo voo = new Voo();
        voo.setAssentosDisponiveis(50);

        PassagemAerea passagem = new PassagemAerea();
        passagem.setNumeroPassageiros(2);

        SistemaReserva sistema = new SistemaReserva();
        assertTrue(sistema.reservarPassagem(passagem, voo));
        assertEquals(48, voo.getAssentosDisponiveis());

        assertTrue(sistema.cancelarReserva(passagem, voo));
        assertEquals(50, voo.getAssentosDisponiveis());
    }

    @Test
    public void testeConfirmacaoCheckIn() {
        PassagemAerea passagem = new PassagemAerea();
        SistemaReserva sistema = new SistemaReserva();
        assertTrue(sistema.realizarCheckIn(passagem));
    }

    @Test
    public void testeFalhaNaReserva() {
        Voo voo = new Voo();
        voo.setAssentosDisponiveis(1);

        PassagemAerea passagem1 = new PassagemAerea();
        passagem1.setNumeroPassageiros(1);

        PassagemAerea passagem2 = new PassagemAerea();
        passagem2.setNumeroPassageiros(2);

        SistemaReserva sistema = new SistemaReserva();
        assertTrue(sistema.reservarPassagem(passagem1, voo));

        assertFalse(sistema.reservarPassagem(passagem2, voo));
    }
}

    

