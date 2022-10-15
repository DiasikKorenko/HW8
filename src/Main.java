public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(3);
        System.out.println("Имитация работы клиники");
        System.out.println("Для пациента с планомом лечения: " + Patient.getTreatment_plan());
        Therapist.appointment();

    }
}