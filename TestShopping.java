import java.util.Scanner;

public class TestShopping {
	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Inventory i1=new Inventory();
        Customer c1 = new Customer("Vasi", "v2802@gmail.com","987654321");

		Product p0 = new Product("Laptop" , "Apple" , 100 , 159999);
		Product p1 = new Product("Shoes","PUMA", 200,2000);
		Product p2 = new Product("Mobile", "VIVO", 100, 10999);
		Product p3 = new Product("Spectacles", "Lenskart", 160,499);
		Product p4 = new Product("Speaker", "boAT",240 , 1699);			
		i1.prodlist.add(p0);
		i1.prodlist.add(p1);
		i1.prodlist.add(p2);
		i1.prodlist.add(p3);
		i1.prodlist.add(p4);

        System.out.println("Items Available in inventory initially with quantity : ");
        i1.display();
	    int  res= 1;		
		do
		{
            System.out.println();
			System.out.println("Enter the Item number you want to select from below list :  ");
			
			for(int i = 0 ; i<i1.prodlist.size();i++)
			{
				System.out.println(i1.prodlist.get(i).pdId+" :: "+i1.prodlist.get(i).name);
			}
			
			int option = scn.nextInt();			
			c1.add_to_cart(option);
		
			
			System.out.println("Do you want to continue? 1 for YES and 0 for NO");
			int k= scn.nextInt();
			if(k==0)
			{
				c1.c.display();
				System.out.println("Total amount of product in your cart --> "+Cart.amount);
				res=0;
			}
			
		}while(res==1);
		i1.display();
		
	}

}