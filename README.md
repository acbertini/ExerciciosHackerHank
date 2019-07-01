# ExerciciosHackerHank

Exercício 1 - MovieTitles (teste 1)
Solução proposta: construir a requisição HTTP GET para extrair os resultados em formato JSON. Foi construido um loop while para varrer todas as páginas do JSON, transformando a variável totalPageNumbers no número total de páginas obtidos através da chave "total_pages". Ao entrar em uma página, são extraídos os dados do nó "data" e dentro os valores de "Title", os quais foram armazenados num array. Com o array preenchido foi aplicado o Collections.sort(titles) para obtenção ordenada dos títulos.
Dificuldades: aprender a tratar uma requisição do tipo HTTP GET e manipular um JSON a partir da biblioteca json-20180813.jar

Exercicio 2 - ShortSubstr (teste 2)
Solução proposta: determinar todos os caracteres distintos dado uma palavra. Extrair a quantidade de caracteres distintos através da variável maxDistinctChar e mediante esse valor varrer a palavra até encontrar uma combinaçào com o mesmo número de caracteres distintos.
Dificuldades: encontrar uma solução lógica para o problema
