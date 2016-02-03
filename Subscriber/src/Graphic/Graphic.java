package Graphic;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import Time.Time;

@SuppressWarnings("serial")
	public class Graphic extends ApplicationFrame implements Observer
	{

		private XYDataset dataset;
		private final JFreeChart chart;
		private final ChartPanel chartPanel;
		
		public Graphic(final String title) 
		{
			super(title);
			dataset = new XYSeriesCollection();
			chart = createChart(dataset,title);
			chartPanel = new ChartPanel(chart);
			chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
			setContentPane(chartPanel);
			pack();
			RefineryUtilities.centerFrameOnScreen(this);
		}
		private JFreeChart createChart(final XYDataset dataset,String title)
		{
			final JFreeChart chart = ChartFactory.createXYLineChart(title, "Time (min)", "Temperature (°C)", dataset,PlotOrientation.VERTICAL,true,true,false);
			chart.setBackgroundPaint(Color.white);
			final XYPlot plot = chart.getXYPlot();
			plot.setBackgroundPaint(Color.WHITE);
			plot.setDomainGridlinePaint(Color.black);
			plot.setRangeGridlinePaint(Color.black);
			final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
			plot.setRenderer(renderer);
			final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
			return chart;
		}
		private void setPoint(String name,int x,double y)
		{
			XYSeries series = null;
			try
			{
				series = ((XYSeriesCollection) dataset).getSeries(name);
			}catch(UnknownKeyException e)
			{
				series = new XYSeries(name);
				((XYSeriesCollection) dataset).addSeries(series); 
			}
			series.add(x,y);
			
			XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) chart.getXYPlot().getRenderer();
			renderer.setSeriesLinesVisible(series.getItemCount() -1,true);
			renderer.setSeriesShapesVisible(series.getItemCount() -1,true);
		}
		
		@Override
		public void update(Observable arg0,Object arg1)
		{
			long temp = (long) arg1;
			setPoint("Temperature",Time.getIstance().getTempActual()-1,temp);
		}
}
