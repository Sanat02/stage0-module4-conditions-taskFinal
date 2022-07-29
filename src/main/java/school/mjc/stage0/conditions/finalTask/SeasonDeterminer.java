package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                logger.log("Winter");
                break;
            case 3:
            case 4:
            case 5:
                logger.log("Spring");
                break;
            case 6:
            case 7:
            case 8:
                logger.log("Summer");
                break;
            case 9:
            case 10:
            case 11:
                logger.log("Autumn");
                break;
            default:
                logger.log("Wrong month number");
                break;
        }
    }
}
