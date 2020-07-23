#language: pt
#encoding: utf-8

Funcionalidade: Gerenciamento dos Usuarios
  Como um administrador do site, eu quero criar, consultar, alterar e excluir outros usuarios

  Esquema do Cenario: Criar Usuario
    Dado que envio uma requisicao com <username> <firstname> <lastname> <email> <password> <phone> <userStatus>
    Entao recebo uma resposta de sucesso com o <statusCode>

    Exemplos:
      | username   | firstname | lastname | email             | password | phone        | userStatus | statusCode |
      | "jucaNF"   | "Juca"    | "NF"     | "jucanm@test.com" | "123456" | "1199990001" | 1          | 200        |
      | "anaNF"    | "Ana"     | "NF"     | "ananm@test.com"  | "654321" | "1199990002" | 1          | 200        |