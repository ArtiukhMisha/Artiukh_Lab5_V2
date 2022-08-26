package com.company;

public class Triangle {
    float a,b,c;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = Math.abs(a);
    }

    public float getB() {
        return b;
    }
    периметр
    public void setB(float b) {
        this.b = Math.abs(b);
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = Math.abs(c);
    }

    public String isReal(){
        String s = new String();
        if (a<b+c && b<a+c && c<b+a){
        s = "real";
        }else {
            s = "unreal";
        }
        return s;
    }
    public float Perimetr(){
        return a+b+c;
    }
    public float Space(){
        float p = (a+b+c)/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public float angleBC(){
        return (float) Math.acos((b*b+c*c-a*a)/(2*b*c));
    }
    public float angleAC(){
        return (float) Math.acos((c*c+a*a-b*b)/(2*a*c));
    }
    public float angleAB(){
        return (float) Math.acos((b*b-c*c+a*a)/(2*b*a));
    }
}
