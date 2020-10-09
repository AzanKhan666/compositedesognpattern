/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

/**
 *
 */
public class CompositeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Khaan");
        // TODO code application logic here
   Tourists tourists1=new Tourists("Rashid");

        Tourists tourists2=new Tourists("Adil");

        Tourists tourists3=new Tourists("Majid");

        Tourists tourists4=new Tourists("Kashif");

        Tourists tourists5=new Tourists("Irfan");



        TourTeam team01=new TourTeam();

        TourTeam team02=new TourTeam();



        team01.add(tourists1);

        team01.add(tourists2);

        team01.add(tourists3);

        team02.add(tourists4);

        team02.add(tourists5);





        team01.AllowTrip("Swat", "15th august");

        team02.AllowTrip("Gilgit","17 August" );



        tourists5.AllowTrip("Waziristan", "23 rd March");


    }

}
