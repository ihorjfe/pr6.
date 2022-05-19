package com.company;

class Footballteams {
    private String name;
    private int power;
    private int speed;
    private int edurence;

    Footballteams(int power, int speed, int edurence, String name) {
        this.name = name;
        this.power = power;
        this.speed = speed;
        this.edurence = edurence;

    }

    void realmadrid(int realspeed, int realpower, int realedurence, String name) {
        realspeed = realspeed;
        realpower = realpower;
        realedurence = realedurence;
        name = name;
        System.out.println("Real Madrid :"+" Швидкість - "+realspeed+ " Сила - "+realpower+" Витривалість - "+realedurence);
    }
    void mansiti(int sitispeed, int sitipower, int sitiedurence, String name) {
        sitispeed = sitispeed;
        sitipower = sitipower;
        sitiedurence = sitiedurence;
        name = name;
        System.out.println("Mansiti :"+" Швидкість - "+sitispeed+ " Сила - "+sitipower+" Витривалість - "+sitiedurence);
    }
    int suma(int edurence, int speed,int power){
        int suma = edurence+speed+power;
        System.out.println("Сума характеристик команд :"+suma);
        return suma;
    }
    double suma(){
        double suma = edurence+speed+power;
        System.out.println("Сума характеристик команд :"+suma);
        return suma;
    }

    static void players(int realmadridplayer, int mansitiplayer) {
        int players = realmadridplayer + mansitiplayer;
        System.out.println("Кількість гравців команди RealMadrid :" + realmadridplayer);
        System.out.println("Кількість гравців команди Mansiti :" + realmadridplayer);
        System.out.println("Загальна кількість гравців :" + players);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEdurence() {
        return edurence;
    }

    public void setEdurence(int edurence) {
        this.edurence = edurence;
    }
}


