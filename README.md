# Exercício técnico - Zenvia

## Problema escolhido
O problema escolhido foi o do [Jokenpo] (http://dojopuzzles.com/problemas/exibe/jokenpo/).


## Solução implementada
O problema foi resolvido de forma bem simples: existe um Enum com as opções possíveis de jogadas. Quando a aplicação é executada, a classe principal informa os dois parâmetros necessários para dar início ao jogo, que são as jogadas de cada jogador de forma descritiva. Após isso a aplicação irá converter a descrição de cada jogada em suas respectivas representações na forma de Enum, e a partir daí é feito o processamento. Para que o jogo aconteça de forma totalmente dinâmica, foi criada uma classe chamada *GameManager*, que possui um método chamado *getSolver* que recebe como parâmetro o Enum que representa a jogada do primeiro jogador e retorna a classe que implementa as regras destea jogada. Foi utilizado o padrão Strategy para implementar as regras do jogo, onde existe uma interface chamada *GameSolver* que define um método, *solveWinner*, que como o nome sugere, resolve qual será o vencedor da partida. Existem 3 implementações desta interface, uma para cada tipo de jogada, onde cada uma destas classes define as regras referentes ao resultado de cada jogada que o oponente poderia realizar, por exemplo, a classe *PaperGameSolver* recebe um parâmetro no método *solveWinner*, onde o parâmetro é um Enum que representa a jogada do oponente, e retorna, também representado pelo Enum, o ganhador da partida, verificando se a jogada escolhida pelo oponente se sairia vencedora, perdedora, ou em um empate em relação ao papel. Para a instanciação de cada classe foi utilizado o Spring Framework com os módulos referentes a injeção de dependências. Tanto para as classes que implementam as regras do jogo, quanto para a Service e para a classe Manager.


## Execução
Para executar a aplicação, basta alterar os valores passados pelo método *main* da classe *GameInitializer* ao método *play* e executar o método *main*. Após isso o resultado será impresso no console.
