package com.hanxk;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(calculate(1000, 8, "ͷ�Ȳ�"));
    }
    public static double calculate(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "ͷ�Ȳ�":
                    price *= 0.9;
                    break;
                case "���ò�":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "ͷ�Ȳ�":
                    price *= 0.7;
                    break;
                case "���ò�":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
