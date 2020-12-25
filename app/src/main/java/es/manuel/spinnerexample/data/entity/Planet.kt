package es.manuel.spinnerexample.data.entity

// TODO swap order for flag and add icons
data class Planet(val name: String, val order: Int) {
    override fun toString(): String {
        return name
    }
}
