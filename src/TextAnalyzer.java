import interfaces.Inter_TextAnalyzer;

public class TextAnalyzer {

    public static void main(String[] args) {

        String[] keywords_spam = new String[]{"купите", "реклама", "цена", "цене"};

        int maxLength = 500;

        String[] test_txt = new String[]{
                "Катерина не успела на автобус и заматерилась =) . 8) :( купите наши услуги",
                "Прохожий обернулся, и многозначительно взглянув на нее произнес. Мадам, а Вы не =) против.. !!! ",
                "Мне не понравился этот текст поэтому :((((((( не смотря на то, что цена привлекательная",
                "Реклама по доступной цене :)"

        };
        Inter_TextAnalyzer[] analyzers = new Inter_TextAnalyzer[]{
                new SpamAnalyzer(keywords_spam),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength)
        };

        CheckLables txt_chek = new CheckLables();
        for (String txt : test_txt)
            System.out.println(txt_chek.checkLabels(analyzers, txt) + "\n " + txt + "\n");

    }
}
