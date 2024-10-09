// Интерфейс с методом go()
interface Moveable {
    fun go()
}

// Класс Car реализует интерфейс Moveable
class Car(
    private var model: String,
    private var color: String,
    private var speed: Int
) : Moveable {
    
    // Реализация метода go() из интерфейса Moveable
    override fun go() {
        println("The car $model is moving at speed $speed km/h.")
    }

    // Геттеры и сеттеры
    fun getModel(): String {
        return model
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getSpeed(): Int {
        return speed
    }

    fun setSpeed(speed: Int) {
        this.speed = speed
    }
}

// Абстрактный класс Human
abstract class Human(
    private var age: Int
) {
    // Геттер для возраста
    fun getAge(): Int {
        return age
    }

    // Сеттер для возраста
    fun setAge(age: Int) {
        this.age = age
    }

    // Абстрактный метод для получения информации о возрасте
    abstract fun printAge()
}

// Класс Women наследует абстрактный класс Human
class Women(age: Int) : Human(age) {
    override fun printAge() {
        println("The woman's age is: ${getAge()}")
    }
}

// Класс Men наследует абстрактный класс Human
class Men(age: Int) : Human(age) {
    override fun printAge() {
        println("The man's age is: ${getAge()}")
    }
}

fun main() {
    // Создаем объект класса Car и вызываем метод go()
    val car = Car("Tesla", "Red", 120)
    car.go()

    // Создаем объект класса Women и выводим возраст
    val woman = Women(25)
    woman.printAge()

    // Создаем объект класса Men и выводим возраст
    val man = Men(30)
    man.printAge()
}
