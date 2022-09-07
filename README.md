# LABIETI2

### David Pérez Mejia

### Steps
* Creamos nuestra base de datos en atlas (MongoDB)
* Creamos nuestro usuario y contraseña.
* Le damos permiso a todas las ips de modificar nuestra database (Por motivos academicos, no recomendado en proyectos serios).
* Agregamos la dependencia de spring-data-mongodb.
* En application.propierties asignamos la variable de entorno de nuestra database
* Modificamos el codigo: https://github.com/CAPJackie/spring-boot-data-mongodb.

### PostMan Tests

## POST

Añadiendo un nuevo User
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/POSTMONGO1.jpg)
En mongoDB
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/POSTMONGO2.jpg)

## GET
GetALL trae todos los users en la database
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/GETALL.jpg)

GetByID
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/GETBYID.jpg)

## PUT

**El endpoint de put**
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/PUTMONGO1.jpg)
**Despues de editado**
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/PUTMONGO2.jpg)


## DELETE
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/DELETEMONGO2.jpg)
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/DELETEMONGO1.jpg)


## CHALLENGES

```
QUERY1
List<User> findByNameLikeOrLastnameLike(String queryText, String queryText2);
```

![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/CHALLENGE1.jpg)

```
QUERY2
List<User> findByCreatedAtAfter(LocalDate date);
```
![](https://github.com/DavidPZ666/LABIETI2/blob/master/img/CHALLENGE2.jpg)
