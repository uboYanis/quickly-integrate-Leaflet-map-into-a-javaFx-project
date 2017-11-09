package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MapController implements Initializable {

	@FXML
	private WebView webView;
	
	private WebEngine webEngine;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		webEngine = webView.getEngine();
		final URL urlLeafletMaps = getClass().getResource("/resources/index.html");
		webEngine.load(urlLeafletMaps.toExternalForm());
	}

}
