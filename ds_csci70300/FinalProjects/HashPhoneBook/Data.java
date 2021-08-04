import java.io.*;
import java.util.*;
import java.lang.*;

public class Data {

  //private data;
  //private List<String> data =new ArrayList<String>();
  List<String>  data; 
  
  //constructor without value
  public Data() {
  data = new ArrayList<String>(3);
  } 
  //constructor with value
  public Data(String lN, String fN,  String pN) {
  data = new ArrayList<String>(3);
    data.add(lN);
    data.add(fN);
    data.add(pN);
  } 

  public void add(String lN, String fN,  String pN) {
    data.add(lN);
    data.add(fN);
    data.add(pN);

  }
// I don't need for now
  public void clear(){
    data.clear();
  }

  public boolean contains (String s){
    if (data.get(0) == s){ 
      return true;
    }
    return false;
  }

  public String get (int index){
    return data.get(index);
  }
  public String toString(){
    String s =String.format("%-25s %-25s",data.get(0),data.get(1))+data.get(2).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    return s;
  }
}