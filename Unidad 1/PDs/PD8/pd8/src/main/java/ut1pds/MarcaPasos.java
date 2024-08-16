package ut1pds;

/**
 * Hello world!
 */
public final class MarcaPasos {
    public class Marcapasos {
        
        private short presionSanguinea;      // 16 bits
        private short frecuenciaCardiaca;    // 16 bits
        private int nivelAzucar;             // 32 bits
        private float minimoTiempoLatidos;   // 32 bits
        private long maximaFuerza;           // 64 bits
        private double bateriaRestante;      // 64 bits
        private String codigoFabricante;     // 8 caracteres
    }

    // 16+16+32+32+64+64 = 224 bits = 28 bytes
    // los trings ocupan 1 byte por caracter y 4 bytes para almacenar la referencia por lo que daria 36 bytes + 4 = 40 bytes
    
}
