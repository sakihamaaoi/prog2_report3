package jp.ac.uryukyu.ie.e235723;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void skillTest() {
        int demoEnemyHp = 28;
        int finalDemoEnemyHp = 1;
        Warrior demoWarrior = new Warrior("デモ戦士", 10, 6);
        Enemy demoEnemy = new Enemy("スライムもどき", 28, 3);
        for (int i = 0; i < 3; i++){
            demoWarrior.attackWithWeponSkill(demoEnemy);
            demoEnemyHp -= 9;
            assertEquals(demoEnemyHp, demoEnemy.getHitPoint());

        }
        assertEquals(finalDemoEnemyHp, demoEnemy.getHitPoint());

    }
    
}
