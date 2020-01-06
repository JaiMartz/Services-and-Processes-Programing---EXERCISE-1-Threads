/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_psp;
/**
 *
 * @author Jairo
 */

public class HiloPrincipal {
    public static void main(String[] args){
        
        System.out.println("******************************************\n" +
                "\n" +
                "* PSP - Tarea 2                          *\n" +
                "\n" +
                "******************************************\n" +
                "\n" +
                "* Jairo Martínez Garrido *\n" +
                "\n" +
                "******************************************\n" +
                "\n" +
                "* DNI 76652856C                          *\n" +
                "\n" +
                "******************************************");
         for(int i =1; i<=10; i++){
            //Creamos un objeto TablaMultiplicar el cual recibe
            //el parametro i para indicar el multiplicador
            TablaMultiplicar tabla = new TablaMultiplicar(i);
            
            //Creamos un hilo de ejecución para el objeto tabla
            Thread hilo = new Thread(tabla);
                try{
                    //Iniciamos el hilo
                    hilo.start();
                    System.out.println("TABLA DEL "+i);
                    //Indicamos al hilo padre que no inicie nuevos hilos hasta que este acabe
                    hilo.join();
            }catch(Exception e){
                System.out.println("Error... "+e.getMessage());
            }
        }
    } 
}
