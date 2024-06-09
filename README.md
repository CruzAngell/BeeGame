<a name="readme-top"></a>
# BeeGame
Bee Game in Java using Visual Studio Code and Maven, Extension Java Pack.

En la siguiente documentación, se explicará paso a paso como clonar este repositorio para ejecutar una versión Alpha de BeeGame.

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de Contenido</summary>
  <ol>
    <li>
      <a href="#about-the-project">Sobre el Proyecto</a>
      <ul>
        <li><a href="#hecho-con">Hecho con</a></li>
      </ul>
    </li>
    <li>
      <a href="#paso-a-paso">Paso a Paso</a>
      <ul>
        <li><a href="#prerequisitos">Prerequisitos</a></li>
        <li><a href="#instalación">Instalación</a></li>
      </ul>
    </li>
    <li><a href="#configuración">Configuración</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contribuciones</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contacto</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Sobre el Proyecto

[![Product Name Screen Shot][product-screenshot]]((https://imgur.com/yeuUeJA)))

BeeGame o Abejita Vuelve a Tu Panal es un videojuego interacto desarrollado en Java utilizando Visual Studio Code, junto con Maven y la extensión Java Pack For Java.
Es un juego de responder preguntas acádemicas con varios niveles de dificultad.

Comentarios:
* El videojuego fue desarrollado en colaboración con 8 participantes en total, cada uno desarrolló partes importantes para la correcta funcionalidad del videojuego.
* Nuestra elección como IDE fue Visual Studio Code por su versatilidad, facilidad y poco consumo de recursos que usa este para su funcionamiento.
* Nos encontramos varios inconvenientes al momento del desarrollo, pero nada que no hayamos podido resolver. :smile:

Por supuesto, la siguiente documentación fue hecha en base a una versión Alpha del videojuego, pero con esto, el usuario final se dará una idea de como ejecutar correctamente el código en cualquier maquina.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



### Desarrollo

En esta sección, se nombrará el lenguaje de programación usado, IDE, y Extensiones que usamos en el proyecto.

Inicialmente, Java fue el lenguaje de programación elegido por petición y requisito para desarrollar el proyecto por indicaciones del Profesor.
Por otro lado, optamos por usar Visual Studio Code por su versatilidad en extensiones, modernidad y sencilles de uso. Dentro de Visual Studio Code, realizamos una configuración sencilla a traves de una extensión llamada Java Pack.
Con esta, logramos ejecutar Java nativamente desde Visual Studio Code. ¡Algo nunca antes visto! 

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- GETTING STARTED -->
## Empecemos

A continuación nombraremos el paso a paso para realizar la instalación y configuración del IDE y extensiones.

### Prerequisitos

1. Debemos tener nuestro sistema operativo limpio de alguna versión anterior del JDK para lograr una configuración exitosa y evitar problemas a futuro.
2. Debemos descargar la ultima versión del <strong>JDK</strong>, que actualmente es la 22.0.1 a traves del siguiente link <a href="https://www.oracle.com/co/java/technologies/downloads/#java22" target="-blank">JDK 22.0.1</a>.
3. Debemos descargar el Framework de <strong>Apache Maven</strong>, en la versión 3.9.7, a traves del siguiente link <a href="https://maven.apache.org/download.cgi" target="_blank">Apache Maven 3.9.7</a>.
4. Debemos descargar el <strong>IDE Visual Studio Code</strong> en su ultima versión, a traves del siguiente link <a href="https://code.visualstudio.com/" target="_blank">Visual Studio Code</a>.

### Instalación

1. Ejecutaremos el .exe del <strong>JDK</strong> primeramente, luego de ello, debemos seguir las instrucciones del instalador y dejando la ruta de instalación de manera predeterminada.
2. Vamos a descomprimir la carptea .zip del Apache Maven, y a continuación, copiaremos la carpeta extraida en la misma ruta donde se instaló el <strong>JDK</strong>, pero evitando entrar a la carpeta del <strong>JDK</strong>.
3. Instalaremos el <strong>IDE Visual Studio Code</strong> como en el primer caso, dejaremos todo de manera predeterminada y al finalizar, nos pedirá si queremos añadirlo al <strong>Path</strong>, lo cual seleccionaremos que si, y luego, se nos abrirá automaticamente <strong>Visual Studio Code</strong>.
  

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- Espacio para explicar la configuración de los recursos de desarrollo -->
## Configuración

1. Iremos a las variables de entorno en nuestro PC, una vez ahí, iremos a la casilla de Variables del Sistema y crearemos una nueva variable llamada <strong>JAVA_HOME</strong> y en el valor de la variable, pondremos la ruta de instalación de nuestro JDK seleccionando la carpeta llamada <strong>jdk-22</strong>.
2. Ahora, dentro del mismo recuadro de Variables del Sistema, seleccionaremos Path y luego daremos en Editar, una vez adentro, crearemos dos nuevas variables añadiendo las rutas bin del JDK junto al <strong>Apache Maven</strong>. Una vez tengamos estas dos variables, las moveremos a los primeros lugares de la lista de variables, preferiblemente el <strong>JDK</strong> en primer lugar, y el <strong>Apache Maven</strong>, en segundo lugar.

<p align="right">(<a href="#readme-top">regresar al inicio</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Add Changelog
- [x] Add back to top links
- [ ] Add Additional Templates w/ Examples
- [ ] Add "components" document to easily copy & paste sections of the readme
- [ ] Multi-language Support
    - [ ] Chinese
    - [ ] Spanish

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
