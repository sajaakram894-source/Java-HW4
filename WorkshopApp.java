package workshopapp;
public class WorkshopApp {
   public static void main(String[] args) {
  WorkshopRegistration workshop = new WorkshopRegistration();

    try {
        workshop.registerParticipant("Ali", 16);
    } catch (InvalidAgeException e) {
        System.out.println("Caught Exception: " + e.getMessage());
    }
    }
    
}
