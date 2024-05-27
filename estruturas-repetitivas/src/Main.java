import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        double vidaHeroi = 100;
        double mana = 30;
        double vidaMonstro = 50;

        while (vidaHeroi > 0 && vidaMonstro > 0) {
            int sorteMonstro;
            boolean turnoHeroi = true;

            while (turnoHeroi == true) {

                System.out.println("Vida: " + vidaHeroi + "  Mana: " + mana + "   <----+++****+++----->   Vida do Monstro: " + vidaMonstro);
                System.out.println("Escolha um tipo uma acao\n1 - Golpe de espada\n2 - Crusado Sagrado(5 de mana)\n3 - Feitico de Cura(10 de mana)");
                System.out.print("Acao desejada: ");
                int acao = sc.nextInt();
                sc.nextLine();

                if (acao == 1) {
                    int golpe = 5 + gerador.nextInt(5);
                    vidaMonstro -= golpe;
                    System.out.println("Voce deu um dano de " + golpe + " de vida no Monstro!");
                    turnoHeroi = false;
                } else if (acao == 2) {
                    if(mana >= 5) {
                        int golpe = 7 + gerador.nextInt(8);
                        mana -= 5;
                        vidaMonstro -= golpe;
                        System.out.println("Voce deu um dano de " + golpe + " de vida no Monstro!");
                        turnoHeroi = false;
                    } else {
                        System.out.println("Voce nao tem mana suficiente, selecione outra acao.");
                    }
                } else if (acao == 3) {
                    if(mana >= 10) {
                        int heal = 5 + gerador.nextInt(5);
                        mana -= 10;
                        vidaHeroi += heal;
                        System.out.println("Voce recuperou " + heal + " pontos de vida!");
                        turnoHeroi = false;
                    } else {
                        System.out.println("Voce nao tem mana suficiente, selecione outra acao.");
                    }
                } else {
                    System.out.println("Opcao Invalida! Selecione outra.");
                }
            }

            if (vidaMonstro <= 0) {
                System.out.println("Parabens! Voce derrotou o monstro");
                break;
            }
            sorteMonstro = gerador.nextInt(5);

            if (sorteMonstro < 4) {
                int golpe = 5 + gerador.nextInt(5);
                 vidaHeroi -= golpe;
                System.out.println("Voce sofreu um dano de " + golpe + " de vida!");
            } else {
                int golpe = 7 + gerador.nextInt(8);
                vidaHeroi -= golpe;
                System.out.println("Voce sofreu um dano de " + golpe + " de vida!");
            }

            if (vidaHeroi <= 0) {
                System.out.println("OH Nao! Voce foi derrotado!");
            }

        }

    }




}