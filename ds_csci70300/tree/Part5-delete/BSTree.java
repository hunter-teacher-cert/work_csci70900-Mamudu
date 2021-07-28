import java.io.*;
import java.util.*;

public class BSTree {
  private TreeNode root;

  public BSTree(){
    root = null;
  }


  public void delete(int key){

    // if the tree is empty, nothing to delete
    if (root==null){
      return;
    }

    // find the node we want to delete
    // and the node above it using piggybacking
    TreeNode front = root;
    TreeNode trailer = root;
    // keep track of which child front is (of trailer)
    boolean frontIsALeftChild = true;

    // stop if we found the key
    // do the piggyback loop
    // until we either find the node or null
    // if the key isn't present
    while (front != null && front.getData() != key){
      if (front.getData() < key){
        trailer = front;
        front = front.getRight();
        frontIsALeftChild = false;
      } else {
        trailer = front;
        front = front.getLeft();
        frontIsALeftChild = true;
      }
    }

    // if key wasn't in tree
    if(front == null){
      return;
    }
    // if we get here:
    // front points to node we want to delete
    // trailer points to its parent

    // case 1: // node to delete is a leaf
    if(front.getLeft() == null && front.getRight() == null){
      // point parent to null
      if(root == front){
        root = null;
      } else if(frontIsALeftChild){
        trailer.setLeft(null);
      } else {
        trailer.setRight(null);
      }
    }
    // case 2a: front has one child (on right)
    else if(front.getLeft() == null){
      if(root == front){
        root = front.getRight();
      } else if(frontIsALeftChild){
        trailer.setLeft(front.getRight());
      } else { // front is a right child
        trailer.setRight(front.getRight());
      }
    }
    // case 2b: front has one child (on left)
    else if(front.getRight() == null){
      if(root == front){
        root = front.getLeft();
      } else if(frontIsALeftChild){
        trailer.setLeft(front.getLeft());
      } else { // front is a right child
        trailer.setRight(front.getLeft());
      }
    }
    // case 3: front has two children
    else {
      // find the node with the largest value
	    // on fronts left subtree
	    // and replace front with it.

      // find node with largest value on front's left subtree
      TreeNode largestOnLeft = front.getLeft();
      while(largestOnLeft.getRight() != null){
        largestOnLeft = largestOnLeft.getRight();
      }

      if(root == front){
        delete(largestOnLeft.getData()); // largestOnLeft had at most one node, so LonL's parent will (at most) point to LonL's child
        largestOnLeft.setRight(front.getRight()); // we know largestOnLeft didn't have a right child
        largestOnLeft.setLeft(front.getLeft()); // overwrite, if any
        root = largestOnLeft;
      }

      // replace front with largestOnLeft
      else if(frontIsALeftChild){
        // MISTAKE: this overwrites the front node, deleting fronts right subtree
        // trailer.setLeft(largestOnLeft);

        delete(largestOnLeft.getData()); // largestOnLeft had at most one node, so LonL's parent will (at most) point to LonL's child
        largestOnLeft.setRight(front.getRight()); // we know largestOnLeft didn't have a right child
        largestOnLeft.setLeft(front.getLeft()); // overwrite, if any
        trailer.setLeft(largestOnLeft); // deletes front
      } else { // front is a right child
        // MISTAKE: this overwrites the front node, deleting fronts right subtree
        // trailer.setRight(largestOnLeft);

        delete(largestOnLeft.getData()); // largestOnLeft had at most one node, so LonL's parent will (at most) point to LonL's child
        largestOnLeft.setRight(front.getRight()); // we know largestOnLeft didn't have a right child
        largestOnLeft.setLeft(front.getLeft()); // overwrite, if any
        trailer.setRight(largestOnLeft); // deletes front


      }
    }

  }

  private void preorderTraverse(TreeNode current){
    if(current == null){
      return;
    }

    // process current node
    System.out.print(current.getData() + ", ");

    // recursively print left subtree
    preorderTraverse(current.getLeft());

    // recursively print right subtree
    preorderTraverse(current.getRight());

  }

  public void preorderTraverse(){
    preorderTraverse(root);
    System.out.println();
  }

  private void postorderTraverse(TreeNode current){
    if(current == null){
      return;
    }

    // recursively print left subtree
    postorderTraverse(current.getLeft());

    // recursively print right subtree
    postorderTraverse(current.getRight());

    // process current node
    System.out.print(current.getData() + ", ");

  }

  public void postorderTraverse(){
    postorderTraverse(root);
    System.out.println();
  }

  private void inorderTraverse(TreeNode current){
    if(current == null){
      return;
    }

    // recursively print left subtree
    inorderTraverse(current.getLeft());

    // process current node
    System.out.print(current.getData() + ", ");

    // recursively print right subtree
    inorderTraverse(current.getRight());

  }

  public void inorderTraverse(){
    inorderTraverse(root);
    System.out.println();
  }



  public void insert(int key){

    TreeNode newNode = new TreeNode(key);

    // if the tree is empty
    // manually insert the new node as the root
    if (root == null){
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = root;

    while (front != null){
      int frontValue = front.getData();
      if (frontValue == key){
        // if we're here, it means the key is
        // already in the tree so we can
        // update this node in some way
        // and then return
        return;
      } else if (frontValue < key){
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }
    if (key > trailer.getData()){
      // insert on the right
      trailer.setRight(newNode);
    } else {
      // insert on left
      trailer.setLeft(newNode);
    }
  }

  public int search(int key){
    TreeNode current = root;

    while (current != null){
      int currentValue = current.getData();
      if (currentValue == key){
        return key;
      } else if (currentValue < key){
        current = current.getRight();
      } else {
        current = current.getLeft();
      }
    }
    throw new NullPointerException();
  }

  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }


}