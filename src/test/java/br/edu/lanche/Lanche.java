package br.edu.lanche;

public class Lanche {
    private  static  final double XBACON = 5;
    private  static  final double TORRADA_SIMPLES = 2;
    private  static  final double XSALADA = 4.5;
    public static double calculaValorFinal(int codigo, int quantidade) {
        switch (codigo) {
            case 2:
                return quantidade * XSALADA;
            case 3:
                return quantidade * XBACON;
            case 4:
                return quantidade * TORRADA_SIMPLES;
            default:
                break;
        }
        return 0;
    }
}
