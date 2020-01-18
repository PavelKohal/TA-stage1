package by.epamtc.automation.collections.main.types;

public enum LollypopType {

    LOLLYPOPE_ON_STICK("карамель на палочке"),
    ICE_CARAMEL("леденцовая карамель"),
    MONPASIER("монпасье"),
    CANDY_PENCIL("леденец-карандаш");

    String explanation;

    LollypopType (String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
