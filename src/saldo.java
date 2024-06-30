import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saldo extends JFrame {
    private JPanel panel_saldo;
    private JLabel saldo;
    private JButton salirButton;
    private JButton regresarAlMenuButton;

    public saldo (){
        super("Saldo");
        setContentPane(panel_saldo);
        saldo.setText(String.valueOf(BalanceSaldo.getSaldo()));
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir ventana = new salir();
                ventana.iniciar();
                dispose();
            }
        });
        regresarAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu ventana = new menu();
                ventana.iniciar();
                dispose();
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
