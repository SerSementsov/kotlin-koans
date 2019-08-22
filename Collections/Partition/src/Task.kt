// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    return customers
        .filter { customer ->
            val (delivered, undelivered) = customer.orders.partition { it.isDelivered }

            undelivered.size > delivered.size
        }
        .toSet()
}
