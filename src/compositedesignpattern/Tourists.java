/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

/**
 *
 * @author MALAK MEHTAB KHAN
 */
public class Tourists {
    String Name;

  
    public void AllowTrip(String location, String date)

    {

        System.out.println(this.Name+" is allowed for trip to" +location+ "for the date"+date);

    }

    public Tourists(String name)
    {

        this.Name=name;

    }

}
   
