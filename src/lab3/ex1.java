package lab3;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n : ");
        int n = sc.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("La somme des  premiers termes est " + s);


	}}
