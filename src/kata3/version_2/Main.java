package kata3.version_2;

import kata3.*;

/**
 *
 * @author Luzma
 * @version 28-10-2020 version 2
 * @since Práctica Laboratorio
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //version 2
        Histogram<String> histogram = new Histogram();
        
        
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        
        
        //---------------------------------
        
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Ventana Histogram", histogram);
        histogramDisplay.execute();
    }
    
}
