import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Map;
import java.util.TreeMap;

public class Shop {
    private Map<String, Double> basket = new TreeMap< String, Double>();
    private Map<String, Double> warehouse = new TreeMap<String, Double>();
    private Map<String,Double> pricelist = new TreeMap<String, Double>();


    public Shop() {

    }

    public  void refillStock(Item item){

    if (warehouse.containsKey(item.getID_name())) {
        Double qty_actual = warehouse.get(item.getID_name())+item.getQuantity();
        warehouse.put(item.getID_name(),qty_actual);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Successfully added ").
                append(item.getQuantity()).
                append(" ").
                append(item.getID_name());
        System.out.println(stringBuilder.toString());  } else {
        System.out.println("Item doesn't exist in database. Please create the item first");
    }

}    public  void removeItemFromWarehouse(Item item){

    if (warehouse.containsKey(item.getID_name())) {
        if(item.getQuantity()>warehouse.get(item.getID_name())){
            System.out.println("Operation impossible");
            System.out.println("Warehouse quantity is lower then requested amount ");
            System.out.println("Warehouse quantity is: "+warehouse.get(item.getID_name()));
            System.out.println("requested quantity is: "+item.getQuantity());
        } else {
            Double qty_actual = warehouse.get(item.getID_name())-item.getQuantity();
        warehouse.put(item.getID_name(),qty_actual);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Successfully removed ").
                append(item.getQuantity()).
                append(" ").
                append(item.getID_name());
        System.out.println(stringBuilder.toString());
        }
    } else {
        System.out.println("Item doesn't exist in database. Please create the item first");
        }
    }



public  void addNewItemToWareHouse(Item item){
        if (warehouse.containsKey(item.getID_name())) {
            System.out.println("Item already exist in database. Please create the new item's name first");
  } else {
        warehouse.put(item.getID_name(),item.getQuantity());
        pricelist.put(item.getID_name(),item.getPrice());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Successfully added ").
                append(item.getQuantity()).
                append(" ").
                append(item.getID_name());
            System.out.println(stringBuilder.toString());
    }

}

    public static void main(String[] args) {

    Item item = new Item("zabawka",2,20);
    Item item2 = new Item("lalka",2,25);
    Item item3 = new Item("autko",2,30);
    Item item4 = new Item("autko",1,30);

    Shop shop = new Shop();
    shop.addNewItemToWareHouse(item);
    shop.addNewItemToWareHouse(item2);
    shop.addNewItemToWareHouse(item3);
    shop.addNewItemToWareHouse(item3);
    shop.removeItemFromWarehouse(item4);
    shop.removeItemFromWarehouse(item3);
    shop.refillStock(item3);

//
//        System.out.println(item.toString() + "\n"+item2.toString()+"\n"+item3.toString());
//
        System.out.println(shop.warehouse.toString());
        System.out.println(shop.pricelist.toString());

    }


}
