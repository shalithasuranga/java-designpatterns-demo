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
public abstract class Game {
    abstract void start();
    abstract void end();
    
    final void doIt() {
        start();
        end();
    }
}
