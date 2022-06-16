<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/logo1.png" width="500">

# Bomb & Run
# Equipo: Shadows web
## Documento de Diseño de Juego
### 27 de octubre de 2021
### Grado en Diseño y Desarrolo de Videojuegos
### URJC, Campus de Móstoles
### Juegos en red
[![Alt text](https://img.youtube.com/vi/GmH22eA9Htw/0.jpg)](https://www.youtube.com/watch?v=GmH22eA9Htw)
## 1.0-Introducción
Este es el documento de diseño de Bomb & Run, un videojuego para ordenador online con estética pixel art. Se desarrollará en 2D gracias al motor Unity. El objetivo de este documento es mostrar al lector y dejar bien registrado todos los elementos de Bomb & Run y servirá de portada para mostrar Bomb & Run.


### 1.1-Concepto

Bomb & Run es un videojuego competitivo en el cual cada jugador tendrá como objetivo 
ganar al contrincante obteniendo el mayor número de puntos posibles utilizando como arma base del juego las bombas, las cuales 
serán su única herramienta para destruir partes del mapa y sobre todo eliminar al contrario.

Los personajes tendrán un tiempo limitado para ganar puntos antes de que el escenario se destruya y se pase a un nivel inferior. El combate se desarrolla encima de una montaña. Al principio en su ladera, después en el interior de la montaña y finalmente en el interior de la tierra . Para terminar, el jugador más destructivo, es decir, el que más puntos consiga; será el ganador y coronado como el rey del caos.

 ### 1.2-Características
 
Este videojuego se basa en:

⦁	Un planteamiento sencillo: prácticamente no tiene historia, la poca historia que se cuenta se hace a través de los mapas.

⦁	Arcade: Es un juego basado en los juegos arcade de finales de los años 80 pero más actualizado: mucho más vistoso y competitivo.

⦁	Uso de estrategia: Es un juego que a primera vista puede ser sencillo pero si se quiere ganar al rival será necesario ser consciente del tiempo de juego, el mapa y los puntos que se pueden llegar a conseguir tanto tú como el enemigo para poder vencer.

⦁	Competitivo: Bomb & Run pretende lograr un enfrentamiento tenso entre los jugadores.

### 1.3-Género

Se podría encajar en tres géneros:

⦁	Acción: Se trata de un juego dinámico, basado en el movimiento constante por parte de los jugadores para poder salir victoriosos de la partida. 

⦁	Arcade: Es un juego accesible, de partidas relativamente cortas y que se aleja del realismo. Cumple con todas las características de un arcade al tener un diseño sencillo, un sistema de vidas, una dificultad ascendente, tener como objetivo lograr l a puntuación más alta, contar con un límite de tiempo y las mínimas interrupciones posibles, pasando rápido entre pantallas.

⦁	Maze game: toda la partida se desarrolla en un laberinto forzando una acción rápida del jugador para superar oponentes en un límite de tiempo.

### 1.4-Jugabilidad

Bomb & Run consta de tres mapas diferentes, aunque todos comparten la ambientación de una montaña, como ya se explicó con anterioridad, iniciamos en una ladera, el siguiente nivel es el interior de la montaña y finalmente el interior de la tierra. El objetivo es obtener el mayor número de puntos antes de terminar el último mapa.
De forma resumida el juego se basa en:

⦁	Un mapa con elementos destructibles e indestructibles.

⦁	Tiempo limitado para ganar puntos.

⦁	Diferentes personajes con sus características especiales.

⦁	Bombas que es la herramienta para ganar puntos.

⦁	Powerups para el personaje y las bombas.
	
### 1.5-Estilo visual

Se trata de un juego con un estilo visual sencillo, con estética pixel art. Cada escenario y personaje, así como los iconos del menú, seguirán una línea visual simple y llamativa. Habrá tres mapas disponibles, cada uno de ellos con un aspecto distintivo para indicar claramente la zona en la que se desarrolla la partida. De igual forma, los personajes que participen en la partida también serán fácilmente identificables. 	

## 2.0-Mecánicas
### 2.1- Jugabilidad
La jugabilidad de Bomb & Run se basa en los niveles, las bombas y los power ups.

Niveles: En Bomb & Run hay 3 niveles: una ladera, el interior de la cueva y las entrañas de la tierra, que serán generados de forma procedural y donde ocurre toda la acción del juego. Son escenarios cerrados, es decir, no tienen entrada o salida donde hay bloques destructibles e indestructibles. El objetivo en cada mapa es lograr el mayor número de puntos posibles explotando los muros y eliminando al contrario cada vez que aparezca en un límite de tiempo ya prefijado. Al llegar al último mapa se sumarán las puntuaciones obtenidas a lo largo de los tres mapas y se mostrará el ganador.

Bombas: Las bombas son el arma principal de los personajes, cada uno posee un tipo único de bomba con características especiales. También existen bombas “genéricas” que aparecen en los niveles como power ups y que todos los jugadores pueden obtener.

Power Ups: Son mejoras de bomba y habilidades que al destruir un muro tiene una probabilidad de aparecer.

### 2.2- Puntuación

En Bomb & Run las formas de sumar puntos son las siguientes:

⦁	Romper Muros: Cada vez que un jugador rompa un muro su puntuación aumentará en 5.

⦁	Matar al jugador contrario: Cada vez que un jugador elimina al jugador contrario su puntuación aumentará en 30.

⦁	Recoger power ups: Cada vez que un jugador coja un power up su puntuación aumentará en 5.  


La puntuación es una de las condiciones de victoria del juego.

### 2.3- Personajes

Bomb & Run cuenta con tres personajes jugables. Cada jugador podrá seleccionar el personaje que prefiera, estos se diferencian bastante visualmente, sobre todo por el color, para ser distinguidos fácilmente por los jugadores. Además si dos jugadores o más eligen el mismo personaje, estos deberán elegir el color de su personaje y no podrá coincidir con la elección de los otros. 
  
Los tres personajes jugables son:
  
-Hirosaki : Se trata de un soldado japonés dispuesto a todo para ganar, o más bien para derrotar a sus enemigos, haciendo de kamikaze si es necesario, pues sus bombas explotarán sin casi tiempo para reaccionar. Su bomba es  Fatboi.

La referencia cultural de este personaje es los kamikazes japoneses de la segunda guerra mundial que pilotaban los aviones hasta estrellarlos contra los buques estadounidenses.

![Kiyoshi Ogawa](https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Ensign_Kiyoshi_Ogawa_hit_Bunker_Hill_%28new%29.png/245px-Ensign_Kiyoshi_Ogawa_hit_Bunker_Hill_%28new%29.png) El piloto suicida Kiyoshi Okawa, quien voló e impactó su avión contra el USS Bunker Hill (CV-17) el 11 de mayo de 1945.

-Pavlichenko: Mujer soldado rusa que participó en la segunda guerra mundial con sus dotes de francotiradora. Su bomba es Nagant.
La referencia cultural de este personaje es la famosa mujer rusa, Liudmila Mijáilivna Pavlichenko que participó en la segunda guerra mundial como francotiradora luchando contra los nazis.

<img src="https://static3.abc.es/media/historia/2017/10/25/pavlichenko-ke0E--1240x698@abc.jpg" width="500">

-Citron: Robot de desactivación de bombas que es capaz de manejar sus bombas de forma remota y estallarlas cuando él desea. Su bomba es C4. 

<img src="https://i.ytimg.com/vi/n5NeTECx6Fo/maxresdefault.jpg" width="500">

La referencia cultural de este personaje se basa en los robots actuales encargados de la desactivación de artefactos explosivos.

### 2.5- Powerups

●	Botas: Aumenta temporalmente la velocidad de movimiento.

●	Pólvora: Aumenta en una casilla en todas direcciones el rango de explosión de las bombas.

●	Reloj: Reduce el tiempo de detonación de las bombas.

●	Vida extra: añade una vida adicional al jugador que la recoja. (No incluido)

●	Sabotaje: revienta una bomba rival al instante. (No incluido)

●	Escudo: vuelve temporalmente al jugador inmune a las explosiones.

●	Bomba láser: la siguiente bomba del jugador será una bomba láser de rango infinito. (No incluido)

### 2.6- Mapa

El juego presenta tres mapas, con un aspecto diferente cada uno, aunque todo presentan la misma temática. El primer mapa se desarrolla sobre la ladera de una montaña, tras terminar este primer mapa, al haber destruido tanto el mapa con las bombas, lo jugadores descienden al siguiente mapa que se desarrolla en el interior de la montaña y finalmente, el último mapa se realiza en las profundidades de la tierra.

Los mapas tienen muros por los que no se puede pasar y tampoco pueden ser destruidos. Existen otros muros que sí se pueden destruir, que son los que otorgan puntos al jugador que los destruye. Los mapas están construidos a base de cuadrados o casillas, dónde se colocarán los muros antes nombrados, los jugadores, las bombas y los power ups que irán apareciendo aleatoriamente por el mapa al destruir bloques.

Dentro del mapa los jugadores aparecerán en una de las esquinas de forma aleatoria tanto al inicio de ese mapa como tras morir dentro del mapa.

Cada mapa posee un tiempo máximo en el que los jugadores pueden intentar obtener puntos, el tiempo de cada mapa será de dos minutos, tras estos dos minutos aparecerá una pantalla en grande que mostrará a los jugadores la cantidad de puntos que tienen y el número de vidas que les quedan y se empieza con el siguiente mapa hasta llegar al último de ellos donde se mostrará el jugador que ha ganado más puntos y que por lo tanto es el ganador.

Si uno de los jugadores pierde todas las vidas antes de llegar al final de tiempo del último mapa, entonces aparecerá directamente la pantalla del jugador que ha quedado con vida y por lo tanto el ganador. 
  
### 2.7 - Controles

Los controles de Bomb & Run son muy sencillos, lo conforman el movimiento del personaje que se realizan con W, S, A, D; la W sería el movimiento vertical hacia arriba, la S el movimiento vertical hacia abajo, la A es el movimiento horizontal hacia la izquierda y la D que sería el movimiento horizontal hacia derecha.

La forma que tienen los jugadores de poner bombas es pulsando la barra espaciadora y colocarán una bomba en el mismo píxel donde está el personaje que lo coloca.

El personaje Citron, coloca las bombas con la barra espaciadora, y detona estas la próxima vez que pulse esa misma tecla.

### 2.8 - Interacción entre elementos

Los personajes no pueden estorbarse entre sí, evitando así encerrar a otro personaje con el tuyo propio. No obstante, los personajes no pueden pasar por encima tanto de sus bombas propias como de bombas enemigas. 

En el caso en el que un personaje se encuentre dentro del rango de explosión de una bomba en el momento de detonación, incluyendo las suyas propias, este pierde una vida y desaparece del mapa durante tres segundos, acto seguido aparece en una esquina del mapa aleatoria, siendo invulnerable durante los próximos cinco segundos. 
  
La explosión de una bomba hará detonar instantáneamente todas las demás bombas que se encuentren en el rango de esta.
  
La forma de un jugador de obtener un power-up será caminando por encima de este.
  
Las bombas pueden demoler los bloques normales, los cuales tienen una probabilidad de soltar un power-up aleatorio. No obstante, las bombas no afectarán a los bloques metálicos.
	
### 2.9 - Multijugador 

#### 2.9.1 - Multijugador Local
En cuanto al multijugador local, este tiene lugar en una única pantalla, por lo cual la interfaz es la misma para ambos jugadores, con una pantalla final de puntuaciones de todos los jugadores, y en lugar de una pantalla de victoria o derrota, aparece un podio en la que los personajes están situados según la puntuación de sus respectivos jugadores.

Los controles en multijugador local añaden la caqpacidad de que el segundo jugador pueda utilizar las flechas del teclado para moverse y la tecla 'intro' para colocar bombas.

#### 2.9.2 - Multijugador online (WebSockets)
Para la implementación y uso de Websockets se ha creado una clase llamada "MultiHandler". Esta clase maneja la llegada y el envío de información, y se ha de hacer cuando se pierde la conexión. Además, incluye varias estructuras de datos como colas y mapas hash para el almacenamiento y envío de datos. De la forma en la que está diseñada esta clase, se permite el juego a más de 2 jugadores, pero siempre en parejas de dos. El jugador que establezca conexión primero con el servidor será el jugador nº1, y el siguiente el nº2. De momento, este modo permite jugar en un mapa con dos personajes.

## 3.0-Interfaz

### 3.1- Menú de Juego

En esta parte se explicarán las interfaces y el contenido de estas.
  
### 3.1.1- Menú

El menú de juego es lo primero que verá el jugador al iniciar el juego, esta pantalla estará  formada por un fondo de imagen sobre el juego, el nombre del juego arriba de la pantalla y los diferentes botones, que en un principio serán el botón de Jugar, cuando el jugador pulse este botón se le dará la opción de crear una sala o entrar en una, usando un código; una vez dentro, el jugador deberá elegir un personaje. Cada uno de estos personajes se le presentará al jugador como un maniquí, con fondo y música diferentes dependiendo del personaje que esté visualizando.
  
El siguiente botón del menú será el Tutorial. Al pulsar este botón se abrirá una pantalla con una explicación breve sobre el objetivo del juego, cómo ganar y los controles, además de los diferentes tipos de bombas, personajes, y powerups, es decir, un resumen del juego para que de forma sencilla el jugador entienda cómo funciona.
  
El tercer botón del menú será Opciones, al pulsar este botón el usuario podrá cambiar algunos aspectos del juego, el audio general, la música del juego y los efectos de sonido.
  
El siguiente botón sería el de Créditos, en este botón se añadirán los miembros del grupo y los creadores de los sprites, música, efectos de sonido, etc. En general todo lo relacionado con el arte y diseño audiovisual del videojuego.

Por último, el último botón del menú es el de Salir, al pulsarlo el jugador cerrará el juego.

### 3.1.2- Juego

Las interfaces dentro del juego son un poco más escasas. Una vez que la partida comience se mostrará el primer mapa de juego, en el cuál se encontrarán todos los elementos con el que el jugador puede interactuar. Detrás del mapa estaría un fondo de juego que corresponde con el mapa que se esté jugando. El primer mapa, al ser una ladera de una montaña, el fondo simula naturaleza verde, con césped y soleado. El segundo mapa al ser una cueva de la montaña, el fondo simulará una cueva oscura y fría. El último mapa al ser el interior de la tierra, se crea un fondo con ríos de lava y tonos más calientes. Además, en cada mapa aparece la vida de ambos jugadores uno a cada lado y los puntos que llevan.

Interfaz de puntuación, esta interfaz sirve de transición entre mapas, en esta pantalla se mostrará la puntuación que tiene cada jugador, donde saldrá el icono y nombre del personaje y su puntuación con el fondo del mapa difuminado que irá cambiando poco a poco hasta pasar el siguiente mapa.

Por último, la última interfaz es la pantalla de victoria y derrota, donde pondrá el personaje del juego en grande y su nombre con un icono de victoria/derrota y aparecerán dos botones uno para volver a jugar y elegir de nuevo el personaje y otro botón para salir al menú inicial de juego.	

 
## 4.0-Arte
### 4.1- Interfaces de juego
- Esquema de pantallas
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/Flowchart4.png" width="500">

- Menú principal
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/menu3.png" width="500">

- Login
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/login.png" width="500">

- LeaderBoard
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/top.png" width="500">

- Tutorial
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/tuto.png" width="500">

- Selección de personaje (On-Line)
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/charSelect3.png" width="500">

- Mapa
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/mapa1.png" width="500">

- Final de juego
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/final.png" width="500">

### 4.2 - Personajes
- Pavlichenko 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/Personajes/RusaconFondo.png" width="500">

- Hirosaki 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/Personajes/JapoConfondo.png" width="500">

- Citron
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/Personajes/RobotConFondo.png" width="500">



### 4.3- Bombas
- Fatboi 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/BombasPersonajes/BombaJapo.png" width="500">

- Nagant 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/BombasPersonajes/BombaURSS.png" width="500">

- C4 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/Im%C3%A1genes/Juego/BombasPersonajes/C4.png" width="500">


### 4.4- Powerups

<p float="left">
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/Botas.png" width="200">
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/Escudo.png" width="200">
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/Polvora.png" width="200">
</p>
<p float="left">
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/Reloj.png" width="200">

</p>


### 4.5- Fondos

- Fondos del menú 
<img src="https://github.com/SamuelArroyo/Bomb-Run/blob/main/sources/im%C3%A1genes/fondo.jpg" width="500">


## 5.0 Música y efectos de sonido
### 5.1- Música
Habrá varias pistas en el juego: 

●	Una pista para el menú, a modo de tema principal.

●	Una pista para la selección de personaje.

●	Una pista para cada mapa.

●	Una canción para la pantalla de resultados, la misma para todos los mapas. 
## 6.0-Instrucciones de uso de la API Rest
Ante la imposibilidad de crear un .jar ejecutable funcional, para el uso del juego con la api es necesario tener instalado Eclipse con SpringBoot. Siendo necesario la creacion de un proyecto de Spring Web y copiando los archivos a las carpetas requeridas. 

## 7.0-Bibliografía
Este juego está basado en el videojuego clásico “Bomberman”. 

- Web de Super Bomberman R: https://www.konami.com/games/bomberman/online/eu/es/

- Imagen de fondo en menú principal: https://store.playstation.com/es-es/product/EP0101-CUSA10662_00-MAINGAME00000000/

- Para referencias de GDD, se han utilizado las siguientes:
https://www.gamasutra.com/view/feature/3384/the_anatomy_of_a_design_document_.php
https://github.com/dsaltares/sion-tower/blob/master/doc/gdd/gdd.pdf  
http://manualdelgamedesigner.blogspot.com/2014/08/design-document-gdd.html 
http://manualdelgamedesigner.blogspot.com/2014/10/como-organizar-efectivamente-el.html

- Enlace a GitHub del grupo: https://github.com/SamuelArroyo/Bomb-Run
