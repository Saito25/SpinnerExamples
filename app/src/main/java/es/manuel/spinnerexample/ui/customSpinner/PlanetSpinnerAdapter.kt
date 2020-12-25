package es.manuel.spinnerexample.ui.customSpinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import es.manuel.spinnerexample.R
import es.manuel.spinnerexample.data.entity.Planet
import es.manuel.spinnerexample.databinding.SpinnerSelectedItemBinding


class PlanetSpinnerAdapter(
    ctxt: Context,
    private val resource: Int,
    private val planets: List<Planet>
) :
    ArrayAdapter<Planet>(ctxt, 0, planets) {

    // TODO HACER
    private val layoutInflater = LayoutInflater.from(ctxt)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

   private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
       val rowView = SpinnerSelectedItemBinding.inflate(layoutInflater, parent, false)
       val planet = planets[position]
       rowView.txtSpinnerSelectedItemKm.text = planet.order.toString()
       rowView.txtSpinnerSelectedItemName.text = planet.name.toString()
       return rowView.root
   }
}