package Project2;

import com.toedter.calendar.JDateChooser;

import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.*;
public class MainClass {
    public static void main(String[] args) {

        Calendar calendar = new Calendar() {
            @Override
            protected void computeTime() {

            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override

            public int getLeastMaximum(int field) {
                return 0;
            }
        };

        int W = 1080;
        int H = 720;
        Color bg = new Color(1193046);

        new MainPanel(bg,W, H);

        System.out.println();
    }
}
