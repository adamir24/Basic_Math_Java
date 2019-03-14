import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Parabola {

    public void parabola(String aTxt, String bTxt, String cTxt){

        double a = Double.parseDouble(aTxt);
        double b = Double.parseDouble(bTxt);
        double c = Double.parseDouble(cTxt);

        XYSeries dataSet= new XYSeries("");

        for(double i=-1000; i<1000; i+=0.1) dataSet.add(i, (a*i*i)+(b*i)+c);

        XYSeriesCollection xySeriesCollection = new XYSeriesCollection(dataSet);

        XYDataset xyDataset = xySeriesCollection;
        // tworzenie wykresu
        JFreeChart lineGraph = ChartFactory.createXYLineChart
                ("Parabola",  // Title
                        "Oś X",           // X-Axis label
                        "Oś Y",           // Y-Axis label
                        xyDataset,          // Dataset
                        PlotOrientation.VERTICAL,        //Plot orientation
                        true,                //show legend
                        true,                // Show tooltips
                        false               //url show
                );

        // szybkie wysswietlanie wykresu
        // przy pomocy klasy ChartFrame
        ChartFrame frame = new ChartFrame("Parabola", lineGraph);
        frame.pack();
        frame.setVisible(true);
    }
}
