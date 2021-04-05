/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Yessi
 */
public class PassengerController {
    public void save(Passenger passenger) {
        String data = dog.getName() + ", " + dog.getColor() + ", " + dog.getAge() + ", " + dog.getWeigth() + ", " + dog.getBreedAnimal();
        FileManager.save(data, "dogs");
    }
    public static String read(){
        String data;
        data = FileManager.read("dogs.csv");
        return data;
    }
}
