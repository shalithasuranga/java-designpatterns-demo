/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Visitor;

/**
 *
 * @author Shalitha Suranga
 */
public class FruitVisitor implements Visitor{

    @Override
    public void visit(Apple item) {
        System.out.println("hey apple");
    }

    @Override
    public void visit(Orange item) {
        System.out.println("hey orange");
    }
    
}
