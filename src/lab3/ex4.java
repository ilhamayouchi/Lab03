package lab3;

public class ex4 {
	    public static void affiche(double[][] t) {
	        for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[i].length; j++) {
	                System.out.print(t[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	  
	    public static boolean regulier(double[][] t) {

	        if (t.length == 0) {
	            return true;
	        }

	        for (int i = 1; i < t.length; i++) {
	            if (t[i].length != t[0].length) {
	                return false;
	            }
	        }

	        return true;
	    }

	
	    public static double[] sommeLignes(double[][] t) {

	        double[] resultat = new double[t.length];

	        for (int i = 0; i < t.length; i++) {

	            for (int j = 0; j < t[i].length; j++) {
	                resultat[i] = resultat[i] + t[i][j];
	            }
	        }

	        return resultat;
	    }

	  
	    public static double[][] somme(double[][] t1, double[][] t2) {

	        if (!regulier(t1) || !regulier(t2)) {
	            return null;
	        }

	        if (t1.length != t2.length) {
	            return null;
	        }

	        if (t1.length != 0 && t1[0].length != t2[0].length) {
	            return null;
	        }

	        double[][] resultat = new double[t1.length][t1[0].length];

	        for (int i = 0; i < t1.length; i++) {
	            for (int j = 0; j < t1[i].length; j++) {
	                resultat[i][j] = t1[i][j] + t2[i][j];
	            }
	        }

	        return resultat;
	    }

	    public static void main(String[] args) {

	        double[][] t1 = {
	            {1.5, 2.5, 3.5},
	            {4.5, 5.5, 6.5}
	        };

	        double[][] t2 = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        System.out.println("Tableau t1 :");
	        affiche(t1);

	        System.out.println("\nTableau regulier : " + regulier(t1));

	        double[] s = sommeLignes(t1);

	        System.out.println("\nSomme des lignes :");
	        for (int i = 0; i < s.length; i++) {
	            System.out.println(s[i]);
	        }

	        double[][] r = somme(t1, t2);

	        System.out.println("\nSomme des deux tableaux :");
	        affiche(r);
	    }
	}