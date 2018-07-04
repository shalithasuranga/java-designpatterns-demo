/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Proxy;

/**
 *
 * @author Shalitha Suranga
 */
public class RealATMMachine implements ATM{

    @Override
    public void withdraw() {
        System.out.println("Withdrawing money..");
    }

    @Override
    public void changePIN() {
        System.out.println("Changing PIN..");
    }
    
}
