package br.com.atividade1;

import java.util.Scanner;
import java.util.Random;

public class atividade1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] vet = new int[10];
        Random rand = new Random();

        for (int i=0; i < vet.length; i++)
            vet[i] = rand.nextInt(99);
        
        }

    }
}