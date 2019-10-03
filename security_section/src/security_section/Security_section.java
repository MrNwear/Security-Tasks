/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_section;

import javax.swing.JOptionPane;

/**
 *
 * @author Nwear74
 */
public class Security_section {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

// security task with ignoring SPACES CAESER TECHNIQUE
        
        
        /*
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String k=JOptionPane.showInputDialog(null,"key :");
        int key=Integer.parseInt(k);
        int encrypted;
        plaintext=plaintext.toLowerCase();
        String encrypted_text="";
        
        for (int i = 0; i < plaintext.length(); i++) {
            char c=plaintext.charAt(i);
            if(c==' ')
                continue;
            encrypted=(plaintext.charAt(i)-97+key)%26;
            encrypted_text+=(char)(encrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after encryption is :"+encrypted_text);
    
            
            // decryption code for caeser tech without spaces
            int decrypted;
        for (int i = 0; i < encrypted_text.length(); i++) {
            char c=encrypted_text.charAt(i);
            
            decrypted=(encrypted_text.charAt(i)-97+(26-key))%26;
            
            decrypted_text+=(char)(decrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after decryption is :"+decrypted_text);
    
    


*/
            
        // SECURITY TASK  CAESER TECHNIQUE
        
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String k=JOptionPane.showInputDialog(null,"key :");
        int key=Integer.parseInt(k);
        int encrypted;
        plaintext=plaintext.toLowerCase();
        String encrypted_text="",decrypted_text="";
        for (int i = 0; i < plaintext.length(); i++) {
            char c=plaintext.charAt(i);
                
            if(c==' '){
            
                encrypted_text+="-";
                continue;
            
            }
            encrypted=(plaintext.charAt(i)-97+key)%26;
            
            encrypted_text+=(char)(encrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after encryption is :"+encrypted_text);
        
        
        //decryption code for caeser tech 
        
        int decrypted;
        for (int i = 0; i < encrypted_text.length(); i++) {
            char c=encrypted_text.charAt(i);
                
            if(c=='-'){
            
                decrypted_text+=" ";
                continue;
            
            }
            decrypted=(encrypted_text.charAt(i)-97+(26-key))%26;
            
            decrypted_text+=(char)(decrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after decryption is :"+decrypted_text);
    
    
    
    }
    
    
}
