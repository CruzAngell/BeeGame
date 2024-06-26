<a name="readme-top"></a>
# BeeGame
Bee Game in Java using Visual Studio Code and Maven, Extension Java Pack.

En la siguiente documentación, se explicará paso a paso como clonar este repositorio para ejecutar una versión Alpha de BeeGame.

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenido</summary>
  <ol>
    <li>
      <a href="#Sobre-el-Proyecto">Sobre el Proyecto</a>
      <ul>
        <li><a href="#Desarrollo">Desarrollo</a></li>
      </ul>
    </li>
    <li>
      <a href="#Paso-a-Paso">Paso a Paso</a>
      <ul>
        <li><a href="#prerequisitos">Prerequisitos</a></li>
        <li><a href="#instalación">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#configuración">Configuración</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#conclusion">Conclusión</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
<a name="Sobre-el-Proyecto"></a>
## Sobre el Proyecto

BeeGame o Abejita Vuelve a Tu Panal es un videojuego interacto desarrollado en Java utilizando Visual Studio Code, junto con Maven y la extensión Java Pack For Java.
Es un juego de responder preguntas acádemicas con varios niveles de dificultad.

<div align="center">
  <img src="https://github.com/CruzAngell/BeeGame/blob/main/src/doc/img/BeeGame.jpg" alt="Imagen Alusiva">
</div>

Comentarios:
* El videojuego fue desarrollado en colaboración con 8 participantes en total, cada uno desarrolló partes importantes para la correcta funcionalidad del videojuego. :sunglasses:
* Nuestra elección como IDE fue Visual Studio Code por su versatilidad, facilidad y poco consumo de recursos que usa este para su funcionamiento. :stuck_out_tongue_winking_eye:
* Nos encontramos varios inconvenientes al momento del desarrollo, pero nada que no hayamos podido resolver. :smile:

Por supuesto, la siguiente documentación fue hecha en base a una versión Alpha del videojuego, pero con esto, el usuario final se dará una idea de como ejecutar correctamente el código en cualquier maquina.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



### Desarrollo
<a name="Desarrollo"></a>
En esta sección, se nombrará el lenguaje de programación usado, IDE, y Extensiones que usamos en el proyecto.

Inicialmente, Java fue el lenguaje de programación elegido por petición y requisito para desarrollar el proyecto por indicaciones del Profesor.
Por otro lado, optamos por usar Visual Studio Code por su versatilidad en extensiones, modernidad y sencilles de uso. Dentro de Visual Studio Code, realizamos una configuración sencilla a traves de una extensión llamada Java Pack.
Con esta, logramos ejecutar Java nativamente desde Visual Studio Code. ¡Algo nunca antes visto! 

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- Comienzo de la explicación general -->
<a name="Paso-a-Paso"></a>
## Empecemos

A continuación nombraremos el paso a paso para realizar la instalación y configuración del IDE y extensiones.

### Prerequisitos
<a name="prerequisitos"></a>
1. Clonar el repositorio locamente en nuestra PC.
2. Debemos tener nuestro sistema operativo limpio de alguna versión anterior del <strong>JDK</strong> para lograr una configuración exitosa y evitar problemas a futuro.
3. Debemos descargar la ultima versión del <strong>JDK</strong>, que actualmente es la 22.0.1 a traves del siguiente link <a href="https://www.oracle.com/co/java/technologies/downloads/#java22" target="-blank">JDK 22.0.1</a>.
4. Debemos descargar el Framework de <strong>Apache Maven</strong>, en la versión 3.9.7, a traves del siguiente link <a href="https://maven.apache.org/download.cgi" target="_blank">Apache Maven 3.9.7</a>.
5. Debemos descargar el <strong>IDE Visual Studio Code</strong> en su ultima versión, a traves del siguiente link <a href="https://code.visualstudio.com/" target="_blank">Visual Studio Code</a>.

### Instalación
<a name="instalación"></a>
1. Ejecutaremos el .exe del <strong>JDK</strong> primeramente, luego de ello, debemos seguir las instrucciones del instalador y dejando la ruta de instalación de manera predeterminada.
2. Vamos a descomprimir la carptea .zip del Apache Maven, y a continuación, copiaremos la carpeta extraida en la misma ruta donde se instaló el <strong>JDK</strong>, pero evitando entrar a la carpeta del <strong>JDK</strong>.
3. Instalaremos el <strong>IDE Visual Studio Code</strong> como en el primer caso, dejaremos todo de manera predeterminada y al finalizar, nos pedirá si queremos añadirlo al <strong>Path</strong>, lo cual seleccionaremos que si, y luego, se nos abrirá automaticamente <strong>Visual Studio Code</strong>.
  

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- Espacio para explicar la configuración de los recursos de desarrollo -->
## Configuración
<a name="readme-top"></a>
1. Iremos a las variables de entorno en nuestro PC, una vez ahí, iremos a la casilla de Variables del Sistema y crearemos una nueva variable llamada <strong>JAVA_HOME</strong> y en el valor de la variable, pondremos la ruta de instalación de nuestro JDK seleccionando la carpeta llamada <strong>jdk-22</strong>.

