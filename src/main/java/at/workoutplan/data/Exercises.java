package at.workoutplan.data;

import at.workoutplan.models.Exercise;

public class Exercises {
    public static final Exercise InclineDumbbellBenchPress = new Exercise("Incline Dumbbell Bench Press")
            .muscleVolume(Muscles.Chest, 1.0f)
            .muscleVolume(Muscles.FrontDelts, 0.7f)
            .muscleVolume(Muscles.Triceps, 0.5f);

    public static final Exercise ChestPressMachine = new Exercise("Chest Press Machine")
            .muscleVolume(Muscles.Chest, 1.0f)
            .muscleVolume(Muscles.FrontDelts, 0.6f)
            .muscleVolume(Muscles.Triceps, 0.5f);

    public static final Exercise DeclineChestPressMachine = new Exercise("Decline Chest Press Machine")
            .muscleVolume(Muscles.Chest, 1.0f)
            .muscleVolume(Muscles.FrontDelts, 0.5f)
            .muscleVolume(Muscles.Triceps, 0.5f);

    public static final Exercise PectoralMachine = new Exercise("Pectoral Machine")
            .muscleVolume(Muscles.Chest, 1.0f);

    public static final Exercise PullUps = new Exercise("Pull-Ups")
            .muscleVolume(Muscles.Latissimus, 1.0f)
            .muscleVolume(Muscles.Biceps, 0.5f)
            .muscleVolume(Muscles.RearDelts, 0.2f)
            .muscleVolume(Muscles.Forearms, 0.3f)
            .muscleVolume(Muscles.Brachialis, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.2f);

    public static final Exercise PulldownMachine = new Exercise("Pulldown Machine")
            .muscleVolume(Muscles.Latissimus, 1.0f)
            .muscleVolume(Muscles.Biceps, 0.5f)
            .muscleVolume(Muscles.RearDelts, 0.2f)
            .muscleVolume(Muscles.Forearms, 0.3f)
            .muscleVolume(Muscles.Brachialis, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.3f);

    public static final Exercise TBarRows = new Exercise("T-Bar Rows")
            .muscleVolume(Muscles.Latissimus, 1.0f)
            .muscleVolume(Muscles.RearDelts, 0.5f)
            .muscleVolume(Muscles.Biceps, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.5f)
            .muscleVolume(Muscles.Forearms, 0.3f)
            .muscleVolume(Muscles.Brachialis, 0.2f);

    public static final Exercise RowMachine = new Exercise("Row Machine (Unilateral)")
            .muscleVolume(Muscles.Latissimus, 1.0f)
            .muscleVolume(Muscles.RearDelts, 0.5f)
            .muscleVolume(Muscles.Biceps, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.4f)
            .muscleVolume(Muscles.Forearms, 0.2f)
            .muscleVolume(Muscles.Brachialis, 0.2f);

    public static final Exercise LowRowMachine = new Exercise("Low Row Machine (Unilateral)")
            .muscleVolume(Muscles.Latissimus, 1.0f)
            .muscleVolume(Muscles.RearDelts, 0.4f)
            .muscleVolume(Muscles.Biceps, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.3f)
            .muscleVolume(Muscles.Forearms, 0.2f)
            .muscleVolume(Muscles.Brachialis, 0.2f);

    public static final Exercise ShoulderPressMachine = new Exercise("Shoulder Press Machine")
            .muscleVolume(Muscles.FrontDelts, 1.0f)
            .muscleVolume(Muscles.SideDelts, 0.5f)
            .muscleVolume(Muscles.Triceps, 0.5f);

    public static final Exercise DumbbellLateralRaises = new Exercise("Dumbbell Lateral Raises")
            .muscleVolume(Muscles.SideDelts, 1.0f);

    public static final Exercise DumbbellReverseFlys = new Exercise("Dumbbell Reverse Flys")
            .muscleVolume(Muscles.RearDelts, 1.0f)
            .muscleVolume(Muscles.Trapezius, 0.3f);

    public static final Exercise FacePulls = new Exercise("Face Pulls")
            .muscleVolume(Muscles.RearDelts, 0.8f)
            .muscleVolume(Muscles.Trapezius, 0.4f)
            .muscleVolume(Muscles.SideDelts, 0.2f);

    public static final Exercise InclineDumbbellCurls = new Exercise("Incline Dumbbell Curls")
            .muscleVolume(Muscles.Biceps, 1.0f);

    public static final Exercise PreacherCurlMachine = new Exercise("Preacher Curl Machine")
            .muscleVolume(Muscles.Biceps, 1.0f);

    public static final Exercise HammerCurls = new Exercise("Hammer Curls")
            .muscleVolume(Muscles.Biceps, 0.7f)
            .muscleVolume(Muscles.Brachialis, 0.7f)
            .muscleVolume(Muscles.Forearms, 0.5f);

    public static final Exercise OverheadDumbbellTricepExtensions = new Exercise("Overhead Dumbbell Tricep Extensions")
            .muscleVolume(Muscles.Triceps, 1.0f);

    public static final Exercise CableTricepPushdowns = new Exercise("Cable Tricep Pushdowns")
            .muscleVolume(Muscles.Triceps, 1.0f);

    public static final Exercise WeightedDips = new Exercise("Weighted Dips")
            .muscleVolume(Muscles.Triceps, 1.0f)
            .muscleVolume(Muscles.Chest, 0.7f)
            .muscleVolume(Muscles.FrontDelts, 0.5f);

    public static final Exercise WeightedBeltSquats = new Exercise("Weighted Belt Squats")
            .muscleVolume(Muscles.Quadriceps, 1.0f)
            .muscleVolume(Muscles.Gluteus, 0.5f)
            .muscleVolume(Muscles.Hamstrings, 0.2f);

    public static final Exercise LegPressMachine = new Exercise("Leg Press Machine")
            .muscleVolume(Muscles.Quadriceps, 1.0f)
            .muscleVolume(Muscles.Gluteus, 0.5f)
            .muscleVolume(Muscles.Hamstrings, 0.2f);

    public static final Exercise SeatedLegExtensionMachine = new Exercise("Seated Leg Extension Machine")
            .muscleVolume(Muscles.Quadriceps, 1.0f);

    public static final Exercise RomanianDeadlifts = new Exercise("Romanian Deadlifts")
            .muscleVolume(Muscles.Hamstrings, 1.0f)
            .muscleVolume(Muscles.Gluteus, 0.7f)
            .muscleVolume(Muscles.Forearms, 0.3f)
            .muscleVolume(Muscles.Trapezius, 0.2f);

    public static final Exercise SeatedLegCurlMachine = new Exercise("Seated Leg Curl Machine")
            .muscleVolume(Muscles.Hamstrings, 1.0f);

    public static final Exercise StandingCalfRaises = new Exercise("Standing Calf Raises")
            .muscleVolume(Muscles.Gastrocnemius, 1.0f);

    public static final Exercise SeatedCalfRaises = new Exercise("Seated Calf Raises")
            .muscleVolume(Muscles.Soleus, 1.0f);

    public static final Exercise HangingLegKneeRaises = new Exercise("Hanging Leg/Knee Raises")
            .muscleVolume(Muscles.Abdominal, 1.0f);

    public static final Exercise WeightedCrunches = new Exercise("Weighted Crunches")
            .muscleVolume(Muscles.Abdominal, 1.0f);
}
