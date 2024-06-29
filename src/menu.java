import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JButton salirButton;
    private JPanel panel_menu;
    private JButton depositarButton;
    private JButton verSaldoButton;
    private JButton retirarButton;

    public menu(){
        super("Menu");
        setContentPane(panel_menu);
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir ventana = new salir();
                ventana.iniciar();
                dispose();
            }
        });

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositar ventana = new depositar();
                ventana.iniciar();
                dispose();
            }
        });
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retirar ventana = new retirar();
                ventana.iniciar();
                dispose();
            }
        });
        verSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saldo ventana = new saldo();
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
