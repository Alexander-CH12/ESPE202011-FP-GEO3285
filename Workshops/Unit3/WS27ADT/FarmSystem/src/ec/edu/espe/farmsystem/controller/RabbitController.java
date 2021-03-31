/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.controller;

import ec.edu.espe.farmsystem.model.Rabbit;
import utils.FileManager;

/**
 *
 * @author qwe
 */
public class RabbitController {
    
    public void save(Rabbit rabbit){
        String data = rabbit.getName() + ";" + rabbit.getColor() + ";" + rabbit.getRace() + ";" + rabbit.getAge() + "; " + rabbit.getSize();
        FileManager.save(data, "Rabbits");
    }
    
    public String read(){
        String data;
        data = FileManager.read("Rabbits.csv");
        return data;
    }
    
}
