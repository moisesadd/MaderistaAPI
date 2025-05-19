----------------------------------------
DOCUMENTACIÓN DE LA API – Maderista
----------------------------------------

BASE URL:
http://localhost:8080

REQUISITOS PREVIOS:
- Se debe crear una base de datos con el nombre "carpinteria".
- El programa se encargará de generar las tablas necesarias automáticamente.
- Modificar el archivo "application.properties" con las credenciales de la base de datos:
  - Usuario y contraseña si aplica.
  - Si la base de datos no tiene contraseña, dejar el campo vacío.

----------------------------------------
ENDPOINTS DISPONIBLES
----------------------------------------

PRODUCTOS:
1 Crear un producto:
   - Método: POST
   - URL: /productos
   - Body (JSON):
     {
       "nombre": "Silla de madera",
       "descripcion": "Silla artesanal con respaldo alto",
       "precio": 300.000,
       "imagenUrl": "http://imagen.com/imagen.jpg"
     }
   - Respuesta: 201 Created

2 Obtener todos los productos:
   - Método: GET
   - URL: /productos
   - Respuesta: 200 OK – Lista de productos

3 Obtener producto por ID:
   - Método: GET
   - URL: /productos/{id}
   - Respuesta: 200 OK o 404 Not Found

4 Eliminar producto por ID:
   - Método: DELETE
   - URL: /productos/{id}
   - Respuesta: 204 No Content o 404 Not Found

----------------------------------------

COTIZACIONES:
1 Enviar solicitud de cotización:
   - Método: POST
   - URL: /cotizaciones
   - Body (JSON):
     {
       "clienteNombre": "Juan Pérez",
       "clienteEmail": "juan@email.com",
       "clienteTelefono": "123456789",
       "productosSolicitados": "Mesa, Silla",
       "comentarios": "Color oscuro, envío a domicilio"
     }
   - Respuesta: 200 OK

2 Obtener todas las cotizaciones:
   - Método: GET
   - URL: /cotizaciones
   - Respuesta: 200 OK – Lista de solicitudes

3 Eliminar cotización por ID:
   - Método: DELETE
   - URL: /cotizaciones/{id}
   - Respuesta: 204 No Content o 404 Not Found

----------------------------------------

CONTACTO:
1 Enviar mensaje de contacto:
   - Método: POST
   - URL: /contacto
   - Body (JSON):
     {
       "nombre": "Ana Martínez",
       "email": "ana@email.com",
       "mensaje": "Me interesa una cotización personalizada."
     }
   - Respuesta: 200 OK

----------------------------------------


