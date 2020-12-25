package es.manuel.spinnerexample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.manuel.spinnerexample.ui.simpleSpinner.SimpleSpinnerActivity
import es.manuel.spinnerexample.databinding.ActivityMainBinding
import es.manuel.spinnerexample.ui.complexSpinner.ComplexSpinner

class ActivityMain : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews() {
        binding.btnMainToSimpleSpinner.setOnClickListener {
            navigateToSimpleSpinner()
        }

        binding.btnMainToComplexSpinner.setOnClickListener {
            navigateToComplexSpinner()
        }
    }

    private fun navigateToSimpleSpinner() {
        val dataIntent = SimpleSpinnerActivity.newIntent(this)
        startActivity(dataIntent)
    }

    private fun navigateToComplexSpinner() {
      val dataInent = ComplexSpinner.newIntent(this)
        startActivity(dataInent)
    }
}