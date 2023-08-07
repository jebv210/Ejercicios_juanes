package com.jebv210.ejercicio_juanes
import java.io.PrintStream
import java.io.ByteArrayOutputStream
import kotlin.random.Random

class taller_1 {
}
fun main() {
    System.setErr(PrintStream(ByteArrayOutputStream()))
    /*telefono
    print("Ingrese la cantidad de notificaciones: \n")
    val num: Int = readLine()!!.toInt()

    if (num < 100 && num >=1){ print("Tienes ${num} notificaciones")
    } else if (num >= 100) { print("Tienes 99+ notificaciones")
    } else { print("No hay mensajes")}*/
    /*reproduccion de musica
    val musica: MutableList<List<Any>> = mutableListOf()
    print("Ingrese el nombre del genero o tipo de musica para el album: \n")
    var genero: String = readLine()!!.toString()

    print("Ingrese la cantidad de canciones que quiere: \n")
    val num: Int = readLine()!!.toInt()

    var i = 1


    while (i <= num) {
        print("Ingrese el nombre de la cancion: \n")
        val cancion: String = readLine()!!.toString()
        print("Ingrese el nombre del artista: \n")
        val artista: String = readLine()!!.toString()
        print("Ingrese el año de publicacion: \n")
        val fecha: String = readLine()!!.toString()
        print("Ingrese la cantidad de reproducciones que tuvo la cancion: \n")
        val reproduccion: Int = readLine()!!.toInt()

        val dato = listOf(cancion, artista, fecha, reproduccion)

        musica.add(dato)

        i++

    }

    for (i in 0 until musica.size) {
        print("cancion ${i+1} tiene ${musica[i][3]} reproducciones\n")
    }
    val musicapopular = musica.maxByOrNull { (it[3] as Int) }
    print("la musica mas conocida es: ${musicapopular} \n")

    var o = 0
    while (o <= musica.size) {
        val mus = musica[o][3] as? Int

        if (mus != null && mus<= 1000) {
            print("musica menos popular: ${musica[o]}\n")


        } else {
            print("musica mas popular: ${musica[o]}\n")

        }
        println("La cancion ${musica[o][0]}, interpretada por ${musica[o][1]}, se lanzó en ${musica[o][2]}, ${musica[o][3]} reproducciones.")
        o++
    }*/
    /*SUBASTA
    val random = Random
    var participante: Int
    var bot: Int
    var bot2: Int
    var subasta: Int

    val objetos = arrayOf("Moto", "Florero", "gokart", "PC","Nintendo")

    for (i in 0 until objetos.size) {
        println("El objeto #${i + 1} a la venta es: ${objetos[i]}")
        subasta = (5000..8000).random()
        println("La venta empieza en ${subasta}")
        println("Cuanto das para la subastas?: ")
        participante = readLine()?.toInt() ?: 0
        bot = (7000..15000).random()
        println("El bot subastó: $bot")
        bot2 = (7000..15000).random()
        println("El bot 2 subastó: $bot2")

        if (participante > bot && participante > bot2) {
            println("Ganaste con $participante, el bot propuso $bot")
            println("Te llevas el objeto #${i + 1} el cual es: ${objetos[i]}")
        } else if ( bot > participante && bot > bot2) {
            println("El bot 1 gana con $bot")
            println("Te llevas el objeto #${i + 1} el cual es: ${objetos[i]}")
        } else if ( bot2 > participante && bot2 > bot) {
            println("El bot 2 gana con $bot2")
            println("Te llevas el objeto #${i + 1} el cual es: ${objetos[i]}")
        }else {
            println("El objeto se va a la casa")
        }
    }*/
    /*RESTAURANTE
    print("Bienvenido a un restaurante: \n")

    val entrada: MutableList<List<Any>> = mutableListOf()
    val fuerte: MutableList<List<Any>> = mutableListOf()
    val postres: MutableList<List<Any>> = mutableListOf()
    val bebidas: MutableList<List<Any>> = mutableListOf()
    while (true) {
        print(
            "Digite: \n" +
                    "1. Si desea agregar un plato\n " +
                    "2. Mostar los platos\n" +
                    "3. mostrar platos por codigo\n" +
                    "4. Modificar el menu\n " +
                    "5. Modificar el plato\n" +
                    "6. Elminar un plato\n" +
                    "7. Para salir del programa\n"
        )
        val opcion: Int = readLine()!!.toInt()
        when (opcion) {
            1 -> {
                while (true) {
                    print("ingrese el nombre del plato o bebida:\n")
                    val nombre: String = readLine()!!.toString()
                    print("ingrese la descripcion del plato o bebida:\n")
                    val descripcion: String = readLine()!!.toString()
                    print("ingrese el precio del plato o bebida:\n")
                    val precio: Int = readLine()!!.toInt()

                    print(
                        "A cual categoria le quiere agregar un plato o bebida:\n" +
                                "1. Entradas\n" +
                                "2. Platos Fuertes\n" +
                                "3. Postres\n" +
                                "4. Bebidas\n"
                    )
                    val categoria: Int = readLine()!!.toInt()
                    val orden = listOf(nombre, descripcion, precio)

                    when (categoria) {
                        1 -> {
                            entrada.add(orden)
                            print("Ya esta el plato\n")
                        }

                        2 -> {
                            fuerte.add(orden)
                            print("Ya esta el plato\n")
                        }

                        3 -> {
                            postres.add(orden)
                            print("Ya esta el postre\n")
                        }

                        4 -> {
                            bebidas.add(orden)
                            print("Ya esta la bebida\n")
                        }

                        else -> {
                            print("Reintente error en agregar plato")
                        }
                    }
                    print("Desea Ingresar otro plato: \n")
                    val eleccion: String = readLine()!!.toString().lowercase()
                    if (eleccion == "no") {
                        break
                    }
                }
            }

            2 -> {
                print(
                    "Consulta general:\n"
                )

                print("Platos de entrada: \n")
                print("${entrada}\n")

                print("Platos fuertes: \n")
                print("${fuerte}\n")

                print("Postres:\n")
                print("${postres}\n")

                print("Bebidas:\n")
                print("${bebidas}\n")
            }

            3 -> {
                print(
                    "Consulta de platos por codigo:\n" +
                            "Cual categoria desea consultar:\n" +
                            "1. Entradas\n" +
                            "2. Platos Fuertes\n" +
                            "3. Postres\n" +
                            "4. Bebidas\n"
                )
                val categoria: Int = readLine()!!.toInt()
                when (categoria) {
                    1 -> {
                        print("Platos de entrada: \n")
                        print("${entrada}\n")
                    }

                    2 -> {
                        print("Platos fuertes: \n")
                        print("${fuerte}\n")
                    }

                    3 -> {
                        print("Postres:\n")
                        print("${postres}\n")
                    }

                    4 -> {
                        print("Bebidas:\n")
                        print("${bebidas}\n")
                    }

                    else -> {
                        print("Reintente error en consultar plato")
                        print("\n")
                    }
                }
            }

            4 -> {
                print("Primero se debera modificar el plato para que se modifique el menu")

                print("Platos de entrada: \n")
                print("${entrada}\n")

                print("Platos fuertes: \n")
                print("${fuerte}\n")

                print("Postres:\n")
                print("${postres}\n")

                print("Bebidas:\n")
                print("${bebidas}\n")
            }

            5 -> {
                print(
                    "Modificar el plato:\n" +
                            "Cual categoria desea modificar para el plato:\n" +
                            "1. Entradas\n" +
                            "2. Platos Fuertes\n" +
                            "3. Postres\n" +
                            "4. Bebidas\n"
                )
                val categoria: Int = readLine()!!.toInt()
                when (categoria) {
                    1 -> {
                        print("Platos de entrada: \n")
                        print("${entrada}\n")
                        print("Digite el  nombre del plato de entrada: \n")
                        val nombre: String = readLine()!!.toString().toLowerCase()
                        for (i in 0 until entrada.size) {
                            if (entrada[i][0] == nombre){
                                print("funcina\n")
                                val indiceentrada = entrada.indexOfFirst { it.first() == nombre }
                                if (indiceentrada != -1) {
                                    // Modificar los datos
                                    print("ingrese el nombre del plato o bebida:\n")
                                    val mnombre: String = readLine()!!.toString()
                                    print("ingrese la descripcion del plato o bebida:\n")
                                    val mdescripcion: String = readLine()!!.toString()
                                    print("ingrese el precio del plato o bebida:\n")
                                    val mprecio: Int = readLine()!!.toInt()
                                    entrada[indiceentrada] = listOf(mnombre, mdescripcion, mprecio)

                                    // Imprimir la lista actualizada
                                    entrada.forEach { (mnombre, mdescripcion, mprecio) ->
                                        println("$mnombre, $mdescripcion, $mprecio")
                                    }
                                } else {
                                    println("No se encontró en la lista.")
                                }
                            }
                        }
                    }

                    2 -> {
                        print("Platos fuertes: \n")
                        print("${fuerte}\n")
                        print("Digite el  nombre del plato de fuerte: \n")
                        val nombre: String = readLine()!!.toString().toLowerCase()
                        for (i in 0 until fuerte.size) {
                            if (fuerte[i][0] == nombre){
                                print("funcina\n")
                                val indicefuerte = fuerte.indexOfFirst { it.first() == nombre }
                                if (indicefuerte != -1) {
                                    // Modificar los datos
                                    print("ingrese el nombre del plato o bebida:\n")
                                    val mnombre: String = readLine()!!.toString()
                                    print("ingrese la descripcion del plato o bebida:\n")
                                    val mdescripcion: String = readLine()!!.toString()
                                    print("ingrese el precio del plato o bebida:\n")
                                    val mprecio: Int = readLine()!!.toInt()
                                    fuerte[indicefuerte] = listOf(mnombre, mdescripcion, mprecio)

                                    // Imprimir la lista actualizada
                                    fuerte.forEach { (mnombre, mdescripcion, mprecio) ->
                                        println("$mnombre, $mdescripcion, $mprecio")
                                    }
                                } else {
                                    println("No se encontró en la lista.")
                                }
                            }
                        }
                    }

                    3 -> {
                        print("Postres:\n")
                        print("${postres}\n")
                        print("Digite el  nombre del postre: \n")
                        val nombre: String = readLine()!!.toString().toLowerCase()
                        for (i in 0 until postres.size) {
                            if (postres[i][0] == nombre){
                                print("funcina\n")
                                val indicepostres = postres.indexOfFirst { it.first() == nombre }
                                if (indicepostres != -1) {
                                    // Modificar los datos
                                    print("ingrese el nombre del plato o bebida:\n")
                                    val mnombre: String = readLine()!!.toString()
                                    print("ingrese la descripcion del plato o bebida:\n")
                                    val mdescripcion: String = readLine()!!.toString()
                                    print("ingrese el precio del plato o bebida:\n")
                                    val mprecio: Int = readLine()!!.toInt()
                                    postres[indicepostres] = listOf(mnombre, mdescripcion, mprecio)

                                    // Imprimir la lista actualizada
                                    postres.forEach { (mnombre, mdescripcion, mprecio) ->
                                        println("$mnombre, $mdescripcion, $mprecio")
                                    }
                                } else {
                                    println("No se encontró en la lista.")
                                }
                            }
                        }
                    }

                    4 -> {
                        print("Bebidas:\n")
                        print("${bebidas}\n")
                        print("Digite el  nombre de la bebida: \n")
                        val nombre: String = readLine()!!.toString().toLowerCase()
                        for (i in 0 until bebidas.size) {
                            if (bebidas[i][0] == nombre){
                                print("funcina\n")
                                val indicebebidas = bebidas.indexOfFirst { it.first() == nombre }
                                if (indicebebidas != -1) {
                                    // Modificar los datos
                                    print("ingrese el nombre del plato o bebida:\n")
                                    val mnombre: String = readLine()!!.toString()
                                    print("ingrese la descripcion del plato o bebida:\n")
                                    val mdescripcion: String = readLine()!!.toString()
                                    print("ingrese el precio del plato o bebida:\n")
                                    val mprecio: Int = readLine()!!.toInt()
                                    bebidas[indicebebidas] = listOf(mnombre, mdescripcion, mprecio)

                                    // Imprimir la lista actualizada
                                    bebidas.forEach { (mnombre, mdescripcion, mprecio) ->
                                        println("$mnombre, $mdescripcion, $mprecio")
                                    }
                                } else {
                                    println("No se encontró en la lista.")
                                }
                            }
                        }
                    }

                    else -> {
                        print("Reintente error en consultar plato")
                        print("\n")
                    }
                }
            }

            6 -> {
                print("Eliminar el plato")
                print("Cual categoria desea eliminar para el plato:\n" +
                        "1. Entradas\n" +
                        "2. Platos Fuertes\n" +
                        "3. Postres\n" +
                        "4. Bebidas\n")
                val categoria: Int = readLine()!!.toInt()
                when (categoria) {
                    1 -> {
                        val o=0
                        print("Platos de entrada: \n")
                        print("${entrada}\n")
                        print("Digite el nombre del Plato de entrada que desea eliminar: \n")
                        val eliminar: String = readLine()!!.toString()
                        entrada.removeIf { it.first() == eliminar }/* eliminará todos los elementos cuyo nombre coincida con el valor de eliminar*/
                        print("eliminado")
                    }

                    2 -> {
                        print("Platos fuertes: \n")
                        print("${fuerte}\n")
                        print("Digite el nombre del Plato de entrada que desea eliminar: \n")
                        val eliminar: String = readLine()!!.toString()
                        fuerte.removeIf { it.first() == eliminar }/* eliminará todos los elementos cuyo nombre coincida con el valor de eliminar*/
                        print("eliminado")
                    }

                    3 -> {
                        print("Postres:\n")
                        print("${postres}\n")
                        print("Digite el nombre del Plato de entrada que desea eliminar: \n")
                        val eliminar: String = readLine()!!.toString()
                        postres.removeIf { it.first() == eliminar }/* eliminará todos los elementos cuyo nombre coincida con el valor de eliminar*/
                        print("eliminado")
                    }

                    4 -> {
                        print("Bebidas:\n")
                        print("${bebidas}\n")
                        print("Digite el nombre del Plato de entrada que desea eliminar: \n")
                        val eliminar: String = readLine()!!.toString()
                        bebidas.removeIf { it.first() == eliminar }/* eliminará todos los elementos cuyo nombre coincida con el valor de eliminar*/
                        print("eliminado")
                    }

                    else -> {
                        print("Reintente error en consultar plato")
                        print("\n")
                    }
                }
            }

            7 -> {
                print("Desea Salir: \n")
                val eleccion: String = readLine()!!.toString().lowercase()
                if (eleccion == "si") {
                    break
                }
            }
        }
    }*/
    /*NEQUI
    var i = 0
    var o = 3
    var cuenta = 4500

    while (i in 0..3) {
        print("Ingrese número de celular: \n")
        var num: String = readLine()!!
        print("Ingrese clave: \n")
        var clave: String = readLine()!!

        if (num == "3145968482" && clave == "1234") {
            println("Inicio de sesión exitoso\n")
            println("Su saldo disponible es de ${cuenta}\n")
            while (true) {
                println(
                    "Por favor digite:\n" +
                            "1. Para hacer un retiro\n" +
                            "2. Enviar dinero\n" +
                            "3. Recargas\n" +
                            "4. Salir\n"
                )

                var opc: Int = readLine()!!.toInt()

                when (opc) {
                    1 -> {
                        print(
                            "Escoja para retirar: \n" +
                                    "1. Cajero\n" +
                                    "2. Punto físico\n"
                        )
                        var opc: Int = readLine()!!.toInt()

                        when (opc) {
                            1 -> {
                                while (true) {
                                    if (cuenta < 2000) {
                                        print("No te alcanza\n")
                                        break
                                    } else {
                                        print("Cuánto desea retirar:\n")
                                        var retiro: Int = readLine()!!.toInt()
                                        var total = cuenta - retiro

                                        if (total < 0) {
                                            print("Su retiro va más allá de lo que tiene\n")
                                            cuenta = cuenta
                                        } else {
                                            val codigo = (100000..999999).random()
                                            print("Retiro exitoso, tenga su código de retiro ${codigo} y lo que le queda es ${total}\n")
                                            cuenta = total
                                            break
                                        }
                                    }
                                }
                            }

                            2 -> {
                                while (true) {
                                    if (cuenta < 2000) {
                                        print("No te alcanza")
                                    } else {
                                        print("Cuánto desea retirar:")
                                        var retiro: Int = readLine()!!.toInt()
                                        var total = cuenta - retiro

                                        if (total < 0) {
                                            print("Su retiro va más allá de lo que tiene")
                                            cuenta = cuenta
                                        } else {
                                            val codigo = (100000..900000).random()
                                            print("Retiro exitoso, tenga su código de retiro ${codigo} y lo que le queda es ${total}\n")
                                            cuenta = total
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }

                    2 -> {
                        print("Número a quien le envía dinero:\n")
                        var numCom: String = readLine()!!

                        print("Cuánto desea enviar:\n")
                        var envio: Int = readLine()!!.toInt()
                        var total = cuenta - envio

                        if (total < 0) {
                            print("Su envío va más allá de lo que tiene, no se puede realizar\n")
                            cuenta = cuenta
                        } else {
                            print("Envío exitoso a ${numCom}, su cantidad de dinero es ${total}\n")
                            cuenta = total
                        }
                    }

                    3 -> {
                        print("Cuanto va a recargar:\n")
                        var recarga: Int = readLine()!!.toInt()
                        val total = recarga + cuenta
                        cuenta = total

                        print("Ahora tiene: ${cuenta}\n")

                    }

                    4 -> {
                        print("Hasta luego\n")
                        break
                    }
                }
            }
        } else {
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes ${o} intentos más")
        }
        o--
        i++
    }*/
}



