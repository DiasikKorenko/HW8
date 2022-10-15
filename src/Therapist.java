public class Therapist extends Patient {


    public Therapist(int treatment_plan) {
        super(treatment_plan);
    }

    public static void doctor_name() {
        System.out.println("Врач - Терапевт");
    }

    public static void method_to_treat() {
        System.out.println("Лечение предусмотрено терапевтом");
    }

    public static void appointment() {
        if (getTreatment_plan() == 1) {
            Surgeon.doctor_name();
            Surgeon.method_to_treat();
        } else if (getTreatment_plan() == 2) {
            Dentist.doctor_name();
            Dentist.method_to_treat();
        } else {
            doctor_name();
            method_to_treat();
        }
    }
}
