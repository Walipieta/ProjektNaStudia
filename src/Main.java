import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.Random;

class plant{
    String name;
    double production_cost , security_cost;
    int productivity; //wydajność
    int age;
    int time_period;
    double plant_period;
    double harvest_cost;
    double price;
    public plant (String name,double production_cost,double security_cost,int productivity,int age,int time_period ,double plant_period,double harvest_cost,
                  double price){
        this.name = name;
        this.production_cost = production_cost;
        this.security_cost = security_cost;
        this.productivity = productivity;
        this.age = age;
        this.time_period = time_period;
        this.plant_period = plant_period;
        this.harvest_cost = harvest_cost;
        this.price = price;
    }
    public String get_name (){
        return  name;
    }
    public double get_Production_cost (){
        return production_cost;
    }
    public double getSecurity_cost (){
        return security_cost;
    }
    public int get_productivity(){
        return productivity;
    }
    public int get_age(){
        return age ;
    }
    public int get_time_period (){
        return time_period;
    }
    public double getPlant_period() {
        return plant_period;
    }
    public double getHarvest_cost() {
        return harvest_cost;
    }
    public double getPrice() {
        return price;
    }
}
































class animal{
     String name;
     int age; // w tygodniach wiek zwierzaka
    char gender;
    int lifeperiod;
    boolean if_eggs , if_milk;
    double cost;
    double wage , wageplus;
    int mature;
    boolean height;
    boolean reproduction;
    double food;
    String[] type_food;
    int reporductionchance ;

    public animal (String name , int age , char gender , int lifeperiod , boolean if_eggs , boolean if_milk , double cost,double wage , double wageplus , int mature ,
    boolean height , boolean reproduction , double food , String[] type_food , int reporductionchance )
    {
       this.name = name;
        this.age = age;
        this.gender = gender;
        this.lifeperiod = lifeperiod;
        this.if_eggs = if_eggs;
        this.if_milk = if_milk;
        this.cost = cost;
        this.wage = wage;
        this.wageplus = wageplus;
        this.mature = mature;
        this.height = height;
        this.reproduction = reproduction;
        this.food = food;
        this.type_food = type_food;
        this.reporductionchance = reporductionchance;






    }
    public String get_name () {
        return name;
    }
    public int get_age () {
        return age;
    }
    public char get_gender (){
        return gender;
    }
    public int get_lifeperiod () {
        return lifeperiod;
    }
    public boolean get_if_eggs (){
        return  if_eggs;
    }
    public boolean get_if_milk (){
        return  if_milk;
    }
    public double get_cost (){
        return  cost;
    }
    public double get_wage (){
        return  wage;
    }
    public double get_wageplus (){
        return  wageplus;
    }
    public int get_mature (){
        return mature;
    }
    public boolean get_height (){
        return height;
    }
    public boolean get_reproduction (){
        return reproduction;
    }
    public double get_food (){
        return food;
    }
    public String[] get_Type_food(){
        return type_food;
    }
    public int get_reproductionchance(){
        return reporductionchance;
    }

public void show (){
    System.out.println(name,cost,gender,age);

}


}

class Gracz{
    public double money;
    int hektary;
    public ArrayList<Animal> zwierzeta_gracz = new ArrayList<Animal>();
    ArrayList <Integer> ilosc_zwierzeta_gracz = new ArrayList<Integer>();
    ArrayList <Plant> rosliny_gracz = new ArrayList<Plant>();
    public void ilosc_gatunkow_zwierzat()

    int jedzenie;

    public Gracz(){
        money = 10000;
        hektary = 0;
        jedzenie = 0;
    }

    public void changemoney( int money ){
        this.money -= money;
    }
    public void addAnimal( Animal a, int ilosc ){
        zwierzeta_gracz.add(a);
        ilosc_zwierzeta_gracz.add(ilosc);
    }
    public void addmoney(int money ){
        this.money += money ;

    }
    public void removeAnimal(Animal a, int ilosc){
        zwierzeta_gracz.remove(a);
    }
}
class farma {
    double size;
    int ilosc_budynkow;

    public farma(double size, int ilosc_budynkow) {
        this.size = size;
        this.ilosc_budynkow = ilosc_budynkow;

    }


    public void ArrayList<String> pom = new ArrayList<String>();
        pom.add(ArrList.get(0).nazwa );

        for(
    int i = 1; i<ArrList.size();i++)

    {
        if (pom.contains(ArrList.get(i).nazwa) == false) {
            pom.add(ArrList.get(i).nazwa);
        }
    }

