import java.lang.Object;
import java.util.*;

public class Piece {
	int numberofpiece=8;
	ArrayList<String> piece = new ArrayList<String>(numberofpiece); 
    String Piece[]={"Plane","Car","Ship","Shoe","Hat","Cat","Robot","Cannon"};
	
    public Piece() {
    // Appending the pieces at the list. 
    	Player player =new Player();
    	@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
    	
    	int i=0;
    	while(i<player.getPlayerNum()) {
    		String playerpiece=scan.nextLine();
    		piece.add(playerpiece); 
    	i++;
    	}
    	   for (int y=0; y<=numberofpiece; y++) 
    		   piece.add(Piece[y]); 
    }
     // Remove unused piece. 
    public void removepiece(int removedpiece) {
    	piece.remove(Piece[removedpiece]);
    }
    
    public void printpiece() {
    // Printing elements one by one 
    for (int i=0; i<piece.size(); i++) 
        System.out.print(piece.get(i)+" "); 
    
    } 
}
