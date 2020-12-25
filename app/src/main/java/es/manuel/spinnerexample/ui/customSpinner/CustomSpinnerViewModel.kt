package es.manuel.spinnerexample.ui.customSpinner

import androidx.lifecycle.ViewModel
import es.manuel.spinnerexample.data.base.Database

class CustomSpinnerViewModel : ViewModel() {
    val planets = Database.queryAllPlanets()
}