import java.util.Scanner;

/*Construa uma classe chamada Date que inclui três atributos:
mes (int), dia (int) e ano (int). Forneça um construtor que
inicializa os três atributos e assume que os valores fornecidos
são corretos. Forneça métodos set e get para cada atributo.
Forneça um método displayDate que mostra o dia, mês e ano
separados por barra (/). Escreva um programa principal para
demonstrar as características da classe Date */

public class Main {
    
    public static void main(String[] args){

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o dia de hoje: ");
            int dia = input.nextInt();

            System.out.print("Digite o mes atual: ");
            int mes = input.nextInt();

            System.out.print("Digite o ano atual: ");
            int ano = input.nextInt();

            Data dataHoje = new Data(dia,mes,ano);

            dataHoje.displayDate();
        }
        
    }


}
