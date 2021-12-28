
import java.util.ArrayList;

public class BrixtonConcerts {

    private final ArrayList<String> artistBrixton = new ArrayList<>();
    private final ArrayList<Integer> attendanceBrixton = new ArrayList<>();
    private final ArrayList<String> dateBrixton = new ArrayList<>();

    /*This is an Array List of the five busiest set of concerts in this venue*/
    public BrixtonConcerts() {
        artistBrixton.add("Jimmy Eat World");
        attendanceBrixton.add(4900);
        dateBrixton.add("July 2021");

        artistBrixton.add("Trivium");
        attendanceBrixton.add(4000);
        dateBrixton.add("November 2021");

        artistBrixton.add("Beck");
        attendanceBrixton.add(4200);
        dateBrixton.add("July 2021");

        artistBrixton.add("Behemoth");
        attendanceBrixton.add(4000);
        dateBrixton.add("October 2021");

        artistBrixton.add("Lamb of God");
        attendanceBrixton.add(4750);
        dateBrixton.add("December 2021");
    }

    private int largestAttendance;

    public int getLargestAttendance() {
        for (int var : attendanceBrixton) {
            if (var > largestAttendance) {
                largestAttendance = var;
            }
        }
        return largestAttendance;
    }

    public int getAverageAttendance() {
        int sum = 0;
        for (int var : attendanceBrixton) {
            sum = sum + var;
        }
        int averageAttendance = sum / attendanceBrixton.size();
        return averageAttendance;
    }

    public int getCapacityWarning() {
        BrixtonAcademy brixtonacademy = new BrixtonAcademy();
        int capacityWarningCounter = 0;
        for (int var : attendanceBrixton) {
            if (var >= brixtonacademy.getMaxCapacity()) {
                capacityWarningCounter++;
            }
        }
        return capacityWarningCounter;
    }
}
