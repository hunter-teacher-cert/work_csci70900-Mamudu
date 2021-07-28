import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
    BSTree t = new BSTree();

    t.seed();
    int value;

    // Part 1: testing search

    value = t.search(10);
    System.out.println(value);

    value = t.search(22);
    System.out.println(value);

    try {
      value = t.search(17);
      System.out.println(value);
    } catch (NullPointerException e) {
      System.out.println("17 not in tree");
    }

    // Part 3: testing insert

    try {
      value = t.search(13);
      System.out.println(value);
    } catch (NullPointerException e) {
      System.out.println("13 not in tree");
    }
    System.out.println("Inserting 13...");
    t.insert(13);
    System.out.println(t.search(13));

    // Part 4: testing traverse

    t.preorderTraverse();
    t.postorderTraverse();
    t.inorderTraverse();

    // Part 5: testing delete
    t.delete(2);
    System.out.println("Deleting 2 (not present)");
    t.inorderTraverse();

    // case 1: leaf
    System.out.println("Deleting 22");
    t.delete(22);

    // case 2: one child
    System.out.println("Deleting 15");
    t.delete(15);

    // case 3: two children
    System.out.println("Deleting 10");
    t.delete(10);


    t.inorderTraverse();

  }
}
// ALL PARTS TESTED SUCCESSFULLY