package at.workoutplan.data;

import at.workoutplan.models.Workout;

import java.util.Arrays;
import java.util.List;

public class Workouts {
    public static List<Workout> getPushPullLegsUpperLowerWorkout() {
        Workout push = new Workout("Push")
                .exercise(Exercises.ChestPressMachine, 4)
                .exercise(Exercises.PectoralMachine, 3)
                .exercise(Exercises.ShoulderPressMachine, 4)
                .exercise(Exercises.DumbbellLateralRaises, 3)
                .exercise(Exercises.OverheadDumbbellTricepExtensions, 3)
                .exercise(Exercises.CableTricepPushdowns, 3);

        Workout pull = new Workout("Pull")
                .exercise(Exercises.PullUps, 4)
                .exercise(Exercises.TBarRows, 4)
                .exercise(Exercises.PulldownMachine, 3)
                .exercise(Exercises.FacePulls, 3)
                .exercise(Exercises.InclineDumbbellCurls, 3)
                .exercise(Exercises.PreacherCurlMachine, 3);

        Workout legs = new Workout("Legs")
                .exercise(Exercises.WeightedBeltSquats, 3)
                .exercise(Exercises.RomanianDeadlifts, 3)
                .exercise(Exercises.SeatedLegExtensionMachine, 2)
                .exercise(Exercises.SeatedLegCurlMachine, 2)
                .exercise(Exercises.StandingCalfRaises, 3)
                .exercise(Exercises.SeatedCalfRaises, 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches, 3);

        Workout upper = new Workout("Upper")
                .exercise(Exercises.InclineDumbbellBenchPress, 3)
                .exercise(Exercises.RowMachine, 3)
                .exercise(Exercises.DumbbellLateralRaises, 3)
                .exercise(Exercises.DumbbellReverseFlys, 3)
                .exercise(Exercises.HammerCurls, 4)
                .exercise(Exercises.WeightedDips, 4);

        Workout lower = new Workout("Legs")
                .exercise(Exercises.RomanianDeadlifts, 3)
                .exercise(Exercises.LegPressMachine, 3)
                .exercise(Exercises.SeatedLegCurlMachine, 2)
                .exercise(Exercises.SeatedLegExtensionMachine, 2)
                .exercise(Exercises.SeatedCalfRaises, 3)
                .exercise(Exercises.StandingCalfRaises, 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches, 3);

        return Arrays.asList(push, pull, legs, upper, lower);
    }

    public static List<Workout> getUpperLowerUpperLowerUpperWorkout() {
        Workout upperBodyChestFocus = new Workout("Upper Body (Chest Focus)")
                .exercise(Exercises.InclineDumbbellBenchPress, 3)
                .exercise(Exercises.PectoralMachine, 3)
                .exercise(Exercises.PulldownMachine, 3)
                .exercise(Exercises.TBarRows, 3)
                .exercise(Exercises.DumbbellLateralRaises, 3)
                .exercise(Exercises.WeightedDips, 4)
                .exercise(Exercises.InclineDumbbellCurls, 3);

        Workout lowerBodyQuadsFocus = new Workout("Lower Body (Quads Focus)")
                .exercise(Exercises.WeightedBeltSquats, 3)
                .exercise(Exercises.SeatedLegExtensionMachine, 3)
                .exercise(Exercises.SeatedLegCurlMachine, 3)
                .exercise(Exercises.StandingCalfRaises, 3)
                .exercise(Exercises.SeatedCalfRaises, 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches);

        Workout upperBodyBackFocus = new Workout("Upper Body (Back Focus)")
                .exercise(Exercises.PulldownMachine, 3)
                .exercise(Exercises.LowRowMachine, 3)
                .exercise(Exercises.FacePulls, 3)
                .exercise(Exercises.DeclineChestPressMachine, 3)
                .exercise(Exercises.DumbbellLateralRaises, 3)
                .exercise(Exercises.PreacherCurlMachine, 3)
                .exercise(Exercises.CableTricepPushdowns, 3);

        Workout lowerBodyHamstringsFocus = new Workout("Lower Body (Hamstrings Focus)")
                .exercise(Exercises.RomanianDeadlifts, 3)
                .exercise(Exercises.SeatedLegCurlMachine, 3)
                .exercise(Exercises.LegPressMachine, 2)
                .exercise(Exercises.SeatedLegExtensionMachine, 2)
                .exercise(Exercises.StandingCalfRaises, 3)
                .exercise(Exercises.SeatedCalfRaises, 3)
                .exercise(Exercises.HangingLegKneeRaises, 3)
                .exercise(Exercises.WeightedCrunches, 3);

        Workout upperBodyShoulderFocus = new Workout("Upper Body (Shoulder Focus)")
                .exercise(Exercises.ShoulderPressMachine, 3)
                .exercise(Exercises.DumbbellLateralRaises, 4)
                .exercise(Exercises.DumbbellReverseFlys, 3)
                .exercise(Exercises.RowMachine, 3)
                .exercise(Exercises.ChestPressMachine, 3)
                .exercise(Exercises.HammerCurls, 4)
                .exercise(Exercises.OverheadDumbbellTricepExtensions, 3);

        return Arrays.asList(upperBodyChestFocus, lowerBodyQuadsFocus, upperBodyBackFocus, lowerBodyHamstringsFocus, upperBodyShoulderFocus);
    }
}
