package at.workoutplan.data;

import at.workoutplan.models.Workout;

import java.util.Arrays;
import java.util.List;

public class Workouts {
    public static List<Workout> getUpperLowerUpperLowerUpperWorkout(boolean inDiet) {
        Workout upperBodyChestFocus = new Workout("Upper Body (Chest Focus)")
                .exercise(Exercises.InclineDumbbellBenchPress, 3)
                .exercise(Exercises.PectoralMachine, 3)
                .exercise(Exercises.PulldownMachine, inDiet ? 2 : 3)
                .exercise(Exercises.TBarRows, inDiet ? 2 : 3)
                .exercise(Exercises.DumbbellLateralRaises, inDiet ? 2 : 3)
                .exercise(Exercises.WeightedDips, inDiet ? 3 : 4)
                .exercise(Exercises.InclineDumbbellCurls, 3);

        Workout lowerBodyQuadsFocus = new Workout("Lower Body (Quads Focus)")
                .exercise(Exercises.WeightedBeltSquats, 3)
                .exercise(Exercises.SeatedLegExtensionMachine, 3)
                .exercise(Exercises.SeatedLegCurlMachine, inDiet ? 2 : 3)
                .exercise(Exercises.StandingCalfRaises, inDiet ? 2 : 3)
                .exercise(Exercises.SeatedCalfRaises, inDiet ? 2 : 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches, 3);

        Workout upperBodyBackFocus = new Workout("Upper Body (Back Focus)")
                .exercise(Exercises.PulldownMachine, 3)
                .exercise(Exercises.LowRowMachine, 3)
                .exercise(Exercises.FacePulls, 3)
                .exercise(Exercises.DeclineChestPressMachine, inDiet ? 2 : 3)
                .exercise(Exercises.DumbbellLateralRaises, inDiet ? 2 : 3)
                .exercise(Exercises.PreacherCurlMachine, 3)
                .exercise(Exercises.CableTricepPushdowns, 3);

        Workout lowerBodyHamstringsFocus = new Workout("Lower Body (Hamstrings Focus)")
                .exercise(Exercises.RomanianDeadlifts, 3)
                .exercise(Exercises.SeatedLegCurlMachine, 3)
                .exercise(Exercises.LegPressMachine, 2)
                .exercise(Exercises.SeatedLegExtensionMachine, 2)
                .exercise(Exercises.StandingCalfRaises, inDiet ? 2 : 3)
                .exercise(Exercises.SeatedCalfRaises, inDiet ? 2 : 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches, 3);

        Workout upperBodyShoulderFocus = new Workout("Upper Body (Shoulder Focus)")
                .exercise(Exercises.ShoulderPressMachine, 3)
                .exercise(Exercises.DumbbellLateralRaises, inDiet ? 3 : 4)
                .exercise(Exercises.DumbbellReverseFlys, 3)
                .exercise(Exercises.RowMachine, inDiet ? 2 : 3)
                .exercise(Exercises.ChestPressMachine, inDiet ? 2 : 3)
                .exercise(Exercises.HammerCurls, inDiet ? 3 : 4)
                .exercise(Exercises.OverheadDumbbellTricepExtensions, 3);

        return Arrays.asList(upperBodyChestFocus, lowerBodyQuadsFocus, upperBodyBackFocus, lowerBodyHamstringsFocus, upperBodyShoulderFocus);
    }
}
