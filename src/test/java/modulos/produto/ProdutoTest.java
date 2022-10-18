package modulos.produto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Testes Mobile do Módulo de Produto")
public class ProdutoTest {

    private WebDriver app;

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Pixel 3 Teste");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "emulator-5554");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "C:\\Users\\Igor\\Desktop\\Lojinha\\nativa\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
        this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Validação do Valor do Produto Não Permitido")
    public void testValidacaoDoValorDeProdutoNaoPermitido() {
        String mensagemApresentada;
        mensagemApresentada = new LoginTela(app)
                .informarUsuario("admin")
                .informarSenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioDeAdicaoDeNovoProduto()
                .informarProdutoNome("XBOX ONE")
                .informarProdutoValor("0000")
                .informarProdutoCores("preto, azul")
                .submeterOFormularioDeAdicaoComErro()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
        app.quit();
    }
}
