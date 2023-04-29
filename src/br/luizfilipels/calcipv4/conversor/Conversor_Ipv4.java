package br.luizfilipels.calcipv4.conversor;

public class Conversor_Ipv4 {

    public static String converter_ip(String ipv4) {
        String[] octetos = ipv4.split("\\.");
        StringBuilder OctetosBinarios = new StringBuilder();
        for (String octeto : octetos) {
            int decimal = Integer.parseInt(octeto);
            String binary = Integer.toBinaryString(decimal);
            OctetosBinarios.append(String.format("%8s", binary).replaceAll(" ", "0")).append(".");
        }
        // Remove the trailing dot
        OctetosBinarios.deleteCharAt(OctetosBinarios.length() - 1);

        return OctetosBinarios.toString();
    }

}
