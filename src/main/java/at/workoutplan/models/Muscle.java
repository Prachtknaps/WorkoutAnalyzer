package at.workoutplan.models;

public class Muscle {
    private String name;
    private float minVolume = 0.0f;
    private float maxVolume = 0.0f;

    public Muscle() {

    }

    public Muscle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Muscle name(String name) {
        this.name = name;
        return this;
    }

    public float getMinVolume() {
        return minVolume;
    }

    public Muscle minVolume(float volume) {
        minVolume = volume;
        return this;
    }

    public float getMaxVolume() {
        return maxVolume;
    }

    public Muscle maxVolume(float volume) {
        maxVolume = volume;
        return this;
    }
}
