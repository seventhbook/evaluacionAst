
package Main;

import java.util.Random;
import java.util.Scanner;
import prob1.Rectangulo;

public class Main {
    public static void main(String[] args) {
        //Problema 1
        //prob1();
        
        //Problema 2
        //prob2();
        
        //Problema 3
        //prob3();
        
        //Problema 7
        prob7();
        
        //Problema 8
        //prob8();
        
        
    }
   
    public static void prob1(){
        Rectangulo r=new Rectangulo();
        r.CalcularArea();
        System.out.println("Area r1= "+r.getArea());
        
        Rectangulo r2=new Rectangulo();
        r2.CalcularArea(25,5);
        System.out.println("Area r2= "+r2.getArea());
    }
    
    public static void prob2() {
        String[] nombres={"juan","pedro","jose","maria","sofia"};
        for (int i=0;i<nombres.length;i++){
            String aux="";
            aux=nombres[i].substring(0, 1).toUpperCase()+nombres[i].substring(1);
            nombres[i]=aux;
        }
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
    
    public static void prob3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame n= ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Error");
            return;
        }
        int aux=1;
        for(int j=0;j<=n;j++){
            for(int k=0;k<j;k++){
                System.out.print(aux+" ");
                aux++;
            }
            System.out.println("");
        }
    }
    
    public static void prob7(){
        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);
        int numeroMist=rnd.nextInt(101);
        int cont=0;
        int adiv=0;
        while(cont<5){
            cont++;
            System.out.println("Inteto "+cont+". Adivina el número: ");
            adiv=sc.nextInt();
            if(adiv==numeroMist){
                System.out.println("Adivinaste el numero felicidades");
                break;
            }
            if(adiv>numeroMist){
                System.out.println("Fallaste el numero es menor");
                continue;
            }
            if(adiv<numeroMist){
                System.out.println("Fallaste el numero es mayor");
                continue;
            }
        }
        System.out.println("El numero era: "+numeroMist);
    }
    
    public static void prob8() {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Dame a: ");
        a=sc.nextInt();
        System.out.println("Dame b: ");
        b=sc.nextInt();
        System.out.println("Dame c: ");
        c=sc.nextInt();
        
        if(a>b){
            if(a>c){
                if(c>b){
                    System.out.println(a+" "+c+" "+b);
                }else{
                    System.out.println(a+" "+b+" "+c);
                }
            }else{
                System.out.println(c+" "+a+" "+b);
            }
        }else{
            if(b>c){
                if(c>a){
                    System.out.println(b+" "+c+" "+a);
                }
                else{
                    System.out.println(b+" "+a +" "+c);
                }
            }else{
                System.out.println(c+" "+b+" "+a);
                
            }
        }
        
    }
    
}
