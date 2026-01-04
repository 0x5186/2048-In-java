public class Couleur {
    public static final String ROUGECLAIR = "\033[91m";
    public static final String ROUGEFONCER = "\033[38;5;52m";
    public static final String VERT = "\033[32m";
    public static final String VERTFONCER = "\033[38;5;22m";
    public static final String ORANGE = "\033[38;5;208m";
    public static final String BLEU = "\033[34m";
    public static final String ROSE = "\033[95m";
    public static final String JAUNE = "\033[33m";
    public static final String GRIS = "\033[90m";
    public static final String JAUNECLAIR = "\033[93m";
    public static final String CYAN = "\033[36m";
    public static final String RESET = "\033[0m";

    public static String prendreCouleur(int valeur) {
        switch (valeur) {
            case 2: return GRIS;
            case 4: return CYAN;
            case 8: return ORANGE;
            case 16: return ROSE;
            case 32: return ROUGECLAIR;
            case 64: return ROUGEFONCER;
            case 128: return VERT;
            case 256: return VERTFONCER;
            case 512: return BLEU;
            case 1024: return JAUNECLAIR;
            case 2048: return JAUNE;
            default: return RESET;
        }
    }
}