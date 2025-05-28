package at.workoutplan.models;

public class MuscleVolume {
    private final Muscle muscle;
    private float volume;

    public MuscleVolume(Muscle muscle, float volume) {
        this.muscle = muscle;
        this.volume = volume;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public float getVolume() {
        return volume;
    }

    public void addVolume(float volume) {
        this.volume += volume;
    }
}
