package ce1002.final1.s107502505;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class game3 implements Initializable {
	public game3() {
		
	}
	int x = 0, center = 0;
	@FXML
	Button _ReturnBtn;
	@FXML
	ImageView _back;
	@FXML
	ImageView _hero;
	@FXML
	Text text;
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
	ImageView _enemy9;
	@FXML
	ImageView _enemy10;
	@FXML
	ImageView _enemy11;
	@FXML
	ImageView _enemy12;
	@FXML
	ImageView _enemy13;
	@FXML
	ImageView _enemy14;
	@FXML
	ImageView _enemy15;
	@FXML
	ImageView _enemy16;
	@FXML
	Pane _field;
	@FXML
	ImageView _weapon;
	@FXML
	ImageView ice;
	@FXML
	ImageView fire;
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
	Pane hp11;
	@FXML
	Pane hp12;
	@FXML
	Pane hp13;
	@FXML
	Pane hp14;
	@FXML
	Pane hp15;
	@FXML
	Pane hp16;
	@FXML
	Pane hp17;
	@FXML
	Pane hp18;
	@FXML
	Pane hp19;
	@FXML
	Pane hp20;
	PathTransition pt = new PathTransition();
	public static hero hero1;
	int time;
	LinkedList<ImageView> _bullets = new LinkedList<ImageView>();
	
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
				_enemy9.setLayoutX(_enemy9.getLayoutX() + 5);
				_enemy10.setLayoutX(_enemy10.getLayoutX() + 5);
				_enemy11.setLayoutX(_enemy11.getLayoutX() + 5);
				_enemy12.setLayoutX(_enemy12.getLayoutX() + 5);
				_enemy13.setLayoutX(_enemy13.getLayoutX() + 5);
				_enemy14.setLayoutX(_enemy14.getLayoutX() + 5);
				_enemy15.setLayoutX(_enemy15.getLayoutX() + 5);
				_enemy16.setLayoutX(_enemy16.getLayoutX() + 5);


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
				_enemy8.setLayoutX(_enemy8.getLayoutX() - 5);
				_enemy9.setLayoutX(_enemy9.getLayoutX() - 5);
				_enemy10.setLayoutX(_enemy10.getLayoutX() - 5);
				_enemy11.setLayoutX(_enemy11.getLayoutX() - 5);
				_enemy12.setLayoutX(_enemy12.getLayoutX() - 5);
				_enemy13.setLayoutX(_enemy13.getLayoutX() - 5);
				_enemy14.setLayoutX(_enemy14.getLayoutX() - 5);
				_enemy15.setLayoutX(_enemy15.getLayoutX() - 5);
				_enemy16.setLayoutX(_enemy16.getLayoutX() - 5);
			
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
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				//battle1=mazeScene;
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy2.getLayoutX() -0.5< _hero.getLayoutX()& time==1) {
				_enemy2.setLayoutX(-5);
				_field.getChildren().remove(_enemy2);
				time=2;
				//main.mainStage.setScene(game.battle1);
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy3.getLayoutX() -2< _hero.getLayoutX()& time==2) {
				_enemy3.setLayoutX(-5);
				_field.getChildren().remove(_enemy3);
				time=3;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy4.getLayoutX() -2< _hero.getLayoutX()& time==3) {
				_enemy4.setLayoutX(-5);
				_field.getChildren().remove(_enemy4);
				time=4;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy5.getLayoutX() -2< _hero.getLayoutX()& time==4) {
				_enemy5.setLayoutX(-5);
				_field.getChildren().remove(_enemy5);
				time=5;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3_1.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3_1 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy6.getLayoutX() -2< _hero.getLayoutX()& time==5) {
				_enemy6.setLayoutX(-5);
				_field.getChildren().remove(_enemy6);
				time=6;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy7.getLayoutX() -2< _hero.getLayoutX()& time==6) {
				_enemy7.setLayoutX(-5);
				_field.getChildren().remove(_enemy7);
				time=7;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy8.getLayoutX() -2< _hero.getLayoutX()& time==7) {
				time=8;
				_enemy8.setLayoutX(-5);
				_field.getChildren().remove(_enemy8);
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}
			if (_enemy9.getLayoutX() -2< _hero.getLayoutX()& time==8) {
				_enemy9.setLayoutX(-5);
				_field.getChildren().remove(_enemy9);
				time=9;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}if (_enemy10.getLayoutX() -2< _hero.getLayoutX()& time==9) {
				_enemy10.setLayoutX(-5);
				_field.getChildren().remove(_enemy10);
				time=10;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3_1.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3_1 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}if (_enemy11.getLayoutX() -2< _hero.getLayoutX()& time==10) {
				_enemy11.setLayoutX(-5);
				_field.getChildren().remove(_enemy11);
				time=11;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}if (_enemy12.getLayoutX() -2< _hero.getLayoutX()& time==11) {
				_enemy12.setLayoutX(-5);
				_field.getChildren().remove(_enemy12);
				time=12;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
				
			}if (_enemy13.getLayoutX() -2< _hero.getLayoutX()& time==12) {
				_enemy13.setLayoutX(-5);
				_field.getChildren().remove(_enemy13);
				time=13;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy14.getLayoutX() -2< _hero.getLayoutX()& time==13) {
				_enemy14.setLayoutX(-5);
				_field.getChildren().remove(_enemy14);
				time=14;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy15.getLayoutX() -2< _hero.getLayoutX()& time==14) {
				_enemy15.setLayoutX(-5);
				_field.getChildren().remove(_enemy15);
				time=15;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3 mazeCtrl = loadder.getController();
				mazeScene.setOnKeyPressed(mazeCtrl.OnKeyPressed);
				main.mainStage.setScene(mazeScene);
			}
			if (_enemy16.getLayoutX() -2< _hero.getLayoutX()& time==15) {
				_enemy16.setLayoutX(-5);
				_field.getChildren().remove(_enemy16);
				time=16;
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("fight3_2.fxml"));
				Parent maze = null;
				try {
					maze = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene mazeScene = new Scene(maze);
				battle3_2 mazeCtrl = loadder.getController();
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
			line1.setStartX(_weapon.getX() + 66);
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
		if (e.getCode() == KeyCode.DIGIT3) {
			RotateTransition rt = new RotateTransition(Duration.millis(500), _weapon);
			rt.setByAngle(45 - _weapon.getRotate());
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			ImageView newBullet=new ImageView(ice.getImage());
			newBullet.setLayoutX(_weapon.getLayoutX() + _weapon.getFitWidth()/2);
			newBullet.setLayoutY(_weapon.getLayoutY() + _weapon.getFitHeight() / 2 - ice.getFitHeight() / 2);
			_bullets.push(newBullet);
			newBullet.setFitHeight(ice.getFitHeight());
			newBullet.setFitWidth(ice.getFitWidth());
			newBullet.setVisible(true);
			_field.getChildren().add(newBullet);
		}
		if (e.getCode() == KeyCode.DIGIT4) {
			RotateTransition rt = new RotateTransition(Duration.millis(500), _weapon);
			rt.setByAngle(45 - _weapon.getRotate());
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			ImageView newBullet=new ImageView(fire.getImage());
			newBullet.setLayoutX(_weapon.getLayoutX() + _weapon.getFitWidth()/2);
			newBullet.setLayoutY(_weapon.getLayoutY() + _weapon.getFitHeight() / 2 - ice.getFitHeight() / 2);
			_bullets.push(newBullet);
			newBullet.setFitHeight(fire.getFitHeight());
			newBullet.setFitWidth(fire.getFitWidth());
			newBullet.setVisible(true);
			_field.getChildren().add(newBullet);
		}
	
	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		hero1 = new hero(20, 2);
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
			ArrayList<ImageView> tBullets = new ArrayList<ImageView>(_bullets);
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
		text.setText(Integer.toString(game3.hero1.Hp)+"/20");
		if(hero1.Hp==20) {
			hp2.setStyle("-fx-background-color: green;");
			hp3.setStyle("-fx-background-color: green;");
			hp4.setStyle("-fx-background-color: green;");
			hp5.setStyle("-fx-background-color: green;");
			hp6.setStyle("-fx-background-color: green;");
			hp7.setStyle("-fx-background-color: green;");
			hp8.setStyle("-fx-background-color: green;");
			hp9.setStyle("-fx-background-color: green;");
			hp10.setStyle("-fx-background-color: green;");
			hp11.setStyle("-fx-background-color: green;");
			hp12.setStyle("-fx-background-color: green;");
			hp13.setStyle("-fx-background-color: green;");
			hp14.setStyle("-fx-background-color: green;");
			hp15.setStyle("-fx-background-color: green;");
			hp16.setStyle("-fx-background-color: green;");
			hp17.setStyle("-fx-background-color: green;");
			hp18.setStyle("-fx-background-color: green;");
			hp19.setStyle("-fx-background-color: green;");
			hp20.setStyle("-fx-background-color: green;");
		}
		if (hero1.Hp == 19) {
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 18) {
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 17) {
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 16) {
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 15) {
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 14) {
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 13) {
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 12) {
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 11) {
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 10) {
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.Hp == 9) {
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else  if (hero1.Hp == 8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 7) {
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 5) {
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 4) {
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 3) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 2) {
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
		} else if (hero1.getHp() == 1) {
			hp16.setStyle("-fx-background-color: red;");
			hp17.setStyle("-fx-background-color: red;");
			hp18.setStyle("-fx-background-color: red;");
			hp19.setStyle("-fx-background-color: red;");
			hp20.setStyle("-fx-background-color: red;");
			hp2.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");

		}
	}
	public void onBackPressed(ActionEvent e) {
		main.mainStage.setScene(level.level);
	}

}