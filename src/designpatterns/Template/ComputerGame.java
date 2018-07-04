/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Template;

/**
 *
 * @author Shalitha Suranga
 */
public class ComputerGame extends Game{

    @Override
    void start() {
        System.out.println("Starting computer game...");
    }

    @Override
    void end() {
        System.out.println("Ending computer game..");
    }
    
    
}
