package rally;

public class App {

    public static void main(String[] args){
        Rally rallyCommemuration = new Rally();

        System.out.println(rallyCommemuration);

        Rally rallyTransaustralian = new Rally("Australia", 8.0,
                                               15, "Commonwealth Establishment");

        System.out.println(rallyTransaustralian);

        Rally rallyGreatChineseRun = new Rally("China", 1.2, 20, "End of Civil War", 25000, 300, "Harbin",
                                               "Urumchi", "Required \"Mao Zhedong's quotes\" to participate",
                                                       "30.06.2035");

        System.out.println(rallyGreatChineseRun);

        Rally.printStaticRallyCounter();
        rallyCommemuration.printRallyCounter();
    }
}