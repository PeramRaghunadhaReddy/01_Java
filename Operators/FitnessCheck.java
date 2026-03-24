package Operators;

public class FitnessCheck {
    public static void main(String[] args) {
        int steps = 8500;
        int heartRate = 72;
        boolean didWorkout = true;
        int healthScore = 100;

        boolean isActiveDay = (steps > 7000) && didWorkout;

        boolean needsAttention = (heartRate > 100) || !didWorkout;

        if (isActiveDay) {
            healthScore += 10;
        }
        if (needsAttention) {
            healthScore -= 15;
        }

        System.out.println("Is Active Day: " + isActiveDay);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("Final Health Score: " + healthScore);
    }
}

