package com.example.registrationform


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        summaryView()

    }

    private fun summaryView() {
        val summary = intent.getSerializableExtra("Summary") as Summary
        val summaryText = """
                Hii...
                My name is ${summary.firstName} ${summary.lastName}. I am very good person
                and I am a ${summary.sex} graduate searching for job and ready to work as a junior android developer
            """.trimIndent()
        text_view_summary.text = summaryText
        edit_text_phone_number_to_send.text = summary.phoneNumber
        edit_text_email_id_to_send.text = summary.emailAddress

    }
}



