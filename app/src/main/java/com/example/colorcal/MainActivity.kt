package com.example.colorcal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var field1Color: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val infoButton = findViewById<ImageView>(R.id.info)
        infoButton.setOnClickListener {
            showPopup()
        }

    }

    private fun showPopup() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup_info, null)
        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        dialogView.findViewById<ImageView>(R.id.close).setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    fun setColor(view: View) {
        val colorResId = when (view.id) {
            R.id.red -> R.color.red
            R.id.orange -> R.color.orange
            R.id.green -> R.color.green
            R.id.yellow -> R.color.yelllow
            R.id.white -> R.color.white
            R.id.blue -> R.color.blue
            else -> return
        }

        val field1 = findViewById<TextView>(R.id.field1)
        val field2 = findViewById<TextView>(R.id.field2)
        val field3 = findViewById<TextView>(R.id.field3)

        if (field1Color == null) {
            setColor(field1, colorResId)
            field1Color = colorResId
        } else {
            setColor(field2, colorResId)

            if (field1Color == R.color.red && colorResId == R.color.blue) {
                setColor(field3, R.color.violet)
            }

            if (field1Color == R.color.red && colorResId == R.color.green) {
                setColor(field3, R.color.yelllow)
            }

            if (field1Color == R.color.red && colorResId == R.color.orange) {
                setColor(field3, R.color.dark_orange)
            }

            if (field1Color == R.color.red && colorResId == R.color.yelllow) {
                setColor(field3, R.color.orange)
            }

            if (field1Color == R.color.red && colorResId == R.color.white) {
                setColor(field3, R.color.pink)
            }

            if (field1Color == R.color.blue && colorResId == R.color.red) {
                setColor(field3, R.color.violet)
            }

            if (field1Color == R.color.blue && colorResId == R.color.green) {
                setColor(field3, R.color.cyan)
            }

            if (field1Color == R.color.blue && colorResId == R.color.orange) {
                setColor(field3, R.color.brown)
            }

            if (field1Color == R.color.blue && colorResId == R.color.yelllow) {
                setColor(field3, R.color.green)
            }

            if (field1Color == R.color.blue && colorResId == R.color.white) {
                setColor(field3, R.color.light_blue)
            }

            if (field1Color == R.color.green && colorResId == R.color.red) {
                setColor(field3, R.color.brown1)
            }

            if (field1Color == R.color.green && colorResId == R.color.blue) {
                setColor(field3, R.color.cyan)
            }

            if (field1Color == R.color.green && colorResId == R.color.orange) {
                setColor(field3, R.color.olive)
            }

            if (field1Color == R.color.green && colorResId == R.color.yelllow) {
                setColor(field3, R.color.lime)
            }

            if (field1Color == R.color.green && colorResId == R.color.white) {
                setColor(field3, R.color.lime)
            }

            if (field1Color == R.color.orange && colorResId == R.color.red) {
                setColor(field3, R.color.dark_orange)
            }

            if (field1Color == R.color.orange && colorResId == R.color.blue) {
                setColor(field3, R.color.brown)
            }

            if (field1Color == R.color.orange && colorResId == R.color.green) {
                setColor(field3, R.color.brown2)
            }

            if (field1Color == R.color.orange && colorResId == R.color.yelllow) {
                setColor(field3, R.color.yellow_orange)
            }

            if (field1Color == R.color.orange && colorResId == R.color.white) {
                setColor(field3, R.color.yellow_orange)
            }

            if (field1Color == R.color.yelllow && colorResId == R.color.red) {
                setColor(field3, R.color.orange)
            }

            if (field1Color == R.color.yelllow && colorResId == R.color.blue) {
                setColor(field3, R.color.green)
            }

            if (field1Color == R.color.yelllow && colorResId == R.color.green) {
                setColor(field3, R.color.lime)
            }

            if (field1Color == R.color.yelllow && colorResId == R.color.orange) {
                setColor(field3, R.color.yellow_orange)
            }

            if (field1Color == R.color.yelllow && colorResId == R.color.white) {
                setColor(field3, R.color.light_yellow)
            }

            if (field1Color == R.color.white && colorResId == R.color.red) {
                setColor(field3, R.color.pink)
            }

            if (field1Color == R.color.white && colorResId == R.color.blue) {
                setColor(field3, R.color.light_blue)
            }

            if (field1Color == R.color.white && colorResId == R.color.green) {
                setColor(field3, R.color.light_green)
            }

            if (field1Color == R.color.white && colorResId == R.color.orange) {
                setColor(field3, R.color.light_orange)
            }

            if (field1Color == R.color.white && colorResId == R.color.yelllow) {
                setColor(field3, R.color.light_yellow)
            }

            field1Color = null
        }
    }

    private fun setColor(view: TextView, colorResId: Int) {
        view.setBackgroundResource(colorResId)
        val hexColor = String.format("#%06X", ContextCompat.getColor(this, colorResId) and 0xFFFFFF)
        when (view.id) {
            R.id.field1 -> findViewById<TextView>(R.id.rgb1).text = hexColor
            R.id.field2 -> findViewById<TextView>(R.id.rgb2).text = hexColor
            R.id.field3 -> findViewById<TextView>(R.id.rgb3).text = hexColor
        }
    }


    fun clearButton(view: View) {
        findViewById<TextView>(R.id.field1).setBackgroundResource(R.drawable.custom_shapes)
        findViewById<TextView>(R.id.field2).setBackgroundResource(R.drawable.custom_shapes)
        findViewById<TextView>(R.id.field3).setBackgroundResource(R.drawable.custom_shapes)

        findViewById<TextView>(R.id.rgb1).text = ""
        findViewById<TextView>(R.id.rgb2).text = ""
        findViewById<TextView>(R.id.rgb3).text = ""
    }

}

