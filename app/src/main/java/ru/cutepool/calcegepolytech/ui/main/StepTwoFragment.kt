package ru.cutepool.calcegepolytech.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_step_two.view.*
import ru.cutepool.calcegepolytech.R
import ru.cutepool.calcegepolytech.ResultActivity

class StepTwoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_step_two, container, false)

        val checkbox = root.findViewById<CheckBox>(R.id.cb_all)

        checkbox.setOnCheckedChangeListener { button, b ->
            root.cb_1.isChecked = b
            root.cb_2.isChecked = b
            root.cb_3.isChecked = b
            root.cb_4.isChecked = b
            root.cb_5.isChecked = b
            root.cb_6.isChecked = b
            root.cb_7.isChecked = b
            root.cb_8.isChecked = b
            root.cb_9.isChecked = b
            root.cb_10.isChecked = b
            root.cb_11.isChecked = b
        }

        val bt = root.findViewById<Button>(R.id.bt_result)
        bt.setOnClickListener {
            val intent = Intent(root.context, ResultActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    companion object {

        fun newInstance() : StepTwoFragment {
            return StepTwoFragment()
        }
    }
}