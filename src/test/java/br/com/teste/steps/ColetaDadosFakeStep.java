package br.com.teste.steps;

import org.openqa.selenium.WebDriver;

import br.com.teste.driver.DriverFactory;
import br.com.teste.driver.Screenshot;
import br.com.teste.excel.MassaDeDados;
import br.com.teste.logic.generator.GenerateLogic;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ColetaDadosFakeStep {

	private WebDriver driver;
	private String folder;
	private MassaDeDados massaDeDados;
	private GenerateLogic generateLogic;

	@Before
	public void Driver() throws Exception {
		massaDeDados = new MassaDeDados();
		driver = DriverFactory.getDriver("https://www.4devs.com.br/gerador_de_pessoas");
		folder = "Teste de Automação" + GenerateLogic.getTimeStamp();
		generateLogic = new GenerateLogic(driver);

	}

	@Dado("que eu esteja na Home Page site 'Fake Name Generator'")
	public void que_eu_esteja_na_home_page_do_site_fake_name_generator() throws Throwable {	
		Screenshot.getScreenShot(driver, folder, "Acessando Home Page");

	}

	@Quando("seleciono os criterios de geracao de massa")
	public void seleciono_os_criterios_de_geracao_de_massa() throws Throwable {
		generateLogic.selecionaEstado("SP");
		generateLogic.selecionaCidade("São Paulo");
		
		Screenshot.getScreenShot(driver, folder, "Selecionando os critérios da massa de teste");
	
	}

	@E("clico em 'Gerar Pessoa'")
	public void clico_em_gerar_pessoa() throws Throwable {
		generateLogic.clicaGerarPessoa();
		
		Screenshot.getScreenShot(driver, folder, "Clicando em 'Gerar Pessoa'");
	}

	@Entao("coleto os dados que foram gerados")
	public void coleto_os_dados_que_foram_gerados() throws Throwable {
		massaDeDados.setNome(generateLogic.getNome());
		massaDeDados.setEmail(generateLogic.getEmail());
		massaDeDados.setSenha(generateLogic.getSenha());
		
		Screenshot.getScreenShot(driver, folder, "Coletando os dados da massa gerada");
	}

	@After
	public void closeDriver() {

		DriverFactory.quit();
	}

}
