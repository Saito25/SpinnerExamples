        package es.manuel.spinnerexample.ui.customSpinner

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import es.manuel.spinnerexample.R
import es.manuel.spinnerexample.data.entity.Planet
import es.manuel.spinnerexample.databinding.ActivityCustomSpinnerBinding
import es.manuel.spinnerexample.databinding.SpinnerSelectedItemBinding

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
        binding.spnCustomSpinnerPlanets.adapter = object :
            CustomSpinnerAdapter<Planet>(this, viewModel.planets, R.layout.spinner_selected_item) {
            override fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
                val rowView = SpinnerSelectedItemBinding.inflate(layoutInflater, parent, false)
                val planet: Planet = this.getItem(position)!!
                rowView.txtSpinnerSelectedItemKm.text = planet.order.toString()
                rowView.txtSpinnerSelectedItemName.text = planet.name
                return rowView.root
            }

        }

        /*
    binding.spnCustomSpinnerPlanets.adapter =
        PlanetSpinnerAdapter(this, viewModel.planets)*/
    }


    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CustomSpinnerActivity::class.java)
        }
    }
}