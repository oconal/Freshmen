package test;

import java.util.HashMap;

public class Group {
    private String name;
    private Student starosta;
    private HashMap<Student, Boolean> grp;

    public HashMap<Student, Boolean> getGroup() {
        return grp;
    }

    public String getName() {
        return name;
    }

    public Student getStarosta() {
        return starosta;
    }

    public Group(String name) {
        grp = new HashMap<>();
        int rnd = (int) (Math.random() * 20) + 5;
        for (int i = 0; i < rnd; i++) {
            int rnd2 = (int) (Math.random() * 10) + 1;
            Boolean isHere = true;
            if (rnd2 > 8) isHere = false;
            grp.put(new Student(this), isHere);
        }
        this.name = name;
        this.starosta = chooseStarosta();
    }

    private Student chooseStarosta() {
        int check = 0;
        Student choose = null;
        HashMap<Student, Integer> tableOfScore = new HashMap<>();
        for (HashMap.Entry<Student, Boolean> pair : this.getGroup().entrySet()) {
            if (tableOfScore.containsKey(pair.getKey().chooseStarosta())) {
                int n = tableOfScore.get(pair.getKey().chooseStarosta());
                tableOfScore.put(pair.getKey().chooseStarosta(), n + 1);
            } else {
                tableOfScore.put(pair.getKey().chooseStarosta(), 1);
            }
        }
        for (HashMap.Entry<Student, Integer> pair : tableOfScore.entrySet()) {
            if (check < pair.getValue()) {
                check = pair.getValue();
                choose = pair.getKey();
            }
        }
        return choose;
    }

}
