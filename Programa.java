/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
        Conta c1 = new Conta();
        
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble());
       
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){
            System.out.println("Saque realizado com sucesso");
        }
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entrada.nextDouble());
        
        System.out.println("Digite um valor para Transferir:");
        minhaConta.transfere(c1,entrada.nextDouble());
        if(minhaConta.transfere(c1,entrada.nextDouble())==true){
            System.out.println("Transferencia realizada com sucesso");
        }
        
        
        
       
        
        
    }
    
}
