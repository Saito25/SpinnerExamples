package es.manuel.spinnerexample.ui.customSpinner

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import es.manuel.spinnerexample.R
import es.manuel.spinnerexample.databinding.ActivityCustomSpinnerBinding

class CustomSpinnerActivity : AppCompatActivity() {

    private val binding: ActivityCustomSpinnerBinding by lazy {
        ActivityCustomSpinnerBinding.inflate(layoutInflater)
    }

    private val viewModel: CustomSpinnerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews() {
        binding.spnCustomSpinnerPlanets.adapter =
            PlanetSpinnerAdapter(this, viewModel.planets)
    }


    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CustomSpinnerActivity::class.java)
        }
    }
}