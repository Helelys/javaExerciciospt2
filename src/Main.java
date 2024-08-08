import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


        System.out.println("Digite um número: ");
        int a = teclado.nextInt();

        if (a > 0) {
            System.out.println("Seu número é positivo.");
        }
        else {
            System.out.println("Seu número é negativo.");
        }

         */ //Checagem de positivo ou negativo

        /* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.


        System.out.println("Digite um número:");
        int a = teclado.nextInt();

        if (a % 2 == 0) {
            System.out.println("É par.");
        }
        else {
            System.out.println("É ímpar");
        }

         */ //Checagem de ímpar ou par

        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.

        System.out.println("Digite um número: ");
        int a = teclado.nextInt();
        System.out.println("Digite outro número: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

         */ //Checagem se são múltiplos

        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        System.out.println("Digite a hora que começou a jogar: ");
        int a = teclado.nextInt();
        System.out.println("Digite a hora que parou de jogar: ");
        int b = teclado.nextInt();

        int duracao;

        if (a < b) {
            duracao = b - a;
        }

        else {
            duracao = 24 - a + b;
        }
        System.out.println("O jogo durou: " + duracao + " horas.");

         */ //Checagem de horas

        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.

        System.out.printf("%n" +
                "Digite um número seguindo a ordem da lista, qual produto deseja comprar? %n" +
                "1 = Cachorro quente;%n" +
                "2 = Salada;%n" +
                "3 = x-Bacon;%n" +
                "4 = Torrada simples;%n" +
                "5 = Refrigerante.%n");

        int item = teclado.nextInt();
        double produto = 0;

        if (item == 1) {
            produto = 4.00;
        }
        else if (item == 2) {
            produto = 4.50;
        }
        else if (item == 3) {
            produto = 5.00;
        }
        else if (item == 4) {
            produto = 2.00;
        }
        else if (item == 5) {
            produto = 1.50;
        }
        else {
            System.out.println("Item inválido, insira novamente: ");
            item = teclado.nextInt();
        }

        System.out.println("Agora digite a quantidade que quer: ");
        int quantidade = teclado.nextInt();

        double conta = produto * quantidade;

        System.out.printf("Sua conta deu: %.2f", conta);

         */ //Lista de produtos com preço final

        /* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”

        System.out.println("Digite um número de 0 a 100");
        int numero = teclado.nextInt();

        if (numero >= 0 && numero < 25) {
            System.out.println("Está nos intervalos entre 0 a 25");
        }
        else if (numero >= 25 && numero < 50) {
            System.out.println("Está nos intervalos entre 25 a 50");
        }
        else if (numero >= 50 && numero < 75) {
            System.out.println("Está nos intervalos entre 50 a 75");
        }
        else if (numero >= 75 && numero < 100 ) {
            System.out.println("Está nos intervalos entre 75 a 100");
        }

        else {
            System.out.println("Inválido, digite outro número: ");
            numero = teclado.nextInt();
        }

         */ //Checagem de intervalos

        /* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.

        System.out.println("Digite o primeiro valor: ");
        double x = teclado.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double y = teclado.nextDouble();


        if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }

        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }

        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }

        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q3");
        }

        else if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }

         */ //Eixo X e eixo Y

        /* Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        Lembre que, se o salário for
        R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        duas casas decimais.

        System.out.println("Digite seu salário: ");
        double salario = teclado.nextDouble();

        double isento = 2000.00;
        double imposto8 = 0.08;
        double imposto18 = 0.18;
        double imposto28 = 0.28;

        double salarioDescontado;

        if (salario < isento) {
            System.out.println("Você é isento de imposto de Renda.");
        }

        else if (salario > 2000.01 && salario < 3000.00) {
            salarioDescontado = (salario - isento) / imposto8;
            System.out.printf("O seu imposto de renda é de: %.2f", salarioDescontado);
        }

        else if (salario > 3000.01 && salario < 4500.00) {
            salarioDescontado = (salario - isento) / imposto18;
            System.out.printf("O seu imposto de renda é de: %.2f", salarioDescontado);
        }

        else if (salario > 4500.01) {
            salarioDescontado = (salario - isento) / imposto28;
            System.out.printf("O seu imposto de renda é de: %.2f", salarioDescontado);
        }

         */

        teclado.close();
    }
}