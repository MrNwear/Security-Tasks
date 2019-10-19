
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nwear74
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String ch=in.next();
        String s=in.next();
        String line1="qwertyuiop";
        String line2="asdfghjkl;";
        String line3="zxcvbnm,./";
        String out="";
        int x=0;
        if(ch.charAt(0)=='R')
            x=-1;
        else if(ch.charAt(0)=='L')
            x=1;
        for (int i = 0; i < s.length(); i++) {
         char chs=s.charAt(i);
            if(line1.indexOf(chs)!= -1){
                int loc=line1.indexOf(chs);
            out+=line1.charAt(loc+x);
            }
            else if(line2.indexOf(chs)!= -1){
                int loc=line2.indexOf(chs);
            out+=line2.charAt(loc+x);
            }
            else if(line3.indexOf(chs)!= -1){
                int loc=line3.indexOf(chs);
            out+=line3.charAt(loc+x);
            }
        }
        System.out.println(out);
    }
}
 