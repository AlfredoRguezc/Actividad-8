/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg8.pkg1;

/**
 *
 * @author Alfredo
 */
public class Actividad81 {


    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deck nuevo = new Deck() ;
        //
       nuevo.shuffle();
       System.out.print("\n  \n");
       nuevo.head();
       System.out.print("\n ");
       nuevo.pick();
       System.out.print("\n ");
       nuevo.hand();
    }
    
}
