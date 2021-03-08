/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author risin
 */
public class Fish extends Animal implements Pet {
    String name="fish";

    public Fish() {
        super(0);
        legs();
    }
    @Override
    public void walk(String name){
        System.out.println("baliklar yürüyemez");
    }
    public void legs(){
        super.legs=0;
    }

    @Override
    public void eat() {
        System.out.println("Balık yemi");
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Playing fish");
    }
}
