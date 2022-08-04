package com.atividade;

import java.util.Scanner;

public class TesteAtividade {

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int opcao;
            String nome1;
            double peso1;
            double tempoAtividade1;
            double perdaCalorias = 0;


            System.out.println("Informe seu nome:");
            Scanner nome = new Scanner(System.in);
            nome1 =nome.next();
            System.out.println("Informe o peso:");
            Scanner peso = new Scanner(System.in);
            peso1 = sc.nextDouble();

            System.out.println("Informe o tempo de atividade:");
            Scanner tempoAtividade = new Scanner(System.in);
            tempoAtividade1 = sc.nextDouble();

            System.out.println("Inserir tipo atividade: \n 1 - Inicial \n 2 - Moderada \n 3 - Pesada ");
                opcao = sc.nextInt();


                switch (opcao) {
                    case 1: //opcao Inicial

                        System.out.println("***Atividade Inicial***");

                        //criar objeto Atividade Inicial

                        Atividade atividade1 = new Atividade();

                        perdaCalorias = atividade1.AtividadeInicial() * peso1 * tempoAtividade1/60;

                        break;

                    case 2: //opcao Moderada

                        System.out.println("***Atividade Moderada***");

                        //criar objeto Atividade Moderada

                        Atividade atividade2 = new Atividade();

                        perdaCalorias = atividade2.AtividadeModerada() * peso1 * tempoAtividade1/60;

                        break;

                    case 3: //opcao atividade pesada

                        System.out.println("***Atividade Pesada***");

                        //criar objeto Atividade Pesada

                        Atividade atividade3 = new Atividade();

                        perdaCalorias = atividade3.AtividadePesada() * peso1 * tempoAtividade1/60;

                        break;


                    default:
                        //System.out.println('Opção inválida");
                        break;



                }

        System.out.println (nome1 +  " - Você eliminou " + perdaCalorias + "  calorias");

    }
}