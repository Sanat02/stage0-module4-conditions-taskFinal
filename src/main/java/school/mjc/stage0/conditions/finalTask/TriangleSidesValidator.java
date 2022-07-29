package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if(firstSide<=secondSide+thirdSide||secondSide<=firstSide+thirdSide||thirdSide<=firstSide+secondSide)
        {
            logger.log("this is a valid triangle");
        }
        else
        {
            logger.log("it's not a triangle");
        }

    }
}
