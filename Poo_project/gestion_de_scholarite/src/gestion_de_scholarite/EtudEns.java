package gestion_de_scholarite;



public class EtudEns extends Etudiant {
    private String specialite;
    

    public EtudEns(String n, String p, int a, String m, String g,double mo,String d) {
        super(n, p, a, m, g,mo,d);
        setSpecialite();
        
    }

    

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite() {
    	if (super.getMoyenBac()>15.3) {
    		this.specialite="pes";
    	}
    	else {
    		this.specialite="pem";
    	}
         
    }

    

    public void afficher() {
        super.afficher();
        System.out.println("Specialite : " + getSpecialite());
        
    }

   
}
