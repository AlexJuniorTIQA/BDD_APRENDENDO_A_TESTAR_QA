package br.comteste.pages.generator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how = How.ID, using = "cep_estado")
	public WebElement campoEstado;
	
	@FindBy(how = How.ID, using = "cep_cidade")
	public WebElement campoCidade;
	
	@FindBy(how = How.ID, using = "bt_gerar_pessoa")
	public WebElement btnGerrarPessoa;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='nome']//span)[1]")
	public WebElement getNome;
	
	@FindBy(how = How.XPATH, using = "//div[@id='email']")
	public WebElement getEmail;

	@FindBy(how = How.XPATH, using = "//div[@id='senha']")
	public WebElement getSenha;
}