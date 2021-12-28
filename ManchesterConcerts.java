
import java.util.ArrayList;

public class ManchesterConcerts {

    private final ArrayList<String> artistManchester = new ArrayList<>();
    private final ArrayList<Integer> attendanceManchester = new ArrayList<>();
    private final ArrayList<String> dateManchester = new ArrayList<>();

    /*This is an Array List of the five busiest set of concerts in this venue*/
    public ManchesterConcerts() {
        artistManchester.add("Maximo Park");
        attendanceManchester.add(1300);
        dateManchester.add("June 2021");

        artistManchester.add("Therapy");
        attendanceManchester.add(1400);
        dateManchester.add("November 2021");

        artistManchester.add("Bury Tomorrow");
        attendanceManchester.add(1300);
        dateManchester.add("July 2021");

        artistManchester.add("Slade");
        attendanceManchester.add(1450);
        dateManchester.add("December 2021");

        artistManchester.add("Half Man Half Biscuit");
        attendanceManchester.add(1000);
        dateManchester.add("January 2022");
    }

    private int largestAttendance;

    public int getLargestAttendance() {
        for (int var : attendanceManchester) {
            if (var > largestAttendance) {
                largestAttendance = var;
            }
        }
        return largestAttendance;
    }

    public int getAverageAttendance() {
        int sum = 0;
        for (int var : attendanceManchester) {
            sum = sum + var;
        }
        int averageAttendance = sum / attendanceManchester.size();
        return averageAttendance;
    }

    public int getCapacityWarning() {
        ManchesterRitz manchesterritz = new ManchesterRitz();
        int capacityWarningCounter = 0;
        for (int var : attendanceManchester) {
            if (var >= manchesterritz.getMaxCapacity()) {
                capacityWarningCounter++;
            }
        }
        return capacityWarningCounter;
    }
}
