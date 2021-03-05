package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    public String toString() {
        return "health: " + health;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef) < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= magicAtt * (1 - hero.magicDef);
    }
}
