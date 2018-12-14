package sample;

import java.io.IOException;
import java.nio.file.Path;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtil {
    List<Book> books = new ArrayList<>();
    Path pathToFile = Paths.get("Water_Consumption_In_The_New_York_City.csv");

    try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){

    }catch(IOException ioe){
        ioe.printStackTrace();
    }

}
