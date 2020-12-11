package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private final int physAtt;

    public Warrior()     {
        setHealth(getMaxHealth());
        setPhysDef(0.8);
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                ", physDef=" + getPhysDef() +
                ", physAtt=" + physAtt +
                '}';
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - (physAtt * hero.getPhysDef())));
        System.out.println(hero.getHealth());
    }
}
