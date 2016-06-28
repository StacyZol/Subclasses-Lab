package com.company;

public class Main {

    public static void main(String[] args) {

     Animal cheetah = new Animal ("Robert", 4, 75,true);
        System.out.println(cheetah.getSpeed());
        System.out.println("Number of Legs: " + cheetah.getLegs());
        System.out.println("Name: " + cheetah.getName());
        System.out.println(cheetah.getIsEndangered());
    Animal cheetah2 = new Animal ();
        System.out.println(cheetah2.getSpeed());
        System.out.println("Number of Legs: " + cheetah2.getLegs());
        System.out.println("Name: " + cheetah2.getName());
        System.out.println(cheetah2.getIsEndangered());

     Mammal whale = new Mammal ("Billy", false);
        System.out.println(whale.getSpeed());
        System.out.println("Number of Legs: " + whale.getLegs());
        System.out.println("Name: " + whale.getName());
        System.out.println(whale.getLivesOnLand());
     Mammal zebra = new Mammal();
        System.out.println(zebra.getSpeed());
        System.out.println("Number of Legs: " + zebra.getLegs());
        System.out.println("Name: " + zebra.getName());
        System.out.println(zebra.getIsEndangered());
        System.out.println(zebra.getLivesOnLand());

      Reptile snake = new Reptile ("scales");
        System.out.println(snake.getSpeed());
        System.out.println("Number of Legs: " + snake.getLegs());
        System.out.println("Name: " + snake.getName());
        System.out.println(snake.getIsEndangered());
        System.out.println(snake.getSkinType());

       Marsupials kangaroo = new Marsupials();
        System.out.println(kangaroo.getSpeed());
        System.out.println("Number of Legs: " + kangaroo.getLegs());
        System.out.println("Name: " + kangaroo.getName());
        System.out.println(kangaroo.getIsEndangered());
        System.out.println(kangaroo.getTypeOfPouch());

       Marsupials koala = new Marsupials ("backward");
        System.out.println(koala.getSpeed());
        System.out.println("Number of Legs: " + koala.getLegs());
        System.out.println("Name: " + koala.getName());
        System.out.println(koala.getIsEndangered());
        System.out.println(koala.getTypeOfPouch());

       Dinosaur tyrannosaurus = new Dinosaur("John", 2, 30, true);
        System.out.println("Speed: " + tyrannosaurus.getSpeed());
        System.out.println("Number of Legs: " + tyrannosaurus.getLegs());
        System.out.println("Name: " + tyrannosaurus.getName());
        System.out.println(tyrannosaurus.getIsEndangered());
        System.out.println(tyrannosaurus.getEatsHumans());

        Dinosaur troodon = new Dinosaur("Brian",2, 20, true);
        System.out.println("Speed: " + troodon.getSpeed());
        System.out.println("Number of Legs: " +troodon.getLegs());
        System.out.println("Name: " +troodon.getName());
        System.out.println("Is Endangered: " +troodon.getIsEndangered());
        System.out.println("Eats Humans: " + troodon.getEatsHumans());


    }
}
