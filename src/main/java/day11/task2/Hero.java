package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    public void physicalAttack(Hero hero) {

        if (hero.health - physAtt * (1 - hero.physDef) < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= physAtt * (1 - hero.physDef);

    }
}
