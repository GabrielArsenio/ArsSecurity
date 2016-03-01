package arssecurity;

import arssecurity.util.SHA2;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Arsênio
 */
public class ArsSecurity {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Informe a senha");

        try {
            senha = new SHA2().getSha2(senha);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criptografar senha:\n" + ex.getMessage());
        }

        JOptionPane.showInputDialog(null, "Senha criptografada", senha);
    }

}
