import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; // zbiera cos z pliku
import java.util.Random;  // losowosci







class Plant{
    String name; // nazwa rosliny
    double cost, production_cost , security_cost;  // koszt przygotowania ziemi  , koszty produkcji , koszt ochrony przed szkodnikami
    int productivity; //wydajność upraw tony na hektar
    int age;   // wiek rosliny
    int time_period;  // czas potrzebny do wyrosniecia
    double plant_period; // kiedy można ja sadzic
    double harvest_cost; // koszt zbiorów
    double price; // cena za kg
    public int harvest_amount; //ilosc_zbiorow
    public boolean if_seed = false; //czy_zasadzona
    public int time_seed = 0; //czas_zasadzenia
    public Plant (String name,double cost,double production_cost,double security_cost,int productivity,int age,int time_period ,double plant_period,double harvest_cost,
                  double price,int harvest_amount, boolean if_seed,int time_seed){
        this.name = name;
        this.cost = cost;
        this.production_cost = production_cost;
        this.security_cost = security_cost;
        this.productivity = productivity;
        this.age = age;
        this.time_period = time_period;
        this.plant_period = plant_period;
        this.harvest_cost = harvest_cost;
        this.price = price;
        this.harvest_amount = harvest_amount;
        this.if_seed = if_seed;
        this.time_seed = time_seed;
    }
    public String get_name (){
        return  name;
    }
    public void set_name( String name ){
        this.name = name;
    }


    public double get_cost (){
        return cost;
    }
    public void set_cost (double cost){this.cost = cost;}


    public double get_Production_cost (){
        return production_cost;
    }
    public void set_Production_cost (double production_cost){this.production_cost = cost;}


    public double getSecurity_cost (){
        return security_cost;
    }
    public void set_security_cost (double security_cost){this.security_cost = security_cost;}


    public int get_productivity(){
        return productivity;
    }
    public void set_productivity (int productivity) {this.productivity =productivity;}


    public int get_age(){return age ;}
    public void set_age (int age) {this.age = age;}


    public int get_time_period (){return time_period;}
    public void set_time_period (int time_period){this.time_period = time_period;}


    public double get_plant_period() {return plant_period;}
    public void set_plant_period (double plant_period){this.plant_period = plant_period;}


    public double get_harvest_cost() {return harvest_cost;}
    public void set_harvest_cost(double harvest_cost){this.harvest_cost = harvest_cost;}


    public double get_price() {return price;}
    public void set_price (double price){this.price = price;}


    public int get_harvest_amount(){return harvest_amount;}
    public void set_harvest_amount(int harvest_amount){this.harvest_amount = harvest_amount;}


    public boolean get_if_seed() {return if_seed;}
    public void set_if_seed (boolean if_seed){this.if_seed = if_seed;}


    public int get_time_seed() {return time_seed;}
    public void set_time_seed (int time_seed){this.time_seed = time_seed;}



    public double profit(){
        double result = harvest_amount * price;
        if_seed = false;
        harvest_amount = 0;
        time_seed = 0;
        return result;
    }
    public void show (){
        System.out.println(name + " " + price + " " + productivity + " " + age);
    }

}

class Animal{
     String name; // co to za zwierzak
     int age; // w tygodniach wiek zwierzaka
    char gender; // płeć
    int lifeperiod; //
    boolean if_eggs , if_milk;  // czy znosi jajka czy daje mleko takie zwierze daje siano co tydzien
    double cost;  //koszt zwierzęcia
    double wage , wageplus; // ile waży , ile przybiera na wadze
    int mature; // dojrzałość czyli czy jest duże czy młode
    boolean height;
    boolean reproduction;
    double food;
    String[] type_food;  // jakie typu jedzenie zwierze akceptuje
    int reporductionchance ; // szansa na rozmnozenie musze posiadac wiecej niz 1 zwierze

