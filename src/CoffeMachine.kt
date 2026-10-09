sealed class CoffeMachineState {
    data object IDLE : CoffeMachineState()
    data object SELECTING : CoffeMachineState()
    data object PROCESSING : CoffeMachineState()
    data object DISPENSING : CoffeMachineState()
    data object ERROR : CoffeMachineState()
}

class CoffeMachine {
    var currentState: CoffeMachineState = CoffeMachineState.IDLE

    fun selectCoffe() {
        currentState = CoffeMachineState.SELECTING
    }
}

fun main() {
    val machine = CoffeMachine()

    println("La máquina de café está encendida")
    println("Estado actual: ${machine.currentState}")

    machine.selectCoffe()

    println("Estado después de seleccionar el café: ${machine.currentState}")
}