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

        for (Workout workout : workouts) {
            for (Exercise exercise : workout.getExercises()) {
                for (MuscleVolume mv : exercise.getMuscleVolumes()) {
                    volumeMap.merge(mv.getMuscle(), mv.getVolume(), Float::sum);
                }
            }
        }

        for (Muscle muscle : Muscles.Muscles) {
            float volume = MathUtils.truncateFloat(volumeMap.getOrDefault(muscle, 0f), 1);
            float min = muscle.getMinVolume();
            float max = muscle.getMaxVolume();

            String statusEmoji;
            if (volume < min)
                statusEmoji = "⚠";
            else if (volume > max)
                statusEmoji = "❌";
            else
                statusEmoji = "✅";

            System.out.println(muscle.getName() + ": " + volume + " [" + (int)min + "-" + (int)max + "] " + statusEmoji);
        }
    }
}
