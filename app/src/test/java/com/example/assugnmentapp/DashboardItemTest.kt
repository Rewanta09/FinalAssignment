package com.example.assugnmentApp


import org.junit.Assert.*
import org.junit.Test

class DashboardItemTest {

    @Test
    fun dashboardItem_shouldContainCorrectFieldValues() {
        val fields = mapOf(
            "title" to "Assignment 1",
            "dueDate" to "2025-06-20",
            "description" to "Math assignment"
        )

        val item = DashboardItem(fields)

        assertEquals("Assignment 1", item.fields["title"])
        assertEquals("2025-06-20", item.fields["dueDate"])
        assertEquals(3, item.fields.size)
    }
}
