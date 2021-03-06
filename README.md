# biblia API

Implementação de uma API, para fornecer informações sobre as biblias, seus respectivos capitulos e versos.

<br><br>

## Mer

<!-- add local image -->
<img src="resources/mer.png" alt="mer" width="100%">

* Pode exister mais de uma biblia ou livro
* Cada Livro possui 1 ou mais capitulos, que foram escritos por escritores;
* Cada livro, possui 1 ou mais versos, que são uma historía dividida em vários pedaços.

<br><br>

## Endpoints

<table>
    <tr>
        <th>Endpoint</th>
        <th>Método</th>
        <th>Descrição</th>
    </tr>
    <tr>
        <td>/livros</td>
        <td>GET</td>
        <td>Retorna todos os livros disponíveis</td>
    </tr>
    <tr>
        <td>/livros/{idLivro}/</td>
        <td>GET</td>
        <td>Retorna um livro especifico</td>
    </tr>
    <tr>
        <td>/livros/{idLivro}/capitulos</td>
        <td>GET</td>
        <td>Retorna todos os capitulos do livro</td>
    </tr>
    <tr>
        <td>/livros/{idCapitulo}/versos</td>
        <td>GET</td>
        <td>Retorna todos os versos de um capitulo</td>
    </tr>
<table>

<br><br>

## Tecnologias

* Java
* Spring Boot
* JPA
* Hibernate
* H2 Database

