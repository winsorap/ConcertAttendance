/*This is the Company class for Academy Music Group, which is responsible
for all of the venues*/
public class AcademyMusicGroup {

    /*Calling venue/concert classes to use company get methods*/
    BristolConcerts bristolconcerts = new BristolConcerts();
    BristolAcademy bristolacademy = new BristolAcademy();
    BrixtonConcerts brixtonconcerts = new BrixtonConcerts();
    BrixtonAcademy brixtonacademy = new BrixtonAcademy();
    ManchesterConcerts manchesterconcerts = new ManchesterConcerts();
    ManchesterRitz manchesterritz = new ManchesterRitz();

    public String getLargestAverageAttendance() {
        String largestAverageAttendance = "";
        String largestAverageAttendanceMessage = "The venue with the largest "
                + "average concert attendance is: ";

        if ((bristolconcerts.getAverageAttendance()
                > brixtonconcerts.getAverageAttendance())
                && (bristolconcerts.getAverageAttendance()
                > manchesterconcerts.getAverageAttendance())) {
            System.out.println(largestAverageAttendanceMessage
                    + bristolacademy.getVenueName());
        } else if ((brixtonconcerts.getAverageAttendance()
                > bristolconcerts.getAverageAttendance())
                && (brixtonconcerts.getAverageAttendance()
                > manchesterconcerts.getAverageAttendance())) {
            System.out.println(largestAverageAttendanceMessage
                    + brixtonacademy.getVenueName());
        } else {
            System.out.println(largestAverageAttendanceMessage
                    + manchesterritz.getVenueName());
        }
        return largestAverageAttendance;
    }

    public String getOverallLargestAttendance() {
        String overallAverageAttendance = "";
        String overallLargestAttendanceMessage = "The largest attendance "
                + "recorded in any concert held in any venue is: ";

        if ((bristolconcerts.getLargestAttendance()
                > brixtonconcerts.getLargestAttendance())
                && (bristolconcerts.getLargestAttendance()
                > manchesterconcerts.getLargestAttendance())) {
            System.out.println(overallLargestAttendanceMessage
                    + bristolconcerts.getLargestAttendance());
        } else if ((brixtonconcerts.getLargestAttendance()
                > bristolconcerts.getLargestAttendance())
                && (brixtonconcerts.getLargestAttendance()
                > manchesterconcerts.getLargestAttendance())) {
            System.out.println(overallLargestAttendanceMessage
                    + brixtonconcerts.getLargestAttendance());
        } else {
            System.out.println(overallLargestAttendanceMessage
                    + manchesterconcerts.getLargestAttendance());
        }
        return overallAverageAttendance;
    }

    public String getAllTriggerWarnings() {
        int allTriggerWarningConcerts = (bristolconcerts.getCapacityWarning()
                + brixtonconcerts.getCapacityWarning()
                + manchesterconcerts.getCapacityWarning());
        String allTriggerWarnings = "The total number of concerts that"
                + " have triggered the capacity warnings is: "
                + allTriggerWarningConcerts;
        return allTriggerWarnings;
    }

    public String fewestCapacityWarnings() {
        String fewestCapacityWarnings = "";
        String fewestCapacityWarningMessage = "The venue with the fewest"
                + " capacity warnings per year on average is: ";

        if ((bristolconcerts.getCapacityWarning()
                < brixtonconcerts.getCapacityWarning())
                && (bristolconcerts.getCapacityWarning()
                < manchesterconcerts.getCapacityWarning())) {
            System.out.println(fewestCapacityWarningMessage
                    + bristolacademy.getVenueName());
        } else if ((brixtonconcerts.getCapacityWarning()
                < bristolconcerts.getCapacityWarning())
                && (brixtonconcerts.getCapacityWarning()
                < manchesterconcerts.getCapacityWarning())) {
            System.out.println(fewestCapacityWarningMessage
                    + brixtonacademy.getVenueName());
        } else {
            System.out.println(fewestCapacityWarningMessage
                    + manchesterritz.getVenueName());
        }
        return fewestCapacityWarnings;
    }
}
