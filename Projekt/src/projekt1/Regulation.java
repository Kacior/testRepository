package projekt1;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Regulation {
    private  String title;
    private int number;
    private int year;
    private List<Judgement> judgements = new LinkedList<>();

    public String getTitle() {
        return title;
    }

    public void assignJudgement2Regulation(Judgement judgement) {
        judgements.add(judgement);
    }

    public Regulation(String title, int number, int year) {
        this.title = title;
        this.number = number;
        this.year = year;
    }

    public int regulationSize() {
        return judgements.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regulation that = (Regulation) o;
        return number == that.number &&
                year == that.year &&
                Objects.equals(title, that.title);
    }

}
