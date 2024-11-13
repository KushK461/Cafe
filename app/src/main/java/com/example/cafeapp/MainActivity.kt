package com.example.cafeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mOrderMessage: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    private fun displayToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun showDonutOrder(view: View) {
        mOrderMessage = "You ordered a donut"
        displayToast(mOrderMessage)
        startOrder(view)
    }

    fun showIceCreamOrder(view: View) {
        mOrderMessage = "You ordered an ice cream sandwich"
        displayToast(mOrderMessage)
        startOrder(view)
    }

    fun showFroyoOrder(view: View) {
        mOrderMessage = "You ordered a Froyo"
        displayToast(mOrderMessage)
        startOrder(view)
    }

    fun startOrder(view: View) {
        val orderIntent = Intent(this, OrderActivity::class.java)
        orderIntent.putExtra("ORDER_MESSAGE", mOrderMessage)
        startActivity(orderIntent)
    }
}