<div align="center">
  <img src="https://github.com/CruzAngell/BeeGame/blob/main/src/doc/img/Explicacion-JDK.jpg" alt="Imagen Alusiva">
</div>

2. Ahora, dentro del mismo recuadro de Variables del Sistema, seleccionaremos Path y luego daremos en Editar, una vez adentro, crearemos dos nuevas variables añadiendo las rutas bin del <strong>JDK</strong> junto al <strong>Apache Maven</strong>. Una vez tengamos estas dos variables, las moveremos a los primeros lugares de la lista de variables, preferiblemente el <strong>JDK</strong> en primer lugar, y el <strong>Apache Maven</strong>, en segundo lugar.

<div align="center">
  <img src="https://github.com/CruzAngell/BeeGame/blob/main/src/doc/img/Explicacion-Path.jpg" alt="Imagen Alusiva">
</div>

3. Despues, iremos a <strong>Visual Studio Code</strong>, al apartado de Extensiones, y buscaremos <strong>Extension Pack for Java</strong> para luego instalar la misma.
4. Desde <strong>Visual Studio Code</strong>, a traves del nuevo Modulo de <strong>Java Projects</strong> o <strong>Maven</strong> abriremos la carpeta que clonamos con anterioridad, una vez la abramos, empezará a cargar el proyecto y la extensión de Java. Una vez haya cargado, debemos de dirigirnos a la siguiente ruta src/JuegoAbejasGUI.java y ejecutar el mismo, tras ejecutarlo, veremos la interfaz alpha de <strong>Abejita vuelve a tu Panal</strong>.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- Explicación de las pruebas Unitarias y Documentación HTML -->
## Pruebas
<a name="readme-top"></a>
* En este caso, desarrollamos las pruebas unitarias con <strong>JUnit</strong>. A continuación, se explicará a detalle como hacerlo apoyado con un video.
1. Cuando estemos adentro del proyecto de Java, iremos al apartado de Pruebas, que se representa con un icono de un frasco de quimicos, tras entrar a ese apartado, presionaremos en el botón azul que dice <strong>Enable Java Test</strong>, despues, se nos habilitará el <strong>Framework</strong> a elegir para realizar las pruebas, en este caso, seleccionaremos <strong>JUnit</strong>. Tras seleccionarlo, debemos desplegar los aprtados de los Test a las pruebas y ejecutarlo, y automaticamente las pruebas iniciarán y arrojarán el resultado en la consola y en pantalla.
El siguiente video, se puede usar de recurso audiovisual. <a href="https://www.youtube.com/watch?v=q35b9pjX_j8">Video Explicativo</a>

El resultado que buscamos, es el siguiente

<div align="center">
  <img src="https://github.com/CruzAngell/BeeGame/blob/main/src/doc/img/Explicacion-Test.jpg" alt="Imagen Alusiva">
</div>

Con lo anterior, tenemos la explicación de como realizar las pruebas unitarias, en este caso, de las preguntas que vamos a presentar en el juego.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- Espacio para explicar como se realiza la documentación con Javadoc -->
## Documentación
<a name="readme-top"></a>
A continuación, se explicará como generar la documentación en formato HTML del código del juego.

1. Debemos asegurarnos de que cada clase y método tenga comentarios Javadoc adecuados, básicamente, comentar el código, para así mostrar lo que hace cada parte del mismo.
2. Debemos guardar todos los cambios realizados en el documento principal del cual queremos generar la documentación.
3. Ejecutaremos el siguiente comando en nuestra consola de <strong>Visual Studio Code</strong> y automaticamente se creará una nueva carpeta en src llamada <strong>doc</strong>, en la cual, estará toda la documentación del código en <strong>HTML</strong>usando <trong>Javadoc</strong>.
   * javadoc
  ```sh
  javadoc -d doc JuegoAbejasGUI.java
  ```

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- CONTACT -->
## Conclusión
<a name="conclusion"></a>
Llegamos al final de la documentación, y con los pasos explicados anteriormente, podrás ejecutar el videojuego en cualquier PC sin ninguna complicación. Recuerda que lo que presentamos anteriormente, fue desde una instalación totalmente limpia de cada framekork e IDE usado.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>
