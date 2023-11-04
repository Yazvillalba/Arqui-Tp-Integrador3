
# ENDPOINTS DE CARRERA 


## Obtiene todas las carreras de la base de datos

### "/carreras"

![img.png](imagenes/img.png)


## Obtener carrera por ID
### "/carreras/id"
![img_1.png](imagenes/img_1.png)


## Agregar Carrera
### "/carreras/agregar/carrera"

*INSERTAR CAPTURA

## Eliminar Carrera
### "/carreras/delete/id"

*INSERTAR CAPTURA

## Obtener carreras por cantidad de inscriptos
### "/carreras/porcantInscriptos"

![img_4.png](imagenes/img_4.png)


# ENDPOINTS ESTUDIANTE

## Obtener todos los estudiantes
### "/estudiantes"

![img_2.png](imagenes/img_2.png)

## Obtener estudiante por Id que seria el dni
### "/estudiantes/id"

![img_5.png](imagenes/img_5.png)

## Obtener estudiantes por Genero
### "/estudiantes/genero/genero"
![img_3.png](imagenes/img_3.png)


## Obtener estudiantes por carrera y ciudad 
### "/estudiantes/carreraycuidad/TUDAI/Rauch"
![img_6.png](imagenes/img_6.png)

## Agregar Estudiante
### "/estudiantes/agregar/Estudiante"

## Elimiar Estudiante
### "/estudiantes/eliminar/id"

*CONSULTAS*

-[x] Cuando se obtiene carrera por id muestra en postman "estudiantes": vacio
-[ ] Probar el agregar carrera
-[ ] Probar el eliminar carrera
-[x] El por cantidad de inscriptos los id son todos 0
-[ ] AL REPORTE CARRERA LE FALTA LA QUERY CORRECTA
-[x] Obtener estudiante por id muestra en el postman las carreras vacias
-[ ] probar agregar estudiante
-[ ] probar eliminar estudiante
-[x] estudiantes por nro de libreta muestra carreras vacias
-[x] NO ANDA BUSCAR ESTUDIANTE POR CARRERA Y CIUDAD 
-[ ] FALTA MATRICULA CONTROLLER Y TODO DE MATRICULA
-[ ] Matricula all deberia tambien devolver el estudiante y la carrera
-[ ] Solucionar paths absolutos en el csv loader