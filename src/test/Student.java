package test;

import java.util.HashMap;

public class Student extends Human {
    private Group grp;
    private final int iq = (int) (Math.random() * 20) + 95;
    private final int authority = (int) (Math.random() * 50) + 51;
    private final int beautiful = (int) (Math.random() * 50) + 51;
    private final int priority = (int) (Math.random() * 3) + 1; // priority: IQ - 1, authority - 2, beautiful - 3

    public int getIq() {
        return iq;
    }

    public int getAuthority() {
        return authority;
    }

    public int getBeautiful() {
        return beautiful;
    }

    public int getPriority() {
        return priority;
    }

    public Group getGrp() {
        return grp;
    }

    public Student(Group grp) {
        super();
        this.grp = grp;
        setAge((int) (Math.random() * 10) + 18);
    }

    public Student chooseStarosta() {
        Student choosen = null;
        int number = 0;
        switch (priority) {
            case 1:
                for (HashMap.Entry<Student, Boolean> pair : grp.getGroup().entrySet()) {
                    if (number < pair.getKey().getIq()) {
                        number = pair.getKey().getIq();
                        choosen = pair.getKey();
                    }
                }
                break;
            case 2:
                for (HashMap.Entry<Student, Boolean> pair : grp.getGroup().entrySet()) {
                    if (number < pair.getKey().getAuthority()) {
                        number = pair.getKey().getAuthority();
                        choosen = pair.getKey();
                    }
                }
                break;
            case 3:
                for (HashMap.Entry<Student, Boolean> pair : grp.getGroup().entrySet()) {
                    if (number < pair.getKey().getBeautiful()) {
                        number = pair.getKey().getBeautiful();
                        choosen = pair.getKey();
                    }
                }
                break;
        }
        return choosen;
    }
}
