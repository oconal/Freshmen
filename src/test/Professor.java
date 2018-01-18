package test;

import java.util.HashMap;

public class Professor extends Human {

    public Professor() {
        super();
        setAge((int) (Math.random() * 29) + 49);
    }

    static void checkGroup(Group grp) { //
        int size = grp.getGroup().size();
        int isHere = 0;
        for (HashMap.Entry<Student, Boolean> pair : grp.getGroup().entrySet()) {
            if (pair.getValue() == true) isHere++;
        }
        if (size == isHere) {
            System.out.println("По результатам переклички все студенты группы \"" + grp.getName() + "\" присутствуют.");
        } else {
            System.out.println("По результатам переклички не все студенты группы \"" + grp.getName() + "\" присутствуют.");
            System.out.println("Из всей группы в " + size + " человек, присутствуют " + isHere + ".");
        }
    }
}
