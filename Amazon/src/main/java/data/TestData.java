package data;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static String item1 = "java books";
    public static String item2 = "tooth paste";
    public static String item3 = "coffee";
    public static String item4 = "laptop";
    public static String item5 = "honey";

    //connect to Database, then read all the items name fr
    // om database

    public static List<String> getListOfItems(){
        List<String> list = new ArrayList<String>();
        list.add("java books");
        list.add("tooth paste");
        list.add("coffee");
        list.add("laptop");
        list.add("honey");

        return list;
    }


}