    public Animal (String name , int age , char gender , int lifeperiod , boolean if_eggs , boolean if_milk , double cost,double wage , double wageplus , int mature ,
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
    public void set_name (String name){this.name = name;}


    public int get_age () {
        return age;
    }
    public void set_age ( int age ){this.age = age;}


    public char get_gender (){
        return gender;
    }
    public void set_gender (char gender){this.gender = gender;}


    public int get_lifeperiod () {
        return lifeperiod;
    }
    public void set_lifeperiod ( int lifeperiod){this.lifeperiod = lifeperiod;}


    public boolean get_if_eggs (){
        return  if_eggs;
    }
    public void set_if_eggs (boolean if_eggs){this.if_eggs = if_eggs;}


    public boolean get_if_milk (){
        return  if_milk;
    }
    public void set_if_milk (boolean if_eggs){this.if_milk = if_milk;}


    public double get_cost (){
        return  cost;
    }
    public void set_cost ( double cost) {this.cost = cost;}


    public double get_wage (){
        return  wage;
    }
    public void set_wage (double wage){ this.wage = wage;}


    public double get_wageplus (){
        return  wageplus;
    }
    public void set_wageplus (double wageplus){ this.wageplus = wageplus;}


    public int get_mature (){
        return mature;
    }
    public void set_mature ( int mature ){ this.mature = mature;}


    public boolean get_height (){
        return height;
    }
    public void set_height (boolean height){ this.height = height;}


    public boolean get_reproduction (){
        return reproduction;
    }
    public void set_reproduction ( boolean reproduction){ this.reproduction = reproduction;}


    public double get_food (){
        return food;
    }
    public void set_food ( double food ){ this.food = food;}



    public String[] get_Type_food(){
        return type_food;
    }
    public void set_Type_food(String[] type_food){this.type_food = type_food;}


    public int get_reproductionchance(){
        return reporductionchance;
    }
    public void set_reproductionchance (int reporductionchance){ this.reporductionchance = reporductionchance;}
)



    public void show (){
        System.out.println(name + " " + cost + " " + gender + " " + age);
    }

}




class Player{
    public double money;
    int acres;
    public ArrayList<Animal> animal_player = new ArrayList<Animal>();
    //public ArrayList <Integer> amount_animal_player = new ArrayList<Integer>();
    public ArrayList <Plant> plant_player = new ArrayList<Plant>();
    //public ArrayList <Integer> amount_plant_player = new ArrayList<Integer>();
    public ArrayList <Farm> farm_player = new ArrayList<Farm>();
    public void amount_species_animal();





    int food;

    public Player(){
        money = 10000;
        acres = 0;
        food = 0;
    }
    public int get_food(){return food;}
    public void set_food (int food){this.food = food;}
    public double get_money(){return money;}
    public void set_money (double money){}




    public int get_acres (){return acres;}
    public void set_acres( int amount ){acres += amount;}

    public void changemoney( int money ){this.money -= money;}
    public void addAnimal( Animal a, int amount ){
        animal_player.add(a);
        amount_animal_player.add(amount);
    }
    public void addPlant( Plant a, int amount ){
        plant_player.add(a);
        amount_plant_player.add(amount);
    }
    public void addmoney(int money ){
        this.money += money ;

    }
    public void removeAnimal(Animal a, int amount){
        animal_player.remove(a);
    }
    public void removePlant(Plant a, int ilosc){
        plant_player.remove(a);
    }
}
class Farm {
    double size;
    int buildings_amount;

    double cost ;

    public Farm(double size, int buildings_amount, double cost) {
        this.size = size;
        this.buildings_amount = buildings_amount;
        this.cost = cost;

    }
    public void show(){
        System.out.println("Size of Farm: " + size + " buildings_amount: " + buildings_amount);
    }

    public double get_cost(){
        return cost;
    }

