package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.Normalizer;

public class FormularioAdicionarProdutoTela extends BaseTela {
    public FormularioAdicionarProdutoTela(WebDriver app) {
        super(app);
    }

    public FormularioAdicionarProdutoTela informarProdutoNome(String produtoNome) {
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);

        return this;
    }

    public FormularioAdicionarProdutoTela informarProdutoValor(String produtoValor) {
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoValor);

        return this;
    }

    public FormularioAdicionarProdutoTela informarProdutoCores(String produtoCores) {
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys("preto, azul");

        return this;
    }

    public FormularioAdicionarProdutoTela submeterOFormularioDeAdicaoComErro() {
        app.findElement(By.id("com.lojinha:id/saveButton")).click();

        return this;
    }

    public String capturarMensagemApresentada() {
        return capturarToast();
    }
}
