/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class Dziedziczenie {

    {
        id = nastepnyId;
        nastepnyId++;
        }
    
    public Dziedziczenie (String i, String  n, int rok, int miesiac , int dzien, int p  ){
        imie=i;
        nazwisko = n;
        GregorianCalendar greg= new GregorianCalendar(rok, miesiac -1, dzien);
        data_z= greg.getTime();
        pensja = p;
        System.out.println("id "+id);
      
    }
    
    public String pobierz_n (){
        return nazwisko;
    }
    
    public String pob_imie(){
        return imie;
    }
    
    
    public Date pobierz_data_z (){
        return data_z;
    }
    
    public double podnies_p (int pp){
        return this.pensja=this.pensja * pp;
    }
    
    public double podnies_p (int pp, int pb){
        return this.pensja=this.pensja * pp - pb;
    }
    /**
     * 
     * @param d - coś
     * @return nazwisko
     */
    boolean equalsa (Dziedziczenie d){
        System.out.println("Sprawdza: \t"+nazwisko +" z \t "+ d.nazwisko);
    return nazwisko.equals(d.nazwisko);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO wszystko i nic
        Dziedziczenie[] dzie= new Dziedziczenie[4];
        dzie[0]= new Dziedziczenie("Maniek","Nowak", 28, 12, 1981, 1220);
        dzie[1]= new Dziedziczenie("Radek","Kruk", 11, 10, 1991, 1820);
        dzie[2]= new Dziedziczenie("Grzegorz","Pilat", 18, 1, 1987, 1520);
        dzie[3]= new Dziedziczenie("Witold","Mitol", 8, 2, 1951, 11220);
        
        
        //blok inicjalizacji obiektu
        
        
        for (int i=0;i<dzie.length;i++){
           Dziedziczenie d= dzie[i];
        if (d.equalsa(dzie[3])){
            System.out.println("ok");
        }   

   
   
                   System.out.println(" " 
                    +d.pob_imie() +" \t" 
                    + d.pobierz_n()+"  \t "
                    +  "  Pensja = "
                    + d.podnies_p(2, 5000));
        }
    }
   private String imie="";
   private String nazwisko="";
   private final Date data_z ;
   private double pensja;
   private static int nastepnyId;
   private static int id;
   
    
}
