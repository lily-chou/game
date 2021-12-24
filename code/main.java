package ce1002.final1.s107502505;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
//--module-path "C:\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml

public class main extends Application{
	public static Stage mainStage;
	public static Scene mainScene;
	public static MediaPlayer mediaplayer;

	@Override // override the start method in the Application

	public void start(Stage mainStage) throws IOException {
		if(mediaplayer==null) {
			Media media=new Media(getClass().getResource("music.mp3").toString());
			mediaplayer=new MediaPlayer(media);
			mediaplayer.setCycleCount(AudioClip.INDEFINITE);
			mediaplayer.play();
		}
		main.mainStage = mainStage;
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent main = loadder.load();
		mainScene = new Scene(main);
		mainStage.setTitle("拯救公主大作戰");
		mainStage.setScene(mainScene);
		mainStage.setResizable(false);
		mainStage.show();
	}

	public static void main(String[] args) {
		launch(args);// launch the data
	}

}
