/**Lab 3
 * David Girard
 * CS 161 winter 2020
 * 1/22/20
 * create program from class diagram with constructors, getters,
 * and headers
 */
public class Main {

private static void  main(String[] args) {
    //made classes into objects and called upon classes in Main
    Referral referralObject = new Referral(); 
    referralObject.getClass();

    ReferralList referrallistObject = new ReferralList();
    referrallistObject.getClass();

    ServiceNeed serviceneedObject = new ServiceNeed();
    serviceneedObject.getClass();

    Survey surveyObject = new Survey();
    surveyObject.getClass();

    SurveyQuestions surveyquestionsObject = new SurveyQuestions();
    surveyquestionsObject.getClass();

    ClinicService clinicserviceObject = new ClinicService();
    clinicserviceObject.getClass();

    Calendar calendarObject = new Calendar();
    calendarObject.getClass();

    Appoitment appoitmentObject = new Appoitment();
    appoitmentObject.getClass();

    Client clientObject = new Client();
    clientObject.getClass();


    } 

   
}
