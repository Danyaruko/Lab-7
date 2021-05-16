package rally;


public class Rally {
    private String rallyCountry;
    private double rallyPriceEuro;
    private int rallyDurationDays;

    private String rallyTheme;
    private int rallyParticipantsNumber;
    private double rallyGrandPrize;
    private String rallyStartPoint;
    private String rallyFinishPoint;

    static private int rallyCounter;

    protected String rallyRestrictions;
    protected String rallyDate;

    public Rally(){
        this("Australia", 5.5, 3, "Emu War");
    }

    public Rally(String country, double priceEuro, int durationDays, String theme){
        this(country, priceEuro, durationDays, theme, 50, 500, "Canberra",
                "Adelaide", "None", "01.01.1970");
    }

    public Rally(String country, double priceEuro, int durationDays, String theme, int participantsNumber,
                 float grandPrize, String startPoint, String finishPoint, String restrictions,
                 String date){
        this.setValues(country, priceEuro, durationDays, theme, participantsNumber, grandPrize, startPoint,
                       finishPoint, restrictions, date);
        rallyCounter++;
    }

    public static int getRallyCounter() {
        return rallyCounter;
    }

    public void setValues(String country, double priceEuro, int durationDays, String theme,
                          int participantsNumber, double grandPrize, String startPoint,
                          String finishPoint, String restrictions, String date){
        this.setRallyCountry(country);
        this.setRallyPriceEuro(priceEuro);
        this.setRallyDurationDays(durationDays);
        this.setRallyTheme(theme);
        this.setRallyParticipantsNumber(participantsNumber);
        this.setRallyGrandPrize(grandPrize);
        this.setRallyStartPoint(startPoint);
        this.setRallyFinishPoint(finishPoint);
        this.setRallyRestrictions(restrictions);
        this.setRallyDate(date);
    }

    public void resetValues(String country, double priceEuro, int durationDays, String theme,
                            int participantsNumber, double grandPrize, String startPoint,
                            String finishPoint, String restrictions, String date){
        this.setValues(country, priceEuro, durationDays, theme, participantsNumber,
                       grandPrize, startPoint, finishPoint, restrictions, date);
    }

    public static void resetRallyCounter(){
        Rally.rallyCounter = 0;
    }

    @Override
    public String toString() {
        return  "Post №: " + getRallyCounter() + "\n" +
                "Country: " + this.getRallyCountry() + "\n" +
                "Price: " + this.getRallyPriceEuro() + " Euro\n" +
                "Duration: " + this.getRallyDurationDays() + " days\n" +
                "Theme: " + this.getRallyTheme() + "\n" +
                "Number of participants: " + this.getRallyParticipantsNumber() + "\n" +
                "Grand prize: " + this.getRallyGrandPrize() + " Euro\n" +
                "Start from: " + this.getRallyStartPoint() + "\n" +
                "Finish at: " + this.getRallyFinishPoint() + "\n" +
                "Special restrictions: " + this.getRallyRestrictions() + "\n" +
                "Date: " + this.getRallyDate() + " Anno Domini\n";
    }

    public static void printStaticRallyCounter(){
        System.out.println("Rallies posted: " + getRallyCounter());
    }

    public void printRallyCounter(){
        System.out.println("Rallies posted: " + getRallyCounter());
    }

    public void setRallyCountry(String country){
        this.rallyCountry = country;
    }

    public void setRallyPriceEuro(double priceEuro){
        this.rallyPriceEuro = priceEuro;
    }

    public void setRallyDurationDays(int durationDays){
        this.rallyDurationDays = durationDays;
    }

    public void setRallyTheme(String theme){
        this.rallyTheme = theme;
    }

    public void setRallyParticipantsNumber(int participantsNumber){
        this.rallyParticipantsNumber = participantsNumber;
    }

    public void setRallyGrandPrize(double grandPrize){
        this.rallyGrandPrize = grandPrize;
    }

    public void setRallyStartPoint(String startPoint){
        this.rallyStartPoint = startPoint;
    }

    public void setRallyFinishPoint(String finishPoint){
        this.rallyFinishPoint = finishPoint;
    }

    public void setRallyRestrictions(String restrictions){
        this.rallyRestrictions = restrictions;
    }
    public void setRallyDate(String date){
        this.rallyDate = date;
    }

    public String getRallyCountry() {
        return rallyCountry;
    }

    public double getRallyPriceEuro() {
        return rallyPriceEuro;
    }

    public int getRallyDurationDays() {
        return rallyDurationDays;
    }

    public String getRallyTheme() {
        return rallyTheme;
    }

    public int getRallyParticipantsNumber() {
        return rallyParticipantsNumber;
    }

    public double getRallyGrandPrize() {
        return rallyGrandPrize;
    }

    public String getRallyStartPoint() {
        return rallyStartPoint;
    }

    public String getRallyFinishPoint() {
        return rallyFinishPoint;
    }

    public String getRallyRestrictions(){
        return rallyRestrictions;
    }

    public String getRallyDate(){
        return rallyDate;
    }
}
