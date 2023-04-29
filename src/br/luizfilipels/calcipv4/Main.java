package br.luizfilipels.calcipv4;

import br.luizfilipels.calcipv4.conversor.Conversor_Ipv4;
public class Main {
    public static void main(String[] args) {
        String ip = "192.168.0.1";
        String binary = "10101000.11100011.01110000.00000000";

        System.out.println("Calculadora IPv4");
        System.out.println("Enviando o ip: 192.168.0.1");

        System.out.println(Conversor_Ipv4.ipv4_binario(ip));

        System.out.println("Agora pegaremos qualquer binário e converteremos para notação IP");

        System.out.println(Conversor_Ipv4.binario_ipv4(binary));
    }
}

