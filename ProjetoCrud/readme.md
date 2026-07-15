# Projeto Crud - utilizando o banco de dados MySQL.

# MVC:
- Model: Define a estrutura dos dados e interage com o banco de dados.
- View: Interface gráfica (JFrame) para cadastro e visualização.
- Controller: Controla a lógica de negócios e faz a ligação entre Model e View.

# Estrutura do projeto:
```css
src/
├── model/
│   ├── Pessoa.java
├── dao/
│   ├── PessoaDAO.java
├── controller/
│   └── PessoaController.java
├── view/
│   └── PessoaView.java
├── util/
│   └── Conexao.java
└── default package/
    └── Main.java
```
# Explicação da estrutura:
- dao: Contém as classes de Data Access Object para interagir com o banco de dados.
- model: Armazena as classes de modelo que representam as tabelas do banco de dados.
- view: Abriga as telas Swing (interface gráfica) da aplicação.
- controller: Contém a lógica para conectar a interface com o modelo.
- util: Inclui classes utilitárias, como a conexão com o banco de dados.
- main: não precisa criar o pacote, apenas adicionar a classe como principal.

# Banco de Dados (MySQL):
- observe o endereço e a senha para o uso do mecanismo:
  - URL: localhost
  - usuário: root
  - senha:
- crie o banco de dados e as tabelas no MySQL Workbench, bem como a procedure
- script do arquivo sql para a criação da tabela: ```cadastro2.sql```

# Estrutura do projeto no Eclipse
- Criando o Projeto Java no Eclipse:
  - Clique em File > New > Java Project.
  - Dê um nome para o seu projeto (por exemplo, CrudMVC).
  - Clique em Finish.
- Configurando o Driver JDBC para permitir a conexão do sistema com o banco de dados:
  - Baixe o arquivo mysql-connector-java.jar:
    - link: https://dev.mysql.com/downloads/connector/j/
    - escolha plataforma independente.
  - Clique com o botão direito no projeto (CrudMVC), vá em Build Path > Configure Build Path.
  - Na aba Libraries, clique em Add External JARs... e selecione o mysql-connector-java.jar.
  - Clique em Apply and Close.
- Estrutura de Pacotes:
  - No Eclipse, clique com o botão direito na pasta src e escolha New > Package.
  - Crie os seguintes pacotes: model, view, controler, dao e util. O arquivo do "main" você pode deixar no pacote "default".
    - Adicione os arquivos ".java" pertencente a cada pacote.

# Código Java:
- pacote: controller
  - PessoaController.java
- pacote: dao
  - PessoaDAO.java
- pacote: model
  - Pessoa.java
- pacote: util
  - Conexao.java
- pacote: view
  - PessoaView.java
- pacote: default
  - Main.java
