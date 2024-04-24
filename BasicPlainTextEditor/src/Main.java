/**
 * @author sibekodumisani
 *
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
    public void start(Stage primaryStage) {
        // Initialize the UndoManager
        UndoManager undoManager = new UndoManager();
        

        // Create the TextArea and set its initial text
     
        TextArea txtArea = new TextArea("Type here...");
        
        txtArea.setOnKeyReleased(u->{
        	if( u.getCode() == KeyCode.SPACE || u.getCode() == KeyCode.PERIOD || u.getCode() == KeyCode.COMMA) { 
	        	undoManager.record(txtArea.getText());
	        	u.consume();
        	}
        });

		/*
		* Checks for undo keystroke and performs undo
		*/
    
        txtArea.setOnKeyPressed(u->{
        	if(u.isControlDown() && u.getCode() == KeyCode.W) { 
	        	txtArea.setText(undoManager.undo());
	        	u.consume();
        	}
        });
        

        // Set an undo action on Ctrl+Z press
	
        //GUI setup
        
        Scene newScene = new Scene(txtArea);
        primaryStage.setScene(newScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
