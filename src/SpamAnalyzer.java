import interfaces.Label;
import interfaces.Inter_TextAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer implements Inter_TextAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}