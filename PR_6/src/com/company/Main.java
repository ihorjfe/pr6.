package com.company;

public class Main {

    public static void main(String[] args) {
     Footballteams teams = new Footballteams(197,198,170,"Teams"  );
     System.out.println("Характеристики команд:" );
     System.out.println("Сила - "+teams.getPower()+"Швидість"+teams.getSpeed()+"Витривалість");
     teams.realmadrid(98,100,85,"Real Madrid");
     teams.mansiti(99,98,85,"ManSiti");
     Footballteams.players(11,11);
     teams.suma(197,198,170);
     teams.suma();
     System.out.println();
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     Stadion stad = new Stadion(500.15,34915,294500000,400,500);
     System.out.println("Характеристика стадіону : ");
     System.out.println("Стадіон :" + " Висота - "+ stad.getHeight()+" Вмістивість - "+ stad.getContains()+" Ціна - "+ stad.getPrice());
     stad.startcontains();
     stad.squade(400,500);
     stad.squade();
     stad.mistsa(15000,10000);
     System.out.println();
     stad.setHeight(500.15);stad.setContains(34915);stad.setPrice(294500000);stad.setWidht(400);stad.setLength(500);
     stad.Open();
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     Field fiel = new Field(68,105,7140);
     System.out.println("Характеристика футбольного поля : ");
     System.out.println("Футбольне поле : "+" Ширина - "+fiel.getWidth()+" Довжина - "+" Площа - "+fiel.getSquare());
     fiel.startfield();
     fiel.perimetr(68,108);
     fiel.perimetr();
     Field.vorota(2.44,7.32);
     Field myfield = new Field(68,105,7140);
     Field myfield1 = new Field(6);
     Field myfield3 = new Field();
     System.out.println(myfield.volume());
     System.out.println(myfield1.volume());
     System.out.println(myfield3.volume());
     System.out.println();
     fiel.setWidth(68);fiel.setLength(105);fiel.setSquare(7140);
    }
}
