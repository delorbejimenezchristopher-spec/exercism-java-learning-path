public class Secrets {

    // '>>>' es un desplazamiento sin signo: entran ceros por la izquierda.
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    // OR: pone en 1 los bits donde la máscara tiene 1.
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    // XOR: invierte los bits donde la máscara tiene 1.
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    // AND con la máscara negada: pone en 0 los bits donde la máscara tiene 1.
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}
