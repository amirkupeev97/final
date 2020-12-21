package com.example.todolist.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalex.R
import com.example.finalex.Todo
import com.example.todolist.ui.TodoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list.*

class TodosFragment : Fragment(R.layout.fragment_list) {


    val todoAdapter = TodoAdapter(mutableListOf(
        Todo("India" , ) ,
        Todo("Britain" ) ,
        Todo("Germany" ) ,

        ))




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.fragment_list, container, false)

            fun getView(): View? {
                return super.getView()
            }


        }





    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvTodoItems.adapter=todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(activity)
    }


}

