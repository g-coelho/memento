import org.example.Atleta;
import org.example.AtletaEstadoAquecido;
import org.example.AtletaEstadoCompetiu;
import org.example.AtletaEstadoContratado;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AtletaTest {

    @Test
    public void deveArmazenarEstados() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        assertEquals(2, atleta.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        atleta.restauraEstado(0);
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        atleta.setEstado(AtletaEstadoCompetiu.getInstance());
        atleta.setEstado(AtletaEstadoAquecido.getInstance());
        atleta.setEstado(AtletaEstadoContratado.getInstance());
        atleta.restauraEstado(2);
        assertEquals(AtletaEstadoAquecido.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Atleta atleta = new Atleta();
            atleta.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}
