package projekt1;

import java.io.File;
import java.text.ParseException;

public class AndJusticeForAll {
    public static void main(String[] args) {
        final File folder = new File("json");
        Judgements cases = new Judgements();//inicjalizuję zbiór orzeczeń
        Judges judgesList = new Judges();
        Regulations regList = new Regulations();/*
        new JSONReader().loadData(folder, cases, judgesList, regList);
        String[] kek = {"KIO 843/11", "KIO 843/11"};
        //cases.showMultipleRubrum(kek);
        //cases.showJudgement("KIO 843/11");
        //cases.testMethod();
        //cases.printStatistics(); // wyświetla ilośc sedziow na sprawę
        // judgesList.top10judges();
        //  cases.printDateStatistics();
        // cases.printCourtStatistics();
        regList.top10regulations();*/
        final File folder2 =new File("cbosa");
        new HTMLReader().loadData(folder2, cases, judgesList, regList);
    }
}
