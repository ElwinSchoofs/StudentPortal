package com.example.level3_task2_studentportal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_portal.*

const val ADD_PORTAL_ACTIVITY = 100

class AddPortalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_portal)
        initViews()
    }

    private fun initViews(){
        btnAddPortal.setOnClickListener { addPortal() }
    }

    private fun addPortal(){
        if(etTitle.text.isNullOrBlank() || etUrl.text.isNullOrBlank()){
            Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            return
        }

        val portal = Portal(
            etTitle.text.toString(),
            etUrl.text.toString()
        )

        val portalActivityIntent = Intent(this, MainActivity::class.java)
        setResult(Activity.RESULT_OK, portalActivityIntent)
        portalActivityIntent.putExtra(PORTAL_EXTRA, portal)
        finish()
    }
}
