package by.epamtc.automation.collections.main.types;

public enum MarmaladeType {

    ORANGE("из апельсинового сока"),
    LEMON("из лимонного сока"),
    APPLE("из яблочного сока"),
    PEAR("из грушевого сока");

    String explanation;

    MarmaladeType (String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
