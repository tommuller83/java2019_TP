package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class SampleController {

    @FXML
    private Button monBouton;

    @FXML
    private PieChart monPieChart;

    @FXML
    void lancer(ActionEvent event) 
    {  
    	createPieChart();
    	 }
    	 public void createPieChart() {
    	 ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
    	 data.addAll(new PieChart.Data("Asia", 30.0),
    	 new PieChart.Data("Africa", 20.3),
    	 new PieChart.Data("North America", 16.3),
    	 new PieChart.Data("South America", 12.0),
    	 new PieChart.Data("Antartica", 8.9),
    	 new PieChart.Data("Europe", 6.7),
    	 new PieChart.Data("Australia", 5.2));
    	 monPieChart.setData(data);
    	 monPieChart.setTitle("The Continents: Land Area");
    	 }

}
