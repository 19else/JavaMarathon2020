package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    private final int physAtt;
    private final int magicAtt;

    public Magician() {
        setHealth(getMaxHealth());
        setMagicDef(0.8);
        physAtt = 5;
        magicAtt = 20;

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                ", magicDef=" + getMagicDef() +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
    hero.setHealth((int) (hero.getHealth() - (magicAtt * hero.getMagicDef())));
        System.out.println(hero.getHealth());
    }


    @Override
    public void physicalAttack(Hero hero) {
    hero.setHealth((int) (hero.getHealth() - (physAtt * hero.getPhysDef())));
        System.out.println(hero.getHealth());
    }
}
