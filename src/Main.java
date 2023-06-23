public class Main {
    public static void main(String[] args) {
   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Peux tu me communiquer ton prenom ");
        String prenom = scanner.nextLine();
        bienvenue(prenom);

        -------Fin Exercice 1-----------

        compteur();

        -------- Fin exercice 2 ---------
        */
/*        System.out.println("Bonjour, Je peux résoudre n'importe qu'elle addition");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisi un premier chiffre entier ");
        int premier = scanner.nextInt();
        System.out.println("Saisi un second chiffre entier ");
        int second = scanner.nextInt();
        addition(premier,second);

        ------- Fin Exercice 3 ----------

        */
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre âge");
        int age = scanner.nextInt();
        String categorie = clubDenfant(age);
        System.out.println("Tu est dans la catégorie: "+ categorie);

        ------Fin Exercice 4 -----------
        */
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix de fabrication");
        int prixDeFabrication = scanner.nextInt();
        System.out.println("Veuillez saisir le prix de vente");
        int prixDeVente = scanner.nextInt();
        boolean argent = profitOuPerte(prixDeFabrication,prixDeVente);
            if (argent) {
                System.out.println("profit");
            } else {
                System.out.println("perte");
            }

        -----------Fin de l'exercice 5-------------------

            */
   /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier pour savoir si il est pair");
        int nombreUser = scanner.nextInt();
        boolean resultat = pairImpair(nombreUser);
            if (resultat) {
                System.out.println("ce nombre est pair");
            } else{
                System.out.println( "Ce nombre est impair");
            }
        ----------- Fin de L'exercice 6 -------------------

        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre pour connaitre sa nature");
        int nombreUser = scanner.nextInt();
        String type = posiOrnega(nombreUser);
        System.out.println("Tu est : "+type);

        -----------Fin de l'exercice 7 --------------------
        */
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Rentre un chiffrfe je vais t'aider à faire tes multiplication");
        int leChiffre = scanner.nextInt();
        tableDeMultiplication(leChiffre);


        ---------- Fin de l'exercice 8 ------------------

     */
    int [] tab = {10, 8, 4, 22, 33};
    int total = sommeDuTableau(tab);
    System.out.println("la somme total de tous les chiffres du tableau est : " + total);
    }
    public static void bienvenue(String nom) {

        System.out.println("Bienvenue " + nom);
    }

    public static void compteur() {
        for(int nombre = 0; nombre <= 100; nombre++) {
            System.out.println(nombre);
        }
    }
    public static int addition( int a, int b) {

        int result =  a + b;
        System.out.println("le resultat est "+result);
        return result;
    }
    public static String clubDenfant(int age) {
        if (age >= 12) {
            return "Cadet";
        } else if (age >= 10) {
            return "Minime";
        } else if (age >= 8) {
            return "Pupille";
        } else {
            return "Poussin";
        }
    }
    public static boolean profitOuPerte (int a, int b) {
        if( a > b) {
            return false;

        }else {
          return true;
        }
    }
    public static boolean pairImpair(int estPair) {
        if (estPair % 2 == 0) {
            return true;
        } else {
        return false;
        }
    }
    public static String posiOrnega (int nombre) {
        if (nombre < 0) {
            return "negatif";
        } else if (nombre == 0) {
            return "nul";
        } else {
            return "positif";
        }
    }

    public static void tableDeMultiplication (int input) {
        // multiplier le input à chaque fois  jusqu'a 10
        for (int i = 1; i <= 10; i++) {
            int resultat = input * i;
        //  le resultat à chaque fois
            System.out.println( input + " x "+ i + " = " + resultat);
        }

    }
    public static int sommeDuTableau(int[] args) {
        // faire un tableau
        int [] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // créer un compteur vide pour l'instant
        int somme = 0;
        // parcourir le tableau
        for (int i=0; i<myArray.length; i++) {
        // stocker la valeur à chaque itération
            somme += i;
        }
        // retourner la somme du tableau
        return somme;
    }

}
