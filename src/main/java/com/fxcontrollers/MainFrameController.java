package com.fxcontrollers;

import com.nodes.Popup;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MainFrameController {

    //menu section
    @FXML
    public void exitMenu_action(){
        System.exit(0);
    }

    @FXML
    public void newMenu_action(){

    }

    @FXML
    public void openMenu_action(){

    }

    @FXML
    public void saveMenu_action(){

    }

    @FXML
    public void exportPlayersMenu_action(){
    	//TODO Writer.export_player_repository(ABSOLUTE_PATH);
    }
    
    @FXML
    public void importPlayersMenu_action(){
    	//TODO Reader.import_player_repository(ABSOLUTE_PATH);
    	//TODO Refresh tables
    }

    @FXML
    public void aboutMenu_action(){
        Popup alert = new Popup(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("");
        alert.setContentText("Created by: Anthony Stulens & Ben Teppers");
        //alert.setGraphic(new ImageView(getClass().getResource("/resources/icons/image.png").toString()));
        alert.showBox();
    }
}
