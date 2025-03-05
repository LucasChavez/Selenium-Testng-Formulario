package Utils;

public class PhoneUtils {
    public static boolean isValidAreaCode(String areaCode) {
        // Verificar que el código de área tiene entre 2 y 4 dígitos y que solo contenga números
        return areaCode.matches("\\d{2,4}");
    }

    // Metodo para validar el número de teléfono
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Verificar que el número de teléfono tiene entre 6 y 8 dígitos y que solo contenga números
        return phoneNumber.matches("\\d{6,8}");
    }
}
