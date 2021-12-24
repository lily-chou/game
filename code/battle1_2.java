package ce1002.final1.s107502505;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class battle1_2  implements Initializable {
	@FXML
	ImageView _hero;
	@FXML
	ImageView _enemy;
	@FXML
	Pane _field;
	@FXML
	ImageView _weapon;
	@FXML
	Button _ReturnBtn;
	@FXML
	Button _nextBtn;
	enemy enemy1;
	@FXML
	Pane hp1;
	@FXML
	Pane hp2;
	@FXML
	Pane hp3;
	@FXML
	Pane hp4;
	@FXML
	Pane hp5;
	@FXML
	Pane hp6;
	@FXML
	Pane hp7;
	@FXML
	Pane hp8;
	@FXML
	Pane hp9;
	@FXML
	Pane hp10;
	@FXML
	Pane e_hp1;
	@FXML
	Pane e_hp2;
	@FXML
	Pane e_hp3;
	@FXML
	Pane e_hp4;
	@FXML
	Pane e_hp5;
	@FXML
	Text text;
	public EventHandler<KeyEvent> OnKeyPressed = (e) -> {
		if (e.getCode() == KeyCode.DIGIT1) { // skill 1
			RotateTransition rt = new RotateTransition(Duration.millis(500), _weapon);
			rt.setByAngle(45 - _weapon.getRotate());
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			try {
				fight();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	};

	public void onnextPressed(ActionEvent e) {
		FXMLLoader loadder = new FXMLLoader(getClass().getResource("med.fxml"));
		Parent maze = null;
		try {
			maze = loadder.load();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scene mazeScene = new Scene(maze);
		game2 mazeCtrl = loadder.getController();
		mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
		main.mainStage.setScene(mazeScene);
	}
	
	public void onBackPressed(ActionEvent e) {
		main.mainStage.setScene(main.mainScene);
	}

	public void fight() throws InterruptedException {
		enemy1.setHp(enemy1.getHp() - game.hero1.getAtk());
		e_hp();
		TimeUnit.SECONDS.sleep((long) 0.5);
		
		if (enemy1.getHp() <= 0) {
			_field.getChildren().remove(_enemy);
			_nextBtn.setFocusTraversable(false);
			_nextBtn.setVisible(true);
		}
		if(enemy1.getHp() > 0){
			Timeline delay = new Timeline(new KeyFrame(Duration.millis(2000), (a) -> {
				_enemy.setLayoutX(_enemy.getLayoutX() - 150);
			}));
			delay.play();

			TimeUnit.SECONDS.sleep((long) 0.5);
			
			Timeline delay1 = new Timeline(new KeyFrame(Duration.millis(4000), (a) -> {
				_enemy.setLayoutX(_enemy.getLayoutX() + 150);
			}));
			delay1.play();
			game.hero1.setHp(game.hero1.getHp() - enemy1.getAtk());
			hp();
		}
		
		if (game.hero1.getHp() <= 0) {
			_field.getChildren().remove(_hero);
			_ReturnBtn.setFocusTraversable(false);
			_ReturnBtn.setVisible(true);

		}
	}

	public void hp() {
		text.setText(Integer.toString(game.hero1.Hp)+"/10");
		if(game.hero1.getHp()==9) {
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==7) {
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==5) {
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==4) {
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==3) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==2) {
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==1) {
			hp2.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");

		}
	}

	public void e_hp() {
		if (enemy1.getHp() == 3) {
			e_hp4.setStyle("-fx-background-color: red;");
			e_hp5.setStyle("-fx-background-color: red;");
		} else if (enemy1.getHp() == 1) {
			e_hp2.setStyle("-fx-background-color: red;");
			e_hp3.setStyle("-fx-background-color: red;");
		} else {
			e_hp1.setStyle("-fx-background-color: red;");
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		enemy1 = new enemy(5, 2);
		showhp();
		Timeline delay = new Timeline(new KeyFrame(Duration.millis(2000), (a) -> {
			_hero.setLayoutX(_hero.getLayoutX() + 220);
			_weapon.setLayoutX(_weapon.getLayoutX() + 220);
			_enemy.setLayoutX(_enemy.getLayoutX() - 220);

		}));
		delay.play();
	}

	public void showhp() {
		text.setText(Integer.toString(game.hero1.Hp)+"/10");
		if(game.hero1.Hp==9) {
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.Hp==8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==7) {
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==5) {
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==4) {
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==3) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==2) {
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		}else if(game.hero1.getHp()==1) {
			hp2.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");

		}
	}

}
