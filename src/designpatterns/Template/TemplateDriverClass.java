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
public class TemplateDriverClass {
    public static void main(String[] args) {
        Game pcgame = new ComputerGame();
        Game mobilegame = new MobilePhoneGame();
        
        pcgame.doIt();
        mobilegame.doIt();
    }
}
