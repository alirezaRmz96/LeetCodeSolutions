package org.example

fun majorityElement(nums: IntArray): Int {
    val count = HashMap<Int, Int>()
    val total = nums.size
    for (n in nums) {
        count[n] = count.getOrElse(n) { 0 } + 1
        if (count.getOrDefault(n, 1) > total / 2)
            return n
    }

    return -1
}
fun main() {
    println(majorityElement(nums = intArrayOf(2, 2, 1, 1, 1, 2, 1)))
}