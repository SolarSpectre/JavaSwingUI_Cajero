import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class acceso extends JFrame{
    private JTextField textField1;
    private JButton ACCESOButton;
    private JTextField contra;
    private JPanel panel_acceso;

    public acceso(){
        super("VENTANA DE ACCESO");
        setContentPane(panel_acceso);
        ACCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena =  "12345";
                String usuario = "admin";
                String contraIngresada =  contra.getText();
                String usuarioIngresado =textField1.getText();
                if(contrasena.equals(contraIngresada) && usuario.equals(usuarioIngresado)){
                    menu ventana = new menu();
                    ventana.iniciar();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Ingrese una Credenciales validas");
                    contra.setText("");
                    textField1.setText("");
                }
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
