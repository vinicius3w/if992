<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selecione as opções</title>
    </head>
    <body>
        <H1>Quais atividades esportivas você pratica?</H1>
    <form action="GetParameterValuesServlet" method="get">
        <input type="checkbox" name="sports" value="Dama"> Dama
        <br/>
        <input type="checkbox" name="sports" value="Domino"> Dominó
        <br/>
        <input type="checkbox" name="sports" value="Truco"> Truco
        <br/>
        <input type="checkbox" name="sports" value="Levantamento de copo"> Levantamento de copo
        <br/>
        <input type="checkbox" name="sports" value="Outros"> Outros
        <br/>
        <input type="submit">
    </form>
    </body>
</html>