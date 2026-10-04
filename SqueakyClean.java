class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean upperNext = false;

        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                // kebab-case -> camelCase: la siguiente letra va en mayúscula.
                upperNext = true;
                continue;
            }

            char current = c;

            if (current == ' ') {
                result.append('_');
                upperNext = false;
                continue;
            }

            // Leetspeak -> texto normal.
            current = switch (current) {
                case '4' -> 'a';
                case '3' -> 'e';
                case '0' -> 'o';
                case '1' -> 'l';
                case '7' -> 't';
                default -> current;
            };

            // Se omite todo lo que no sea letra.
            if (!Character.isLetter(current)) {
                continue;
            }

            if (upperNext) {
                current = Character.toUpperCase(current);
                upperNext = false;
            }
            result.append(current);
        }

        return result.toString();
    }
}
