package es.manuel.spinnerexample.ui.customSpinner

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding


abstract class CustomSpinnerAdapter<T>(
    ctxt: Context,
    private val spinnerItems: List<T>,
    @LayoutRes private val spinnerLayout: Int
) : ArrayAdapter<T>(ctxt, 0, spinnerItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }



    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    abstract fun initView(position: Int, convertView: View?, parent: ViewGroup): View
}