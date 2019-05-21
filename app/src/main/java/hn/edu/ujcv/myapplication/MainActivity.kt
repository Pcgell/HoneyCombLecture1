package hn.edu.ujcv.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            mensaje.text = "estamos levemente preocupados."
        }

        var  tv: TextView
        tv = findViewById(R.id.mensaje);
        tv.text ="ingrese su estado de animo"

    }

    fun onHappy(view : View){
        mensaje.text = "estamos contentos!!"
    }

    fun onShowAbout( view: View){
        val intent : Intent
        intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
