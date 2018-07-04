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
public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    
    @Override
    public String getName() {
        return super.getName() + " : color=red";
    }
    
}
