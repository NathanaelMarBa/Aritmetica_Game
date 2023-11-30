import Nathanael.Martinez.Operaciones.Utilidades;
import Nathanael.Martinez.Operaciones.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class ventanaPrincipal extends JFrame implements ActionListener {
    private JPanel panelVentanaPrincipal;
    private JButton btn0;
    private JButton btn4;
    private JButton btn1;
    private JButton btn6;
    private JButton btn3;
    private JButton btn5;
    private JButton btn2;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JLabel lbOperacion;
    private JLabel lbResultado;
    private JLabel lbPuntos;
    private JLabel lbIntentos;

    private JPanel ventanaPrincipal;
int n1 = 0;

int n2 = 0;

int contador =0;

int resultadoEsperado = 0;


    private final Random random = new Random();
    public ventanaPrincipal()throws HeadlessException{
        setContentPane(panelVentanaPrincipal);
        setVisible(true);
        setSize(480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        establecerListenerBotones();
        generarSuma();
        generarResta();
        generarDivision();
        generarMultiplicacion();

    }

    private void establecerListenerBotones() {
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
    }



    private void operaciones() {
        int operacionAleatoria = random.nextInt(4) + 1;

        switch (operacionAleatoria) {
            case 1:
                generarSuma();
                break;
            case 2:
                generarResta();
                break;
            case 3:
                generarDivision();
                break;
            case 4:
                generarMultiplicacion();
                break;
        }
    }

    private void generarSuma(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + " + "  + n2;
        lbOperacion.setText(operacion);
    }
    private void generarResta(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + " - "  + n2;
        lbOperacion.setText(operacion);
    }
    private void generarDivision(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + " / "  + n2;
        lbOperacion.setText(operacion);
    }
    private void generarMultiplicacion(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + " x "  + n2;
        lbOperacion.setText(operacion);
    }


    public static  void main(String[]args){
        new ventanaPrincipal();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String numero="";
        String total = lbResultado.getText();

        numero = validarActionEventBotones(actionEvent, numero);
        total += numero;
        lbResultado.setText(total);

        validarOperacion();
    }

    private void validarOperacion() {
            if (lbPuntos.getText().equals("Puntos: 0")) {
                lbOperacion.setText("Game Over");
                lbResultado.setText("");
            }

            String operacionActual = lbOperacion.getText();
            if (operacionActual.contains("+")) {
                resultadoEsperado = n1 + n2;
            } else if (operacionActual.contains("-")) {
                resultadoEsperado = n1 - n2;
            } else if (operacionActual.contains("/")) {
                resultadoEsperado = n1 / n2;
            } else if (operacionActual.contains("x")) {
                resultadoEsperado = n1 * n2;
            }
            
            if (Integer.parseInt(lbResultado.getText()) == resultadoEsperado) {
                incrementarContador();
                lbResultado.setText("");
                operaciones();
            } else {
                decrementarContador();
                lbResultado.setText("");
                operaciones();
            }

    }
    private void incrementarContador() {
        contador ++;
        lbPuntos.setText("Puntos: " +contador);
    }

    private void decrementarContador(){
        contador--;
        lbPuntos.setText("Puntos: "+contador);
    }


    private String validarActionEventBotones(ActionEvent actionEvent, String numero) {
        if(actionEvent.getSource()==btn0)
            numero = btn0.getText();
        if(actionEvent.getSource()== btn1)
            numero = btn1.getText();
        if(actionEvent.getSource()==btn2)
            numero = btn2.getText();
        if(actionEvent.getSource()== btn3)
            numero = btn3.getText();
        if(actionEvent.getSource()== btn4)
            numero = btn4.getText();
        if(actionEvent.getSource()== btn5)
            numero = btn5.getText();
        if(actionEvent.getSource()== btn6)
            numero = btn6.getText();
        if(actionEvent.getSource()== btn7)
            numero = btn7.getText();
        if(actionEvent.getSource()== btn8)
            numero = btn8.getText();
        if(actionEvent.getSource()== btn9)
            numero = btn9.getText();
        return numero;
    }
}
