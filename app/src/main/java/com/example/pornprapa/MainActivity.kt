package com.example.pornprapa

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//ซ่อน Title bar
        supportActionBar?.hide()
        // Buttton  btn = findViewById(R.id.btn_phrae);

        btn_udon.setOnClickListener(View.OnClickListener {

            setProvice(getDrawable(R.drawable.udon_img), getString(R.string.btn_udon),getString(R.string.history_udon))

        })
        btn_ubon.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.ubon_img), getString(R.string.btn_ubon),getString(R.string.history_ubon))

        })
        btn_roiet.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.roiet_img), getString(R.string.btn_roiet),getString(R.string.history_roiet))

        })
        btn_nongkhai.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.nongkhai_img), getString(R.string.btn_nongkhai),getString(R.string.history_nongkhai))

        })



    }

    fun setProvice (drawable: Drawable?, header:String, content:String ){

        img_province.setImageDrawable(drawable)  //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติของแพร่

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}


