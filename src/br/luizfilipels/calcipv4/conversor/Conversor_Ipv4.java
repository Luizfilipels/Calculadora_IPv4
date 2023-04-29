package br.luizfilipels.calcipv4.conversor;

public class Conversor_Ipv4 {

    public static String ipv4_binario(String ipv4) {
        String[] octetos = ipv4.split("\\.");
        StringBuilder OctetosBinarios = new StringBuilder();
        for (String octeto : octetos) {
            int decimal = Integer.parseInt(octeto);
            String binario = Integer.toBinaryString(decimal);
            OctetosBinarios.append(String.format("%8s", binario).replaceAll(" ", "0")).append(".");
        }
        OctetosBinarios.deleteCharAt(OctetosBinarios.length() - 1);

        return OctetosBinarios.toString();
    }

    public static String binario_ipv4(String binario) {
        String[] octetos = binario.split("\\.");
        StringBuilder ipv4 = new StringBuilder();
        for (String octeto : octetos) {
            int decimal = Integer.parseInt(octeto, 2);
            ipv4.append(decimal).append(".");
        }
        // Remove o ponto final
        ipv4.deleteCharAt(ipv4.length() - 1);

        return ipv4.toString();
    }

}
