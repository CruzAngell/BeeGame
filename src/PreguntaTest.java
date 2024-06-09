import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PreguntaTest {

    @Test
    public void testValidarRespuestaCorrecta() {
        Pregunta pregunta = new Pregunta("¿Cuánto es 2 + 2?", "3", "4", "5", "6", "4");
        assertEquals(true, pregunta.validarRespuesta("4"));
    }

    @Test
    public void testValidarRespuestaIncorrecta() {
        Pregunta pregunta = new Pregunta("¿Cuánto es 2 + 2?", "3", "4", "5", "6", "4");
        assertEquals(false, pregunta.validarRespuesta("3"));
    }

    @Test
    public void testGetEnunciado() {
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París");
        assertEquals("¿Cuál es la capital de Francia?", pregunta.getEnunciado());
    }

    @Test
    public void testGetOpcionA() {
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París");
        assertEquals("Londres", pregunta.getOpcionA());
    }

    @Test
    public void testGetOpcionB() {
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París");
        assertEquals("Madrid", pregunta.getOpcionB());
    }

    @Test
    public void testGetOpcionC() {
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París");
        assertEquals("Roma", pregunta.getOpcionC());
    }

    @Test
    public void testGetOpcionD() {
        Pregunta pregunta = new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París");
        assertEquals("París", pregunta.getOpcionD());
    }
}
