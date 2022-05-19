package HomeTasks.task_08;

public class Wall extends Barrier {
    double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcomeAnObstacle(Participant participant) {
        if (participant.getJumpLimit() > height) {
            System.out.printf("%s jumped successful with %s meters!\n",
                    participant, height);
            return true;
        } else {
            System.out.printf("%s could not jump over the wall with %s meters. Only: %s\n",
                    participant, height, participant.getJumpLimit());
            return false;
        }
    }
}
