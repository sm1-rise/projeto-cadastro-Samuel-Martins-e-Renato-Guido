package handler;

import domains.product.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Data {

    /*
   * Arraylist responsável por armazenar lista de produtos
     */

    public static ArrayList<Product> products = new ArrayList<>();

    //Método para salvar Arraylist produtos em um arquivo.txt
    public static String salvar() {
        try {
            FileWriter fw = new FileWriter("Save.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(Data.products);
            fw.flush();
            pw.close();
            fw.close();

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

}
