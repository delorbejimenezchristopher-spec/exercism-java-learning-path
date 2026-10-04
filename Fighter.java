class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    // Un guerrero nunca es vulnerable.
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        spellPrepared = true;
    }

    // Es vulnerable salvo que haya preparado un hechizo.
    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter warrior) {
        return spellPrepared ? 12 : 3;
    }
}
