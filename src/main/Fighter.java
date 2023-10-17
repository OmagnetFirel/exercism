package main;

abstract class Fighter {

    boolean isVulnerable(){
        return false;
    };

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {
    @Override
    public String toString() {
        String msg = String.format("main.Fighter is a main.Warrior");
        return msg;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }


}

class Wizard extends Fighter {
    boolean spellPrepared = false;


    @Override
    int damagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }

    void prepareSpell() {
        spellPrepared = true;
    }

}