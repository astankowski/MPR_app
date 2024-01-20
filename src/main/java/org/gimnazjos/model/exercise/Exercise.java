package org.gimnazjos.model.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Exercise {
    private String name;
    private int sets;
    private double weight;
    private ExerciseBodyPart bodypart;
    private ExerciseCategory category;
}
