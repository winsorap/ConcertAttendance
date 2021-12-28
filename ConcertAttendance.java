/*The main class, to call upon the methods from all of the venue/concert
classes.
For this coursework, I have used three venues from across the 
Academy Music Group for comparison purposes.*/
public class ConcertAttendance {

    public static void main(String[] args) {

        /*Calling all classes to use get methods*/
        BristolConcerts bristolconcerts = new BristolConcerts();
        BristolAcademy bristolacademy = new BristolAcademy();
        BrixtonConcerts brixtonconcerts = new BrixtonConcerts();
        BrixtonAcademy brixtonacademy = new BrixtonAcademy();
        ManchesterConcerts manchesterconcerts = new ManchesterConcerts();
        ManchesterRitz manchesterritz = new ManchesterRitz();
        AcademyMusicGroup academymusicgroup = new AcademyMusicGroup();

        /*Final strings not in caps, as not static*/
        final String crowdCapacity = "The crowd capacity is: ";
        final String largestAttendance = "The largest concert attendance is: ";
        final String averageAttendance = "The average concert attendance is: ";
        final String totalConcerts = "The total number of concerts over a 12 "
                + "month period is: ";
        final String averageConcerts = "The average number of concerts per year"
                + " is: ";
        final String capacityWarning = "The number of concerts with a capacity "
                + "warning is: ";

        /*Bristol Academy venue get methods*/
        System.out.println(bristolacademy.getVenueName());
        System.out.println(crowdCapacity + bristolacademy.getCapacity());
        System.out.println(largestAttendance
                + bristolconcerts.getLargestAttendance()); //1550
        System.out.println(averageAttendance
                + bristolconcerts.getAverageAttendance()); //1310
        System.out.println(totalConcerts + bristolacademy.getNumberOfConcerts());
        System.out.println(averageConcerts
                + bristolacademy.getAverageConcerts()); //8
        System.out.println(capacityWarning
                + bristolconcerts.getCapacityWarning() + "\n"); //2

        /*Brixton Academy venue get methods*/
        System.out.println(brixtonacademy.getVenueName());
        System.out.println(crowdCapacity + brixtonacademy.getCapacity());
        System.out.println(largestAttendance
                + brixtonconcerts.getLargestAttendance()); //4900
        System.out.println(averageAttendance
                + brixtonconcerts.getAverageAttendance()); //4370
        System.out.println(totalConcerts + brixtonacademy.getNumberOfConcerts());
        System.out.println(averageConcerts
                + brixtonacademy.getAverageConcerts()); //16
        System.out.println(capacityWarning
                + brixtonconcerts.getCapacityWarning() + "\n"); //3

        /*Manchester Ritz venue get methods*/
        System.out.println(manchesterritz.getVenueName());
        System.out.println(crowdCapacity + manchesterritz.getCapacity());
        System.out.println(largestAttendance
                + manchesterconcerts.getLargestAttendance()); //1450
        System.out.println(averageAttendance
                + manchesterconcerts.getAverageAttendance()); //1290
        System.out.println(totalConcerts + manchesterritz.getNumberOfConcerts());
        System.out.println(averageConcerts
                + manchesterritz.getAverageConcerts()); //10
        System.out.println(capacityWarning
                + manchesterconcerts.getCapacityWarning() + "\n"); //4

        /*Academy Music Group company get methods*/
        System.out.println(academymusicgroup.getLargestAverageAttendance()); //Brixton
        System.out.println(academymusicgroup.getOverallLargestAttendance()); //4900
        System.out.println(academymusicgroup.getAllTriggerWarnings() + "\n"); //9
        System.out.println(academymusicgroup.fewestCapacityWarnings()); //Bristol

    }
}
