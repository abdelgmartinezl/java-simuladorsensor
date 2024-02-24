package sensor;

import java.util.Random;

public class AnalizadorDatosSensor {

    public static void main(String[] args) {
        final int SENSOR_VALOR_MIN = 0;
        final int SENSOR_VALOR_MAX = 100;
        final int NUM_LECTURAS = 100;

        double[] lecturaSensor = new double[NUM_LECTURAS];
        double[][] dataSensor = new double[NUM_LECTURAS][2];

        Random rand = new Random();
        for (int i = 0; i < NUM_LECTURAS; i++) {
            double lectura = SENSOR_VALOR_MIN + (SENSOR_VALOR_MAX - SENSOR_VALOR_MIN) * rand.nextDouble();
            lecturaSensor[i] =  lectura;
            dataSensor[i][0] = lectura;
            dataSensor[i][1] = System.currentTimeMillis();
        }

        double suma = 0;
        for (double l : lecturaSensor) {
            suma += l;
        }
        double promedioLectura = suma / NUM_LECTURAS;

        System.out.println("Analisis de Datos del Sensor");
        System.out.println("Lectura Promedio: " + promedioLectura);

        String estadoSensor = (promedioLectura < 50) ? "Normal" : "Anormal";
        System.out.println("Estado del Sensor: " + estadoSensor);
    }

}
