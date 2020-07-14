package ru.cutepool.calcegepolytech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.title = "Результаты расчета"

        val rv = findViewById<RecyclerView>(R.id.rv_result)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter()

        val array = arrayOf("90%", "80%", "70%", "60%")
        val adapterSpinner = ArrayAdapter<String>(this, R.layout.my_simple_spinner_item, array)
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapterSpinner
        spinner.setSelection(1)
    }
}

class MyAdapter : RecyclerView.Adapter<MyAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.test_item, parent, false))

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind()
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {

        }
    }

}
