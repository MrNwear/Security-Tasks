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
public class thirdTask {
    
    public static void main(String[] args) {
        // Encryption for poly alphapet
        /*
        String plaintext=JOptionPane.showInputDialog(null, "plaintext : ");
        String key=JOptionPane.showInputDialog(null,"Key : ");
        String encrypted_text="";
        int pointer=0;
        int k=key.length();
        int gap=plaintext.length()-key.length();
        for (int i = 0; i < gap; i++) {
            key+=key.charAt(pointer);
            pointer++;
            if(pointer>=k)
                pointer=0;
        }
        plaintext=plaintext.toLowerCase();
        for (int i = 0; i < plaintext.length(); i++) {
            encrypted_text+=(char)((((plaintext.charAt(i)-97)+(key.charAt(i)-97))%26)+97);
        }
        JOptionPane.showMessageDialog(null, encrypted_text);
*/
        // ********* decryption code for poly alphapet ********
        /*
        String encryptedtext=JOptionPane.showInputDialog(null, "plaintext : ");
        String key=JOptionPane.showInputDialog(null,"Key : ");
        String decrypted_text="";
        int pointer=0;
        int k=key.length();
        int gap=encryptedtext.length()-key.length();
        for (int i = 0; i < gap; i++) {
            key+=key.charAt(pointer);
            pointer++;
            if(pointer>=k)
                pointer=0;
        }
        encryptedtext=encryptedtext.toLowerCase();
        for (int i = 0; i < encryptedtext.length(); i++) {
            decrypted_text+=(char)((((encryptedtext.charAt(i)-97)+26-(key.charAt(i)-97))%26)+97);
        }
        JOptionPane.showMessageDialog(null, decrypted_text);
        */
        /* // ************** affine cipher encryption task ***********\\
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String dfs=JOptionPane.showInputDialog(null,"df :");
        int df=Integer.parseInt(dfs);
        String k=JOptionPane.showInputDialog(null,"key :");
        int key=Integer.parseInt(k);
        int encrypted;
        plaintext=plaintext.toLowerCase();
        String encrypted_text="";
        
        for (int i = 0; i < plaintext.length(); i++) {
            char c=plaintext.charAt(i);
            if(c==' ')
                continue;
            encrypted=((plaintext.charAt(i)-97)*df+key)%26;
            encrypted_text+=(char)(encrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after encryption is :"+encrypted_text);
        */
        /*    ********* affine cipher decryption task *********
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String dfs=JOptionPane.showInputDialog(null,"df :");
        int df=Integer.parseInt(dfs);
        String k=JOptionPane.showInputDialog(null,"key :");
        int key=Integer.parseInt(k);
        int decrypted;
        plaintext=plaintext.toLowerCase();
        String decrypted_text="";
        
        for (int i = 0; i < plaintext.length(); i++) {
            char c=plaintext.charAt(i);
            if(c==' ')
                continue;
            decrypted=(((plaintext.charAt(i)-97)-key)/df)%26;
            decrypted_text+=(char)(decrypted+97);
            
        }
        JOptionPane.showMessageDialog(null, "your plaintext after encryption is :"+decrypted_text);
        */
    }
    
}
