package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable <Pet>, Comparator <Pet> {
    String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }



    public String speak(){

        return "";
    }

    public int compareTo(Pet test) {


        return getName().compareTo(test.getName());
    }


    @Override
    public int compare(Pet o1, Pet o2) {


        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}
