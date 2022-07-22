/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usalma;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class UsAlma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Sayi Giriniz:");
        int n=inp.nextInt();
        
        System.out.println(n+" Sayisindan Kucuk 4'un Kuvvetleri:");
        for(int i=1;i<=n;i*=4){
            System.out.println(i);
        }
        
        System.out.println(n+" Sayisindan Kucuk 5'un Kuvvetleri:");
        for(int i=1;i<=n;i*=5){
            System.out.println(i);
        }
    }
    
}
