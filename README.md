Projeto de BDD para avaliação

Projeto desenvolvido em cima do site https://www.4devs.com.br/gerador_de_pessoas

Site para apoio de estudo: https://www.toolsqa.com/

Cenário de teste: 
 - Realizar coleta de dados fake




MassaDeDados.xlsx - Massa de dados para consumo do teste
Pasta Report: Contem o arquivo de report do teste e as screenshot da execução 


Descrição dos pacotes: 

-> Main

  -> driver: Este pacote contem as condições da execução do driver, screenshot e MassaDeDados.

  -> excel: Este pacote contem a classe que define a forma de consumo da massa de dados.

  -> logic: Este pacote contem as classes de lógica do teste, utilizando da boa prática de desenvolvimento e reutilização de código.
  
  -> pages: Este pacote contem as páginas do site e seus respectivos elementos mapeados.

->Teste 

  -> Runners: Este pacote contem a classe de execução do teste.

  -> Steps: Este pacote contem as classes de step dos  testes
