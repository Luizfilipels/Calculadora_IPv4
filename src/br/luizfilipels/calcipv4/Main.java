package br.luizfilipels.calcipv4;

import br.luizfilipels.calcipv4.conversor.Conversor_Ipv4;
public class Main {
    public static void main(String[] args) {
        String ip = "192.168.0.1";

        System.out.println("Calculadora IPv4");
        System.out.println("Enviando o ip: 192.168.0.1");

        System.out.println(Conversor_Ipv4.converter_ip(ip));
    }
}

