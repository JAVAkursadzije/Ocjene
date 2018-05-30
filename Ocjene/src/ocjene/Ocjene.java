/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocjene;
import java.util.Scanner;
import jdk.internal.org.objectweb.asm.commons.Method;
/**
 *
 * @author Andrej
 */
public class Ocjene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] predmeti = {"Matematika", "Fizika", "Biologija", "Hemija", "Geografija"};
        int [] ocjene = {0, 0, 0, 0, 0};
        
        
        
        String [][] testovi = {
            {"kviz1", "fizikaTest1", "biologijaTest1", "hemijaTest1", "geografijaTest1"},
            {"matematikaTest2", "fizikaTest2", "biologijaTest2", "hemijaTest2", "geografijaTest2"},
            {"matematikaTest3", "fizikaTest3", "biologijaTest3", "hemijaTest3", "geografijaTest3"},
        };
        
        Scanner unos = new Scanner(System.in);
        
//  Petlja za prolaz kroz sve ispite
        for (int i = 0; i < 1; i++) {
        
//  Petlja za prolaz kroz tri kviza
        System.out.println(predmeti[i]);
            for (int j = 0; j < 3; j++) {
                
//  Provjera unesenog odgovora da ili ne.
//  Petlja WHILE vraca na unos ako je odgovor razlicit od "da" ili "ne"
//  SWITCH usmjerava na unos bodova odnosno kviz za odgovore "da" odnosno "ne"
                String k1 = null;
                while (!("da".equals(k1) || "ne".equals(k1))) {                    
                    System.out.println("Da li je radjen kviz " + (j+1) + "? (da/ne)");
                    k1 = unos.next();
                }
                switch (k1){
                    case "da":                
                        ocjene[i] += bodovi10();
                        break;
                    case "ne":
                        System.out.println("Odgovorite na sljedeca pitanja:\n");
                        ocjene[i] += kviz1();
                        break;
                }
            }   
//  Unos bodova sa pismenog dijela ispita
//  Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove sa pismenog dijela ispita:");
                ocjene[i] += bodovi20();
                
//  Unos bodova sa usmenog dijela ispita
//  Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove sa usmenog dijela ispita:");
                ocjene[i] += bodovi20();
                
//  Unos bodova sa seminarskog rada
//  Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove seminarskog rada:");
                ocjene[i] += bodovi20();
        
//  Unos bodova sa prisustva
//  Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi10
            System.out.println("Unesite bodove prisustva:");
                    ocjene[i] += bodovi10();

        }
                
                
        
//  Ispis rezultata po predmetima, izracunavanje i ispis prosjeka
        int prosjek=0;
        System.out.println("\nStudent je ostvario sljedeci uspjeh:\n");
            for (int i = 0; i < predmeti.length; i++) {
                System.out.println(predmeti[i] + ": " + ocjene[i]+"%");
                prosjek += ocjene[i];
        }
            prosjek /= predmeti.length;
        System.out.println("\nPROSJECNO:" + prosjek + "%");
            
            
}
    
    public static int kviz1(){
        Scanner odg = new Scanner (System.in);
        String [] pitanja = { "Mlijeko je bijelo? \n a) da\n b) ne",
                                "5 > 10\n a) da\n b) ne",
                                "Svjetlost je brza od zvuka. \n a) da\n b) ne",
                                "Miki Maus je mis. \n a) da\n b) ne",
                                "H2O je hemijska formula benzina. \n a) da\n b) ne"};
        String [] odgovori = {"a", "b", "a", "a", "b"};
        int bod=0;
            for (int i = 0; i < pitanja.length; i++) {
                System.out.println(pitanja[i]);
                String odgovor = null;
                    while (!("a".equals(odgovor) || "b".equals(odgovor))) {                    
                        System.out.println("ODGOVOR:");
                        odgovor = odg.next();
                    }
                        if (odgovor.equals(odgovori[i])) {
                        bod += 2;
                        }
            }
        return bod;
    }
    
    public static int bodovi10(){
        Scanner unos = new Scanner (System.in);
        int kviz1=15;
        while (kviz1<0 || kviz1>10) {            
            try {
                    System.out.print("Unesite broj bodova: ");
                    kviz1 = unos.nextInt();
                    if (kviz1 < 0 || kviz1 > 10) throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException iae) {
                    System.out.println("Broj bodova nije u opsegu 0-10!");
                }
                catch (Exception e) {
                    System.out.println("Niste pravilno unijeli broj bodova!");
                    unos.next();
                }
        }
        return kviz1;
    }
    
    public static int bodovi20(){
        Scanner unos = new Scanner (System.in);
        int kviz1=25;
        while (kviz1<0 || kviz1>20) {            
            try {
                    System.out.print("Unesite broj bodova: ");
                    kviz1 = unos.nextInt();
                    if (kviz1 < 0 || kviz1 > 20) throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException iae) {
                    System.out.println("Broj bodova nije u opsegu 0-20!");
                }
                catch (Exception e) {
                    System.out.println("Niste pravilno unijeli broj bodova!");
                    unos.next();
                }
        }
        return kviz1;
    }
}
