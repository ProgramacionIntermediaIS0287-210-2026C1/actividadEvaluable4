package com.exam.domain.vo;

public class ValueObjects {

    public record StudentId (String value) {
        public StudentId {
            if (value == null || value.isBlank()) {
                throw new IllegalArgumentException("El ID del estudiente no puede estar vacio.");
                
            }
        }
        // public StudentId {
        //     if (value == null || value.isBlank()) {
        //         throw new IllegaArgumentException("El ID del estudiante no puede estar vacio.");
                
        //     }
        // }
    }

    public record QuestionId(String value) {
    }

    public record AnswerText(String value) {
    }

    public record Calificacion(int puntaje, int total) {
    }
}