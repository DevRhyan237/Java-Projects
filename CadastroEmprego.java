package com.mycompany.rhyanproject;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String trabalho;
        String requisitos[] = {"Desenvolvedor Frontend","Analista de Dados","Game Developer"};
        int idade;
        System.out.print("\n=-=-=-=\n");
        System.out.print("TECHTUDO COMPANY");
        System.out.print("\n=-=-=-=\n");
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        if(idade < 0){
            System.out.println("Idade Invalida: ");
            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("=-=-=-=");
        System.out.println("Requisitos:");
        for(int j = 0; j < 3; j++){
            System.out.println(requisitos[j]);
        }
        System.out.println("=-=-=-=");
        scanner.nextLine();
        System.out.print("Informe seu trabalho:");
        trabalho = scanner.nextLine();
        boolean encontrado = false;
        for(int i = 0; i < 3; i++){
            if(requisitos[i].equalsIgnoreCase(trabalho)){
                System.out.printf("Requisito %s se encontra na lista!",trabalho);
                encontrado = true;
                cadastro(idade, nome, trabalho);
                }
        }
        if(!encontrado){
            System.out.printf("Infelizmente nao ha vagas para %s!",trabalho);
               
            }
        scanner.close();
    }
    static void cadastro(int idade, String nome, String trabalho){
       System.out.print("\n=-=-=-=");
       System.out.printf("\nNome: %s, \nIdade: %d anos\nEmprego: %s",nome,idade,trabalho);
       System.out.print("\n=-=-=-=");
       System.out.print("\n");
       System.out.printf("Parabens! Voce foi contratado!");
    }
}
