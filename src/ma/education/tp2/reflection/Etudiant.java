package ma.education.tp2.reflection;

public class Etudiant {
    public long id;
    public String nom;
    static public int nbEtudiants;
    public Etudiant(long id,String nom,int nb){
        this.id = id;
        this.nom = nom;
        nbEtudiants+=nb;
    }
}
