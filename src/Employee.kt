data class Employee (
    var name: String,
    var salary: Double,
    var contractType: String
){
    override fun toString(): String {
        return "Name: $name - Salary: $salary - ContractType $contractType"
    }
}