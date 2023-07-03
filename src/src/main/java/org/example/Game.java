package org.example;

import java.util.Objects;
import java.util.Random;

public class
Game {

    public static City city=new City();
    public  void buildCity() throws Exception {


        Avatar avatar=new Avatar("",0,0);
        Avatar avatar1=new Avatar("",0,0);
        Random random=new Random();
        int no= random.nextInt(1,20);

        DataBase dataBase=new DataBase();
        dataBase.selectAll(city);


        Bank bank= new Bank(0,"Melli",null,"bank",10,0.1f,true,2);
        city.getBanks().add(bank);
        DataBase.saveBank(city,bank);
        Boutique boutique=new Boutique(1,"khoshpoosh",null,"boutique",5,0.2f,true,1);
        city.getBoutiques().add(boutique);
        DataBase.saveBoutique(city,boutique);
        Clinic clinic=new Clinic(2,"shafa",null,"clinic",6,0.3f,true,avatar,avatar1,2);
        city.getClinics().add(clinic);
        DataBase.saveClinic(city,clinic);
        Factory factory=new Factory(3,"Nassaji",null,"factory",8,0.4f,true,0,1);
        city.getFactories().add(factory);
        DataBase.saveFactory(city,factory);
        Restaurant restaurant=new Restaurant(4,"Bargrizan",null,"restaurant",7,0.5f,true,1);
        city.getRestaurants().add(restaurant);
        DataBase.saveRestaurant(city,restaurant);
        Supermarket supermarket=new Supermarket(5,"mamad",null,"supermarket",3,0.6f,true,1);
        city.getSupermarkets().add(supermarket);
        DataBase.saveSupermarket(city,supermarket);
        Home home=new Home(6,"House",null,"home",2,0.7f,true,"apartment",2,10);
        city.getHomes().add(home);
        DataBase.saveHome(city,home);
        Land land=new Land(7,"land",null,"land",1,0.8f,true,"residental&commericial",true);
        city.getLands().add(land);
        DataBase.saveLand(city,land);
        Land land1=new Land(8,"land",null,"land",1,0.9f,true,"farming",false);
        city.getLands().add(land1);
        DataBase.saveLand(city,land1);
        Land land2=new Land(9,"land",null,"land",1,1.0f,true,"residental&commericial",true);
        city.getLands().add(land2);
        DataBase.saveLand(city,land2);



    }

    public void startGame() throws Exception {


        Menu.showMenu();

    }


}
