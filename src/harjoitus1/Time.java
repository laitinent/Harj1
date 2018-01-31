/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitus1;

/**
 *
 * @author tlaitinen
 */
public class Time {
    private int hour;
    
    // metodit
    public int getHour()
    {
        return hour;
    }
    
    public Time nextSecond()
    {
        //return null;        
        return this;
    }
}
