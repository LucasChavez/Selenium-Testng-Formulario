package utils;

import java.util.Arrays;
import java.util.List;

public class ProvinceUtils {

    // Lista de provincias válidas (se agrego las provincias en el dropdown)
    private static final List<String> VALID_PROVINCES = Arrays.asList(
            "CABA","Buenos Aires","Córdoba","Mendoza","Misiones","Salta","San Juan","Jujuy",
            "Santa Cruz","Santiago del Estero","Tierra del Fuego","Tucumán","Catamarca","Chubut"
    );

    // Metodo para validar si una provincia es válida
    public static boolean isValidProvince(String province) {
        return VALID_PROVINCES.contains(province);
    }
}
