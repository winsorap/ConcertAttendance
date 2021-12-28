
import java.util.ArrayList;

public class BristolConcerts {

    private final ArrayList<String> artistBristol = new ArrayList<>();
    private final ArrayList<Integer> attendanceBristol = new ArrayList<>();
    private final ArrayList<String> dateBristol = new ArrayList<>();

    /*This is an Array List of the five busiest set of concerts in this venue*/
    public BristolConcerts() {
        artistBristol.add("Skindred");
        attendanceBristol.add(1550);
        dateBristol.add("October 2021");

        artistBristol.add("Meshuggah");
        attendanceBristol.add(1500);
        dateBristol.add("December 2021");

        artistBristol.add("Black Stone Cherry");
        attendanceBristol.add(1000);
        dateBristol.add("February 2022");

        artistBristol.add("The Stranglers");
        attendanceBristol.add(1300);
        dateBristol.add("February 2022");

        artistBristol.add("Apocalytica");
        attendanceBristol.add(1200);
        dateBristol.add("March 2022");
    }

    private int largestAttendance;

    public int getLargestAttendance() {
        for (int var : attendanceBristol) {
            if (var > largestAttendance) {
                largestAttendance = var;
            }
        }
        return largestAttendance;
    }

    public int getAverageAttendance() {
        int sum = 0;
        for (int var : attendanceBristol) {
            sum = sum + var;
        }
        int averageAttendance = sum / attendanceBristol.size();
        return averageAttendance;
    }

    public int getCapacityWarning() {
        BristolAcademy bristolacademy = new BristolAcademy();
        int capacityWarningCounter = 0;
        for (int var : attendanceBristol) {
            if (var >= bristolacademy.getMaxCapacity()) {
                capacityWarningCounter++;
            }
        }
        return capacityWarningCounter;
    }
}
