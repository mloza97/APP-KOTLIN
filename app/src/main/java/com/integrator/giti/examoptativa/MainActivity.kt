package com.integrator.giti.examoptativa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSliderAdapter = ImageSliderAdapter(this)

        main_image_.setSliderAdapter(imageSliderAdapter)
        main_image_.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        main_image_.startAutoCycle()

        imageSliderAdapter.renewItems(fetchSliderItemList())

        val objetivo = findViewById<CardView>(R.id.objetivo)
        val informacion = findViewById<CardView>(R.id.informacion)

        objetivo.setOnClickListener {

            val intent = Intent(this, ObjetivoActivity::class.java)
            startActivity(intent)

        }

        informacion.setOnClickListener {

            val intent = Intent(this, InformacionActivity::class.java)
            startActivity(intent)

        }

    }

    private fun fetchSliderItemList(): List<String> {
        val items = arrayListOf<String>()
        //pexels photos to be fetch from intenet
        items.add("https://www.basham.com.mx/wp-content/uploads/2020/06/NOTA1.png")
        items.add("https://garinetiquetas.com/blog/wp-content/uploads/2020/07/93B80542-E314-40A2-9D8B-9EEAD96BC2C4.jpeg")
        items.add("https://www.dof.gob.mx/imagenes_diarios/2019/10/11/MAT/seeco11_Cimg_161629.png")
        items.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTaZBNPvVVZBQflN6A-Al8MAZSfnUQkcEp4ew&usqp=CAU")
        return items
    }
}