import java.util.ArrayList;
import java.util.List;

public class Inventory {
	 public static List<Product> prodlist= new ArrayList<Product>() ;

     public static void update_inventory(int pID) {
		for(int i = 0 ;i< prodlist.size();i++)
		{
			if(prodlist.get(i).pdId==pID)
				prodlist.get(i).qty--;
		}
	}
	
	public void display() {
        System.out.println();
		System.out.println("Inventory:");
		for(int i = 0 ; i<prodlist.size(); i++)
		{
			System.out.println(prodlist.get(i).name+"- "+prodlist.get(i).qty);
		}
	}	
}

