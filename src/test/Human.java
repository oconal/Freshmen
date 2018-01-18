package test;

public class Human {
    private final String NAME = generateName();
    private int age;
    public static final String[] FIRST_NAME = {"Анна ", "Николай ", "Виктория ", "Григорий ", "Мария ", "Владимир ", "Александра ", "Иван ", "Любовь ", "Яна "};
    public static final String[] LAST_NAME = {"Мурз", "Крут", "Вой", "Кузнец", "Хомяк", "Плотник", "Лось", "Монетко", "Пильник", "Борщ"};

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
    }

    private String generateName() { // Генерирует имя человека случайным образом
        String name = "";
        name = name.concat(FIRST_NAME[(int) (Math.random() * FIRST_NAME.length)]);
        name = name.concat(LAST_NAME[(int) (Math.random() * LAST_NAME.length)]);
        return name;
    }

    private void generateCharacters() {
    }
}
