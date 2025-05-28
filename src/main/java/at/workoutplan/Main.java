package at.workoutplan;

import at.workoutplan.data.Muscles;
import at.workoutplan.data.Workouts;
import at.workoutplan.models.Muscle;
import at.workoutplan.models.Exercise;
import at.workoutplan.models.MuscleVolume;
import at.workoutplan.models.Workout;
import at.workoutplan.utils.MathUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Workout> workouts = Workouts.getUpperLowerUpperLowerUpperWorkout();

        Map<Muscle, Float> volumeMap = new HashMap<>();

        // Berechne das Volumen pro Muskel
        for (Workout workout : workouts) {
            for (Exercise exercise : workout.getExercises()) {
                for (MuscleVolume mv : exercise.getMuscleVolumes()) {
                    volumeMap.merge(mv.getMuscle(), mv.getVolume(), Float::sum);
                }
            }
        }

        // Ausgabe in der Reihenfolge wie in Muscles.Muscles
        for (Muscle muscle : Muscles.Muscles) {
            float volume = MathUtils.truncateFloat(volumeMap.getOrDefault(muscle, 0f), 1);
            float min = muscle.getMinVolume();
            float max = muscle.getMaxVolume();

            String statusEmoji;
            if (volume < min) {
                statusEmoji = "⚠"; // unter Minimum
            } else if (volume > max) {
                statusEmoji = "❌"; // über Maximum
            } else {
                statusEmoji = "✅"; // im Zielbereich
            }

            System.out.println(muscle.getName() + ": " + volume + " [" + (int)min + "-" + (int)max + "] " + statusEmoji);
        }
    }
}
