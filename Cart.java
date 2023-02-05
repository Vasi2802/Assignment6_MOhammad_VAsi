import java.util.HashMap;
import java.util.Map;

public class Cart {
	int id;
	static Map <String , Integer> cartList = new HashMap <>(); 
	static double amount;
	
    public  void display() {
        System.out.println("Items in your Cart with quantity are : \n");
         for (Map.Entry<String,Integer> entry : cartList.entrySet()) 
                System.out.println(entry.getKey() + "-->" + entry.getValue());
        
    }

	public static void item_added(int pdtId) {
     	if(cartList.containsKey(Inventory.prodlist.get(pdtId-1).name))
		{
			cartList.put(Inventory.prodlist.get(pdtId-1).name, cartList.get(Inventory.prodlist.get(pdtId-1).name) + 1);
			amount+=Inventory.prodlist.get(pdtId-1).price;
		}
			
        else
        	{
        		cartList.put(Inventory.prodlist.get(pdtId-1).name, 1);
        		amount+=Inventory.prodlist.get(pdtId-1).price;
        	}
        }
}
