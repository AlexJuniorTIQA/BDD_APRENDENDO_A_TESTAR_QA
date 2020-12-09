package br.com.teste.excel;

import br.com.teste.excel.ExcelUtils;

public class MassaDeDados {
	// Exemplo de massa para teste, vale esta estrutura n�o supre a
	// necessidade na pespectiva de uma automa��o com muita manipula��o de massa de
	// dados
	public void setNome(String nome) throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "Teste");
		ExcelUtils.setCellData(nome, 1, 0);
		
	}
	
	public void setEmail(String email) throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "Teste");
		ExcelUtils.setCellData(email, 1, 1);
		
	}

	public void setSenha(String senha) throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "Teste");
		ExcelUtils.setCellData(senha, 1, 2);
		
	}


}
