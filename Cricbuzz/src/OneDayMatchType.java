public class OneDayMatchType implements MatchType{

    public int noOfOvers() {
        return 50;
    }

    @Override
    public int maxOverCountBowlers() {
        return 10;
    }

}
