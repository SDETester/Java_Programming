package day08_ternary_switch;

public class FiledTrip {
    public static void main(String[] args) {

        int grade = 6;

        String location = "Unknown";
        int numOfGroups = 0;
        String teacher = "Unknown";

        if(grade >= 1 && grade <= 6){

            if(grade == 1){
                location = "Apple orchard";
                numOfGroups = 3;
                teacher = "Ms. Smith";
            }else if(grade == 2){
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr. Lee";
            }else if(grade == 3){
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Ms.Wilson";
            }else if(grade ==4){
                location = "Movie theater";
                numOfGroups = 2;
                teacher = "Ms. Reyes";
            }else if(grade ==5){
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms. Lela";
            }else{ // grade  == 6
                location = "Six Flags";
                numOfGroups = 6;
                teacher = "Mr. Watt";
            }

        }


        System.out.println("Local - " + location);
        System.out.println("Number of groups - "+numOfGroups);
        System.out.println("Teacher in charge - "+teacher);




    }

}

/*
 2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith
			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee
			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson
			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes
			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela
			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt
			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */


