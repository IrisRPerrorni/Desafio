package Desafio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Desafio01Max {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> erros = new ArrayList<>();
        ArrayList<Integer> acertos = new ArrayList<>();
        ArrayList<Integer> aleatorios = new ArrayList<>();

        int num;
        int rand = 0;
        int score = 0;
        String usuario;
        int tentativa = 0;

        System.out.println("==========Vamos comparar os números?=========");
        System.out.println("O jogo irá sortear um número você terá que adivinhar qual número ele sorteou");
        System.out.println(" -> Se você adivinhar o número sorteado você irá ganhar 10 pts");
        System.out.println(" -> Se você chegar um número acima do sorteado você irá ganhar 5 pts");
        System.out.println(" -> Se você chegar um número abaixo do sorteado você irá ganhar 5 pts");
        System.out.println("  ");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nível de dificuldade:");
        System.out.println("Digite 1 para o nível fácil (números de 1 a 10)");
        System.out.println("Digite 2 para o nível médio (números de 1 a 50)");
        System.out.println("Digite 3 para o nível difícil (números de 1 a 100)");

        int nivel = entrada.nextInt(); // Entrada do usuario para o nivel do jogo que ele optar

        System.out.println("\n===========================let's play===============\n");

        switch (nivel) { // o valor nivel escolhido pelo usuario
            case 1: // para nivel fácil
                System.out.println("nível fácil");
                do { // para rodar as tentativas
                    tentativa++;
                    do { // valor verdeiro
                        System.out.println(tentativa + "º tentativa: Digite um número inteiro de 1 a 10");
                        num = entrada.nextInt();
                        rand = random.nextInt(10) + 1;


                        if (num > 10 || num < 1) { // para valor incorreto
                            System.out.println("Valor incorreto! Digite um número de 1 a 10 para o teste!");
                            System.out.println("\n=========================================================");
                        } // laço do if

                    } while (num > 10 || num < 1); // laço do 2 do
                    if (rand == num) { // para acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Parabens!! os Numeros são iguais você ganhou 10 pts");
                        score = 10 + score;
                        System.out.println("\n=========================================================");
                        acertos.add(num);
                        aleatorios.add(rand);


                    } else if (rand != num && num == (rand + 1)) { // para erro um valor acima do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número maior que o sorteado!");
                        System.out.println(" ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else if (rand != num && num == (rand - 1)) { // para erro um valor abaixo do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número menor que o sorteado!");
                        System.out.println("ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else {
                        System.out.println("o numero sorteado é: " + rand); // para erro
                        System.out.println("Que pena você não conseguiu adivinhar o número!");
                        score = 0 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);
                    } // fim do laço de condição

                    do { // 3° laço do while para condição de jogar novamente
                        System.out.println("Gostaria de jogar novamente? digite 'S' para sim ou 'N' para não");
                        usuario = entrada.next();

                        if (usuario.equalsIgnoreCase("N")) { // encerra o jogo e mostra os valores
                            System.out.println("Sua pontuação é: " + score + " pts");
                            System.out.printf("Os números sorteados foram: ");
                            System.out.println(aleatorios);

                            if (erros.isEmpty()) {
                                System.out.println("\nNão houve erros");
                            } else {
                                System.out.println("\nNúmeros errados digitados:" + " " + erros);
                            }

                            if (acertos.isEmpty()) {
                                System.out.println("\nNão houve acertos");
                            } else {
                                System.out.println("\nNúmeros corretos digitados:" + " " + acertos);
                            }

                            break;
                        }

                        if (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")) { // informar comando invalido
                            System.out.println("Valor invalido, digite N ou S");
                        }

                    } while (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")); // repetir caso for comando invalido

                } // laço do 1 do while
                while (usuario.equalsIgnoreCase("S")); // condição sim para jogar novamente ,

                break; // sair

            case 2:
                System.out.println("Nível médio:");
                do { // para rodar as tentativas
                    tentativa++;
                    do { // valor verdeiro
                        System.out.println(tentativa + "º tentativa Digite um número inteiro de 1 a 50");
                        num = entrada.nextInt();
                        rand = random.nextInt(50) + 1;


                        if (num > 50 || num < 1) { // para valor incorreto
                            System.out.println("Valor incorreto! Digite um número de 1 a 50 para o teste!");
                            System.out.println("\n=========================================================");
                        } // laço do if

                    } while (num > 50 || num < 1); // se o valor for verdadeiro nessa condição dentro do while irá para o loop acima se for falso dentro dessa condição irá rodar apos o while e fechar o ciclo (laço do 2° do)
                    if (rand == num) { // para acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Parabens!! os Numeros são iguais você ganhou 10 pts");
                        score = 10 + score;
                        System.out.println("\n=========================================================");
                        acertos.add(num);
                        aleatorios.add(rand);


                    } else if (rand != num && num == (rand + 1)) { // para erro um valor acima do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número maior que o sorteado!");
                        System.out.println(" ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else if (rand != num && num == (rand - 1)) { // para erro um valor abaixo do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número menor que o sorteado!");
                        System.out.println("ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else {
                        System.out.println("o numero sorteado é: " + rand); // para erro
                        System.out.println("Que pena você não conseguiu adivinhar o número!");
                        score = 0 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);
                    } // fim do laço de condição

                    do { // 3° laço do while para condição de jogar novamente
                        System.out.println("Gostaria de jogar novamente? digite 'S' para sim ou 'N' para não");
                        usuario = entrada.next();

                        if (usuario.equalsIgnoreCase("N")) { // encerra o jogo e mostra os valores
                            System.out.println("Sua pontuação é: " + score + " pts");
                            System.out.printf("Os números sorteados foram: ");
                            System.out.println(aleatorios);

                            if (erros.isEmpty()) {
                                System.out.println("\nNão existe erros");
                            } else {
                                System.out.println("\nNúmeros errados digitados:" + " " + erros);
                            }

                            if (acertos.isEmpty()) {
                                System.out.println("\nNão existe acertos");
                            } else {
                                System.out.println("\nNúmeros corretos digitados:" + " " + acertos);
                            }

                            break;
                        }

                        if (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")) { // informar comando invalido
                            System.out.println("Valor invalido, digite N ou S");
                        }

                    } while (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")); // repetir caso for comando invalido

                } // laço do 1 do while
                while (usuario.equalsIgnoreCase("S")); // condição sim para jogar novamente ,

                break; // sair

            case 3:
                System.out.println("Nível difícil :");
                do { // para rodar as tentativas
                    tentativa++;
                    do { // valor verdeiro
                        System.out.println(tentativa + "º tentativa Digite um número inteiro de 1 a 100");
                        num = entrada.nextInt();
                        rand = random.nextInt(100) + 1;


                        if (num > 100 || num < 1) { // para valor incorreto
                            System.out.println("Valor incorreto! Digite um número de 1 a 50 para o teste!");
                            System.out.println("\n=========================================================");
                        } // laço do if

                    } while (num > 100 || num < 1); // se o valor for verdadeiro nessa condição dentro do while irá para o loop acima se for falso dentro dessa condição irá rodar apos o while e fechar o ciclo (laço do 2° do)
                    if (rand == num) { // para acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Parabens!! os Numeros são iguais você ganhou 10 pts");
                        score = 10 + score;
                        System.out.println("\n=========================================================");
                        acertos.add(num);
                        aleatorios.add(rand);


                    } else if (rand != num && num == (rand + 1)) { // para erro um valor acima do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número maior que o sorteado!");
                        System.out.println(" ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else if (rand != num && num == (rand - 1)) { // para erro um valor abaixo do acerto
                        System.out.println("o numero sorteado é: " + rand);
                        System.out.println("Você chegou próximo , digitou um número menor que o sorteado!");
                        System.out.println("ganhou 5 pts");
                        score = 5 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);

                    } else {
                        System.out.println("o numero sorteado é: " + rand); // para erro
                        System.out.println("Que pena você não conseguiu adivinhar o número!");
                        score = 0 + score;
                        System.out.println("\n=========================================================");
                        erros.add(num);
                        aleatorios.add(rand);
                    } // fim do laço de condição

                    do { // 3° laço do while para condição de jogar novamente
                        System.out.println("Gostaria de jogar novamente? digite 'S' para sim ou 'N' para não");
                        usuario = entrada.next();

                        if (usuario.equalsIgnoreCase("N")) { // encerra o jogo e mostra os valores
                            System.out.println("Sua pontuação é: " + score + " pts");
                            System.out.printf("Os números sorteados foram: ");
                            System.out.println(aleatorios);

                            if (erros.isEmpty()) {
                                System.out.println("\nNão existe erros");
                            } else {
                                System.out.println("\nNúmeros errados digitados:" + " " + erros);
                            }

                            if (acertos.isEmpty()) {
                                System.out.println("\nNão existe acertos");
                            } else {
                                System.out.println("\nNúmeros corretos digitados:" + " " + acertos);
                            }

                            break;
                        }

                        if (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")) { // informar comando invalido
                            System.out.println("Valor invalido, digite N ou S");
                        }

                    } while (!usuario.equalsIgnoreCase("N") && !usuario.equalsIgnoreCase("S")); // repetir caso for comando invalido

                } // laço do 1 do while
                while (usuario.equalsIgnoreCase("S")); // condição sim para jogar novamente ,

                break; // sair

            default:
                System.out.println("Informação invalida");

        } // laço do switch

    }
}
