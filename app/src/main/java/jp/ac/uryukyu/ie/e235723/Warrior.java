package jp.ac.uryukyu.ie.e235723;

public class Warrior extends Hero {
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    
    public void attackWithWeponSkill(LivingThing opponent){
        if ( getHitPoint() > 0) {
            int damage = (int)(getAttack() * 3/2);
            setDead(false);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
            }
            
        }

    
}
