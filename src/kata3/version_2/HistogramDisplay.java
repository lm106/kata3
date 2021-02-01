package kata3.version_2;

import kata3.*;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Luzma
 * @version 28-10-2020 version 2
 * @since Práctica Laboratorio
 */
public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histogram;
    
    public HistogramDisplay(String title, Histogram<String> histogram){
        super(title);
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram", "email domains", "n* emails", 
                dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (String key: histogram.keySet()){
            dataset.addValue(histogram.get(key), "", key);
        }
        /*
        dataset.addValue(23, "", "ulpgc.es");
        dataset.addValue(33, "", "dis.ulpgc.es");
        dataset.addValue(13, "", "ull.es");
        dataset.addValue(56, "", "gmail.es");
        dataset.addValue(16, "", "hotmail.com");
        */
        return dataset;
    }
    
    public void execute(){
        this.setVisible(true);
    }
}
