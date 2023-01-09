public class Account {
    private String name;
    private int dayOfBirth;
    private int mounthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phoneNumber;


    private String sureName;
    private int weight;
    private int pressure;
    private int stepsByDay;
    private int age;

    Account( String name, int dayOfBirth, int mounthOfBirth,int yearOfBirth,String email,String phoneNumber,String sureName,
     int weight, int pressure, int stepsByDay){
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.mounthOfBirth =mounthOfBirth;
        this.yearOfBirth=yearOfBirth;
        this.email=email;
        this.phoneNumber =phoneNumber;
        this.sureName = sureName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2020 - yearOfBirth;
    }
    public  String getName(){
        return this.name;
    }
    public int getDayOfBirthday(){
        return this.dayOfBirth;
    }
    public int getMounthOfBirthday(){
        return this.mounthOfBirth;
    }
    public int getYearOfBirthday(){
        return this.yearOfBirth;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public int getAge(){
        return this.age;
    }
    public String getSureName(){
        return this.sureName;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getPressure(){
        return this.pressure;
    }
    public int getStepsByDay(){
        return this.stepsByDay;
    }
    public void setSureName(String sureName){
        this.sureName = sureName;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setPressure(int pressure){
        this.pressure = pressure;
    }
    public void setStepsByDay(int stepsByDay){
        this.stepsByDay = stepsByDay;
    }
    public void printAccountInfo(){
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "AccountInfo:\n" +
                "name " + this.name + "\n" +
                "dayOfBirth " + this.dayOfBirth + "\n" +
                "monthOfBirth " + this.mounthOfBirth + "\n" +
                "yearOfBirth " + this.yearOfBirth + "\n" +
                "email " + this.email + "\n" +
                "phone " + this.phoneNumber + "\n" +
                "surname " + this.sureName + "\n" +
                "weight " + this.weight + "\n" +
                "pressure " + this.pressure + "\n" +
                "stepsByDay " + this.stepsByDay + "\n" +
                "age " + this.age + "\n" + "\n";
    }
}





