/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Honoré
 */


class Fruit {
    String nom;
    int prix; 
    int quantite;

    public Fruit(String nom, int prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getTotal() {
        return prix * quantite;
    }

    @Override
    public String toString() {
        return nom + " : " + prix + " FCFA x " + quantite + " = " + getTotal() + " FCFA";
    }
}

public class ArrayListExemple {
    public static void main(String[] args) {

        ArrayList<Fruit> panier = new ArrayList<>();

      
        panier.add(new Fruit("Pomme", 500, 3));   
        panier.add(new Fruit("Banane", 300, 5));  
        panier.add(new Fruit("Orange", 400, 2));  

        System.out.println("Panier :");
        afficher(panier);

        int total = calculerTotal(panier);
        System.out.println("Total a payer = " + total + " FCFA");


        panier.removeIf(f -> f.nom.equals("Banane"));

        System.out.println("Apres suppression des bananes :");
        afficher(panier);
        total = calculerTotal(panier);
        System.out.println("\nTotal a payer = "+total );

        // Ajouter un autre fruit
        panier.add(new Fruit("Mangue", 700, 4));

        System.out.println("\nApres ajout :");
        afficher(panier);

        // Nouveau total
        total = calculerTotal(panier);
        System.out.println("Nouveau total = " + total + " FCFA");
    }

    public static void afficher(ArrayList<Fruit> panier) {
        for (Fruit f : panier) {
            System.out.println(f);
        }
    }

    public static int calculerTotal(ArrayList<Fruit> panier) {
        int total = 0;
        for (Fruit f : panier) {
            total += f.getTotal();
        }
        return total;
    }
}