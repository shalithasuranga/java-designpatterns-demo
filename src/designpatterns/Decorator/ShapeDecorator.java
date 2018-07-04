/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Decorator;

/**
 *
 * @author Shalitha Suranga
 */
public class ShapeDecorator implements Shape {
    private Shape shape;
    
   ShapeDecorator(Shape shape) {
       this.shape = shape;
   } 

    @Override
    public String getName() {
        return this.shape.getName();
    }
   
   
}
