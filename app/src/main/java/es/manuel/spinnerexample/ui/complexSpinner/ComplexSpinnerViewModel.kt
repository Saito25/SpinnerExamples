package es.manuel.spinnerexample.ui.complexSpinner

import androidx.lifecycle.ViewModel
import es.manuel.spinnerexample.data.base.Database

class ComplexSpinnerViewModel : ViewModel() {
    val planets = Database.queryAllPlanets()
}