package com.example.koska.myapplication;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Zipcodes {

    private final List<Zipcode> list = new ArrayList<>();

    private static final String[][] codes =(
            ("10115", "Berlin-Mitte")
    public Zipcodes(){
                for (String[] code : codes) list.add(new Zipcode(code[0],code[i]));

    }

    public List <Zipcode search(String code, String city){
                city = city.toLowerCase();
                List<Zipcode> Lines = new ArrayList();
                for (Zipcode = : list)
                    if (z.getCode().startsWith(code) && z.getCity().toLowerCase().contains(city)) lines.add(z);
                return lines;
    }
}
