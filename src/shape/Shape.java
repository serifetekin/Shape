/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author AYBU
 */
 class Shape {

    int x, y;
    double cevre;
    double alan;
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }
    
    public void cevreGoster(){
        System.out.println("Cevre degeri: " + cevre);
    }
    public void alanGoster(){
        System.out.println("Alan degeri: " + alan);
    }
    public void cevreHesapla(){
        System.out.println("Bu metot subclasslarda yazilacaktir.");
    }
    public void alanHesapla(){
        System.out.println("Bu metot subclasslarda yazilacaktir.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kare k = new Kare();
        Dikdortgen d = new Dikdortgen();
        Daire da = new Daire();
        
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("X kenar�n� giriniz: ");
        int x = in1.nextInt();
        System.out.println("Y kenar�n� giriniz: ");
        int y = in2.nextInt();
        
        k.setX(x);
        d.setX(x);
        d.setY(y);
        da.setX(x);
        
        k.alanHesapla();
        k.cevreHesapla();
        d.alanHesapla();
        d.cevreHesapla();
        da.alanHesapla();
        da.cevreHesapla();
        
        System.out.println("Karenin �evresi: " + k.cevre + " Alan�: " +k.alan);
        System.out.println("Dik�rtgenin �evresi: " + d.cevre + " Alan�: " +d.alan);
        System.out.println("Dairenin �evresi: " + da.cevre + " Alan�: " +da.alan);      

    }
    
 }

class Kare extends Shape{
    
    @Override
    public void cevreHesapla(){
        cevre = 4*x;
    }
    public void alanHesapla(){
        alan = x*x;
    }
    
}
    
class Dikdortgen extends Shape{
    int y;    
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }
    
    public void cevreHesapla(){
        cevre = 2*(x+y);
    }
    public void alanHesapla(){
        alan = x*y;
    }
}
    
class Daire extends Shape{
        
    public void cevreHesapla(){
        cevre = 2*3.14*x;
    }
    public void alanHesapla(){
        alan = 2*3.14*x;
    }
}
    
    
    

