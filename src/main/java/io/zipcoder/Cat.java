package io.zipcoder;

public class Cat extends Pet {

    public Cat(String petName) {

        setName(petName);

    }
    public String getname(){
        return getName();
    }
    public String speak(){


        return "Meow";
    }

}
