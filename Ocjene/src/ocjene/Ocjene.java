/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocjene;
import java.util.Scanner;
/**
 *
 * @author Andrej
 */
public class Ocjene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat=0, fiz=0, bio=0, hem=0, geo=0;
        int kviz1=0;
        
        String[] predmeti = {"Matematika", "Fizika", "Biologija", "Hemija", "Geografija"};
        int [] ocjene = {0, 0, 0, 0, 0};
        String [][] testovi = {
            {"matematikaTest1", "fizikaTest1", "biologijaTest1", "hemijaTest1", "geografijaTest1"},
            {"matematikaTest2", "fizikaTest2", "biologijaTest2", "hemijaTest2", "geografijaTest2"},
            {"matematikaTest3", "fizikaTest3", "biologijaTest3", "hemijaTest3", "geografijaTest3"},
        };
        
        boolean kvizovi=false;
        Scanner unos = new Scanner(System.in);
        
        
        //Unosi se int broj bodova
        for (int i = 0; i < predmeti.length; i++) {
            
        
        
        System.out.println(predmeti[i]);
        
            for (int j = 0; j < 3; j++) {
                
            
        
        System.out.println("Da li je radjen kviz " + (j+1) + "? (da/ne)");
        String k1 = unos.next();
                
        switch (k1){
            case "da":                
                while (kvizovi != true) 
                {   
                    kviz1 = bodovi10();
                    if (kviz1>=0 && kviz1<=10){
                        ocjene[i] =+ kviz1;
                        kvizovi = true;}
                }
                kvizovi = false;
                break;
            case "ne":
                System.out.println("Odgovorite na sljedeca pitanja:");
                System.out.println(testovi[j][i]);
                    pitanja();                          //pozivanje metode pitanja() da bi se pristupilo kvizu i bodovanju odgovora
                    System.out.println(pitanja());      //iz nekog razloga dva puta postavlja pitanje 1
                break;
        }
        }
            /*  Unos bodova sa pismenog dijela ispita
            **  Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            */
            
            System.out.println("Unesite bodove sa pismenog dijela ispita:");
            while (kvizovi != true) 
                {   
                    kviz1 = bodovi20();
                    if (kviz1>=0 && kviz1<=20){
                        ocjene[i] =+ kviz1;
                        kvizovi = true;}
                }
                kvizovi = false;
        }
            System.out.println(mat);
            System.out.println(kvizovi);
        }
    
    public static int bodovi10(){
                Scanner unos = new Scanner (System.in);
                int kviz1=15;
                try {
                    System.out.print("Unesite broj bodova: ");
                    kviz1 = unos.nextInt();
                    if (kviz1 < 0 || kviz1 > 10) throw new IllegalArgumentException();
                    return kviz1;                    
                }
                catch (IllegalArgumentException iae) {
                    System.out.println("Broj bodova nije u opsegu 0-10!");
                    return kviz1;
                }
                catch (Exception e) {
                    System.out.println("Niste pravilno unijeli broj bodova!");
                    unos.next();
                    return kviz1;
                }
    }
    
    public static int bodovi20(){
                Scanner unos = new Scanner (System.in);
                int kviz1=25;
                try {
                    System.out.print("Unesite broj bodova: ");
                    kviz1 = unos.nextInt();
                    if (kviz1 < 0 || kviz1 > 20) throw new IllegalArgumentException();
                    return kviz1;                    
                }
                catch (IllegalArgumentException iae) {
                    System.out.println("Broj bodova nije u opsegu 0-20!");
                    return kviz1;
                }
                catch (Exception e) {
                    System.out.println("Niste pravilno unijeli broj bodova!");
                    unos.next();
                    return kviz1;
                }
    }
    public static int pitanja(){                // započeta metoda pitanja()
       int p1=1, p2=2, p3=3, p4=4, p5=5, p6=6, p7=7, p8=8, p9=9, p10=10;
       int odg, bod;
        System.out.println("1. Pitanje 1?");
        System.out.print("1. Odgovor: ");
        Scanner scan=new Scanner (System.in);
            odg=scan.nextInt();    
        if (odg==p1){
            bod=2;
        } else bod=0;
            return bod;
    }
}
    
        
        
    
    
