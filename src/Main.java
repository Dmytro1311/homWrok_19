public class Main {
    public static void main(String[] args) {
       Account john =  new Account("John", 13,11,1995,"John@gmai.com","1234","John",90, 120, 10000 );
       john.printAccountInfo();
       Account bob = new Account("Bob",20,10,2000,"Bob@gmail.com","3321","Bob", 100,125, 15000);
       bob.printAccountInfo();
       Account jack = new Account("Jack",30,06,1990,"jack@mail.com", "4563","Jack", 70,130,8000);
       jack.printAccountInfo();
       jack.setSureName("other name ");
       jack.setWeight(85);
       jack.setPressure(120);
       jack.printAccountInfo();

    }


}