package csc402.week6;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);

        bst.insert(60);
        bst.insert(80);
        bst.insert(90);
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(35);
        bst.insert(45);
        bst.insert(75);
        bst.insert(85);
        bst.insert(95);
        bst.insert(100);
        bst.insert(110);
        bst.insert(120);
        bst.insert(130);
        bst.insert(140);
        bst.insert(150);
        bst.insert(160);
        bst.insert(170);
        bst.insert(180);
        bst.insert(190);
        bst.insert(200);
        bst.insert(210);
        bst.insert(220);
        bst.insert(230);
        System.out.println("Search 40: " + bst.search(40)); // true
        System.out.println("Search 90: " + bst.search(90)); // false

       
    }
}
