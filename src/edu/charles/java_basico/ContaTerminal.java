package edu.charles.java_basico;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        final String AGENCIA = "067-8";
        double saldo = 0;

        String resposta;
        do {


            System.out.println("Possui uma conta no banco Charlitos? (S , N)");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("informe o seu nome:");
                String nomeUsuario = sc.nextLine();

                int numeroConta = 0;
                boolean numeroContaValido = false;
                while (!numeroContaValido) {
                    try {
                        System.out.println("Por favor, digite o número da conta!");
                        numeroConta = Integer.parseInt(sc.nextLine());
                        numeroContaValido = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Você deve digitar um número válido para o número da conta. \n");
                    }
                }

                double valorDeposito = 0;
                boolean valorDepositoValido = false;
                while (!valorDepositoValido) {
                    try {
                        System.out.print("Agora informe o valor do deposito de abertura: RS ");
                        valorDeposito = Double.parseDouble(sc.nextLine());
                        valorDepositoValido = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: você deve digitar um número válido para o valor do deposito. \n");
                    }
                }

                saldo += valorDeposito;

                System.out.println(STR."Olá \{nomeUsuario}, obrigado por criar uma conta em nosso banco Charlitos, sua agência é \{AGENCIA}, conta \{numeroConta} e seu saldo R$ \{saldo} já está disponível para saque");

            } else if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Area de login em manutenção.");
            } else {
                System.out.println("resposta digitada não compreendida, tente novamente \n");
            }
        } while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
    }
}