package org.gimnazjos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.gimnazjos.model.exercise.Exercise;

import java.util.List;
@Data
@AllArgsConstructor
public class Workout {
    private String name;
    private List<Exercise> workoutList;
    private int timeInSeconds;
}
