package com.example.linterror33rc3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rib = BillingAddressRib(findViewById(R.id.constraint_root), this)
        rib.didBecomeActive()
    }

}
