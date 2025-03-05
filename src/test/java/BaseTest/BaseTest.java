package BaseTest;

import org.Pantallas.Inicio; // Importa la clase Inicio para interactuar con elementos de la página.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

// Clase BaseTest que proporciona para la conexion con el driver y la url
public class BaseTest {
    // Variables protegidas accesibles desde clases que extiendan BaseTest.
    protected WebDriver driver; // Instancia del navegador.
    protected Inicio inicio; // Página inicial que contiene métodos para interactuar con elementos.

    // Metodo que se ejecuta antes de cada prueba para configurar el entorno.
    @BeforeTest
    public void setUp() {
        // Establece la ruta del driver de Chrome.
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        // Inicializa el navegador Chrome.
        driver = new ChromeDriver();
        // Crea una instancia de la clase Inicio con el WebDriver.
        inicio = new Inicio(driver);
        // Configura un tiempo de espera implícito para encontrar elementos.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Navega a la URL de la aplicación que se probará.
        driver.get("https://purchase-testing.klimber.com/ar/GroupLife/Index");
        // Maximiza la ventana del navegador.
        driver.manage().window().maximize();
        // Instancio un objeto de la clase Inicio.
        inicio = new Inicio(driver);
    }

    // Metodo que se ejecuta después de cada prueba para cerrar el navegador.
    @AfterTest
    public void teardown() {
        // Verifica que el driver no venga null antes de cerrarlo.
        if (driver != null) {
            driver.quit(); // Cierra todas las ventanas del navegador y termina la sesión.
        }
    }
}
