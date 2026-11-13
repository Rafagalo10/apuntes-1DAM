import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase principal que inicializa la ventana del juego.
 */
public class SnakeGame extends JFrame {

    public SnakeGame() {
        // Añadimos el panel del tablero a la ventana
        add(new Tablero());
        
        setResizable(false);
        pack(); // Ajusta la ventana al tamaño del panel
        
        setTitle("Juego de la Serpiente - Avanzado");
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Ejecutamos el juego en el hilo de eventos de Swing
        EventQueue.invokeLater(() -> {
            JFrame juego = new SnakeGame();
            juego.setVisible(true);
        });
    }
}

/**
 * Clase que representa el tablero donde ocurre la lógica y el dibujado del juego.
 */
class Tablero extends JPanel implements ActionListener {

    // Constantes de configuración del juego
    private final int ANCHO_TABLERO = 300;
    private final int ALTO_TABLERO = 300;
    private final int TAMANO_PUNTO = 10;
    private final int TOTAL_PUNTOS = (ANCHO_TABLERO * ALTO_TABLERO) / (TAMANO_PUNTO * TAMANO_PUNTO);
    private final int RETRASO = 140; // Velocidad del juego (milisegundos)

    // Arreglos para almacenar las coordenadas X e Y de todas las partes de la serpiente
    private final int[] x = new int[TOTAL_PUNTOS];
    private final int[] y = new int[TOTAL_PUNTOS];

    // Variables de estado del juego
    private int longitudSerpiente;
    private int manzanaX;
    private int manzanaY;
    private int puntuacion = 0;

    // Direcciones de movimiento
    private boolean izquierda = false;
    private boolean derecha = true;
    private boolean arriba = false;
    private boolean abajo = false;
    private boolean enJuego = true;

    private Timer temporizador;

    public Tablero() {
        iniciarTablero();
    }

    private void iniciarTablero() {
        addKeyListener(new AdaptadorTeclado());
        setBackground(Color.BLACK);
        setFocusable(true);
        setPreferredSize(new Dimension(ANCHO_TABLERO, ALTO_TABLERO));
        iniciarJuego();
    }

    private void iniciarJuego() {
        longitudSerpiente = 3;
        puntuacion = 0;

        // Posición inicial de la serpiente
        for (int i = 0; i < longitudSerpiente; i++) {
            x[i] = 50 - i * TAMANO_PUNTO;
            y[i] = 50;
        }

        generarManzana();

        // Inicia el bucle principal del juego
        temporizador = new Timer(RETRASO, this);
        temporizador.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujar(g);
    }

    private void dibujar(Graphics g) {
        if (enJuego) {
            // Dibujar la manzana
            g.setColor(Color.RED);
            g.fillOval(manzanaX, manzanaY, TAMANO_PUNTO, TAMANO_PUNTO);

            // Dibujar la serpiente
            for (int i = 0; i < longitudSerpiente; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN); // Cabeza
                } else {
                    g.setColor(new Color(45, 180, 0)); // Cuerpo
                }
                g.fillRect(x[i], y[i], TAMANO_PUNTO, TAMANO_PUNTO);
            }

            // Dibujar la puntuación
            g.setColor(Color.WHITE);
            g.setFont(new Font("Helvetica", Font.BOLD, 12));
            g.drawString("Puntos: " + puntuacion, 10, 20);

            Toolkit.getDefaultToolkit().sync();
        } else {
            mostrarFinDelJuego(g);
        }
    }

    private void mostrarFinDelJuego(Graphics g) {
        String mensaje = "Fin del Juego";
        String mensajePuntos = "Puntuación final: " + puntuacion;
        Font fuentePequeña = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metricas = getFontMetrics(fuentePequeña);

        g.setColor(Color.WHITE);
        g.setFont(fuentePequeña);
        
        // Centrar los mensajes en la pantalla
        g.drawString(mensaje, (ANCHO_TABLERO - metricas.stringWidth(mensaje)) / 2, ALTO_TABLERO / 2 - 20);
        g.drawString(mensajePuntos, (ANCHO_TABLERO - metricas.stringWidth(mensajePuntos)) / 2, ALTO_TABLERO / 2);
    }

    private void comprobarManzana() {
        // Si la cabeza choca con la manzana
        if ((x[0] == manzanaX) && (y[0] == manzanaY)) {
            longitudSerpiente++;
            puntuacion += 10;
            generarManzana();
        }
    }

    private void mover() {
        // Mover el cuerpo (cada parte sigue a la que tiene delante)
        for (int i = longitudSerpiente; i > 0; i--) {
            x[i] = x[(i - 1)];
            y[i] = y[(i - 1)];
        }

        // Mover la cabeza en la dirección actual
        if (izquierda) x[0] -= TAMANO_PUNTO;
        if (derecha)   x[0] += TAMANO_PUNTO;
        if (arriba)    y[0] -= TAMANO_PUNTO;
        if (abajo)     y[0] += TAMANO_PUNTO;
    }

    private void comprobarColisiones() {
        // Comprobar si la serpiente choca consigo misma
        for (int i = longitudSerpiente; i > 0; i--) {
            if ((i > 4) && (x[0] == x[i]) && (y[0] == y[i])) {
                enJuego = false;
            }
        }

        // Comprobar si la serpiente choca con los bordes
        if (y[0] >= ALTO_TABLERO) enJuego = false;
        if (y[0] < 0) enJuego = false;
        if (x[0] >= ANCHO_TABLERO) enJuego = false;
        if (x[0] < 0) enJuego = false;

        // Si el juego terminó, detenemos el temporizador
        if (!enJuego) {
            temporizador.stop();
        }
    }

    private void generarManzana() {
        // Colocar la manzana en una posición aleatoria de la cuadrícula
        int r = (int) (Math.random() * (ANCHO_TABLERO / TAMANO_PUNTO));
        manzanaX = ((r * TAMANO_PUNTO));

        r = (int) (Math.random() * (ALTO_TABLERO / TAMANO_PUNTO));
        manzanaY = ((r * TAMANO_PUNTO));
    }

    // Este método es llamado cada vez que el Timer hace un "tick" (Bucle del juego)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (enJuego) {
            comprobarManzana();
            comprobarColisiones();
            mover();
        }
        repaint(); // Vuelve a dibujar la pantalla
    }

    /**
     * Clase interna para procesar los controles del teclado.
     */
    private class AdaptadorTeclado extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int tecla = e.getKeyCode();

            // Evitamos que la serpiente se dé la vuelta sobre sí misma
            if ((tecla == KeyEvent.VK_LEFT) && (!derecha)) {
                izquierda = true;
                arriba = false;
                abajo = false;
            }
            if ((tecla == KeyEvent.VK_RIGHT) && (!izquierda)) {
                derecha = true;
                arriba = false;
                abajo = false;
            }
            if ((tecla == KeyEvent.VK_UP) && (!abajo)) {
                arriba = true;
                derecha = false;
                izquierda = false;
            }
            if ((tecla == KeyEvent.VK_DOWN) && (!arriba)) {
                abajo = true;
                derecha = false;
                izquierda = false;
            }
        }
    }
}