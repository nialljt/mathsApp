//==============================================
//
//	Packages from JFreeChart
//  http://www.jfree.org/jfreechart/
//  NIALL : please import jcommon-1.0.17.jar and 
//	jfreechart-1.0.14.jar from src/graph
//
//  where i learned how to use it
//  http://stackoverflow.com/questions/5290812/jfreechart-scatter-plot-lines
//
//  we altered alot of it
//
//==============================================


package graph;

import java.awt.Dimension;
import java.awt.geom.Ellipse2D;
import java.util.Vector;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class graph extends JPanel {
	private XYSeriesCollection dataset;


	public graph(Vector xp, Vector yp, Vector xl, Vector yl, String function) {
		
		dataset = new XYSeriesCollection();
		final XYSeries data = new XYSeries("data", false);
		//loop through and add points for visible points
		for(int i = 0; i < xp.size(); i++){
			data.add((float)xp.get(i),(float)yp.get(i));

		}
		
		final XYSeries otherdata = new XYSeries("otherdata", false);
		//loop through and add the points for the line
		for(int i =0; i < xl.size(); i++){
		otherdata.add((float)xl.get(i),(float)yl.get(i));
		
		}
		dataset.addSeries(data);
		dataset.addSeries(otherdata);
		final JFreeChart chart = createChart(dataset, function);
		final ChartPanel chartPanel = new ChartPanel(chart);
		//set the height and width of the chart
		chartPanel.setPreferredSize(new Dimension(540,320));
		add(chartPanel);
		setVisible(true);
	}

	private JFreeChart createChart(final XYDataset dataset, String function) {
		final JFreeChart chart = ChartFactory.createScatterPlot(function, // chart title
				"X", // x axis label
				"Y", // y axis label
				dataset, // data
				PlotOrientation.VERTICAL, false, // include legend
				false, // tooltips
				false // urls
				);
		XYPlot plot = (XYPlot) chart.getPlot();
		//set the type of render(chart type)
		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		//dont draw a line for the first set of data
		renderer.setSeriesLinesVisible(0, false);
		//draw points for the first set of data
		renderer.setSeriesShapesVisible(0, true);
		//draw lines for second set of data
		renderer.setSeriesLinesVisible(1, true);
		//dont draw points for second set of data
		renderer.setSeriesShapesVisible(1, false);
		//plot the graph
		plot.setRenderer(renderer);
		return chart;
	}

}