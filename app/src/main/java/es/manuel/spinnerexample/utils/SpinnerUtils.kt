package es.manuel.spinnerexample.utils

import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

fun Spinner.doOnItemSelected(
    action: (
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) -> Unit
) {
    onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            action(parent, view, position, id)
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }

    }
}