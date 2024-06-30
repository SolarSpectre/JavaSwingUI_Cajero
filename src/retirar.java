import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retirar extends JFrame {
    private JPanel panel_retirar;
    private JButton volverAlMenuButton;
    private JButton calcularButton;
    private JTextField valor1;

    public retirar(){
        super("Retirar");
        setContentPane(panel_retirar);
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
                BalanceSaldo.retirar(valor);
                JOptionPane.showMessageDialog(null,"Se ha realizado el retiro correctamente!");
                valor1.setText("");
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
