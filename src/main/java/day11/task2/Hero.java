package day11.task2;

public abstract class Hero {
    private int health;
    private double physDef;
    private double magicDef;
    private static final int MAX_HEALTH = 100;
    private static final int MIN_HEALTH = 0;

    public static int getMaxHealth() {
        return MAX_HEALTH;
    }

    public static int getMinHealth() {
        return MIN_HEALTH;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
         return health;
    }
    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }
}