    /*public void ArrayList<String> pom = new ArrayList<String>();
        pom.add(ArrList.get(0).nazwa );

        for(
    int i = 1; i<ArrList.size();i++)

    {
        if (pom.contains(ArrList.get(i).nazwa) == false) {
            pom.add(ArrList.get(i).nazwa);
        }
    }

        System.out.println(pom.size());
*/
    public void addFarm( Building a ){
        buildings_farm.add(a);
    }


}
 class Building {
    double surface;
    double price;
    String name;
    public Building (double surface,double price, String name ){
        this.surface = surface;
        this.price = price;
        this. name = name;
    }
}
public class Main {
    public double price = 1000;
    public static boolean check (Player g ){
        int food = 0;
        int uniqueAnimal = 0;
        ArrayList<Animal> diffrent_animals = new ArrayList<Animal>();
        for ( int i=0; i<g.animal_player.Length; i++ ){
            if (pom.contains(ArrayList.get(i).nazwa) == false)
                if(  diffrent_animals.contains(g.animal_player.get(i)) == false ){
                    diffrent_animals.add( g.animal_player.get(i) );
                }
        }
        uniqueAnimal = diffrent_animals.Length;

        int uniquePlants = 0;
        ArrayList<Plant> diffrent_plants = new ArrayList<Plant>();
        for ( int i=0; i<g.plant_player.Length; i++ ){
            if(  diffrent_plants.contains(g.plant_player.get(i)) == false ){
                diffrent_plants.add( g.plant_player.get(i) );
            }
        }
        uniquePlants = diffrent_plants.Length;

        for( Animal i : g.animal_player ){
            food += i.get_food();
        }
        if (g.acres >= 20 && food*52 <= g.get_food() && uniqueAnimal >= 5 && uniquePlants >= 5 ){
            return true;
        }
        return false;
    }
    public static Farm generator_farm (){
        Random generator = new Random();
        int size = generator.nextInt(50);
        int building = generator.nextInt(10);
        Farm X = new Farm(size, building);
        return X;
    }
    public static mass_up( ArrayList<Animal> a, ArrayList <Plant> p ){
        for( Animal i : a )
            i.wage++;
        for( Plant i : p )
            i.age++;

    }
    public static reproduction( ArrayList<Animal> a, Player g ){
        public ArrayList<Animal> z_g = new ArrayList<Animal>();
        public ArrayList <Integer>amount_z_g = new ArrayList<Integer>();

        z_g.add( a.get(0).get_name() );
       amount_z_g.add(1);

        for (int i = 0; i<a.Length; i++ ){
            boolean ok = false;
            for (int j = 0; j<z_g.Length; j++ ){
                if( a.get(i) == z_g.get(j) ){
                   amount_z_g[j]++;
                    ok = true;
                    break;
                }
            }
            if( ok == false ){
                z_g.add( a.get(i) );
               amount_z_g.add(1);
            }
        }

        for (int i=0; i<z_g.Length; i++ ){
            if(amount_z_g.get(i) > 1 ){
                Animal animal = new Animal(z_g.get(i).get_name(), 0 ,z_g.get(i).get_gender(),z_g.get(i).get_lifeperiod(),z_g.get(i).get_if_eggs(),z_g.get(i).get_if_milk(),z_g.get(i).get_cost(),z_g.get(i).get_wage(),z_g.get(i).get_wageplus(),z_g.get(i).get_mature(),z_g.get(i).get_height(),z_g.get(i).get_reproduction(),z_g.get(i).get_food(),z_g.get(i).get_Type_food(),z_g.get(i).get_reproductionchance());
                g.animal_player.add( animal );
            }
        }
    }
    public static protection( ArrayList<Plant> p, Player g ){
        for( Plant i : p ){
            g.changemoney( i.getSecurity_cost );
        }
    }
    public static if_eggs_if_milk( ArrayList<Animal> a, Player g ){
        for( Animal i : a ){
            if( i.get_if_eggs() || i.get_if_milk() )
                g.addmoney( 100 );
        }
    }
    public static feeding( ArrayList<Animal> a, Player g ){
        for( Animal i : a ){
            if( i.get_food() < g.get_food() )
                g.set_food( -5 );
            else
                g.changemoney(-50);
        }
    }
    public static zero_money( Player g ){
        for (int i = 0; i<g.animal_player.Length; i++ ){
            g.animal_player.get(i).set_wage(1);
        }
    }
    public static zero_harvest( Player g ){
        int i = 0;
        while( i < g.plant_player.Length ){
            if( g.plant_player.get(i).czy_zasadzona == true ){
                g.plant_player.remove(i);
                i = 0;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("animal.txt");
        File file2 = new File("plant.txt");
        File file3 = new File("building.txt");
        Scanner in = new Scanner(file1);
        Scanner in2 = new Scanner(file2);
        Scanner in3 = new Scanner(file3);
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        ArrayList <Animal> animals = new ArrayList<Animal>();
        ArrayList <Plant>  plants = new ArrayList<Plant>();
        ArrayList <Building> buildings = new ArrayList<Building>();
        Player g = new Player();


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
            animals.add( zwierze );
        }

        String name;
        double cost, production_cost , security_cost;
        int productivity; //wydajność
        int age;
        int time_period;
        double plant_period;
        double harvest_cost;
        double price;

        for ( int i=0; i<4; i++){
            name = in2.next();
            cost = in2.nextDouble();
            production_cost = in2.nextDouble();
            security_cost = in2.nextDouble();
            productivity = in2.next();
            age = in2.next();
            time_period = in2.next();
            plant_period = in2.nextDouble();
            harvest_cost = in2.nextDouble();
            price = in2.nextDouble();

            Plant plant = new Plant(name, cost, production_cost, security_cost, productivity, age, time_period, plant_period, harvest_cost, price);
            plants.add( plant );
        }

        String name;
        double surface, price;

        for ( int i=0; i<5; i++){
            name = in3.next();
            surface = in3.nextDouble();
            price = in3.nextDouble();

            Building building = new Building(name, surface, price);
            buildings.add( building );
        }

        for( Animal i : animals ){
            i.show();
            System.out.println( "Ilosc: " + generator.nextInt(10) );
        }

        //zwierzeta.get( generator.nextInt(3) ).show();


        int week = 1;

        while( true ){
            int choice = -1;
            boolean randomness = false;

            while( choice != 0 ){
                System.out.println( "MENU" );
                System.out.println( "1. Buy animal" );
                System.out.println( "2. Buy/Sell ground" );
                System.out.println( "3. Buy farm");
                System.out.println( "4. Buy new buildings");
                System.out.println( "5. Buy plants");
                System.out.println( "6. Sell plants");
                System.out.println( "7. Sell animals");
                System.out.println(" 8. Seed plants");
                System.out.println(" 9. Harvest plants");
                System.out.println(" 10. Check state of stores");
                System.out.println(" 11. Check info about animals ");
                System.out.println(" 12. Check info about plants");
                System.out.println( "0. End of Turn" );
                System.out.print( "Choose option: " );
                choice = scan.nextInt();

                if( choice == 1 ){
                    for( Animal i : animals){
                        i.show();
                        //System.out.println( "Ilosc: " + generator.nextInt(10) );
                    }
                    System.out.print( "What do you want to buy and how much?: " );
                    int number = scan.nextInt();
                    int ilosc = scan.nextInt();
                    if (g.money >= animals.get( number ).get_cost()){
                        g.changemoney( animals.get( number ).get_cost() );
                        g.addAnimal( animals.get( number ), ilosc );
                    }

                }
                else if( choice == 2 ){
                    System.out.print( "How much ground do you want to buy?: " );
                    int number = scan.nextInt();
                    if (g.money >= number*price ){
                        g.changemoney( number*price );
                        g.set_acres( number );
                    }
                }
                else if( choice == 3 ){
                   farm f1 = generator_farm();
                   farm f2 = generator_farm();
                   farm f3 = generator_farm();
                    f1.show();
                    f2.show();
                    f3.show();
                    System.out.print( "What do you want to buy?: " );
                    int number = scan.nextInt();

                    if( number == 1 && f1.get_cost() <= g.get_money() && f1.get_acres() <= g.get_acres() ){
                        g.changemoney( f1.get_cost() );
                        g.farm_player.add(f1);
                        g.set_acres( -f1.acres );
                    }
                    else if( number == 2 && f2.get_cost() <= g.get_money() && f2.get_acres() <= g.get_acres() ){
                        g.changemoney( f2.get_cost() );
                        g.farm_player.add(f2);
                        g.set_acres( -f2.acres );
                    }
                    else if( number == 3 && f3.get_cost() <= g.get_money() && f3.get_acres() <= g.get_acres() ){
                        g.changemoney( f3.get_cost() );
                        g.farm_player.add(f3);
                        g.set_acres( -f3.acres );
                    }
                }
                else if( choice == 4 ){
                    for( Building i : buildings ){
                        i.show();
                    }
                    System.out.print( "What do you want to buy?: " );
                    int number = scan.nextInt();
                    for( int i=0; i<farm_player.Length; i++ ){
                        if (g.get_money() >= buildings.get( number ).get_cost() && g.farm_player.get(i).get_amount_of_buildings() >= 1 && g.farm_player.get(i).get_size() >= buildings.get( number ).get_surface() ){
                            g.changemoney( buildings.get( number ).get_cost() );
                            g.farm_player.get(i).get_amount_of_buildings() -= 1;
                            g.farm_player.get(i).get_size() -= buildings.get( number ).get_surface();
                            g.farm_player.get(i).addFarma( buildings.get( number ) );
                            break;
                        }
                    }
                }
                else if( choice == 5 ){
                    for( Plant i : plants ){
                        i.show();
                    }
                    System.out.print( "What do you want to buy and how much?: ");
                    int number = scan.nextInt();
                    int amount = scan.nextInt();
                    if (g.money >=plants.get( number ).get_cost()){
                        g.changemoney(plants.get( number ).get_cost() );
                        g.addPlant(plants.get( number ),amount );
                    }

                }
                else if ( choice == 6){
                    double profit_ = 0;
                    for( Plant i : g.plant_player ){
                        profit_ += i.profit();
                    }
                    System.out.print( "Sell all harvest for: " + profit );
                    g.addmoney( profit );
                }
                else if ( choice == 7){
                    for( Animal i : g.animal_player ){
                        i.show();
                        //System.out.println( "Ilosc: " + generator.nextInt(10) );
                    }
                    System.out.print(  "What do you want to sell and how much?: " );
                    int number = scan.nextInt();
                    int ilosc = scan.nextInt();
                    g.addmoney( g.animal_player.get( number ).get_cost());
                    g.removeAnimal( g.animal_player.get( number ), ilosc );
                }
                else if( choice == 8 ){
                    for( Plant i :plants ){
                        i.show();
                    }
                    System.out.print( "What do we seed?: " );
                    int number = scan.nextInt();
                    if (g.money >= (plants.get( number ).get_Production_cost() +plants.get( number ).getSecurity_cost()) ){
                        g.changemoney(plants.get( number ).get_Production_cost() );
                        g.changemoney(plants.get( number ).getSecurity_cost()) );
                        g.plant_player.get(number).if_seed = true;
                    }

                }
                else if( choice == 9 ){
                    for (int i=0; i< g.plant_player.Length; i++ ){
                        if( g.get_money() <= g.plant_player.get(i).getHarvest_cost() && g.plant_player.get(i).get_age() >= g.plant_player.get(i).getPlant_period() ){
                            g.changemoney( g.plant_player.get(i).getHarvest_cost() );
                            g.set_food() += g.plant_player.get(i).get_productivity();
                            g.plant_player.get(i).harvest_amount += g.plant_player.get(i).get_productivity();
                            g.plant_player.get(i).set_age( 0 );
                            g.plant_player.get(i).set_if_seed( false );
                        }
                    }

                }
                else if (choice == 10){
                    System.out.println("We have: " + g.get_food() + " food" );
                }
                else if (choice == 11){
                    for( Animal i : g.animal_player ){
                        i.show();
                    }
                }
                else if (choice == 12){
                    for( Plant i : g.plant_player ){
                        i.show();
                    }
                }
                if( check() ){
                    System.out.println("You Win");
                    break; break;
                }

                int random = generator.nextInt(100);
                if( random < 2 && randomness == false ){
                    mass_up( g.animal_player, g.plant_player );
                    randomness = true;
                }else if( random >2 && random < 5 && randomness == false ){
                    reproduction( g.animal_player, g );
                    randomness = true;
                }else if( random >5 && random < 10 && randomness == false ){
                    protection( g.plant_player, g );
                    randomness = true;
                }else if( random >10 && random < 15 && randomness == false ){
                    if_eggs_if_milk( g.animal_player, g );
                    randomness = true;
                }else if( random >15 && random < 20 && randomness == false ){
                    feeding( g.animal_player, g );
                    randomness = true;
                }
            }


            week++;
            for( Plant i : g.plant_player ){
                if( i.time_seed )
                    i.time_seed++;
            }
            for( Animal i : g.animal_player ){
                i.age++;
            }

            if( g.money <= 0 ){
                zero_money(g);
                int random = generator.nextInt(100);
                if( random > 50 && random < 60 ){
                    zero_harvest(g);
                }
            }
        }

        System.out.print( week);
    }









}