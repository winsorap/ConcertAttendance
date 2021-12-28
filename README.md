# ConcertAttendance

This is my coursework for CSCM41J Introduction to Programming in Java, a core module in my MSc Computer Science degree.

My mark for this coursework was 91%, which was one of the highest from the January intake of Masters students.

The coursework brief was as follows:

Leigh Clark, Feb 2021

This coursework is worth 20% of your final module grade.

Scenario
As of February 2021, we are now living in more hopeful times in light of recent events. Soon we can look forward to gathering in numbers to share social experiences - such as live music! In the UK, venues that host live music (amongst other things like comedy gigs) may be run by the same company. An example is the Academy Music Group (Links to an external site.) who run numerous popular venues across the country.

For this coursework, you are going to write a class (or ideally classes - hint!) that models concert attendances at different venues run by the same company. Understanding concert attendance allows companies to track the popularity of the different acts they book to perform and understand annual trends in people's desire to see live music. Crucially, understanding attendance at venues allows companies to see how often each venue reaches close to full capacity. This is important for keeping track of popular acts, but also for monitoring the security and safety of attendees.

For the sake of this coursework, we are going to say that once a venue reaches >= 85% capacity, a "capacity warning" is triggered. This allows venues to closely monitor the safety of attendees during the concert and is also useful for annual reports. Any trends in capacity warnings can be utilised by each venue to consider increasing staff and security for specific acts or for specific dates in the year. 

Problem Specification
You must write a class (or classes!) to define concert attendances for multiple venues run by the same company. Your program must include the following:

Concerts
Each concert that takes place at a specific venue will have:

- an artist
- attendance
- date (month and year)

Venues
Each venue that is owned by the company will have:

- a name
-  location 
- year since it has been open
- capacity
- list of concerts

Include methods to find:

- largest concert attendance in venues
- average attendance in venues
- average number of concerts per year in venues
- all concerts at or above the 85% capacity threshold (that triggers the capacity warnings)

Company
The company is responsible for all venues. As such, it should hold all information about these venues. Write methods that find:

- The venue with the largest average concert attendance
- The largest attendance recorded in any concert held in any venue
- A list of all concerts that have trigged the capacity warnings
- The venue with the fewest capacity warnings per year on average

Main Method
You should write a main method that allows you to test your program to fulfil the problem specification. In your main method, you should be able to enter the information above and run test data to show your program works. 