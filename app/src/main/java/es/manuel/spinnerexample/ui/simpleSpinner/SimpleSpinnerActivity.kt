package es.manuel.spinnerexample.ui.simpleSpinner

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.google.android.material.snackbar.Snackbar
import es.manuel.spinnerexample.databinding.ActivitySimpleSpinnerBinding

class SimpleSpinnerActivity : AppCompatActivity() {
    private val binding: ActivitySimpleSpinnerBinding by lazy {
        ActivitySimpleSpinnerBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
    }

    // TODO Hacer que el snackbar no se muestre al inicio de la actividad
    override fun onResume() {
        super.onResume()
        setupViewsOnStart()
    }

    private fun setupViewsOnStart() {
        binding.spnSimpleSpinnerPlanets.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
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

    private fun setupViews() {
        binding.btnSimpleSpinnerShow.setOnClickListener {
            showSnackBar()
        }
    }

    private fun showSnackBar() {
        val planet = binding.spnSimpleSpinnerPlanets.selectedItem as String
        Snackbar.make(
            binding.root,
            planet,
            Snackbar.LENGTH_LONG
        ).show()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, SimpleSpinnerActivity::class.java)
        }
    }
}