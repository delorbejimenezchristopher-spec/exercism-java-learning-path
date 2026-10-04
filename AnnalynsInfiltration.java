class AnnalynsInfiltration {
    // Ataque rápido: solo si el caballero está dormido.
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // Espiar: al menos uno de los tres debe estar despierto.
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // Señalar al prisionero: prisionero despierto y arquero dormido.
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    // Liberar al prisionero:
    //  - con perro: basta con que el arquero esté dormido;
    //  - sin perro: prisionero despierto y caballero y arquero dormidos.
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,
                                          boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        }
        return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }
}
