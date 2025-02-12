package gestion_de_scholarite;



public class Etudiant extends Personne {
    private String mat;
    private double MoyenBac;
    private String diplome;
    public Etudiant(String n, String p, int a, String m, String g,double mo,String d) {
        super(n, p, a, g);
        setMat(m);
        setMoyenBac(mo);
        setDiplome(d);
    }
    public double getMoyenBac() {
        return MoyenBac;
    }

    public void setMoyenBac(double MoyenBac) {
        this.MoyenBac = MoyenBac;
    }
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }
    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
    
    

    public void afficher() {
        System.out.println("Matricule : " + getMat());
        super.afficher();
        System.out.println("Diplome : " + getDiplome()); 
        
    }

   
}

