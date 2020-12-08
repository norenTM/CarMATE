package fail.enormous.carmate

// CarList Class
class CarList(val brand: String, val model: String, val year: String, val color: String, val type: String, val price: String) {
    // This sets every variable within the CarList class as a string, despite the JSON files using price and year as ints! Easier for displaying this data.
    // Don't need to put anything in here like getBrand() functions like Java, Kotlin has this built-in.
}