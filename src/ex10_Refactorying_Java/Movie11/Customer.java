package ex10_Refactorying_Java.Movie11;

import ex13_ChatGPT.CollectionPractice.List.List;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals;

    Customer(String name){
        this._name=name;
        _rentals=new Vector();
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public void showRentals(){
        for(int i=0; i<_rentals.size(); i++){
            System.out.println(_rentals.get(i).toString());
        }
    }

//    public void iterator(){
//        Enumeration rentals=_rentals.elements();
//        rentals.
//
//    }

}
