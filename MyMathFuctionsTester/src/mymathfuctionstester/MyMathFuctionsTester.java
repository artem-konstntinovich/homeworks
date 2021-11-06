/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymathfuctionstester;

import math.MyMath;

/**
 *
 * @author T530
 */
public class MyMathFuctionsTester {

    
    public static void main(String[] args) {
        double R = 3;
        double S = MyMath.calcCircleArea(R);
        System.out.println("Площадь круга с радиусом "+R+" равна "+S);
    }
    
}
