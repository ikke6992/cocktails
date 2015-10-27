package GUI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main {

	
	private void ActionSelect(){
	    // handler for key press / release events, other keys are
	    // handled by the parent (keyboard) node handler
	    final EventHandler<KeyEvent> keyEventHandler =
	        new EventHandler<KeyEvent>() {
	            public void handle(final KeyEvent keyEvent) {
	                if (keyEvent.getCode() == KeyCode.A) {
	 
	                    keyEvent.consume();
	                }else if (keyEvent.getCode() == KeyCode.B) {
	                	
	                    keyEvent.consume();	
	                }else if (keyEvent.getCode() == KeyCode.C){
	                	
	                
	                    keyEvent.consume();	
	                }else if (keyEvent.getCode() == KeyCode.D){
	                	
	                    keyEvent.consume();	                	
	                };
	            }

	        };
	 
	    keyNode.setOnKeyPressed(keyEventHandler);
	    keyNode.setOnKeyReleased(keyEventHandler);
	    
//	    keyNode.addEventhandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){
//	    	public void handle( final KeyEvent keyEvent) { handleFocusTraversal ( keyboardNode, keyEvent);
//	    	}
//	    });
	}
}
