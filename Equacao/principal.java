package Equacao;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Equacao equacao = new Equacao();
        Delta delta = new Delta();
        EqXn eqxn = new EqXn();

        System.out.println("Software para resolução de equação do segundo grau no formato ax^2 + bx + c ");
        System.out.print("Informe o valor de a: ");
        equacao.setA(entrada.nextDouble());
        System.out.print("Informe o valor de b: ");
        equacao.setB(entrada.nextDouble());
        System.out.print("Informe o valor de c: ");
        equacao.setC(entrada.nextDouble());
        System.out.println("O valor de delta é : " + delta.calcularDelta(equacao.getA(), equacao.getB(), equacao.getC()));
        if (delta.validaDelta(delta.getValorDelta())) {
            if (delta.getValorDelta() == 0) {
                System.out.println("A equação possui apenas uma solução real onde x="
                        + eqxn.calculaXu(equacao.getA(), equacao.getB(), equacao.getC()));
            } else {
                System.out.println(
                        "O valor de X negativo é: " + eqxn.calculaXn(equacao.getA(), equacao.getB(), equacao.getC()));
                System.out.println(
                        "O valor de X positivo é: " + eqxn.calculaXp(equacao.getA(), equacao.getB(), equacao.getC()));
            }
        } else {
            System.out.println("Não existe solução real para equações de segundo grau com delta negativo.");
        }
        entrada.close();
    }

}
