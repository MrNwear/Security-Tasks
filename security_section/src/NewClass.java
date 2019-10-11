
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
        int n=in.nextInt();
        String s="";
        for (int i = 1; i <= n; i++) {
            s+=Integer.toString(i);
        }
        System.out.println(s.charAt(n-1));
    }
}
 