package com.example.helloworld.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import com.example.helloworld.adapters.PersonAdapter
import com.example.helloworld.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        personList = getPersons()
        adapter  = PersonAdapter(this, R.layout.list_view_person, personList)

        listView.adapter = adapter
    }

    private fun getPersons(): List<Person> {
        return listOf(
            Person("Jose", "Tejada", 36),
            Person("Vasco", "Tejada", 26),
            Person("Maria", "Quezada", 16),
            Person("Luis", "Martinez", 14),
            Person("Ana", "Rodriguez", 32),
            Person("Rebeca", "Rojas", 24),
            Person("Gabriela", "Estrada", 33),
            Person("Maritza", "Huiza", 56),
            Person("Karen", "Cayo", 77),
            Person("Martin", "Del Prado", 31),
            Person("Rafael", "Castañeda", 65),
            Person("Joaquin", "Romero", 18),
            Person("Rodrigo", "Huari", 19),
            Person("Lucia", "Quezada", 16),
            Person("Fabiola", "Martinez", 14),
            Person("Roxana", "Rodriguez", 32),
            Person("Estella", "Rojas", 24),
            Person("Mariela", "Estrada", 33),
            Person("Alexander", "Huiza", 56),
            Person("Jorge", "Cayo", 77),
            Person("Robert", "Del Prado", 31),
            Person("Jean Pierre", "Castañeda", 65),
            Person("Willy", "Romero", 18),
            Person("Christian", "Huari", 19)
        ).sortedBy { it.firstName }
    }
}
