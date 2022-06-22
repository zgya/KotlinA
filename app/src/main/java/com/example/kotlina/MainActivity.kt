package com.example.kotlina

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ActionMenuView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.transition.Visibility
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","onCreate execute")
        button1.setOnClickListener(this)
        supportActionBar?.hide()
//        button1.setOnClickListener{
////            val intent = Intent("android.intent.action.ALL_APPS")
////            startActivity(intent)
////            val intent = Intent(Intent.ACTION_DIAL)
//////            intent.data = Uri.parse("https://www.baidu.com")
////            intent.data = Uri.parse("tel:10086")
////            startActivity(intent)
//        }

    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.button1-> AlertDialog.Builder(this).apply {
                setTitle("This is Dialog")
                setMessage("Something important")
                setCancelable(false)
                setPositiveButton("OK"){dialog,which->}
                setNegativeButton("Cancel"){dialog,which->}
            }.show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item->Toast.makeText(this,"You Clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item->Toast.makeText(this,"You Clicked Remove",Toast.LENGTH_SHORT).show()

        }
        return true
    }
    private fun save(inputText: String) {
        try {
            val output = openFileOutput("data", Context.MODE_PRIVATE)
            val writer = BufferedWriter(OutputStreamWriter(output))
            writer.use {
                it.write(inputText)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }


}