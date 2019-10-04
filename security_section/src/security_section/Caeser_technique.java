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
public class Caeser_technique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

// ********security task with ignoring SPACES CAESER TECHNIQUE******
        
        
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
      
        
        /*
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
    
    
    */
        
        
        
        
        
        /* 
            // **********Transposition cipher (encryption code )**********
        
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String k=JOptionPane.showInputDialog(null,"key :");
        char[][] a=new char [300][300];
        int row=0,column=0;
        for (int i = 0; i < plaintext.length(); i++) {
            if(plaintext.charAt(i)==' ')
                continue;
            a[row][column]=plaintext.charAt(i);
            column++;
            if(column==k.length()){
            column=0;
            row++;
            }
        }
        if(column==0){
            
        }
        else
        {
            int times=k.length()-column;
            for(int i = 0; i < times; i++) {
                a[row][column]=(char)('A'+i);
                
                column++;
                
            }
        }
        int idx=0;
        int [] order=new int [k.length()+2];
        for (int i = 0; i < 26; i++) {
            if(k.indexOf((char)('a'+i))!=-1){
            order[idx]=k.indexOf((char)('a'+i));
            idx++;
            
            }
        }
        String encrypted_txt="";
        for (int i = 0; i < k.length(); i++) {
            int index=order[i];
            
            for (int j = 0; j <= row; j++) {
                encrypted_txt+=a[j][index];
        
            }
        }
        System.out.println(encrypted_txt);
        */

        
            // **********Transposition cipher (decryption code )**********
        
        
        String plaintext=JOptionPane.showInputDialog(null,"enter the plaintext you want to encrypt");
        String k=JOptionPane.showInputDialog(null,"key :");
        char[][] a=new char [300][300];
        int row,column;
        
        int idx=0;
        int [] order=new int [k.length()+2];
        for (int i = 0; i < 26; i++) {
            if(k.indexOf((char)('a'+i))!=-1){
            order[idx]=k.indexOf((char)('a'+i));
            idx++;
            
            }
        }
        row=plaintext.length()/k.length();
        idx=0;
        for (int i = 0; i < k.length(); i++) {
            int index=order[i];
            
            for (int j = 0; j < row; j++) {
                
                a[j][index]=plaintext.charAt(idx);
                idx++;
                if(idx==plaintext.length())
                    break;
                
            }
            
                if(idx==plaintext.length())
                    break;
        }
        row=0;
        column=0;
        String temp="";
        for (int i = 0; i < plaintext.length(); i++) {
            
            temp+=a[row][column];
            column++;
            if(column==k.length()){
            column=0;
            row++;
            }
        }
        
        System.out.println(temp);
        
}}

// eomsnaliyewrhlaofe