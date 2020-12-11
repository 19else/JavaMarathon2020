package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{

    private final int physAtt;
    private final int magicAtt;

    public Shaman() {
        setHealth(getMaxHealth());
        setPhysDef(0.2);
        setMagicDef(0.2);
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (getHealth() + 50 > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else {
            setHealth(getHealth() + 50);
        }
    }

    @Override
    public void healTeamMate(Hero hero) {
        if (hero.getHealth() + 10 < getMaxHealth()) {
            hero.setHealth(hero.getHealth() + 10);
        }
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

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                ", physDef=" + getPhysDef() +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                ", magicDef=" + getMagicDef() +
                '}';
    }
}
