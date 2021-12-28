/*Manchester venue class*/
public class ManchesterRitz {

    /*Entered as static final variables, because these existed prior to the
    creation of this program*/    
    private static final String VENUE_NAME = "02 Ritz Manchester";
    private static final String VENUE_LOCATION = "Manchester";
    private static final int YEAR_OPENED = 2011;
    private static final int CAPACITY = 1500;
    private static final int NUMBER_OF_CONCERTS = 120; //Annual figure
    private static final int AVERAGE_CONCERTS = NUMBER_OF_CONCERTS / 12; //Months
    
    /*Final doubles not in caps, as not static*/
    private final double capacityTrigger = 0.85;
    private final double maxCapacity = CAPACITY * capacityTrigger;

    public String getVenueName() {
        return VENUE_NAME;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public int getNumberOfConcerts() {
        return NUMBER_OF_CONCERTS;
    }

    public int getAverageConcerts() {
        return AVERAGE_CONCERTS;
    }
}
