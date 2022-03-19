package ma.education.tp2.reflection;

public class TestStatic {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1,"Oumaima",20);
        Etudiant e2 = new Etudiant(2,"Sara",30);
        System.out.println("LE NOMBRE DES ETUDIANTS EST: "+Etudiant.nbEtudiants);
        System.out.println(e1.id+" "+e1.nom);
        System.out.println(e2.id+" "+e2.nom);
    }
}
