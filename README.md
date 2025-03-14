O projeto atualmente está em um estágio intermediário de desenvolvimento, com cerca de 50% das funcionalidades implementadas. 
Abaixo, descrevo o progresso realizado até agora e os próximos passos necessários para completar o projeto.

1. O que já foi feito (50% concluído):

Backend (API Spring Boot):
Modelagem da Entidade NotaFiscal: A classe NotaFiscal foi criada com os atributos necessários (id, numero, emitente, destinatario, valor) e anotada com JPA para persistência no banco de dados.

Repositório: Foi configurado um repositório (NotaFiscalRepository) usando o Spring Data JPA para interagir com o banco de dados H2.

Serviço: A lógica de negócios foi encapsulada na classe NotaFiscalService, que inclui métodos para listar, criar, buscar por ID e deletar notas fiscais.

Controlador REST: O controlador (NotaFiscalController) expõe endpoints RESTful para operações CRUD (GET, POST, DELETE).

Configuração do Banco de Dados: O banco de dados H2 foi configurado para armazenamento temporário dos dados durante o desenvolvimento.

Frontend (HTML + CSS + JavaScript):
Interface HTML: Foi desenvolvido um formulário para criação de novas notas fiscais e uma tabela para exibir as notas cadastradas.

Estilização (CSS): O front-end foi estilizado com CSS interno para proporcionar uma interface visualmente agradável e responsiva.

Integração com a API (JavaScript): O JavaScript foi implementado para consumir os endpoints da API via fetch. As funcionalidades incluem:

Carregar a lista de notas fiscais na tabela.

Enviar novas notas fiscais para o backend via POST.

Exibir mensagens de erro caso ocorram problemas no envio dos dados.
