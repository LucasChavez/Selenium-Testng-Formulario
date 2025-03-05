package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Slider {

    public static void moveSlider(WebDriver driver, int desiredValue) {
        // Localizar el handle del slider
        WebElement sliderHandle = driver.findElement(By.cssSelector(".slider-handle.min-slider-handle"));

        // Obtener valores mínimos y máximos
        int minValue = Integer.parseInt(sliderHandle.getAttribute("aria-valuemin"));
        int maxValue = Integer.parseInt(sliderHandle.getAttribute("aria-valuemax"));

        // Validar si el valor deseado está en el rango permitido
        if (desiredValue < minValue || desiredValue > maxValue) {
            String errorMessage = "El valor deseado está fuera del rango permitido: " + minValue + " - " + maxValue;
            System.out.println(errorMessage);
            throw new IllegalArgumentException(errorMessage); // Lanza una excepción
        }

        // Calcular el porcentaje correspondiente
        double percentage = ((double)(desiredValue - minValue) / (maxValue - minValue)) * 100;

        // Usar JavaScript para mover el slider
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].setAttribute('aria-valuenow', '" + desiredValue + "');"
                + "arguments[0].style.left = '" + percentage + "%';";

        js.executeScript(script, sliderHandle);

        // Actualizar la barra de selección del slider
        WebElement sliderSelection = driver.findElement(By.cssSelector(".slider-selection"));
        String selectionScript = "arguments[0].style.width = '" + percentage + "%';";
        js.executeScript(selectionScript, sliderSelection);

        // Actualizar la tooltip del slider
        WebElement tooltip = driver.findElement(By.cssSelector(".tooltip-main"));
        String tooltipScript = "arguments[0].style.left = '" + percentage + "%';"
                + "arguments[0].querySelector('.tooltip-inner').textContent = '" + desiredValue + "';";
        js.executeScript(tooltipScript, tooltip);

        // Actualizar el valor de suma asegurada
        WebElement sumaAsegurada = driver.findElement(By.id("suma_aseguradatotal"));
        String sumaAseguradaScript = "arguments[0].textContent = '$' + arguments[1].toLocaleString('es-CL');";
        js.executeScript(sumaAseguradaScript, sumaAsegurada, desiredValue);

        System.out.println("El slider se movió al valor: " + desiredValue);
    }
}
