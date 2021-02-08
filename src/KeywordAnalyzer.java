import interfaces.Inter_TextAnalyzer;
import interfaces.Label;

abstract class KeywordAnalyzer implements Inter_TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] words_negative = getKeywords();
        for (String key_i : words_negative) {
            boolean check = text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }
}
