package gestion_de_scholarite;

import java.util.ArrayList;

public class Poo {


    public static void addPersonne(ArrayList<Personne> personnes, Personne personne) {
        
            personnes.add(personne);
        
    }


    public static void afficherPersonnes(String title, ArrayList<Personne> listPersonnes) {
        

        System.out.println(title);
        
        for (Personne personne : listPersonnes) {
            
                personne.afficher();
                System.out.println("Is Major: " + personne.isMajor());
                System.out.println("-----------------------");
                
           
        }
        System.out.println("The number of personnes is: " + listPersonnes.size());
        System.out.println("___________________________________________________________________________________________________________________________________");
    }

    
    public static void main(String[] args) {
 
        ArrayList<Personne> personnes = new ArrayList<>();

       
        Personne P1 = new Personne("Ahmed", "Ali", 30, "Male");
        Etudiant E1 = new Etudiant("Fatma", "Ali", 23, "12345", "Female", 14.80,"physique");
        EtudEns EE1 = new EtudEns("Hocini", "Oussama", 25, "212139047924","Male", 14.80,"Informatique");
        EtudEns EE2 = new EtudEns("Moundjid", "Djaijda", 22, "212139047925", "Male", 16.04,"Math");

        
        addPersonne(personnes, P1);
        addPersonne(personnes, E1);
        addPersonne(personnes, EE1);
        addPersonne(personnes, EE2);

        
        afficherPersonnes("List of All Persons:", personnes);
    }
}