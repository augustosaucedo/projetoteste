import java.util.Scanner;

public class classificacao {
    public String nome;
    public String genero;
    public float altura;
    public float peso;
    public char generoChar;

    public void menu() {
        String textBlock = """
                #############Olá##############
                Sejá bem vindo a classificação!
                Para prosseguir, responda as seguintes perguntas:
                """;
        System.out.println(textBlock);
    }

    public void pesquisar(String nome, String genero, float altura, float peso, char generoChar) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = scan.nextLine();
        this.nome = nome;
        System.out.print("\033[H\033[2J");

        System.out.println("Genero: ");
        genero = scan.nextLine();
        this.genero = genero;
        System.out.print("\033[H\033[2J");

        System.out.println("Altura: ");
        altura = scan.nextFloat();
        this.altura = altura;
        System.out.print("\033[H\033[2J");

        System.out.println("Peso: ");
        peso = scan.nextFloat();
        this.peso = peso;
        System.out.print("\033[H\033[2J");

        generoChar = genero.charAt(0);

        scan.close();

        classificar(altura, peso, generoChar);
    }

    public void classificar(float altura, float peso, char generoChar) {
        float calculo = peso / (altura * altura);

        if (generoChar == 'M' || generoChar == 'm') {
            if (calculo < 20) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Abaixo do peso");
            } else if (calculo >= 20 && calculo < 25) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Peso normal");
            } else if (calculo >= 25 && calculo < 30) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Sobrepeso");
            } else if (calculo >= 30) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Obesidade");
            } else {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Indefinido");
            }
        }

        if (generoChar == 'F' || generoChar == 'f') {
            if (calculo < 19) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Abaixo do peso");
            } else if (calculo >= 19 && calculo < 24) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Peso normal");
            } else if (calculo >= 24 && calculo < 29) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Sobrepeso");
            } else if (calculo >= 29) {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Obesidade");
            } else {
                System.out.println("Seu IMC: " + calculo + "\nClassificação: Indefinido");
            }
        }
}
}
