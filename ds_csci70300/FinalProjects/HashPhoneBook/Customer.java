import java.io.*;
import java.util.*;
import java.lang.*;

public class Customer {

  //private Customer next;
  //private LinkedList<Data> customer; 
  private LinkedList<Data> customer; 


  Data data = new Data();
  // constructor empty
  public Customer() {
    customer = new LinkedList<Data>();

  } 

      //constructor with value
  public Customer(String lN, String fN,  String pN) {
    customer = new LinkedList<Data>();
    data.add(lN,fN,pN);
    customer.add(data);
    //next= null;
  } 
  
  //set  Customer
  

public void set(int index, Data d){
  customer.set(index,d);
}
public void addFirst(Data d){
  customer.addFirst(d);
}
public void add(Data d){
  customer.add(d);
}

public void addIndex(int index, Data d){
  customer.add(index, d);
}

  // get customer
  public Data get(int index) {  
    return customer.get(index);
  }
  
  public boolean removeCustomer(String s){
    boolean b = false;
    //customer.element();
    for (int i = 0; i < customer.size(); i++) {
      data =  get(i);

      if (data.contains(s)){
        b= true;
        customer.remove(i);
        return b;
      }
    }
    return b;
  }
 
  public void remove(int index) {  
    customer.remove(index);
  }
  public int size() {  
    return customer.size();
  }
  public void clear() {  
    customer.clear();
  }
  public Iterator iterator(){
    return customer.iterator();
  }
  public Data element(){
    return customer.element();
  }
  public Data peekLast(){
    return customer.peekLast();
  }
  
  public  void printCustomer(){
  //customer.element();
  Iterator it = customer.iterator();
    while(it.hasNext()){
       System.out.println(it.next());
    }
  }
  public String toString(){
  //return customer.get(0).toString()+ ","+customer.get(1).toString()
  return customer.get(1).toString();
  }
  public int hashCode(String name) {
    return name.hashCode() % 100;
  }
}//class Node