        System.out.println(pom.size());



}



public class budynek {
    double powierzchnia;
    double cena;
    String nazwa;
    public budynek(double powierzchnia,double cena, String nazwa ){
        this.powierzchnia = powierzchnia;
        this.cena = cena;
        this.nazwa = nazwa;
    }
}







public class Main {

    public static sprawdzenie (Gracz g ){
        if (g.hektary >= 20){


        }
    }

    public static farma generator_farm (){
        Random generator = new Random();
        int size = generator.nextInt(50);
        int building = generator.nextInt(10);
        farma X = new farma(size, building);
        return X ;
    }





    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner in = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        ArrayList <Animal> zwierzeta = new ArrayList<Animal>();
        Gracz g = new Gracz();


        String name;
        int age; // w tygodniach wiek zwierzaka
        char gender;
        int lifeperiod;
        boolean if_eggs , if_milk;
        double cost;
        double wage , wageplus;
        int mature;
        boolean height;
        boolean reproduction;
        double food;
        String[] type_food;
        int reporductionchance ;

        for ( int i=0; i<4; i++){
            name = in.next();
            age = in.nextInt();
            gender = in.next().charAt(0);
            lifeperiod  = in.nextInt();
            if_eggs = in.nextBoolean();
            if_milk = in.nextBoolean();
            cost = in.nextDouble();
            wage = in.nextDouble();
            wageplus = in.nextDouble();
            mature = in.nextInt();
            height = in.nextBoolean();
            reproduction = in.nextBoolean();
            food = in.nextDouble();
            type_food = in.next;
            reporductionchance = in.nextInt();

            Animal zwierze = new Animal(name, age,gender,lifeperiod,if_eggs,if_milk,cost,wage,wageplus,mature,height,reproduction,food,type_food,reporductionchance);
            zwierzeta.add( zwierze );
        }

        for( Animal i : zwierzeta ){
            i.show();
            System.out.println( "Ilosc: " + generator.nextInt(10) );
        }

        //zwierzeta.get( generator.nextInt(3) ).show();


        int tydzien = 1;


        int wybor = -1;
        boolean losowosc = false;

        while( wybor != 0 ){
            System.out.println( "MENU" );
            System.out.println( "1. Zakup Zwierzecia" );
            System.out.println( "2. Zakup/Sprzedaz ziemi" );
            System.out.println("3.Zakup farmy");
            System.out.println("4. zakup nowych budynków");
            System.out.println("5.Zakup roślin");
            System.out.println("6.Sprzedaż roślin");
            System.out.println("7.Sprzedaż zwierząt");
            System.out.println("8.sadzenie roślin");
            System.out.println("9.zbiór roślin");
            System.out.println("10.sprawdzenie stanu zapasów");
            System.out.println("11. sprawdzenie info o zwierzetach ");
            System.out.println("12. sprawdzenie info o roślinach");
            System.out.println( "0. Koniec Tury" );
            System.out.print( "Wybierz opcje: " );
            wybor = scan.nextInt();

            if( wybor == 1 ){
                for( Animal i : zwierzeta ){
                    i.show();
                    //System.out.println( "Ilosc: " + generator.nextInt(10) );
                }
                System.out.print( "Co kupic i ile?: " );
                int numer = scan.nextInt();
                int ilosc = scan.nextInt();
                if (g.money >= zwierzeta.get( numer ).get_cost()){
                    g.changemoney( zwierzeta.get( numer ).get_cost() );
                    g.addAnimal( zwierzeta.get( numer ), ilosc );
                }

            }
            else if ( wybor == 7){
                for( Animal i : g.zwierzeta_gracz ){
                    i.show();
                    //System.out.println( "Ilosc: " + generator.nextInt(10) );
                }
                System.out.print( "Co chcesz sprzedac i ile?: " );
                int numer = scan.nextInt();
                int ilosc = scan.nextInt();
                g.addmoney( g.zwierzeta_gracz.get( numer ).get_cost());
                g.removeAnimal( g.zwierzeta_gracz.get( numer ), ilosc );
            }
            else if (wybor == 11){
                for( Animal i : g.zwierzeta_gracz ){
                    i.show();
                }


            }
            sprawdzenie ( )


            int losowe = generator.nextInt(10);
            if( losowe < 2 && losowosc == false ){
                tydzien += 10; losowosc = true;
            }
        }
        tydzien++;



        System.out.print( tydzien );
    }









}