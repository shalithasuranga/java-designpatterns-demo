/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Factory;

/**
 *
 * @author Shalitha Suranga
 */
public class LinuxFactory implements Factory{

    @Override
    public Icon getIcon() {
        return new LinuxIcon();
    }
    
}
