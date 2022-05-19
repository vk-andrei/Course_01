package HomeTasks.task_08;

public class Start {
    public static void main(String[] args) {
        Participant human1 = new Human("Andrei", 1200, 1.9);
        Participant human2 = new Human("Nik", 900, 0.8);
        Participant human3 = new Human("Timofei", 1500, 2.1);
        Participant cat1 = new Cat("Felix", 300, 0.9);
        Participant cat2 = new Cat("Tom", 450, 1.2);
        Participant robot1 = new Robot("T3000", 55000, 3.5);
        Participant robot2 = new Robot("Fedor", 100, 0.1);

        RunningTrack runningTrack1 = new RunningTrack(400);
        Wall wall1 = new Wall(1.8);

        Participant[] participants = {human1, human2, human3, cat1, cat2, robot1, robot2};
        Barrier[] barriers = {runningTrack1, wall1};

        for (Participant p : participants) {
            for (Barrier b : barriers) {
                if (!b.overcomeAnObstacle(p)) {
                    System.out.println(p + " go out from competition.");
                    break;
                }
            }
        }
    }
}
