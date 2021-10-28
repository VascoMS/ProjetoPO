package ggc.core;

import java.io.Serializable;

public class Batch implements Serializable{
    private double _price;
    private int _quantity;
    private Partner _partner;
    private Product _product;

public Batch(double price, int quantity, Partner partner, Product product){
    _price=price;
    _quantity=quantity;
    _partner=partner;
    _product=product;
}

public double getPrice(){
    return _price;
}
public int getQuantity(){
    return _quantity;
}
public Partner getPartner(){
    return _partner;
}
public Product getProduct(){
    return _product;
}

@Override
public String toString(){
    return ""+_product.getId()+"|"+_partner.getId()+"|"+(int)_price+"|"+_quantity;
}

Batch makeCopy(){
    return new Batch(_price, _quantity, _partner, _product);
}

}
