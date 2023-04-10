import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
        double megabyte;
        double velocidade;
        double tempo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo em MB?");
        megabyte = teclado.nextDouble();

        System.out.println("Qual a velocidade da sua internet em MBps?");
        velocidade = teclado.nextDouble();

        tempo = (megabyte / (velocidade / 0.8)) / 60.0;

        System.out.printf("O tempo será de:%.2f", tempo);
    }

}