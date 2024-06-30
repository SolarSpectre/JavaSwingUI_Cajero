import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depositar extends JFrame{
    private JPanel panelDeposito;
    private JButton volverAlMenuButton;
    private JButton calcularButton;
    private JTextField valor1;

    public depositar(){
        super("Depositar");
        setContentPane(panelDeposito);
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
                BalanceSaldo.depositar(valor);
                JOptionPane.showMessageDialog(null,"Se ha realizado el deposito correctamente!");
                valor1.setText("");
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
