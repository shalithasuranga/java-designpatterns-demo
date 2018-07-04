/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Singleton;

/**
 *
 * @author Shalitha Suranga
 */

public class Singleton {
    public static void main(String[] args) {
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());
    }
}

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    
    private SingletonEager() {
        
    }
    
    public static SingletonEager getInstance() {
        return instance;
    }
}

class SingletonLazy {
    private static SingletonLazy instance = null;
    
    private SingletonLazy() {
        
    }
    
    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class SingletonStatic {
    private static SingletonStatic instance = new SingletonStatic();
    
    private SingletonStatic() {
        
    }
    
    public static SingletonStatic getInstance() {
        return instance;
    }
}

class SingletonThreadsafe {
    private static SingletonThreadsafe instance = new SingletonThreadsafe();
    
    private SingletonThreadsafe() {
        
    }
    
    public static synchronized SingletonThreadsafe getInstance() {
        if(instance == null) {
            instance = new SingletonThreadsafe();
        }
        return instance;
    }
}




