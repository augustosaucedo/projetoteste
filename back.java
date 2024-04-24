import java.util.Scanner;

public class back {
    public int vidasdefault = 10;
    public int vidas = vidasdefault;
    public int randomNumber;
    public float pontuacao = 0;
    public boolean acertou = false;
    public String resposta = "emjogo";

    public int randomizador() {
        double aleatorio = Math.random() * 100;
        int randomNumberInt = (int) aleatorio;
        return randomNumberInt;
    }

    public void tentativa() {
        acertou = false;
        System.out.println("Você tem " + vidasdefault + " vidas, tente adivinhar o número que a maquina escolheu:");
        randomNumber = randomizador();
        Scanner scan = new Scanner(System.in);

        while (acertou == false) {
            int tentativa = scan.nextInt();
            if (tentativa == randomNumber) {
                System.out.print("\033[H\033[2J");
                pontuacao = tentativa + pontuacao + vidas * vidas;
                System.out.println(
                        "Parabens, acertou com " + vidas + " vida(s) restantes\nSua pontuacao foi de: " + pontuacao);
                do {
                    System.out.println("jogar novamente? (s/n)");
                    String resposta = scan.next();

                    if (resposta.equals("s") || resposta.equals("S")) {
                        resposta = "emjogo";
                        vidas = vidasdefault;
                        randomNumber = randomizador();
                        tentativa = -1;
                        System.out.println("Você tem " + vidasdefault + " vidas e " + pontuacao
                                + " pontos, tente adivinhar o número que a maquina escolheu:");
                        // scan.close();
                        // tentativa();
                        break;
                    } else if (resposta.equals("n") || resposta.equals("N")) {
                        resposta = "emjogo";
                        acertou = true;
                        scan.close();
                        break;
                    } else {
                        System.out.println("resposta invalida");
                    }
                } while (true);

            } else {
                if (tentativa > randomNumber) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Tente um numero menor");

                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Tente um numero maior");
                }
                System.out.println("ultima tentativa: " + tentativa);
                vidas--;
                System.out.println("Vidas restantes: " + vidas);
                System.out.println("Seu score atual é: " + pontuacao);
            }
            if (vidas == 0) {
                System.out.println("Acabaram suas vidas, sua pontuacao foi de: " + pontuacao);
                acertou = true;
            }
        }
    }
}