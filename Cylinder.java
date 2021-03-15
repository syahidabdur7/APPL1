/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1;

/**
 *
 * @author User
 */
public class Cylinder extends Shape {
    public double radius;
    public double height;
    
    public Cylinder (double r, double h){
        super ("Cylinder");
        radius = r;
        height = h;        
    }
    
    @Override
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    @Override
    public String toString(){
         return super.toString() + "\n" + "of radius "+radius + "of height"+height;
    }
}
