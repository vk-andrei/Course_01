package Lessons.lesson_05;

public class Start {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // String nickname = scan.next();


        Player player1 = new Player("Andrei", 80, 15, 34000);
        Player player2 = new Player("Dmitrii", 90, 12, 20000);
        Player player3 = new Player("fedya", 23, 11, 10000);

        // player1.money = 99999999999             - избегаем этого. ДЕЛАЕМ PRIVATE
        player1.setMoney(234);
        // player1.level = -10
        player2.setMoney(-20);
//        System.out.println(player1.nickName + " " + player1.level + " " + player1.points + " " + player1.money);
//        System.out.println(player2.nickName + " " + player2.level + " " + player2.points + " " + player2.money);
//        System.out.println(player3.nickName + " " + player3.level + " " + player3.points + " " + player3.money);

        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.printInfo();
            player.jump();
            System.out.println("---------------------");
        }

        System.out.println(player1.toString());   // --- toString и так там есть, писать необязательно, но можно переопределить его!!

        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

        player1.jump();
        System.out.println("---------------------");

        System.out.println(player1.getLevel());

    }


}



