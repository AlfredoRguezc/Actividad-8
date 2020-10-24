
package actividad.pkg8.pkg1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alfredo
 */
public class Deck {
    
    
    List<Card> List = new ArrayList<>();
    Card card = new Card();
    //
     public Deck() {
        Crearcartas("Tréboles", "Negro");
        Crearcartas("Corazones", "Rojo");
        Crearcartas("Picas", "Negro");
        Crearcartas("Diamantes", "Rojo");
    }
    
    public void Crearcartas(String palo , String color) {
    for (int i = 2; i < 15; i++) {
            card.setPalo(palo);
            card.setColor(color);
            card.setValor(Integer.toString(i));
            
            if(i == 11){
                
                card.setValor("J");
            }
            if(i == 12){
                card.setValor("Q");
            }
            
            if(i == 13){
                card.setValor("K");
            }
            
            if(i == 14){
                card.setValor("A");
            }
            
            List.add(card);
            card = new Card();
        }

    }
    
    
    
    public void shuffle(){
    
        System.out.print("Se mezclo del deck");
    }
    
    public void head(){
        
       System.out.print("palo: " +  List.get(0).getPalo() + "  color: "+  List.get(0).getColor()  +"  valor: "+ List.get(0).getValor());
        List.remove(0);
       System.out.print("\n Quedan "+List.size()+" cartas \n"); 
    }
    
    public void pick(){
         int Random = (int) (Math.random() * (List.size() - 1) + 0);
         
         System.out.print("palo: " +  List.get(Random).getPalo() + "  color: "+  List.get(Random).getColor()  +"  valor: "+ List.get(Random).getValor());
        List.remove(Random);
        
       System.out.print("\n Quedan "+List.size()+" cartas \n"); 
         
    }
    
    public void hand(){
        
        for(int i = 0; i < 5; i++){
        System.out.print("palo: " +  List.get(i).getPalo() + "  color: "+  List.get(i).getColor()  +"  valor: "+ List.get(i).getValor());
        System.out.print("\n");
        //System.out.print("\n Quedan "+List.size()+" cartas \n"); 
     }
        for(int i = 0; i < 5; i++){
           List.remove(i); 
        }
        
        System.out.print("\n Quedan "+List.size()+" cartas \n"); 
    }
    
    
    
}
