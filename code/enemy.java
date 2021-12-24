package ce1002.final1.s107502505;


public class enemy{
	int Hp;
    int Atk;
	public enemy() {
		
	}
	
	public enemy(int hp_,int atk_) {
		Hp=hp_;
		Atk=atk_;
	}
	public int getHp() {
    	return Hp;
    }
    public int getAtk() {
    	return Atk;
    }
    public void setHp(int n) {
    	Hp=n;
    }


}