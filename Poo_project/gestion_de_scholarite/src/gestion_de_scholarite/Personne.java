package gestion_de_scholarite;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String gender;
    

    public Personne(String n, String p, int a, String g) {
        setNom(n);
        setPrenom(p);
        setAge(a);
        setGender(g);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
            this.age = age;
        
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void afficher() {
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        System.out.println("Age : " + getAge());
        System.out.println("Gender : " + getGender());
    }

    
    public boolean isMajor() {
        return getAge() >= 18;
    }
}
