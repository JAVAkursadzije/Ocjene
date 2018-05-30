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
        
        String[] predmeti = {"Matematika", "Fizika", "Biologija", "Hemija", "Geografija"};
        int [] ocjene = {0, 0, 0, 0, 0};
        String [][] testovi = {
            {"matematikaTest1", "fizikaTest1", "biologijaTest1", "hemijaTest1", "geografijaTest1"},
            {"matematikaTest2", "fizikaTest2", "biologijaTest2", "hemijaTest2", "geografijaTest2"},
            {"matematikaTest3", "fizikaTest3", "biologijaTest3", "hemijaTest3", "geografijaTest3"},
        };
        
        Scanner unos = new Scanner(System.in);
        
        //Unosi se int broj bodova
        for (int i = 0; i < 1; i++) {
        
        System.out.println(predmeti[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println("Da li je radjen kviz " + (j+1) + "? (da/ne)");
                String k1 = unos.next();
                
                switch (k1){
                    case "da":                
                        ocjene[i] += bodovi10();
                        break;
                    case "ne":
                        System.out.println("Odgovorite na sljedeca pitanja:");
                        System.out.println(testovi[j][i]);
                        break;
                }
            }   
//          Unos bodova sa pismenog dijela ispita
//          Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove sa pismenog dijela ispita:");
                ocjene[i] += bodovi20();
                
//          Unos bodova sa usmenog dijela ispita
//          Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove sa usmenog dijela ispita:");
                ocjene[i] += bodovi20();
                
//          Unos bodova sa seminarskog rada
//          Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi20
            System.out.println("Unesite bodove seminarskog rada:");
                ocjene[i] += bodovi20();
        
//          Unos bodova sa prisustva
//          Bodovi se unose kao integer i ispituje se tacnost unosa metodom bodovi10
            System.out.println("Unesite bodove prisustva:");
                    ocjene[i] += bodovi10();

        }
                
                
        
//      Ispis rezultata po predmetima
            for (int i = 0; i < predmeti.length; i++) {
                System.out.println(predmeti[i] + ": " + ocjene[i]);
        }
            
            
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
