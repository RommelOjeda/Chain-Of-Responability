/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.chain.of.responability;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChainOfResponability {

    public static void main(String[] args) {
        String[] carreras = {
            "Suma",
            "Resta",
            "Multiplicacion",
            "Dividir"
        };

        ImageIcon icon = new ImageIcon();
        String resp = (String) JOptionPane.showInputDialog(null,
                "Seleccione una operacion", "Operaciones",
                JOptionPane.DEFAULT_OPTION, icon,
                carreras, carreras[0]);
        JOptionPane.showMessageDialog(null, "escogiste la operacion " + resp);
        String respuesta1 = JOptionPane.showInputDialog("ingrese el primer digito");
        String respuesta2 = JOptionPane.showInputDialog("Escribe el segundo digito");
        int number1 = Integer.parseInt(respuesta1);
        int number2 = Integer.parseInt(respuesta2);
        
        
        int c= 0;
        while (c<=0) {
        int ra = ramdom();
        int de = ramdom2();
        
        switch (ra) {
            case 1:
                        if(de==1){
                            int oper = ManejadorConcreto1(number1,number2,resp);
                            JOptionPane.showMessageDialog(null, "La Operacion fue realizada con exito " + oper);
                            
                        }else{
                            System.out.println("el proceso cambio de manejador");
                        }

                
                break;
            case 2:
                        if(de==1){
                            int oper = ManejadorConcreto2(number1,number2,resp);
                            JOptionPane.showMessageDialog(null, "La Operacion fue realizada con exito " + oper);  
                            
                        }else{
                            System.out.println("el proceso cambio de manejador");
                        }

                break;
            case 3:
                        if(de==1){
                            int oper = ManejadorConcreto3(number1,number2,resp);
                            JOptionPane.showMessageDialog(null, "La Operacion fue realizada con exito " + oper);                            
                           
                        }else{
                            System.out.println("el proceso cambio de manejador");
                        }

                break;
            default:
        }                    
        }
    }

    public static void Manejador() {

    }

    public static int ManejadorConcreto1(int x,int y,String fun) {
        int operaciom=0;

       
          if(fun=="Suma"){
              operaciom=x+y;
        }if(fun=="Resta"){
            operaciom=x-y;
            
        }if(fun=="Multiplicacion"){
            operaciom=x*y;
        }if(fun=="Dividir"){
            operaciom=x/y;
        }

        return operaciom;
        }

    public static int ManejadorConcreto2(int x,int y,String fun) {
        int operaciom=0;

       
          if(fun=="Suma"){
              operaciom=x+y;
        }if(fun=="Resta"){
            operaciom=x-y;
            
        }if(fun=="Multiplicacion"){
            operaciom=x*y;
        }if(fun=="Dividir"){
            operaciom=x/y;
        }

        return operaciom;
        }
    
    public static int ManejadorConcreto3(int x,int y,String fun) {
        int operaciom=0;

       
          if(fun=="Suma"){
              operaciom=x+y;
        }if(fun=="Resta"){
            operaciom=x-y;
            
        }if(fun=="Multiplicacion"){
            operaciom=x*y;
        }if(fun=="Dividir"){
            operaciom=x/y;
        }

        return operaciom;
        }

    public static int ramdom() {
        Random r1 = new Random();
        int valorDado = r1.nextInt(3) + 1;
        System.out.println(valorDado);

        return valorDado;
    }
    
    public static int ramdom2() {
        Random r1 = new Random();
        int valorDado = r1.nextInt(1) + 1;
        System.out.println(valorDado);

        return valorDado;
    }
}
