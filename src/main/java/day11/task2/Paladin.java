package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
private final int physAtt;


    public Paladin() {
        physAtt = 10;
        setHealth(100);
        setPhysDef(0.5);
        setMagicDef(0.2);
    }

    @Override
    public String toString() {

        return "Paladin{" +
                "health=" + getHealth() +
                ", physDef=" + getPhysDef() +
                ", physAtt=" + physAtt +
                ", magicDef=" + getMagicDef() +
                '}';
    }

    @Override
    public void healHimself() {
        if (getHealth() + 25 > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else {
            setHealth(getHealth() + 25);
        }
     //   setHealth(Math.min(getHealth() + 25, getMaxHealth()));
    }

    @Override
    public void healTeamMate(Hero hero) {
       if (hero.getHealth() + 10 < getMaxHealth()) {
           hero.setHealth(hero.getHealth() + 10);
       }
    }

    @Override
    public void physicalAttack(Hero hero) {
         hero.setHealth((int) (hero.getHealth() - (physAtt * hero.getPhysDef())));
        System.out.println(hero.getHealth());
    }
}
