package android.univ.fr.weathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkButton = findViewById<Button>(R.id.CheckButton)

        /*checkButton.setOnClickListener {
            val location = locationEditText.text.toString()
            val tent = Intent(this@MainActivity,SecondActivity::class.java)
            tent.putExtra("Location", location)
            startActivity(tent)
        }*/

        checkButton.setOnClickListener {

            val locationEditText = findViewById<EditText>(R.id.addLocation)
            val location = locationEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, location)
            }
            startActivity(intent)
        }

        }
    }




