package teste;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConhecimentoTest {
    Conhecimento fogo;

    @BeforeEach
    public void Start(){
        fogo = new Conhecimento();
    }

    //Conhecimento Observado

    @Test
    public void naoDeveObservarConhecimentoObservado() {
        fogo.setEstado(ConhecimentoEstadoObservado.getInstance());
        assertFalse(fogo.observar());
    }
    @Test
    public void naoDeveVerificarConhecimentoObservado() {
        fogo.setEstado(ConhecimentoEstadoObservado.getInstance());
        assertFalse(fogo.verificar());
    }
    @Test
    public void DeveTeorizarConhecimentoObservado() {
        fogo.setEstado(ConhecimentoEstadoObservado.getInstance());
        assertTrue(fogo.teorizar());
        assertEquals("Conhecimento no estado de teorização.", fogo.getNomeEstado());
    }
    @Test
    public void DeveTestarConhecimentoObservado() {
        fogo.setEstado(ConhecimentoEstadoObservado.getInstance());
        assertTrue(fogo.testar());
        assertEquals("Conhecimento no estado de testes.", fogo.getNomeEstado());
    }

    //Conhecimento Teorizado

    @Test
    public void naoDeveObservarConhecimentoTeorizado() {
        fogo.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        assertFalse(fogo.observar());
    }
    @Test
    public void naoDeveTeorizarConhecimentoTeorizado() {
        fogo.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        assertFalse(fogo.teorizar());
    }
    @Test
    public void DeveVerificarConhecimentoTeorizado() {
        fogo.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        assertTrue(fogo.verificar());
        assertEquals("Conhecimento no estado de verificação.", fogo.getNomeEstado());
    }
    @Test
    public void DeveTestarConhecimentoTeorizado() {
        fogo.setEstado(ConhecimentoEstadoTeorizado.getInstance());
        assertTrue(fogo.testar());
        assertEquals("Conhecimento no estado de testes.", fogo.getNomeEstado());
    }

    //Conhecimento Testado

    @Test
    public void naoDeveObservarConhecimentoTestado() {
        fogo.setEstado(ConhecimentoEstadoTestado.getInstance());
        assertFalse(fogo.observar());
    }
    @Test
    public void naoDeveTestarConhecimentoTestado() {
        fogo.setEstado(ConhecimentoEstadoTestado.getInstance());
        assertFalse(fogo.testar());
    }
    @Test
    public void DeveTeorizarConhecimentoTestado() {
        fogo.setEstado(ConhecimentoEstadoTestado.getInstance());
        assertTrue(fogo.teorizar());
        assertEquals("Conhecimento no estado de teorização.", fogo.getNomeEstado());
    }
    @Test
    public void DeveVerificarConhecimentoTestado() {
        fogo.setEstado(ConhecimentoEstadoTestado.getInstance());
        assertTrue(fogo.verificar());
        assertEquals("Conhecimento no estado de verificação.", fogo.getNomeEstado());
    }

    //Conhecimento Verificado
    @Test
    public void DeveObservarConhecimentoVerificado() {
        fogo.setEstado(ConhecimentoEstadoVerificado.getInstance());
        assertTrue(fogo.observar());
        assertEquals("Conhecimento no estado de observação.", fogo.getNomeEstado());
    }
    @Test
    public void DeveTestarConhecimentoVerificado() {
        fogo.setEstado(ConhecimentoEstadoVerificado.getInstance());
        assertTrue(fogo.testar());
        assertEquals("Conhecimento no estado de testes.", fogo.getNomeEstado());
    }
    @Test
    public void DeveTeorizarConhecimentoVerificado() {
        fogo.setEstado(ConhecimentoEstadoVerificado.getInstance());
        assertTrue(fogo.teorizar());
        assertEquals("Conhecimento no estado de teorização.", fogo.getNomeEstado());
    }
    @Test
    public void DeveVerificarConhecimentoVerificado() {
        fogo.setEstado(ConhecimentoEstadoVerificado.getInstance());
        assertTrue(fogo.verificar());
        assertEquals("Conhecimento no estado de verificação.", fogo.getNomeEstado());
    }
}