package com.ec.todolist1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ChoixListActivity : AppCompatActivity(), View.OnClickListener {

    private var edtListe: EditText? = null
    private var btnOK: Button? = null
    private var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choixlist_layout)

        btnOK = findViewById<Button>(R.id.button)
        edtListe = findViewById<EditText>(R.id.pseudo)


        // Demande à MainActivity d'implémenter l'interface onClickListener

        // Demande à MainActivity d'implémenter l'interface onClickListener
        btnOK?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {

        }
    }
}