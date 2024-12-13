package ma.emsi.jouida.tp2jouidasoufiane.llm;

public class RequeteException extends Exception {
    public RequeteException(String message, String prettyPrinting) {
        super(message + prettyPrinting);
    }

}