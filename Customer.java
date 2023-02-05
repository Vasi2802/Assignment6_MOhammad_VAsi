public class Customer {
    String c_name;
    String c_email;
    String c_phone;
    Cart c;
    public Customer(String name, String email , String phone ) {
       
        this.c_name =name;
        this.c_email=email;
        this.c_phone=phone;
        this.c = new Cart();
    }
    
   public void add_to_cart(int id) {
        c.item_added(id);
        Inventory.update_inventory(id);
       
   }
   }
   
   