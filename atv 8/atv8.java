
package aula2;
import javax.swing.JOptionPane;
public class atv8 {
    public static void main(String[] args) {
        
        String nome, sobrenome, nomeCompleto;
        
        nome = JOptionPane.showInputDialog("Digite o seu primeiro nome: ");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        
        nomeCompleto = nome + " " + sobrenome;
        
        JOptionPane.showMessageDialog(null, "Seu nome completo e: " + nomeCompleto);
         
        
       
        
    }    
    
    
}
