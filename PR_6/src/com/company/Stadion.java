package com.company;

class Stadion {
    private  double height;
    private int contains;
    private int price;
    private int widht;
    private int length;
    Stadion(double height, int contains, int price, int widht, int length){
    this.height = height;
    this.contains = contains;
    this.price = price;
    this.widht = widht;
    this.length = length;
}
void startcontains(){
    contains  = contains - 10000;
    System.out.println("Вболівальників на стадіоні : "+contains);
}
int squade(int widht,int length){
    int squade = length*widht;
    return squade;
}
double squade(){
    double squad = (length*widht);
    System.out.println("Площа стадіону :"+ squad);
    return  squad;
}
 static void mistsa(int sudu, int stiy){
    int mistsya = sudu+stiy;
    System.out.println("Кількість сидячих місць :"+sudu);
    System.out.println("Кількість стоячих місць :"+stiy);
    System.out.println("Загальна кількість місць :"+mistsya);
}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getContains() {
        return contains;
    }

    public void setContains(int contains) {
        this.contains = contains;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void Open(){
    System.out.println("Стадіон відкривається :");
    }
}
