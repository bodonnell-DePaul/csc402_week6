package csc402.week6;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String csvFile = "/home/bodonnell/csc402/lectures/week6/demo/202303300_batting.csv";
        BinarySearchTree bst = new BinarySearchTree();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> records = reader.readAll();
            String[] headers = records.get(0); // First row is the header
            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                PositionPlayer person = new PositionPlayer();
                for (int j = 0; j < headers.length; j++) {
                    person.setAttribute(headers[j], record[j]);
                }
                bst.insert(person);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        // BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(50);
        // bst.insert(30);
        // bst.insert(20);
        // bst.insert(40);
        // bst.insert(70);

        // bst.insert(60);
        // bst.insert(80);
        // bst.insert(90);
        // bst.insert(10);
        // bst.insert(5);
        // bst.insert(15);
        // bst.insert(35);
        // bst.insert(45);
        // bst.insert(75);
        // bst.insert(85);
        // bst.insert(95);
        // bst.insert(100);
        // bst.insert(110);
        // bst.insert(120);
        // bst.insert(130);
        // bst.insert(140);
        // bst.insert(150);
        // bst.insert(160);
        // bst.insert(170);
        // bst.insert(180);
        // bst.insert(190);
        // bst.insert(200);
        // bst.insert(210);
        // bst.insert(220);
        // bst.insert(230);
        // System.out.println("Search 40: " + bst.search(40)); // true
        // System.out.println("Search 90: " + bst.search(90)); // false

       
    }
}
