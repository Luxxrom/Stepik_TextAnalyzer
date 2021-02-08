import interfaces.Label;
import interfaces.Inter_TextAnalyzer;

public class TooLongTextAnalyzer implements Inter_TextAnalyzer {

    private int maxLength;

    TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
        return Label.OK;
    }
}