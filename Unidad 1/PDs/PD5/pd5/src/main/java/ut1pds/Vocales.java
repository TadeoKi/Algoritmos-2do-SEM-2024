package ut1pds;

public enum Vocales {
    A('a'), E('e'), I('i'), O('o'), U('u'), 
    Á('á'), É('é'), Í('í'), Ó('ó'), Ú('ú');

    private final char letra;

    Vocales(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public static boolean esVocal(char c) {
        for (Vocales v : Vocales.values()) {
            if (v.getLetra() == c) {
                return true;
            }
        }
        return false;
    }
}
