/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

import java.util.ArrayList;

/**
 *
 * @author MALAK MEHTAB KHAN
 */
    
    public class TourTeam implements Traveler{

    private final ArrayList<Tourists> tourists=new ArrayList<>();

    public void add(Tourists tourist) {

        tourists.add(tourist);

    }

    @Override
    public void AllowTrip(String location, String date)

    {
        for(Tourists everySingleTourist :tourists) {

            everySingleTourist.AllowTrip(location, date);
        }
    }

}
