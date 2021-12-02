package Transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @Test
    public void realizarTransacao() {
        contaXuxa.realizarTransferencia(1000.00, contaSilvio);
        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "12345678900", "11111");
        silvioSantos = new Cliente("Silvio Santos", "88987654321", "22222");

        contaXuxa = new Conta("0025", "2254", 2500.00, xuxa);
        contaSilvio = new Conta("0026", "2251", 3500.00, silvioSantos);
    }

    @Test
    public void validarTransferenciaInvalida() {
        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvio);
        assertFalse(resultado);
    }

    @Test
    public void validarAgencia() {
        assertEquals("0025", contaXuxa.getAgencia());
    }

    @Test
    public void validarConta() {
        assertEquals("2254", contaXuxa.getNumeroConta());
    }

    @Test
    public void validarAgenciaSilvio() {
        assertEquals("0026", contaSilvio.getAgencia());
    }

    @Test
    public void validarContaSilvio() {
        assertEquals("2251", contaSilvio.getNumeroConta());
    }

    @Test
    public void validarCPFXuxa() {
        assertEquals("12345678900", xuxa.getCpf());
    }

    @Test
    public void validarCPFSilvio() {
        assertEquals("88987654321", silvioSantos.getCpf());
    }

    @Test
    public void validarRGXuxa() {
        assertEquals("11111", xuxa.getRg());
    }

    @Test
    public void validarRGSilvio() {
        assertEquals("22222", silvioSantos.getRg());
    }

    @Test
    public void validarNomeClientexuxa() {
        assertEquals("Xuxa", xuxa.getNome());
    }

    @Test
    public void validarNomeClienteSilvio() {
        assertEquals("Silvio Santos", silvioSantos.getNome());
    }

    @Test
    public void validarSaldoXuxa() {
       assertEquals(2500.00, contaXuxa.getSaldo());
           }

    @Test
    public void validarSaldoSilvio() {
        assertEquals(3500.00, contaSilvio.getSaldo());
    }
}



