import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depositar extends JFrame{
    private JPanel panelReportes;
    private JButton volverAlMenuButton;
    private JButton calcularButton;
    private JTextField valor1;
    private JTextField valor2;
    private JTextField resultado;

    public depositar(){
        super("OPCIONES DE MENU");
        setContentPane(panelReportes);
        volverAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu ventana = new menu();
                ventana.iniciar();
                dispose();
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(valor1.getText());
                int valorr = Integer.parseInt(valor2.getText());
                int result = valor+valorr;
                resultado.setText(String.valueOf(result));
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
