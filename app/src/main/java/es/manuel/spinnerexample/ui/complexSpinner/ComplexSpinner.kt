package es.manuel.spinnerexample.ui.complexSpinner

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import es.manuel.spinnerexample.data.entity.Planet
import es.manuel.spinnerexample.databinding.ActivityComplexSpinnerBinding


class ComplexSpinner : AppCompatActivity() {

    private val binding: ActivityComplexSpinnerBinding by lazy {
        ActivityComplexSpinnerBinding.inflate(layoutInflater)
    }

    private val viewModel: ComplexSpinnerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews() {
        setupSpinner()
        binding.btnComplexSpinnerShow.setOnClickListener { showSnackBar() }
    }

    private fun setupSpinner() {
        val spinnerAdapter =
            ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                viewModel.planets
            ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }

        binding.spnComplexSpinnerPlanets.apply {
            adapter = spinnerAdapter
            onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    showSnackBar()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }

            }
        }
    }

    private fun showSnackBar() {
        val planet = binding.spnComplexSpinnerPlanets.selectedItem as Planet
        Snackbar.make(
            binding.root,
            planet.toString(),
            Snackbar.LENGTH_LONG
        ).show()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ComplexSpinner::class.java)
        }
    }
}