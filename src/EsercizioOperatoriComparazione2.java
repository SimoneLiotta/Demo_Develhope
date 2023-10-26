public class EsercizioOperatoriComparazione2 {
    public static void main(String[] args) {
        char primo = 'a';
        char secondo = 'a';

        System.out.println(comparaChar(primo,secondo));

    }

    public static boolean comparaChar (char primo, char secondo){
        return primo != secondo;
    }
}
