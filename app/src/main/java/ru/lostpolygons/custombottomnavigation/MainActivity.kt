package ru.lostpolygons.custombottomnavigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CustomBottomNavigation.BottomListener {
    override fun onRadioClick() {
        Toast.makeText(this,"Click menu 1", Toast.LENGTH_SHORT).show()
    }

    override fun onProgramClick() {
        Toast.makeText(this,"Click menu 2", Toast.LENGTH_SHORT).show()
    }

    override fun onNewsClick() {
        Toast.makeText(this,"Click menu 3", Toast.LENGTH_SHORT).show()
    }

    override fun onCompetitionClick() {
        Toast.makeText(this,"Click menu 4", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setBottomListener(this)

    }
}
