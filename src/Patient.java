public class Patient {
    private static int treatment_plan;

    public static int getTreatment_plan() {
        return treatment_plan;
    }

    public Patient(int treatment_plan) {
        Patient.treatment_plan = treatment_plan;
    }
}
