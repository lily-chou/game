package ce1002.final1.s107502505;

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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class battle2 implements Initializable{
	@FXML
	ImageView _hero;
	@FXML
	ImageView _enemy;
	@FXML
	Pane _field;
	@FXML
	ImageView _weapon;
	@FXML
	ImageView e_weapon;
	@FXML
	Button _ReturnBtn;
	@FXML
	Button _nextBtn;
	hero hero1 = new hero(15, 2);
	enemy enemy1 ;
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
	Pane e_hp6;
	@FXML
	Pane e_hp7;
	@FXML
	Pane e_hp8;
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
		if (e.getCode() == KeyCode.DIGIT2) {
			RotateTransition rt = new RotateTransition(Duration.millis(1000), _weapon);
			rt.setByAngle(45);
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			Line line1 = new Line();
			line1.setStartX(_weapon.getX() + 70);
			line1.setStartY(55);
			line1.setEndX(_weapon.getX() + 170);
			line1.setEndY(55);
			PathTransition pt = new PathTransition();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(line1);
			pt.setNode(_weapon);
			pt.setOrientation(null);
			pt.setCycleCount(2);
			pt.setAutoReverse(true);
			pt.play();
			try {
				fight2();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	};
	public void onBackPressed(ActionEvent e) {
		main.mainStage.setScene(main.mainScene);
	}
	public void onnextPressed(ActionEvent e) {
		main.mainStage.setScene(level.game2);
	}
	
	public void fight() throws InterruptedException {
		enemy1.setHp(enemy1.getHp() - game2.hero1.getAtk());
		e_hp();
		TimeUnit.SECONDS.sleep((long) 0.5);
		if (enemy1.getHp() <= 0) {
			_field.getChildren().remove(_enemy);
			_field.getChildren().remove(e_weapon);
			_nextBtn.setFocusTraversable(false);
			_nextBtn.setVisible(true);
			addhp();
		}
		if(enemy1.getHp() > 0){
			RotateTransition rt = new RotateTransition(Duration.millis(500), e_weapon);
			rt.setByAngle(e_weapon.getRotate()-45);
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			game2.hero1.setHp(game2.hero1.getHp() - enemy1.getAtk());
			hp();
		}
		
		if (game2.hero1.getHp() <= 0) {
			_field.getChildren().remove(_hero);
			_ReturnBtn.setFocusTraversable(false);
			_ReturnBtn.setVisible(true);

		}
	}
	
	public void fight2() throws InterruptedException {
		enemy1.setHp(enemy1.getHp() - 3);
		e_hp();
		TimeUnit.SECONDS.sleep((long) 0.5);
		
		if (enemy1.getHp() <= 0) {
			_field.getChildren().remove(_enemy);
			_field.getChildren().remove(e_weapon);
			_nextBtn.setFocusTraversable(false);
			_nextBtn.setVisible(true);
			addhp();
		}
		if(enemy1.getHp() > 0){
			RotateTransition rt = new RotateTransition(Duration.millis(500), e_weapon);
			rt.setByAngle(e_weapon.getRotate()-45);
			rt.setCycleCount(2);
			rt.setAutoReverse(true);
			rt.play();
			game2.hero1.setHp(game2.hero1.getHp() - enemy1.getAtk());
			hp();
		}
		if (game2.hero1.getHp() <= 0) {
			_field.getChildren().remove(_hero);
			_ReturnBtn.setFocusTraversable(false);
			_ReturnBtn.setVisible(true);

		}
	}
	
	public void hp() {
		text.setText(Integer.toString(game2.hero1.Hp)+"/15");
		if(game2.hero1.getHp()==13) {
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==12) {
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==11) {
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==10) {
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==9) {
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==7) {
			hp10.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==5) {
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==4) {
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
			hp7.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==3) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp6.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==2) {
			hp4.setStyle("-fx-background-color: red;");
			hp5.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==1) {
			hp2.setStyle("-fx-background-color: red;");
			hp3.setStyle("-fx-background-color: red;");
			hp4.setStyle("-fx-background-color: red;");
		}
	}
	public void e_hp() {
		if(enemy1.getHp()==6) {
			e_hp7.setStyle("-fx-background-color: red;");
			e_hp8.setStyle("-fx-background-color: red;");
		}else if(enemy1.getHp()==5) {
			e_hp6.setStyle("-fx-background-color: red;");
			e_hp7.setStyle("-fx-background-color: red;");
			e_hp8.setStyle("-fx-background-color: red;");
		}else if(enemy1.getHp()==4) {
			e_hp5.setStyle("-fx-background-color: red;");
			e_hp6.setStyle("-fx-background-color: red;");
			e_hp7.setStyle("-fx-background-color: red;");
		}else if(enemy1.getHp()==3) {
			e_hp4.setStyle("-fx-background-color: red;");
			e_hp5.setStyle("-fx-background-color: red;");
			e_hp6.setStyle("-fx-background-color: red;");
		}else if(enemy1.getHp()==2) {
			e_hp3.setStyle("-fx-background-color: red;");
			e_hp4.setStyle("-fx-background-color: red;");
			e_hp5.setStyle("-fx-background-color: red;");
		}else if(enemy1.getHp()==1) {
			e_hp2.setStyle("-fx-background-color: red;");
			e_hp3.setStyle("-fx-background-color: red;");
			e_hp4.setStyle("-fx-background-color: red;");
		}else {
			e_hp1.setStyle("-fx-background-color: red;");
			e_hp2.setStyle("-fx-background-color: red;");
			e_hp3.setStyle("-fx-background-color: red;");
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		showhp();
		enemy1 = new enemy(8, 2);
		Timeline delay = new Timeline(new KeyFrame(Duration.millis(2000), (a) -> {
			_hero.setLayoutX(_hero.getLayoutX()+220);
			_weapon.setLayoutX(_weapon.getLayoutX()+220);
			_enemy.setLayoutX(_enemy.getLayoutX()-220);
			e_weapon.setLayoutX(e_weapon.getLayoutX()-220);
			
		}));
		delay.play();
	}

	public void addhp() {
		if(game2.hero1.getHp()==13) {
			hp14.setStyle("-fx-background-color: green;");
			hp15.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=15;
		}else if(game2.hero1.getHp()==12) {
			hp13.setStyle("-fx-background-color: green;");
			hp14.setStyle("-fx-background-color: green;");
			hp15.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=15;
		}else if(game2.hero1.getHp()==11) {
			hp12.setStyle("-fx-background-color: green;");
			hp13.setStyle("-fx-background-color: green;");
			hp14.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=14;
		}else if(game2.hero1.getHp()==10) {
			hp11.setStyle("-fx-background-color: green;");
			hp12.setStyle("-fx-background-color: green;");
			hp13.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=13;
		}else if(game2.hero1.getHp()==9) {
			hp10.setStyle("-fx-background-color: green;");
			hp11.setStyle("-fx-background-color: green;");
			hp12.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=12;
		}else if(game2.hero1.getHp()==8) {
			hp9.setStyle("-fx-background-color: green;");
			hp10.setStyle("-fx-background-color: green;");
			hp11.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=11;
		}else if(game2.hero1.getHp()==7) {
			hp8.setStyle("-fx-background-color: green;");
			hp9.setStyle("-fx-background-color: green;");
			hp10.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=10;
		}else if(game2.hero1.getHp()==6) {
			hp7.setStyle("-fx-background-color: green;");
			hp8.setStyle("-fx-background-color: green;");			
			hp9.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=9;
		}else if(game2.hero1.getHp()==5) {
			hp6.setStyle("-fx-background-color: green;");
			hp7.setStyle("-fx-background-color: green;");
			hp8.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=8;
		}else if(game2.hero1.getHp()==4) {
			hp5.setStyle("-fx-background-color: green;");
			hp6.setStyle("-fx-background-color: green;");
			hp7.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=7;
		}else if(game2.hero1.getHp()==3) {
			hp4.setStyle("-fx-background-color: green;");
			hp5.setStyle("-fx-background-color: green;");
			hp6.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=6;
		}else if(game2.hero1.getHp()==2) {
			hp3.setStyle("-fx-background-color: green;");
			hp4.setStyle("-fx-background-color: green;");
			hp5.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=5;
		}else if(game2.hero1.getHp()==1) {
			hp2.setStyle("-fx-background-color: green;");
			hp3.setStyle("-fx-background-color: green;");
			hp4.setStyle("-fx-background-color: green;");
			game2.hero1.Hp=4;
		}
		text.setText(Integer.toString(game2.hero1.Hp)+"/15");
	}
	public void showhp() {
		text.setText(Integer.toString(game2.hero1.Hp)+"/15");
		if(game2.hero1.getHp()==14) {
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==13) {
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==12) {
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==11) {
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==10) {
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==9) {
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.Hp==8) {
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==7) {
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==6) {
			hp7.setStyle("-fx-background-color: red;");
			hp8.setStyle("-fx-background-color: red;");
			hp9.setStyle("-fx-background-color: red;");
			hp10.setStyle("-fx-background-color: red;");
			hp11.setStyle("-fx-background-color: red;");
			hp12.setStyle("-fx-background-color: red;");
			hp13.setStyle("-fx-background-color: red;");
			hp14.setStyle("-fx-background-color: red;");
			hp15.setStyle("-fx-background-color: red;");
		}else if(game2.hero1.getHp()==5) {
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
		}else if(game2.hero1.getHp()==4) {
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
		}else if(game2.hero1.getHp()==3) {
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
		}else if(game2.hero1.getHp()==2) {
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
		}else if(game2.hero1.getHp()==1) {
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

}
