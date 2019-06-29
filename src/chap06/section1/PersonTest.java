package chap06.section1;

class Person {
    //멤버 필드
    private String name;
    private int age;

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Kildong", 30);
        p1.setName("Dooly");
        System.out.println(p1.getName());
    }
}