package com.codepro.geoquiz

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trueBtnClicked(view: View) {
        var toast = Toast.makeText(applicationContext, R.string.toast_true,
        Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()
    }
    fun falseBtnClicked(view: View) {
        var toast = Toast.makeText(applicationContext, R.string.toast_false,
            Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP,0,0)
        toast.show()
    }
}
