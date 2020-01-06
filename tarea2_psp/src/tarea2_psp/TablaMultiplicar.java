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
public class TablaMultiplicar extends Thread{
    //Atributo que almacenará el multiplicador
    private int tabla;
    
    TablaMultiplicar (int tabla){
        this.tabla=tabla;
    }
    
    public void run(){
        
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d%n", tabla,i, tabla * i);
            
            try{
                //Dormimos el hilo 300 milisegundos
                Thread.sleep(300);
            }catch(Exception ex){
                ex.getMessage();
        }
        
        }
    }
}
