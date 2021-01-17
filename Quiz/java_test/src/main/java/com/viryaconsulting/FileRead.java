package com.viryaconsulting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    String path = "C:\\Users\\ayodh\\Downloads\\Compressed\\Java tst\\java_test\\src\\main\\resources\\trades.dat";
    String line = "";

    FileRead(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(values[0]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
