package jp.ac.uryukyu.ie.e235723;

public class LivingThing {
    private String name;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private int hitPoint;
    /**
     * getter
     * @return int hitPoint 敵のHP
     */
    public int getHitPoint() {
        return this.hitPoint;
    }
    /**
     * setter
     * @param hitPoint int hitPoint 敵のHP
     * 
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    private int attack;
    /**
     * getter
     * @return int attack 敵の攻撃力
     */
    public int getAttack() {
        return this.attack;
    }
    /**
     * setter
     * @param attack int attack 敵の攻撃力
     * 
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    private boolean dead;
    /**
     * getter
     * @return boolean dead 敵の生死状態。true=死亡。
     */
    public boolean isDead() {
        return this.dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    
    public LivingThing (String name, int hitPoint, int attack) {
        this.setName(name);
        this.setHitPoint(hitPoint);
        this.setAttack(attack);
        this.setDead(dead);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public void attack(LivingThing opponent){
        if ( getHitPoint() > 0) {
            int damage = (int)(Math.random() * attack);
            this.dead = false;
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
            }
            
        }

    
    public void wounded(int damage){
        hitPoint -= damage;
        if(this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    
}
