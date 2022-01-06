package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerValue: Array<String> = arrayOf("BE.cse", "ME.cse")
        val spinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValue)
        spinner_sex.adapter = spinnerAdapter
        onClickButton()


    }

    private fun onClickButton() {
        button_preview.setOnClickListener {
            val summary = Summary(
                edit_text_first_name.text.toString(),
                edit_text_last_name.text.toString(),
                edit_text_email_id.text.toString(),
                edit_text_phone_number.text.toString(),
                spinner_sex.selectedItem.toString()
            )
            val summaryIntent = Intent(this, SummaryActivity::class.java)
            summaryIntent.putExtra("Summary", summary)
            startActivity(summaryIntent)
        }
    }


}