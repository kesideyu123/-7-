package com.hanxk.scanner;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������������䣺");
        int age = sc.nextInt();
        System.out.println("���������ǣ�" + age);

        System.out.println("�������������֣�");
        String name = sc.next();
        System.out.println(name + "��ӭ������ϵͳ~~");
    }
}