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
public class Comission extends Hourly {
    private double totalSales;
    private double commisRate;
    
    public Comission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commisRate = comRate;
    }
    public void addSales(double newtotalSales){
        totalSales += newtotalSales;
    }
    @Override
    public double pay(){
        totalSales = totalSales*commisRate;
        totalSales = totalSales + super.pay();
        return totalSales;
    }
    public String toString(){
        String result = super.toString();
        result += "\n Total Sales : "+ totalSales;
        return result;
    }   
}   
