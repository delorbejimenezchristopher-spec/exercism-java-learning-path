public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String code;
    private final int encodedLevel;

    LogLevel(String code, int encodedLevel) {
        this.code = code;
        this.encodedLevel = encodedLevel;
    }

    public int getEncodedLevel() {
        return encodedLevel;
    }

    // Convierte el código de tres letras en su nivel; si no existe, UNKNOWN.
    public static LogLevel fromCode(String code) {
        for (LogLevel level : values()) {
            if (level != UNKNOWN && level.code.equals(code)) {
                return level;
            }
        }
        return UNKNOWN;
    }
}
