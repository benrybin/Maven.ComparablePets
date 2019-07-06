package io.zipcoder;

public class Snake extends Pet {

    public Snake(String petName) {

        setName(petName);

    }
    public String getname(){
        return getName();
    }
    public String speak(){


        return "ZZZZzzz";
    }
}
