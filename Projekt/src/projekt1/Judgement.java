package projekt1;

import java.util.*;

public class Judgement {
    private Date date;
    private String courtType;
    private String textContent;
    private String signature;
    private Map<Judge, String> judges = new HashMap<>();//Mapa przypisująca sedziemu jego funkcje w danej sprawie

    Judgement(Date date, String courtType, String textContent, String signature) {
        this.date = date;
        this.courtType = courtType;
        this.textContent = textContent;
        this.signature = signature;
    }
public String getCourtType(){
        return this.courtType;
}
    public Date getDate(){
        return this.date;
    }

    public void showContent() {
        System.out.print(textContent);
    }

    public void assignJudge2Judgement(Judge judge, String function) {
        judges.put(judge, function);
    }

    public String signature() {
        return this.signature;
    }

    private String CourtTypeToRoman(String courtType) throws IllegalArgumentException {
        switch (courtType) {
            case "COMMON":
                return "I";
            case "SUPREME":
                return "II";
            case "CONSTITUTIONAL_TRIBUNAL":
                return "III";
            case "NATIONAL_APPEAL_CHAMBER":
                return "IV";
            default:
                throw new IllegalArgumentException("Niepoprawny argument" + courtType);
        }
    }

    public int judgesPerCase() {
        return judges.size();
    }

    public void rubrum() {
        List<Judge> judgesArray =new LinkedList<>(judges.keySet());
        System.out.print(signature()+"\n"+this.date.toString()+"\n"+courtType+"\n");
        for(int i=0;i<judgesArray.size();i++){
            System.out.print(judgesArray.get(i)+"\n");
        }
    }
}
