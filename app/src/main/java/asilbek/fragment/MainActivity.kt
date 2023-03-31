package asilbek.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asilbek.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.container,HomeFragment())
            .commit()
    }
}