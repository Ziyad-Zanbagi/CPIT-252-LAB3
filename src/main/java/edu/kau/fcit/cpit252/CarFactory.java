/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kau.fcit.cpit252;

/**
 *
 * @author 1937512
 */
public class CarFactory {
    public Car getClone(Car carObject){
        
        return carObject.makeCopy();
    }
}
