public class LogLine {
    private final LogLevel level;
    private final String message;

    // Formato: "[<LVL>]: <MENSAJE>"
    public LogLine(String logLine) {
        int close = logLine.indexOf(']');
        String code = logLine.substring(1, close);
        this.level = LogLevel.fromCode(code);
        this.message = logLine.substring(close + 2).trim();
    }

    public LogLevel getLogLevel() {
        return level;
    }

    // Formato corto: "<NIVEL_CODIFICADO>:<MENSAJE>"
    public String getOutputForShortLog() {
        return level.getEncodedLevel() + ":" + message;
    }
}
