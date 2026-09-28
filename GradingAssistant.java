package bd.edu.aiub.sms;

public class GradingAssistant {

    public String calculateGrades(float marks){
        if(marks >= 90){
            return "A+";
        }
        else if(marks >= 80 ){
            return "A";
        }
        else if(marks >= 75){
            return "A-";
        }
        else if(marks >= 70){
            return "B+";
        }
        else if(marks >= 65){
            return "B-";
        }
        else if(marks >= 60){
            return "C+";
        }
        else if(marks >= 55){
            return "C-";
        }
        else if(marks >= 50){
            return "D+";
        }
        else if(marks >= 45){
            return "D-";
        }
        else{
            return "F";
        }
    }
}
