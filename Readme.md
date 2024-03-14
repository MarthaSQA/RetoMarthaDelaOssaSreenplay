Proyecto Patron de Diseño Screenplay

Reto Screenplay SQA

Gestor de Dependencias Gradle
Objetivo

Crear un proyecto completo de Pruebas Automatizadas usando Java y Selenium, con el patron de diesño Screenplay.

Ingresar a la página https://www.bikesonline.com/ y automatizar 4 flujos, los cuales deben estar separados cada uno en un feature por aparte.

Observacion: La apertura del navegador, debe utilizar lectura de Excel para darle la URL de la página al proyecto.
Flujos

    El primer flujo debe realizar mínimo 3 búsquedas por la caja de texto de la página, y la data le debe ser enviada con data table desde el background.

    El segundo flujo debe realizar mínimo 5 búsquedas por la caja de texto de la página, y la data le debe ser enviada con examples desde el outline.

    El tercer flujo debe realizar mínimo 3 búsquedas por la caja de texto de la página, y la data le debe ser enviada con lectura de excel.

    El cuarto flujo debe ingresar a una categoría que contenga 10 o más productos, y seleccionar uno de los productos de forma aleatoria.

Se debe generar el reporte de SerenityBDD.

Está prohibido el uso de xpaths absolutos.

Está prohibido el uso Thread.sleep, en lugar de eso pueden usar esperas implícitas, preferiblemente el WaitUntil que nos proporciona Serenity Screenplay.