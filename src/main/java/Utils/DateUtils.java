package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class DateUtils {

    public static boolean isValidAge(String dateOfBirth) {
        try {
            // Definir el formato de fecha esperado: dd/MM/yyyy
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Convertir la fecha de nacimiento de String a LocalDate
            LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);

            // Obtener la fecha actual
            LocalDate currentDate = LocalDate.now();

            // Calcular la diferencia entre la fecha de nacimiento y la fecha actual
            Period age = Period.between(birthDate, currentDate);

            // Verificar si la diferencia en años es de al menos 18
            return age.getYears() >= 18;

        } catch (DateTimeParseException e) {
            // Si la fecha no tiene un formato válido, no es válida
            System.out.println("Formato de fecha no válido: " + dateOfBirth);
            return false;
        }
    }
}
