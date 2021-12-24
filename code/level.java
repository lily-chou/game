package ce1002.final1.s107502505;

import ce1002.final1.s107502505.game;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class level {
	public static Scene game1;
	public static Scene game2;
	public static Scene game3;
	public static Scene level;

	public void onStartPressed(ActionEvent e) throws IOException {
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("level.fxml"));
		Parent maze = loadder.load();
		Scene choose = new Scene(maze);
		level=choose;
		main.mainStage.setScene(choose);

	}
	public void onExitPressed(ActionEvent e) {
	    main.mainStage.close();
	}
	
	public void onEasyPressed(ActionEvent e) throws IOException {
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("easy.fxml"));
		Parent maze = loadder.load();
		Scene choose1 = new Scene(maze);
		game1=choose1;
		game mazeCtrl = loadder.getController();
		choose1.setOnKeyPressed(mazeCtrl.OnKeyPressed);
		main.mainStage.setScene(choose1);

	}
	public void onNormalPressed(ActionEvent e) throws IOException {
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("med.fxml"));
		Parent maze = loadder.load();
		Scene choose1 = new Scene(maze);
		game2=choose1;
		game2 mazeCtrl = loadder.getController();
		choose1.setOnKeyPressed(mazeCtrl.OnKeyPressed);
		main.mainStage.setScene(choose1);

	}
	public void onDiffPressed(ActionEvent e) throws IOException {
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("hard.fxml"));
		Parent maze = loadder.load();
		Scene choose1 = new Scene(maze);
		game3=choose1;
		game3 mazeCtrl = loadder.getController();
		choose1.setOnKeyPressed(mazeCtrl.OnKeyPressed);
		main.mainStage.setScene(choose1);


	}

}

