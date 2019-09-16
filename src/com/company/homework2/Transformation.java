package com.company.homework2;

public class Transformation {
    public static void main(String[] args) {
        makeFromByte();
        makeFromShort();
        makeFromChar();
        makeFromInt();
        makeFromLong();
        makeFromFloat();
        makeFromDouble();
        makeFromBoolean();


    }

    private static void makeFromBoolean() {
        boolean y1 = false;
        byte u1 = 3;
        //u1=(byte)y1;
        boolean y2 = false;
        short u2 = 3;
        //u2=(short)y2;
        boolean y3 = false;
        char u3 = 3;
        //u3=(char)y3;
        boolean y4 = false;
        int u4 = 3;
        boolean y8 = false;
        boolean u8 = true;
        u8 = y8;
    }

    private static void makeFromDouble() {
        double n1 = 4.1;
        byte m1 = 3;
        m1 = (byte) n1;
        System.out.println(m1);
        double n2 = 4.1;
        short m2 = 3;
        m2 = (short) n2;
        System.out.println(m2);
        double n3 = 4.1;
        char m3 = 3;
        m3 = (char) n3;
        System.out.println(m3);
        double n4 = 4.1;
        int m4 = 3;
        m4 = (int) n4;
        System.out.println(m4);
        double n5 = 4.1;
        long m5 = 3;
        m5 = (long) n5;
        System.out.println(m5);
        double n6 = 4.1;
        float m6 = 3.1f;
        m6 = (float) n6;
        System.out.println(m6);
        double n7 = 4.1;
        double m7 = 3.1;
        m7 = n7;
        System.out.println(m7);
        double n8 = 4.1;
        boolean m8 = false;
        /**m8=(boolean)n8;
         System.out.println(m8);*/
    }

    private static void makeFromFloat() {
        float j1 = 2.1f;
        byte v1 = 4;
        v1 = (byte) j1;
        System.out.println(v1);
        float j2 = 2.1f;
        short v2 = 4;
        v2 = (short) j2;
        System.out.println(v2);
        float j3 = 2.1f;
        char v3 = 4;
        v3 = (char) j3;
        System.out.println(v3);
        float j4 = 2.1f;
        int v4 = 4;
        v4 = (int) j4;
        System.out.println(v4);
        float j5 = 2.1f;
        long v5 = 4;
        v5 = (long) j5;
        System.out.println(v5);
        float j6 = 2.1f;
        float v6 = 4.1f;
        v6 = j6;
        System.out.println(v6);
        float j7 = 2.1f;
        double v7 = 4.1;
        v7 = j7;
        System.out.println(v7);
        float j8 = 2.1f;
        boolean v8 = false;
        /**v8=(boolean)j8;
         System.out.println(v8);*/
    }

    private static void makeFromLong() {
        long g1 = 6;
        byte h1 = 8;
        h1 = (byte) g1;
        System.out.println(h1);
        long g2 = 6;
        short h2 = 8;
        h2 = (short) g2;
        System.out.println(h2);
        long g3 = 6;
        char h3 = 8;
        h3 = (char) g3;
        System.out.println(h3);
        long g4 = 6;
        int h4 = 8;
        h4 = (int) g4;
        System.out.println(h4);
        long g5 = 6;
        long h5 = 8;
        h5 = g5;
        System.out.println(h5);
        long g6 = 6;
        float h6 = 8f;
        h6 = g6;
        System.out.println(h6);
        long g7 = 6;
        double h7 = 8;
        h7 = g7;
        System.out.println(h7);
        long g8 = 6;
        boolean h8 = false;
        /**h8=(boolean)g8;
         System.out.println(h8);*/
    }

    private static void makeFromInt() {
        int d1 = 5;
        byte f1 = 9;
        f1 = (byte) d1;
        System.out.println(f1);
        int d2 = 5;
        short f2 = 9;
        f2 = (short) d2;
        System.out.println(f2);
        int d3 = 5;
        char f3 = 9;
        f3 = (char) d3;
        System.out.println(f1);
        int d4 = 5;
        int f4 = 9;
        f4 = d4;
        System.out.println(f4);
        int d5 = 5;
        long f5 = 9;
        f5 = d5;
        System.out.println(f5);
        int d6 = 5;
        float f6 = 9f;
        f6 = d6;
        System.out.println(f6);
        int d7 = 5;
        double f7 = 9.7;
        f7 = d7;
        System.out.println(f7);
        int d8 = 5;
        boolean f8 = false;
        /**f8=boolean(d8);
         System.out.println(f8);*/
    }

    private static void makeFromChar() {
        char a1 = 5;
        short s1 = 9;
        s1 = (short) a1;
        System.out.println(s1);
        char a2 = 5;
        byte s2 = 9;
        s2 = (byte) a2;
        System.out.println(s2);
        char a3 = 5;
        char s3 = 9;
        s3 = a3;
        System.out.println(s3);
        char a4 = 5;
        int s4 = 9;
        s4 = a4;
        System.out.println(s4);
        char a5 = 5;
        long s5 = 9;
        s5 = a5;
        System.out.println(s5);
        char a6 = 5;
        float s6 = 9f;
        s6 = a6;
        System.out.println(s6);
        char a7 = 5;
        double s7 = 9.5;
        s7 = a7;
        System.out.println(s7);
        char a8 = 5;
        boolean s8 = false;
        /**s8 = (boolean)a8;
         System.out.println(s8);*/
    }

    private static void makeFromShort() {
        short k1 = 5;
        byte l1 = 9;
        l1 = (byte) k1;
        System.out.println(l1);
        short k2 = 5;
        short l2 = 9;
        l2 = k2;
        System.out.println(l2);
        short k3 = 5;
        char l3 = 9;
        l3 = (char) k3;
        System.out.println(l3);
        short k4 = 5;
        int l4 = 9;
        l4 = k4;
        System.out.println(l4);
        short k5 = 5;
        long l5 = 9;
        l5 = k5;
        System.out.println(l5);
        short k6 = 5;
        float l6 = 9.6F;
        l6 = k6;
        System.out.println(l6);
        short k7 = 5;
        double l7 = 9.6;
        l7 = k7;
        System.out.println(l7);
        short k8 = 5;
        boolean l8 = false;
        /**l8 = (boolean)k8;
         Преобразование невозможно*/
    }

    private static void makeFromByte() {
        byte k = 5;
        byte l = 9;
        l = k;
        System.out.println(l);
        byte d = 6;
        short m = 5;
        m = d;
        System.out.println(d);
        byte z = 18;
        char q = 1;
        q = (char) z;
        System.out.println(q);
        byte a = 12;
        int b = 200;
        b = a;
        System.out.println(b);
        byte f = 9;
        long h = 100;
        h = f;
        System.out.println(h);
        byte x = 1;
        float v = 4.5f;
        v = x;
        System.out.println(v);
        byte n = 2;
        double r = 40.5;
        r = n;
        System.out.println(r);
        byte o = 3;
        boolean t = true;
        /**t = (boolean)o;
         Преобразование невоозможно*/
    }
}


