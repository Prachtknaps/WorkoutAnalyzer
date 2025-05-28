package at.workoutplan.models;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String name;
    private final List<MuscleVolume> muscleVolumes;

    public Exercise() {
        muscleVolumes = new ArrayList<>();
    }

    public Exercise(String name) {
        this.name = name;
        muscleVolumes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Exercise name(String name) {
        this.name = name;
        return this;
    }

    public List<MuscleVolume> getMuscleVolumes() {
        return muscleVolumes;
    }

    public Exercise muscleVolume(Muscle muscle, float volume) {
        for (MuscleVolume muscleVolume : muscleVolumes) {
            if (muscleVolume.getMuscle().equals(muscle)) {
                muscleVolume.addVolume(volume);
                return this;
            }
        }

        muscleVolumes.add(new MuscleVolume(muscle, volume));
        return this;
    }
}
