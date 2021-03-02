package com.company;

import java.awt.*;
import java.net.SocketOption;

public class Main {
        public void DisplayEmplooye() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        }
    }


        public static void main(String[] args) {
            Emplooye e1 = new Emplooye("4tr", 43, 'M');
            e1.DisplayEmplooye();
        }

}