package HomeTasks.task_08;

public class RunningTrack extends Barrier {
    int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcomeAnObstacle(Participant participant) {
        if (participant.getRunLimit() > length) {
            System.out.printf("%s ran successful %s meters!\n",
                    participant, length);
            return true;
        } else {
            System.out.printf("%s could not run %s meters. Only: %s\n",
                    participant, length, participant.getRunLimit());
            return false;
        }
    }
}
