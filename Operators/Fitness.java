package Operators;

public class Fitness{
    public static void main(String[] args) {
        int steps = 8500;
        int heartRate = 72;
        boolean didWorkout = true;
        int healthScore = 100;

        boolean isActiveDay = (steps > 7000) && didWorkout;
        boolean needsAttention = (heartRate > 100) || !didWorkout;

        int activeBonus = (isActiveDay && true) ? 1 : 0;
        int attentionPenalty = (needsAttention && true) ? 1 : 0;

        healthScore += Boolean.compare(isActiveDay, false) * 10;
        healthScore -= Boolean.compare(needsAttention, false) * 15;

        System.out.println("Is Active Day: " + isActiveDay);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("Final Health Score: " + healthScore);
    }
}

