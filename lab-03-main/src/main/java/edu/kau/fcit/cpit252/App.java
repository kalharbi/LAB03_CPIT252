package edu.kau.fcit.cpit252;
/*
Faris Mohammed AlNahdi 
1935595
*/
public class App {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Accord", 2019);
        // print car and recall info
        System.out.println(c1);
        // create a duplicate car object to print the recall info in a table
        Car c2 = c1.clone(); 
        RecallViewer rv = new RecallViewer(c2);
        //full info will be displayed without having the need to send another HTTP request  
        rv.printTableView();
    }
}
