ALUNOS:

- Guilherme Vinícius - RA: 4231925652
- Leonardo Gabriel - RA: 4231921808

#

PRÁTICA - PINOS




Você foi contratado por uma fábrica que desenvolve um sistema de montagem baseado em pinos e buracos. Atualmente, existem dois tipos de pinos: pinos redondos e pinos quadrados. Os buracos redondos só aceitam pinos que sigam o formato redondo, enquanto os pinos quadrados não se encaixam diretamente.
Sua tarefa é criar uma estrutura que permita a adaptação dos pinos quadrados para que eles possam ser usados nos buracos redondos, sem modificar o comportamento dos pinos redondos ou dos buracos.


Requisitos:
- Crie uma interface PinoRedondo com o método getRaio().
- Implemente a classe concreta PinoRedondoConcreto que representa um pino redondo.
- Crie a classe PinoQuadrado que representa o pino quadrado com uma largura.
- Crie a classe adaptadora AdaptadorPinoQuadrado que encapsula um PinoQuadrado e implementa a interface PinoRedondo, adaptando a largura do quadrado para um raio equivalente ( raio equivalente = L 22).
- Implemente a classe BuracoRedondo, que aceita apenas pinos redondos e verifica se o pino pode se encaixar com base no raio.
- Crie uma classe Principal para verificar se os pinos redondos se encaixam nos buracos redondos e se os pinos quadrados podem ser adaptados para se encaixar também.
