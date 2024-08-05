/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;
import java.util.Scanner;
/**
 *
 * @author joaor
 */

public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Seja Bem Vindo!\nPor favor, digite o número da Conta !");
        int num = scn.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String ag = scn.next();
        System.out.println("Por favor, digite o nome do cliente !");
        String nome = scn.next();
        System.out.println("Por favor, digite o saldo !");
        double saldo= scn.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nome,ag,num,saldo);

    }
    
}

