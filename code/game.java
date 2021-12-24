package ce1002.final1.s107502505;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;


public class game implements Initializable {
	//public static Scene battle1;
	public game() {
		
	}
	int x = 0, center = 0;
	@FXML
	Button _nextBtn;
	@FXML
	Button _ReturnBtn;
	@FXML
	ImageView _back;
	@FXML
	ImageView _hero;
	@FXML
	ImageView _enemy;
	@FXML
	ImageView _enemy2;
	@FXML
	ImageView _enemy3;
	@FXML
	ImageView _enemy4;
	@FXML
	ImageView _enemy5;
	@FXML
	ImageView _enemy6;
	@FXML
	ImageView _enemy7;
	@FXML
	ImageView _enemy8;
	@FXML
	Pane _field;
	@FXML
	ImageView _weapon;
	@FXML
	Label _bullet;
	@FXML
	Text text;
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
	PathTransition pt = new PathTransition();
	public static hero hero1;
	LinkedList<Label> _bullets = new LinkedList<Label>();
	int time;
	
	public EventHandler<KeyEvent> OnKeyPressed = (e) -> { // hero move
		if (e.getCode() == KeyCode.A) {
			hp();
			center--;
			_hero.setScaleX(-1);
			_weapon.setLayoutX(_hero.getLayoutX() - 50);
			_weapon.setScaleX(-1);

			if (x != 0) {
				_hero.setLayoutX(_hero.getLayoutX() - 5);
				x--;
			}
			if (center > 0 && x == 0) {
				_back.setLayoutX(_back.getLayoutX() + 5);
				_enemy.setLayoutX(_enemy.getLayoutX() + 5);
				_enemy2.setLayoutX(_enemy2.getLayoutX() + 5);
				_enemy3.setLayoutX(_enemy3.getLayoutX() + 5);
				_enemy4.setLayoutX(_enemy4.getLayoutX() + 5);
				_enemy5.setLayoutX(_enemy5.getLayoutX() + 5);
				_enemy6.setLayoutX(_enemy6.getLayoutX() + 5);
				_enemy7.setLayoutX(_enemy7.getLayoutX() + 5);
				_enemy8.setLayoutX(_enemy8.getLayoutX() + 5);

			} else if (center < 0 || center == 0) {
				_hero.setLayoutX(_hero.getLayoutX() - 5);
				_weapon.setLayoutX(_weapon.getLayoutX() - 5);
				x--;
			}
			if (_enemy.getLayoutX() - 10 < _hero.getLayoutX()) {
				pt.stop();
			}
			
		}
		
		if (e.getCode() == KeyCode.D) {
			center++;
			hp();
			if (_hero.getScaleX() == -1) {
				_hero.setScaleX(1);
				_weapon.setLayoutX(_hero.getLayoutX() + 50);
				_weapon.setScaleX(1);
			}
			if (x < 0) {
				_hero.setLayoutX(_hero.getLayoutX() + 5);
				_weapon.setLayoutX(_weapon.getLayoutX() + 5);
				x++;
			}
			if (center < 871 && x == 0) {
				_back.setLayoutX(_back.getLayoutX() - 5);
				_enemy.setLayoutX(_enemy.getLayoutX() - 5);
				_enemy2.setLayoutX(_enemy2.getLayoutX() - 5);
				_enemy3.setLayoutX(_enemy3.getLayoutX() - 5);
				_enemy4.setLayoutX(_enemy4.getLayoutX() - 5);
				_enemy5.setLayoutX(_enemy5.getLayoutX() - 5);
				_enemy6.setLayoutX(_enemy6.getLayoutX() - 5);
				_enemy7.setLayoutX(_enemy7.getLayoutX() - 5);
				_enemy8.setLayoutX(_enemy8.getLayoutX() - 5);/**/
			
			} else if (center >= 871) {
				_hero.setLayoutX(_hero.getLayoutX() + 5);
				_weapon.setLayoutX(_weapon.getLayoutX() + 5);
				x++;
			}
			if(_enemy.getLayoutX()-1<_hero.getLayoutX()) {
				pt.stop();
			}

			if (_enemy.getLayoutX() -0.5< _hero.getLayoutX()& time==0) {
				_enemy.setLayoutX(-5);
				_field.getChildren().remove(_enemy);
				time=1;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				//battle1=mazeScene;
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy2.getLayoutX() -0.5< _hero.getLayoutX()& time==1) {
				_enemy2.setLayoutX(-5);
				_field.getChildren().remove(_enemy2);
				time=2;
				//main.mainStage.setScene(game.battle1);
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy3.getLayoutX() -2< _hero.getLayoutX()& time==2) {
				_enemy3.setLayoutX(-5);
				_field.getChildren().remove(_enemy3);
				time=3;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy4.getLayoutX() -2< _hero.getLayoutX()& time==3) {
				_enemy4.setLayoutX(-5);
				_field.getChildren().remove(_enemy4);
				time=4;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy5.getLayoutX() -2< _hero.getLayoutX()& time==4) {
				_enemy5.setLayoutX(-5);
				_field.getChildren().remove(_enemy5);
				time=5;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy6.getLayoutX() -2< _hero.getLayoutX()& time==5) {
				_enemy6.setLayoutX(-5);
				_field.getChildren().remove(_enemy6);
				time=6;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy7.getLayoutX() -2< _hero.getLayoutX()& time==6) {
				_enemy7.setLayoutX(-5);
				_field.getChildren().remove(_enemy7);
				time=7;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy8.getLayoutX() -2< _hero.getLayoutX()& time==7) {
				time=8;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight1_2.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle1_2 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
		}
		
		if (e.getCode() == KeyCode.W) {
			_hero.setLayoutY(_hero.getLayoutY() - 10);
			Timeline delay = new Timeline(new KeyFrame(Duration.millis(300), (a) -> {
				_hero.setLayoutY(_hero.getLayoutY() + 10);
				_weapon.setLayoutX(_hero.getLayoutX() + 50);
			}));
			delay.play();
		}
		
		if (e.getCode() == KeyCode.DIGIT1) { // skill 1
			RotateTransition rt = new RotateTransition(Duration.millis(500), _weapon);
			rt.setByAngle(45 - _weapon.getRotate());
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
		}
		
		if (e.getCode() == KeyCode.DIGIT2) {
			RotateTransition rt = new RotateTransition(Duration.millis(1000), _weapon);
			rt.setByAngle(45);
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			Line line1 = new Line();
			line1.setStartX(_weapon.getX() + 50);
			line1.setStartY(50);
			line1.setEndX(_weapon.getX() + 166);
			line1.setEndY(50);
			PathTransition pt = new PathTransition();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(line1);
			pt.setNode(_weapon);
			pt.setOrientation(null);
			pt.setCycleCount(2);
			pt.setAutoReverse(true);
			pt.play();
		}
	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		hero1 = new hero(10, 2);
		Line line1 = new Line();
		line1.setStartX(_enemy.getLayoutX());
		line1.setEndX(_enemy.getLayoutX() + 50);
		pt = new PathTransition();
		pt.setDuration(Duration.millis(2000));
		pt.setPath(line1);
		pt.setNode(_enemy);
		pt.setOrientation(null);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		Timeline fps = new Timeline(new KeyFrame(Duration.millis(1000 / 60), (e) -> {
			ArrayList<Label> tBullets = new ArrayList<Label>(_bullets);
			for (var b : tBullets) {
				b.setLayoutX(b.getLayoutX() + 5);
				if (b.getLayoutX() > _field.getWidth()) {
					_bullets.remove(b);
					_field.getChildren().remove(b);
				}
			}
		}));
		fps.setCycleCount(Timeline.INDEFINITE);
		fps.play();
		
		
	}

	public void hp() {
		text.setText(Integer.toString(hero1.Hp)+"/10");
		if (hero1.Hp == 9) {
			hp10.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 7) {
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 5) {
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 4) {
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 3) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 2) {
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 1) {
			hp2.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");

		}
	}
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
		main.mainStage.setScene(level.level);
	}

}
