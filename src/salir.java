import javax.swing.*;

public class salir extends JFrame {
    private JPanel salirPanel;

    public salir(){
        super("Salir");
        setContentPane(salirPanel);
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
