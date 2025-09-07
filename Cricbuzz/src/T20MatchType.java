public class T20MatchType implements MatchType{

    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxOverCountBowlers() {
        return 5;
    }
}
