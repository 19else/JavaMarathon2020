package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();
        Warrior warrior = new Warrior();
        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeamMate(magician);
        magician.magicalAttack(warrior);
        shaman.physicalAttack(warrior);
        paladin.healHimself();
        int n = 0;
        while (n < 5) {
            warrior.physicalAttack(magician);
            n++;
        }
    }
}
