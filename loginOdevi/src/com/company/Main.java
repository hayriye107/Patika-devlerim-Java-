package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner islem = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = islem.nextLine();
        System.out.print("Şifreniz: ");
        password = islem.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Şifre yanlış.\nşifrenizi yenilemek için 1'e basınız.");
            int kontrol = islem.nextInt();
            islem.nextLine();
            if (kontrol == 1) {
                System.out.print("Yeni parolanız:");
                newPassword = islem.nextLine();
                if (!Objects.equals(newPassword, password)) {
                    System.out.print("Yeni Parolanız: " + newPassword);
                } else {
                    System.out.println("ŞİFRE OLUŞTURMA KURALLARINA UYGUN DEĞİL");
                }
            } else {
                System.out.println("Şifrre oluşturulmadı");
            }


        }


    }
}


