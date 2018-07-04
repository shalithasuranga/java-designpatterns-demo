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
public class Apple implements Fruit {

    @Override
    public void accept(FruitVisitor visitor) {
        visitor.visit(this);
    }
    
}
