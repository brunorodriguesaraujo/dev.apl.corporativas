### Padrão Factory - Vantagens: 

- Você evita acoplamentos firmes entre o criador e os produtos concretos.
- Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
- Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.

### Padrão Strategy - Vantagens:

- Você pode trocar algoritmos usados dentro de um objeto durante a execução.
- Você pode isolar os detalhes de implementação de um algoritmo do código que usa ele.
- Princípio aberto/fechado. Você pode introduzir novas estratégias sem mudar o contexto.

### Padrão Facade - Vantagens:

- Você pode isolar seu código da complexidade de um subsistema.
- Desconectar o cliente de um subsistema complexo

### Padrão Builder - Vantagens:

- Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
- Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
- Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
