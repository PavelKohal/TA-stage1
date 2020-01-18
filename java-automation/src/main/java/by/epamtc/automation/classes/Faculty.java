package by.epamtc.automation.classes;

public enum Faculty {
    EF("экономический факультет"),
    MF("механический факультет"),
    TF("технический факультет");

    private String decoding;

    Faculty(String decoding) {
        this.decoding = decoding;
    }

    public String getDecoding() {
        return decoding;
    }
}
