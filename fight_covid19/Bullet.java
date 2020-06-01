package fight_covid19;

public class Bullet extends D_object{
	
	private int HP = 0;
	private int ATK = 0;
	private int Move_speed = 0;
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public int getATK() {
		return ATK;
	}
	public void setATK(int ATK) {
		this.ATK = ATK;
	}	
	
	public int getMove_speed() {
		return Move_speed;
	}
	
	public void setMove_speed(int Move_speed) {
		this.Move_speed = Move_speed;
	}
	
	public void attack() {
		if(!Core.virus.get(this.getY()).get(this.getX()).getname().equals("E")) {
			Virus currentvirus = Core.virus.get(this.getY()).get(this.getX());
			currentvirus.setHP(currentvirus.getHP() - this.getATK());
			currentvirus.dead();
			this.dead();//hit and clear bullet
		}
	}
	
	public void dead() {}
}
