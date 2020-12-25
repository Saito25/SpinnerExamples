package es.manuel.spinnerexample.data.base

import es.manuel.spinnerexample.data.entity.Planet

interface Repository {
    fun queryAllPlanets(): List<Planet>
}