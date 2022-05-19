package com.company;

class Field {
    private int width;
    private int length;
    private int square;
     Field(int width, int length, int  sqyare){
        this.width=width;
        this.length=length;
        this.square =sqyare;
    }
    void startfield(){
    length = 108;
    System.out.println("Гравець команди під номер '10' пробіг всю довжину поля і вернувся тим самим подолав відстань:"+ (2*length));
    }
    int perimetr(int length,int width){
        int perimetr = 2*(length+width);
        return perimetr;
    }
    double perimetr(){
    double perimetr = 2*(length+width);
    System.out.println("Периметр поля :"+perimetr);
    return 0;
    }
    static void vorota(double height, double width){
        double square = height * width;
        System.out.println("Характеристика воріт :"+" Висота -" + height + " Ширина- "+ width+  " Площа - "+ square);
    }
    Field(){
        width = 0;
        length = 0;

    }
    Field(int plosha){
        width = length = plosha;
    }
    double volume(){
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}


