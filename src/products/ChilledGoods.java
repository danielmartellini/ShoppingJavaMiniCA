/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author danie
 */
public abstract class ChilledGoods {

    private String size;
    private double price;
    private int numItems;

    /**
     *
     * @param size because it could be kg, grams or liters
     * @param numItems
     * @param price
     */
    public ChilledGoods(String size, int numItems, double price) {
        this.size = size;
        this.numItems = 1;
        this.price = price;

    }

    public double getPrice() {
        return price * numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }
   @Override
    public String toString(){
        
        return this.numItems+" "+size+" for "+getPrice()+"EURO";
    }
    
}
