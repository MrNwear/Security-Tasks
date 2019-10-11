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
public class second_task_full_vegnie {
    public static void main(String[] args) {
        // Encryption for full vegnie
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
        // ********* decryption code for full vegnie ********
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
        
        //*********** encryption for playfair Cipher *************\\
        /* 
        String plaintext=JOptionPane.showInputDialog(null, "plaintext : ");
        String key=JOptionPane.showInputDialog(null,"Key : ");
        String encrypted_text="";
        char [][] matrix=new char[5][5];
        String added="";
        char init='a';
        int r=0;
        int c=0;
        int [] charIndex=new int[26];
       
        for (int i = 0; i < key.length(); i++) {
            
            if(added.indexOf(key.charAt(i))==-1){
            added+=key.charAt(i);
            if(key.charAt(i)=='i'){
                added+='j';
                charIndex['j'-'a']=c+r*5;
            }
                else if(key.charAt(i)=='j'){
                added+='i';
                charIndex['i'-'a']=c+r*5;
                }
            matrix[r][c]=key.charAt(i);
            charIndex[key.charAt(i)-'a']=c+r*5;
          //      System.out.println(r+" "+c);
            c++;
            }
           else
                continue;
            if(c==5){
                r++;
                c=0;
            }
            //asdfewqjfgi
            }
        
        //System.out.println(added);
        
        for(int i=r;i<5;i++){
            if(c==5){
                c=0;
            }
            while(c<5){
         //       System.out.println(r+" "+c);
            if(added.indexOf(init)==-1){
                if(init=='i'){
                added+='j';
                charIndex['i'-'a']=c+i*5;
            }
            else if(init=='j'){
                added+='i';
                 charIndex['i'-'a']=c+i*5;
            }
                added+=init;
            matrix[i][c]=init;
            charIndex[init-'a']=c+i*5;
            c++;
            }
            init+=1;
            }
        }
      
        for(int i=0;i<plaintext.length()-1;i++){
            String block="";
            if(plaintext.charAt(i)==plaintext.charAt(i+1)){
                block+=plaintext.charAt(i);
                block+='x';
            }
            else
            {
                block+=plaintext.charAt(i);
                block+=plaintext.charAt(i+1);
                i++;
            }
            int row_char1=charIndex[block.charAt(0)-'a']/5;           
            int column_char1=(charIndex[block.charAt(0)-'a']%5);
            int row_char2=charIndex[block.charAt(1)-'a']/5;
            int column_char2=(charIndex[block.charAt(1)-'a']%5);
            
            if(row_char1==row_char2){
                
                encrypted_text+=matrix[row_char1][(column_char1+1)%5];
                encrypted_text+=matrix[row_char2][(column_char2+1)%5];
            }
            else if(column_char1==column_char2){
                
                encrypted_text+=matrix[(row_char1+1)%5][column_char1];
                encrypted_text+=matrix[(row_char2+1)%5][column_char2];
            }
            else
            {
                
                encrypted_text+=matrix[row_char1][column_char2];
                encrypted_text+=matrix[row_char2][column_char1];
                
            }
        }
    
        System.out.println(encrypted_text);
    */
        
        //*********decryption for playfair cipher*********\\
        /*
        String plaintext=JOptionPane.showInputDialog(null, "plaintext : ");
        String key=JOptionPane.showInputDialog(null,"Key : ");
        String decrypted_text="";
        char [][] matrix=new char[5][5];
        String added="";
        char init='a';
        int r=0;
        int c=0;
        int [] charIndex=new int[26];
       
        for (int i = 0; i < key.length(); i++) {
            
            if(added.indexOf(key.charAt(i))==-1){
            added+=key.charAt(i);
            if(key.charAt(i)=='i'){
                added+='j';
                charIndex['j'-'a']=c+r*5;
            }
                else if(key.charAt(i)=='j'){
                added+='i';
                charIndex['i'-'a']=c+r*5;
                }
            matrix[r][c]=key.charAt(i);
            charIndex[key.charAt(i)-'a']=c+r*5;
          //      System.out.println(r+" "+c);
            c++;
            }
           else
                continue;
            if(c==5){
                r++;
                c=0;
            }
            //asdfewqjfgi
            }
        
        //System.out.println(added);
        
        for(int i=r;i<5;i++){
            if(c==5){
                c=0;
            }
            while(c<5){
         //       System.out.println(r+" "+c);
            if(added.indexOf(init)==-1){
                if(init=='i'){
                added+='j';
                charIndex['i'-'a']=c+i*5;
            }
            else if(init=='j'){
                added+='i';
                 charIndex['i'-'a']=c+i*5;
            }
                added+=init;
            matrix[i][c]=init;
            charIndex[init-'a']=c+i*5;
            c++;
            }
            init+=1;
            }
        }
      
        for(int i=0;i<plaintext.length()-1;i++){
            String block="";
            if(plaintext.charAt(i)==plaintext.charAt(i+1)){
                block+=plaintext.charAt(i);
                block+='x';
            }
            else
            {
                block+=plaintext.charAt(i);
                block+=plaintext.charAt(i+1);
                i++;
            }
            int row_char1=charIndex[block.charAt(0)-'a']/5;           
            int column_char1=(charIndex[block.charAt(0)-'a']%5);
            int row_char2=charIndex[block.charAt(1)-'a']/5;
            int column_char2=(charIndex[block.charAt(1)-'a']%5);
            
            if(row_char1==row_char2){
                
                decrypted_text+=matrix[row_char1][(column_char1-1)%5];
                decrypted_text+=matrix[row_char2][(column_char2-1)%5];
            }
            else if(column_char1==column_char2){
                
                decrypted_text+=matrix[(row_char1-1)%5][column_char1];
                decrypted_text+=matrix[(row_char2-1)%5][column_char2];
            }
            else
            {
                
                decrypted_text+=matrix[row_char1][column_char2];
                decrypted_text+=matrix[row_char2][column_char1];
                
            }
        }
    
        System.out.println(decrypted_text);

*/
    }
    
    
}
