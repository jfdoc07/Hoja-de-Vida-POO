<%-- 
    Document   : index
    Created on : 3/03/2026, 2:18:00 p. m.
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>Formulario</title>
    </head>
    <body>
    <h3>Formulario para generar tu hoja de vida</h3>
    <div>
        <form action="HojadeVidaServlet" method="post">
            <input type="text" name="nombre" id="nombre" placeholder="Escriba su nombre" required>
            <input type="text" name="profesion" id="profesion" placeholder="Escriba su profesión" required>
            <input type="email" name="correo" placeholder="Escriba su correo" required>
            <input type="number" name="telefono" placeholder="Digite su número de teléfono/contacto" required>
            <select name="tipodocumento" id="" required>
                <option value="" disabled selected>Seleccione su tipo de documento</option>
                <option value="CC">Cédula de ciudadanía</option>
                <option value="CE">Cédula de extranjería</option>
                <option value="Pasaporte">Pasaporte</option>
            </select>
            <input type="number" name="cedula" placeholder="Digite su número de documento" required>
            <textarea type="text" name="perfilprofesional" placeholder="Escriba su perfil profesional" required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="experiencialaboral"
                placeholder="Describa algunos cargos desempeñados con anterioridad" required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="formacionacademica" placeholder="Escriba su formación académica" required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="aptitudes" placeholder="Describa algunas aptitudes propias" required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="referenciaspersonales" placeholder="Describa algunas referencias personales"
                required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="referenciasprofesionales" placeholder="Describa algunas referencias profesionales"
                required spellcheck="true" rows="6"></textarea>
            <textarea type="text" name="idiomas" placeholder="Describa los idiomas que sepa hablar" required spellcheck="true" rows="6"></textarea>
            <input type="submit" value="Enviar datos">
        </form>
    </div>
</body>
</html>
