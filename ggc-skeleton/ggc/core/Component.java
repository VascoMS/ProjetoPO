package ggc.core;

import java.io.Serializable;

public class Component implements Serializable{
    private Product _product;
    private int _quantity;
    
    public Component(int quantity, Product product){
        _product=product;
        _quantity=quantity;
    }

    public Product getProduct(){
        return _product;
    }

    public int getQuantity(){
        return _quantity;
    }

    @Override
    public String toString(){
		return ""+_product+":"+_quantity; 
        
    }
}
