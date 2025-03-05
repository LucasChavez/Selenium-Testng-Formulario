package TestFormulario;

// Importación de clases necesarias para la prueba.
import BaseTest.BaseTest;
import Utils.Slider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Slider.moveSlider;

// Clase que define las pruebas relacionadas con un formulario.
public class Formulario extends BaseTest {

    @Test(description = "Ingresamos los valores del formulario respetando las condiciones,tanto de edad,provincia y numero de telefono")
    public void validarAño() throws InterruptedException {
        // Datos de entrada para la prueba.
        String fechaNacimiento = "27/11/2001";
        String provincia = "CABA";
        String phoneCode = "111";
        String phoneNumber = "56664641";

        // Validar si la edad es válida antes de continuar.
        boolean isAgeValid = utils.DateUtils.isValidAge(fechaNacimiento);
        Assert.assertTrue(isAgeValid, "El usuario debe tener al menos 18 años para continuar.");

        // Si la edad es válida, ingresa la fecha de nacimiento en el formulario.
        if (isAgeValid) {
            inicio.edad().sendKeys(fechaNacimiento);
        }

        // Validar si la provincia es válida antes de seleccionarla.
        boolean isValidProvince = utils.ProvinceUtils.isValidProvince(provincia);
        Assert.assertTrue(isValidProvince, "La provincia ingresada no es válida.");

        // Si la provincia es válida, selecciona la opción correspondiente en el dropdown.
        if (isValidProvince) {
            inicio.seleccionarOpcionDropdown(provincia);
        }

        // Validar si el código de área y el número de teléfono son válidos antes de ingresarlos.
        boolean isValidAreaCode = Utils.PhoneUtils.isValidAreaCode(phoneCode);
        Assert.assertTrue(isValidAreaCode, "El código de área ingresado no es válido.");

        boolean isValidPhoneNumber = Utils.PhoneUtils.isValidPhoneNumber(phoneNumber);
        Assert.assertTrue(isValidPhoneNumber, "El número de teléfono ingresado no es válido.");

        // Si ambos son válidos, los ingresa en el formulario.
        if (isValidAreaCode && isValidPhoneNumber) {
            inicio.phoneCode().sendKeys(phoneCode);
            inicio.phoneNumber().sendKeys(phoneNumber);
        }

        // Realiza un scroll hacia abajo en la página para continuar con el formulario.
        inicio.scroll();

        // Instancia del objeto Slider para manipular el slider del formulario.
        Slider slider = new Slider();

        // Mueve el slider a un valor deseado (ejemplo: 2,300,000).
        slider.moveSlider(driver, 2300000);
        Thread.sleep(2000); // Espera de 2 segundos para visualizar el movimiento del slider.
    }
}
