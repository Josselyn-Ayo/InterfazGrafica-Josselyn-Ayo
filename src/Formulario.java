import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Formulario extends JFrame {
    private JPanel Formulario;
    private JTextField NombreField;
    private JTextField ApellidoField2;
    private JTextField DireccionField3;
    private JTextField TelefonoField4;
    private JTextField AñoNacimientoField5;
    private JTextField EstaturaField6;
    private JButton accion1Button;
    private JButton accion2Button;
    private JLabel resultadoLabel;

    public Formulario() {
        setTitle("FORMULARIO BASICO");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(Formulario);
        setVisible(true);



        accion1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = "Nombre: " + NombreField.getText()
               + "\nApellido:" + ApellidoField2.getText()
                +"\nDireccion:" +DireccionField3.getText()
                + "\nTelefono:" +TelefonoField4.getText()
                 +"\nAño de Nacimiento: "+ AñoNacimientoField5.getText()
                + "\nEstatura: "+ EstaturaField6.getText();
                JOptionPane.showMessageDialog(null,datos);
            }
        });

        accion2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = "<html>"+
                        "\nNombre: " + NombreField.getText() +"<br>"
                        + "\nApellido:" + ApellidoField2.getText()+"<br>"
                        +"\nDireccion:" +DireccionField3.getText()+"<br>"
                        + "\nTelefono:" +TelefonoField4.getText()+"<br>"
                        +"\nAño de Nacimiento: "+ AñoNacimientoField5.getText()+"<br>"
                        + "\nEstatura: "+ EstaturaField6.getText()+"<br>";
                resultadoLabel.setText(datos);

            }
        });
    }
}
