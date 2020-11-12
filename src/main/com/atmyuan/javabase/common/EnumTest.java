package main.com.atmyuan.javabase.common;

import java.sql.SQLOutput;

public class EnumTest {
    public static void main(String[] args) {
        StringBuffer sd = null;
        StringBuilder sbd = null;
        System.out.println("EnumDome1.男=" + EnumDome1.男);
        System.out.println("EnumDome2.LAUNCH=" + EnumDome2.LAUNCH);
        EnumDome2.EVENT.show();
        System.out.println("EnumDome2.LAUNCH.name()=" + EnumDome2.LAUNCH.name());
    }
}
