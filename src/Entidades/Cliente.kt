class Cliente(
    private val nombres: String,
    private val primerApellido: String,
    private val segundoApellido: String,
    private val rfc: String,
    private val direccion: String,
    private val listaReservas: MutableList<Reserva> = mutableListOf()
) {

    fun getDatosCliente(): String {
        return "Nombre: $primerApellido $segundoApellido $nombres RFC: $rfc Dirección: $direccion"
    }

    fun agregarReserva(reserva: Reserva) {
        listaReservas.add(reserva)
    }
}

