package at.workoutplan.data;

import at.workoutplan.models.Muscle;

import java.util.Arrays;
import java.util.List;

public class Muscles {
    /* ===== Chest ===== */
    public static final Muscle Chest = new Muscle("Chest").minVolume(10.0f).maxVolume(20.0f);

    /* ===== Back ===== */
    public static final Muscle Latissimus = new Muscle("Latissimus").minVolume(10.0f).maxVolume(20.0f);
    public static final Muscle Trapezius = new Muscle("Trapezius").minVolume(6.0f).maxVolume(16.0f);
    public static final Muscle LowerBack = new Muscle("Lower Back").minVolume(4.0f).maxVolume(10.0f);

    /* ===== Shoulders ===== */
    public static final Muscle FrontDelts = new Muscle("Front Delts").minVolume(10.0f).maxVolume(16.0f);
    public static final Muscle SideDelts = new Muscle("Side Delts").minVolume(8.0f).maxVolume(20.0f);
    public static final Muscle RearDelts = new Muscle("Rear Delts").minVolume(8.0f).maxVolume(20.0f);

    /* ===== Arms ===== */
    public static final Muscle Biceps = new Muscle("Biceps").minVolume(8.0f).maxVolume(20.0f);
    public static final Muscle Brachialis = new Muscle("Brachialis").minVolume(6.0f).maxVolume(14.0f);
    public static final Muscle Triceps = new Muscle("Triceps").minVolume(8.0f).maxVolume(20.0f);
    public static final Muscle Forearms = new Muscle("Forearms").minVolume(6.0f).maxVolume(14.0f);

    /* ===== Legs ===== */
    public static final Muscle Quadriceps = new Muscle("Quadriceps").minVolume(10.0f).maxVolume(20.0f);
    public static final Muscle Hamstrings = new Muscle("Hamstrings").minVolume(10.0f).maxVolume(18.0f);
    public static final Muscle Gluteus = new Muscle("Gluteus").minVolume(8.0f).maxVolume(20.0f);
    public static final Muscle Gastrocnemius = new Muscle("Gastrocnemius").minVolume(6.0f).maxVolume(14.0f);
    public static final Muscle Soleus = new Muscle("Soleus").minVolume(6.0f).maxVolume(14.0f);

    /* ===== Abs ===== */
    public static final Muscle Abdominal = new Muscle("Abdominal").minVolume(6.0f).maxVolume(15.0f);

    public static final List<Muscle> Muscles = Arrays.asList(Chest, Latissimus, Trapezius, LowerBack, FrontDelts, SideDelts, RearDelts, Biceps, Brachialis, Triceps, Forearms, Quadriceps, Hamstrings, Gluteus, Gastrocnemius, Soleus, Abdominal);
}
