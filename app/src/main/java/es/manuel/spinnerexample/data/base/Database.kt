package es.manuel.spinnerexample.data.base

import es.manuel.spinnerexample.data.entity.Planet

object Database : Repository {

    val planets: List<Planet> = listOf(
        Planet("Tierra", 100),
        Planet("Jupiter", 150),
        Planet("Saturno", 120),
        Planet("Urano", 130),
    )

    override fun queryAllPlanets(): List<Planet> = planets
}