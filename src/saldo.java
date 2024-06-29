import javax.swing.*;

public class saldo extends JFrame {
    private JPanel panel_saldo;

    public saldo (){
        super("Saldo");
        setContentPane(panel_saldo);
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
