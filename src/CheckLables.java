import interfaces.Inter_TextAnalyzer;
import interfaces.Label;

public class CheckLables {
    public Label checkLabels(Inter_TextAnalyzer[] analyzers, String text) {
        for(Inter_TextAnalyzer obj_txt_an : analyzers) {
            Label label_check = obj_txt_an.processText(text);
            if (label_check != Label.OK) return label_check;
        }
        return Label.OK;
    }

}
