/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Adaptor;

/**
 *
 * @author Shalitha Suranga
 */
public class AdapterDriverClass {
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();
        MobilePhoneAdapter adaptor = new MobilePhoneAdapter(mobile);
        adaptor.fakeSound();
    }
}
