package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int magicAtt = 15;
    static final int HEAL_HIMSELF = 50;
    static final int HEAL_TEAMMATE = 30;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    public String toString() {
        return "health: " + health;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > MAX_HEALTH)
            health = MAX_HEALTH;
        else
            health += HEAL_HIMSELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH)
            hero.health = MAX_HEALTH;
        else
            hero.health += HEAL_TEAMMATE;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef) < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= magicAtt * (1 - hero.magicDef);
    }
}
