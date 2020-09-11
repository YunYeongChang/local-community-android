package com.implude.localcommunity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_link.*

private var mFirebaseAnalytics: FirebaseAnalytics? = null
class LinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        btn_test1.setOnClickListener(({
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }))
        btn_test2.setOnClickListener(({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }))
        btn_test3.setOnClickListener(({
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }))
        btn_test4.setOnClickListener(( {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }))
        btn_test5.setOnClickListener(({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }))
    }
}