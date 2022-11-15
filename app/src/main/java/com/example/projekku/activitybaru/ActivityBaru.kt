package com.example.projekku.activitybaru

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projekku.R
import kotlinx.android.synthetic.main.baru_activity.*



class ActivityBaru : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baru_activity)

        title = "Pertandingan"

        val bundle: Bundle? = intent.extras

        bundle.apply {
            val dataFromMainActivity : String? = intent.getStringExtra("key1")
            tvProfile.text = dataFromMainActivity
        }
//        bundle.apply {
//            val dataFromMainActivity : String? = intent.getStringExtra("key2")
//            tvProfile1.text = dataFromMainActivity
//        }
    }

}
