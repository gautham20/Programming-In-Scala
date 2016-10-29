import scala.collection.mutable
import scala.collection.immutable

//default companion object set is of immutable package

var domains = Set("Machine Learning", "Data Science")
domains += "Visualizations" //this gives a new set object
println(domains)

var passions = mutable.Set("Netherlands", "Unhabited Island")
passions.+=("Mustang GT")
println(passions)
