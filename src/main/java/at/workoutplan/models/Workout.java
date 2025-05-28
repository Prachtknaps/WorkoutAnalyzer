package at.workoutplan.models;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private String name;
    private final List<Exercise> exercises;

    public Workout() {
        exercises = new ArrayList<>();
    }

    public Workout(String name) {
        this.name = name;
        exercises = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Workout name(String name) {
        this.name = name;
        return this;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public Workout exercise(Exercise exercise) {
        exercises.add(exercise);
        return this;
    }

    public Workout exercise(Exercise exercise, int sets) {
        for (int i = 0; i < sets; i++) {
            exercises.add(exercise);
        }
        return this;
    }
}
