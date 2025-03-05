package org.Pantallas;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// Clase Inicio que contiene métodos para interactuar con elementos de una página web.
public class Inicio {
    WebDriver driver;

    // Constructor que inicializa el WebDriver.
    public Inicio(WebDriver driver) {
        this.driver = driver;
    }

    // Devuelve el elemento Web correspondiente al campo de entrada para la edad, identificado por su ID "BirthdayStep1".
    public WebElement edad(){
        return click("BirthdayStep1");
    }

    // Devuelve un objeto Select para manejar un dropdown (desplegable) identificado por su ID "province".
    public Select getDropdown() {
        WebElement dropdownElement = click("province");
        return new Select(dropdownElement);
    }

    // Selecciona una opción del dropdown usando el texto visible de la opción.
    public void seleccionarOpcionDropdown(String textoVisible) {
        Select dropdown = getDropdown();
        dropdown.selectByVisibleText(textoVisible);
    }

    // Devuelve el elemento Web correspondiente al campo para ingresar el código telefónico, identificado por su ID "txtPhoneCode".
    public WebElement phoneCode(){
        return click("txtPhoneCode");
    }

    // Devuelve el elemento Web correspondiente al campo para ingresar el número telefónico, identificado por su ID "txtPhoneNumber".
    public WebElement phoneNumber(){
        return click("txtPhoneNumber");
    }


    // Realiza un desplazamiento (scroll) hacia abajo en la página usando JavaScript, desplazando 200 píxeles.
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);"); // Cambia 200 por la cantidad de píxeles deseados.
    }

    // Encuentra y devuelve un elemento Web identificado por su ID.
    public WebElement click(String id){
        return driver.findElement(By.id(id));
    }
}