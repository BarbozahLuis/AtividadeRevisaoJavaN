package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);
    public void exemplo1(){
        //1. ler o nº
        System.out.println("Digite um número");
        double nDigitado = sc.nextDouble();
        //2. se nDigitado for maior que 10
        if (nDigitado>10){
            System.out.println("É maior que 10!");
        } else{
            System.out.println("Não é maior que 10!");
        }
    }
    public void exemplo2(){
        System.out.println("Digite horas trabalhadas no mês");
        double horasMes = sc.nextDouble();
        double valorHora = 20;
        double horasFixa = 200;
        double horaExtra = horasMes-horasFixa;
        double salarioTotal = horasFixa*valorHora+horaExtra*valorHora*1.5;
        System.out.println("Seu salário total é"+salarioTotal);
        

    }
}