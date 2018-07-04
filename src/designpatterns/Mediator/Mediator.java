/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Mediator;

/**
 *
 * @author Shalitha Suranga
 */
public class Mediator {
    Computer computer;
    User user;
    
    void registerUser(User u) {
        user = u;
    }
    
    void registerComputer(Computer c) {
        computer = c;
    }
    
    void sendMessage(String message) {
        user.send(message);
        computer.receive(message);
    }
}
