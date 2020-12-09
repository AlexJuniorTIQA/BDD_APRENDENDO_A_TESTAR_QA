package br.com.teste.logic.generator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.teste.driver.StoredActions;
import br.comteste.pages.generator.HomePage;

public class GenerateLogic {
	private HomePage homePage;
	private StoredActions action;

	public GenerateLogic(WebDriver driver) {
		homePage = PageFactory.initElements(driver, HomePage.class);
		action = new StoredActions(driver);
	}

	public static String getTimeStamp() {
		return new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(Calendar.getInstance().getTime());
	}

	public void selecionaEstado(String valueEstado) {
		action.waitVisibilityOf(homePage.campoEstado, 30);
		action.click(homePage.campoEstado);
		action.selectElementByValue(homePage.campoEstado, valueEstado);
	

	}

	public void selecionaCidade(String valeuCidade) {
		action.waitVisibilityOf(homePage.campoCidade, 30);
		action.sleep(5);
		action.click(homePage.campoCidade);
		action.insertText(homePage.campoCidade, valeuCidade + Keys.ENTER);
	}

	public void clicaGerarPessoa() {
		action.waitVisibilityOf(homePage.btnGerrarPessoa, 30);
		action.scroll(homePage.btnGerrarPessoa);
		action.click(homePage.btnGerrarPessoa);
	}
	
	public String getNome() {
		action.waitVisibilityOf(homePage.getNome, 30);
		action.scroll(homePage.getNome);
		String nome = action.readFromElement(homePage.getNome);
		return nome;
	}
	public String getEmail() {
		action.waitVisibilityOf(homePage.getEmail, 30);
		String email = action.readFromElement(homePage.getEmail);
		return email;
	}
	public String getSenha() {
		action.waitVisibilityOf(homePage.getSenha, 30);
		action.scroll(homePage.getSenha);
		String senha = action.readFromElement(homePage.getSenha);
		return senha;
	}
}
