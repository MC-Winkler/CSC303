package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by mwinkler3 on 8/31/2015.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Red Moose");
            brands.add("Jack Amber");
        }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
