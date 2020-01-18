package by.epamtc.automation.collections.main.types;

public enum ChocolateType {

    STUFFED_CHOCOLATE("с начинкой"),
    WITH_WAFFLE("вафельный"),
    PURE_CHOCOLATE("только шоколад");

    String explanation;

    ChocolateType (String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
