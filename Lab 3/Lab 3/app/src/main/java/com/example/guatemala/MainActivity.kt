package com.example.guatemala

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun mostrarTexto(view: View) {

        val boton: ImageButton = findViewById<ImageButton>(R.id.BotonEstrella)
        val ingresado: EditText = findViewById(R.id.NombreIngresado)
        val resultado: TextView = findViewById<TextView>(R.id.Resultado)
        val nombre: TextView = findViewById<TextView>(R.id.EtiquetaNombre)

        var contador = 1
        boton.setOnClickListener {

            contador = contador + 1
            if (contador % 2 != 0) {


                nombre.visibility = View.VISIBLE
                ingresado.visibility = View.VISIBLE
                resultado.setText(ingresado.text.toString())
            } else {
                nombre.visibility = View.INVISIBLE
                ingresado.visibility = View.INVISIBLE


                resultado.setText(ingresado.text.toString())
            }

        }
    }

    //Extraído de: https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
    fun abrirBotonTikal(view: View) {

        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion",
            Descripcion(
                "Virus",
                "Los coronavirus son una familia de virus que se descubrió en la década de los 60 pero cuyo origen es todavía desconocido. Sus diferentes tipos provocan distintas enfermedades, desde un resfriado hasta un síndrome respiratorio grave (una forma grave de neumonía).",
                "¿Qué es el Coronavirus?"
            )
        )
        startActivity(intento)

    }


    fun abrirSemuc(view: View) {
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion",
            Descripcion(
                "Síntomas",
                "En general, los síntomas principales de las infecciones por coronavirus pueden ser los siguientes. Dependerá del tipo de coronavirus y de la gravedad de la infección:\n" +
                        "\n" +
                        "    Tos.\n" +
                        "     \n" +
                        "    Dolor de garganta.\n" +
                        "     \n" +
                        "    Fiebre.\n" +
                        "     \n" +
                        "    Dificultad para respirar (disnea).\n" +
                        "     \n" +
                        "    Dolor de cabeza.\n" +
                        "     \n" +
                        "    Escalofríos y malestar general.\n" +
                        "     \n" +
                        "    Secreción y goteo nasal.\n",
                "¿Cuáles son los síntomas?"
            )
        )
        startActivity(intento)

    }

    fun abrirAntigua(view: View) {
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion", Descripcion(
                "Indicaciones",
                "" +
                        "\n" +
                        "Usar mascarrilla, gel, y lavarse las manos constantemente.",
                "¿Cuáles son las indicaciones?"
            )
        )
        startActivity(intento)
    }

    fun backear(view: View) {
        val boton:Button = findViewById<Button>(R.id.back)
        val ingresdo:TextView = findViewById<TextView>(R.id.ComentarioIngresado)
        boton.setOnClickListener {

            Toast.makeText(this, "No puede disminuir abajo de cero", Toast.LENGTH_LONG).show()
            val intento: Intent = Intent(this, MainActivity::class.java)
            startActivity(intento)
        }



    }


}




