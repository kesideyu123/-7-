package javabean;

public class Student {
    private String name;
    private double score;
    //必须提供一个公开的无参数构造器


    public Student() {
    }
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
