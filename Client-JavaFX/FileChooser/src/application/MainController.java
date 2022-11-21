package application;


import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

public class MainController {
	@FXML
	private Button btn1;
	
	@FXML
	private ListView listview1;
	
	@FXML
	private ListView listview2;
	
	public void Button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		File selectedFile = fc.showOpenDialog(null);
		
		if (selectedFile != null) {
			listview1.getItems().add(selectedFile.getAbsolutePath());
		} else {
			System.out.println("File is not valid");
		}
	}
	
	

}
