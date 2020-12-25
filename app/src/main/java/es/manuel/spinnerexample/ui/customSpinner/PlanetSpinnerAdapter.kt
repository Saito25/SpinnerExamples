package es.manuel.spinnerexample.ui.customSpinner

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import es.manuel.spinnerexample.R
import es.manuel.spinnerexample.data.entity.Planet

class PlanetSpinnerAdapter(val planets: List<Planet>, val ctxt: Context) :
    ArrayAdapter<Planet>(ctxt, R.layout.spinner_selected_item, planets) {

    // TODO HACER

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getDropDownView(position, convertView, parent)
    }
}