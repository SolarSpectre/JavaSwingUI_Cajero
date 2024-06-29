import javax.swing.*;

public class retirar extends JFrame {
    private JPanel panel_retirar;

    public retirar(){
        super("Retirar");
        setContentPane(panel_retirar);
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
