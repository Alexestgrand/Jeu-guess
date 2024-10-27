import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] nombresUser1 = new int[5];
       System.out.println("Utilisateur 1, entrez 5 nombres : ");
        for (int i = 0; i < 5; i++) {
            nombresUser1[i] = scanner.nextInt();
        }

        System.out.println("Utilisateur 1, choisissez un nombre clé parmi vos nombres : ");
        int nombreCleUser1 = scanner.nextInt();
        int compteur = 0;
        while ( true ) {
            if(compteur > 4){
                compteur = 0;
                System.out.println("Utilisateur 1, choisissez un nombre clé parmi vos nombres : ");
                nombreCleUser1 = scanner.nextInt();
            }
            if(nombresUser1[compteur]== nombreCleUser1) {
                break;
            }
            compteur++;

        }



        /*for (int essai = 1; essai <= 3; essai++) {
            int[] nombresUser2 = new int[5];
            System.out.println("Utilisateur 2, entrez 5 nombres (essai " + essai + ") : ");
            for (int i = 0; i < 5; i++) {
                nombresUser2[i] = scanner.nextInt();
            }
            System.out.println("Utilisateur 2, choisissez un nombre clé parmi vos nombres : ");
            int nombreCleUser2 = scanner.nextInt();

            if (nombreCleUser2 == nombreCleUser1) {
                gagne = true;
                break;
            } else {
                System.out.println("Mauvaise clé, essayez encore.");
            }
        }*/

        for(int i =0;i <= 4; i++) {
            System.out.println(nombresUser1[i]);
        }


        System.out.println("Utilisateur 2, veuillez choisir votre nombre clé parmis les nombres au dessus, 3 chances");

        int nombreCleUser2 = scanner.nextInt();

       for(int essaie =0; essaie < 2; essaie++){
         if(nombreCleUser2==nombreCleUser1){

             break;
         }
         else{
             System.out.println("Mauvaise réponse, essayez encore (essaie " + essaie + "/3");
             nombreCleUser2 = scanner.nextInt();
         }


       }






    }
}