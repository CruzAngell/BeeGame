import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase principal del juego de las abejas que utiliza una interfaz gráfica.
 */
public class JuegoAbejasGUI extends JFrame {
    private static final int NUM_ABEJAS_INICIALES = 10;
    private static final int NUM_PREGUNTAS_POR_RONDA = 3;

    private int numAbejas;
    private int nivel;
    private List<Pregunta> preguntas;

    private JLabel lblNivel;
    private JLabel lblAbejas;
    private JButton btnResponder;

    /**
     * Constructor de la clase JuegoAbejasGUI. Inicializa la interfaz gráfica y las variables del juego.
     */
    public JuegoAbejasGUI() {
        setTitle("Juego de las Abejas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        numAbejas = NUM_ABEJAS_INICIALES;
        nivel = 1;
        preguntas = new ArrayList<>();
        cargarPreguntas();

        lblNivel = new JLabel("Nivel: " + nivel);
        lblAbejas = new JLabel("Abejas en el panal: " + numAbejas);
        btnResponder = new JButton("Responder");

        btnResponder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugarRonda();
            }
        });

        JPanel panel = new JPanel();
        panel.add(lblNivel);
        panel.add(lblAbejas);
        panel.add(btnResponder);

        add(panel);
        setVisible(true);
    }

    /**
     * Carga las preguntas en la lista de preguntas del juego.
     */
    private void cargarPreguntas() {
        preguntas.add(new Pregunta("¿Cuánto es 2 + 2?", "3", "4", "5", "6", "4"));
        preguntas.add(new Pregunta("¿Quién escribió 'Don Quijote de la Mancha'?", "William Shakespeare", "Gabriel García Márquez", "J.K. Rowling", "Miguel de Cervantes", "Miguel de Cervantes"));
        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?", "Londres", "Madrid", "Roma", "París", "París"));
        preguntas.add(new Pregunta("¿Quién pintó la Mona Lisa?", "Vincent van Gogh", "Pablo Picasso", "Claude Monet", "Leonardo da Vinci", "Leonardo da Vinci"));
        preguntas.add(new Pregunta("¿Qué planeta es conocido como el planeta rojo?", "Júpiter", "Saturno", "Venus", "Marte", "Marte"));
        preguntas.add(new Pregunta("¿Cuál es el río más largo del mundo?", "Nilo", "Amazonas", "Yangtsé", "Misisipi", "Amazonas"));
        preguntas.add(new Pregunta("¿En qué continente se encuentra el desierto del Sahara?", "Asia", "América", "África", "Australia", "África"));
        preguntas.add(new Pregunta("¿Cuál es el océano más grande del mundo?", "Atlántico", "Índico", "Ártico", "Pacífico", "Pacífico"));
        preguntas.add(new Pregunta("¿Cuál es el país más grande del mundo por área?", "Canadá", "China", "Estados Unidos", "Rusia", "Rusia"));
        preguntas.add(new Pregunta("¿En qué país se encuentra la Torre Eiffel?", "Italia", "España", "Francia", "Alemania", "Francia"));
        preguntas.add(new Pregunta("¿Qué instrumento toca el famoso violinista Itzhak Perlman?", "Piano", "Guitarra", "Violín", "Flauta", "Violín"));
        preguntas.add(new Pregunta("¿Qué elemento químico tiene el símbolo H?", "Helio", "Hidrógeno", "Hierro", "Plata", "Hidrógeno"));
        preguntas.add(new Pregunta("¿Cuál es el animal más rápido del mundo?", "León", "Tigre", "Guepardo", "Águila", "Guepardo"));
        preguntas.add(new Pregunta("¿Quién inventó la bombilla eléctrica?", "Nikola Tesla", "Alexander Graham Bell", "Thomas Edison", "Benjamin Franklin", "Thomas Edison"));
        preguntas.add(new Pregunta("¿Cuál es el libro más vendido del mundo?", "El Quijote", "La Biblia", "Harry Potter", "El Señor de los Anillos", "La Biblia"));
        preguntas.add(new Pregunta("¿Qué país tiene la forma de una bota?", "España", "Portugal", "Grecia", "Italia", "Italia"));
        preguntas.add(new Pregunta("¿Cuál es el animal nacional de China?", "Tigre", "Dragón", "Panda", "León", "Panda"));
        preguntas.add(new Pregunta("¿Cuál es el nombre del rey de la selva?", "Tigre", "Elefante", "León", "Jirafa", "León"));
        preguntas.add(new Pregunta("¿Qué deporte se juega en Wimbledon?", "Baloncesto", "Tenis", "Fútbol", "Críquet", "Tenis"));
        preguntas.add(new Pregunta("¿Qué ciudad es conocida como 'La Gran Manzana'?", "Los Ángeles", "Chicago", "Miami", "Nueva York", "Nueva York"));
        preguntas.add(new Pregunta("¿Cuál es el metal más ligero?", "Oro", "Plata", "Litio", "Aluminio", "Litio"));
        preguntas.add(new Pregunta("¿Cuántos colores hay en el arcoíris?", "Cinco", "Seis", "Siete", "Ocho", "Siete"));
        preguntas.add(new Pregunta("¿Qué gas necesitan las plantas para hacer la fotosíntesis?", "Oxígeno", "Nitrógeno", "Hidrógeno", "Dióxido de carbono", "Dióxido de carbono"));
        preguntas.add(new Pregunta("¿Cuál es el órgano más grande del cuerpo humano?", "Cerebro", "Corazón", "Hígado", "Piel", "Piel"));
        preguntas.add(new Pregunta("¿Qué planeta es el más cercano al Sol?", "Venus", "Marte", "Mercurio", "Tierra", "Mercurio"));
        preguntas.add(new Pregunta("¿En qué país se encuentra el Monte Fuji?", "China", "Corea del Sur", "Japón", "Vietnam", "Japón"));
        preguntas.add(new Pregunta("¿Cuál es el deporte más popular del mundo?", "Baloncesto", "Críquet", "Fútbol", "Tenis", "Fútbol"));
        preguntas.add(new Pregunta("¿Qué animal es conocido por su larga trompa?", "Rinoceronte", "Elefante", "Hipopótamo", "Jirafa", "Elefante"));
        preguntas.add(new Pregunta("¿Quién escribió 'Harry Potter'?", "C.S. Lewis", "J.R.R. Tolkien", "J.K. Rowling", "Suzanne Collins", "J.K. Rowling"));
        preguntas.add(new Pregunta("¿Qué continente es también un país?", "África", "Australia", "Antártida", "Asia", "Australia"));
        preguntas.add(new Pregunta("¿Cuál es el lago más grande del mundo?", "Lago Superior", "Lago Victoria", "Lago Baikal", "Mar Caspio", "Mar Caspio"));
        preguntas.add(new Pregunta("¿Qué instrumento musical tiene teclas blancas y negras?", "Guitarra", "Saxofón", "Piano", "Violín", "Piano"));
        preguntas.add(new Pregunta("¿En qué país se encuentran las pirámides de Giza?", "México", "Perú", "Egipto", "India", "Egipto"));
        preguntas.add(new Pregunta("¿Cuál es el segundo planeta más grande del sistema solar?", "Tierra", "Júpiter", "Saturno", "Urano", "Saturno"));
        preguntas.add(new Pregunta("¿Qué ciudad es la capital de Japón?", "Pekín", "Seúl", "Tokio", "Bangkok", "Tokio"));
        preguntas.add(new Pregunta("¿Qué insecto produce miel?", "Mosca", "Mariposa", "Abeja", "Hormiga", "Abeja"));
    }

    /**
     * Juega una ronda del juego, presentando preguntas al usuario y actualizando el número de abejas y nivel.
     */
    private void jugarRonda() {
        if (numAbejas <= 0) {
            JOptionPane.showMessageDialog(null, "Game Over");
            return;
        }
        for (int i = 0; i < NUM_PREGUNTAS_POR_RONDA; i++) {
            Pregunta pregunta = obtenerPreguntaAleatoria();
            String[] opciones = {pregunta.getOpcionA(), pregunta.getOpcionB(), pregunta.getOpcionC(), pregunta.getOpcionD()};
            String respuestaUsuario = (String) JOptionPane.showInputDialog(
                null,
                pregunta.getEnunciado(),
                "Seleccione una opción",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            if (pregunta.validarRespuesta(respuestaUsuario)) {
                JOptionPane.showMessageDialog(null, "¡Respuesta correcta! Una abeja se ha sumado al panal.");
                numAbejas++;
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Una abeja ha dejado el panal.");
                numAbejas--;
                if (numAbejas <= 0) {
                    JOptionPane.showMessageDialog(null, "Game Over");
                    return;
                }
            }
            lblAbejas.setText("Abejas en el panal: " + numAbejas);
        }
        nivel++;
        lblNivel.setText("Nivel: " + nivel);
    }

    /**
     * Obtiene una pregunta aleatoria de la lista de preguntas.
     * @return una pregunta aleatoria.
     */
    private Pregunta obtenerPreguntaAleatoria() {
        Random rand = new Random();
        int index = rand.nextInt(preguntas.size());
        return preguntas.get(index);
    }

    /**
     * Método principal que inicia la aplicación del juego.
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoAbejasGUI();
            }
        });
    }

    public Object getNumAbejas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumAbejas'");
    }

    public void setNumAbejas(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNumAbejas'");
    }
}

/**
 * Clase que representa una pregunta del juego.
 */
class Pregunta {
    private String enunciado;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String respuestaCorrecta;

    /**
     * Constructor de la clase Pregunta.
     * @param enunciado el enunciado de la pregunta.
     * @param opcionA opción A de la pregunta.
     * @param opcionB opción B de la pregunta.
     * @param opcionC opción C de la pregunta.
     * @param opcionD opción D de la pregunta.
     * @param respuestaCorrecta la respuesta correcta de la pregunta.
     */
    public Pregunta(String enunciado, String opcionA, String opcionB, String opcionC, String opcionD, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    /**
     * Obtiene el enunciado de la pregunta.
     * @return el enunciado de la pregunta.
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Obtiene la opción A de la pregunta.
     * @return la opción A.
     */
    public String getOpcionA() {
        return opcionA;
    }

    /**
     * Obtiene la opción B de la pregunta.
     * @return la opción B.
     */
    public String getOpcionB() {
        return opcionB;
    }

    /**
     * Obtiene la opción C de la pregunta.
     * @return la opción C.
     */
    public String getOpcionC() {
        return opcionC;
    }

    /**
     * Obtiene la opción D de la pregunta.
     * @return la opción D.
     */
    public String getOpcionD() {
        return opcionD;
    }

    /**
     * Valida si la respuesta del usuario es correcta.
     * @param respuestaUsuario la respuesta del usuario.
     * @return true si la respuesta es correcta, false en caso contrario.
     */
    public boolean validarRespuesta(String respuestaUsuario) {
        return respuestaUsuario.equalsIgnoreCase(respuestaCorrecta);
    }
}
