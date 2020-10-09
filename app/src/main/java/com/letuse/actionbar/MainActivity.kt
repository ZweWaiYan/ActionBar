package com.letuse.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener {
            val oneFragment = oneFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,oneFragment)
            //ကိုယ်ရွေးခဲ့တဲ့ Transaction အတိုင်း Back နှိပ်လိုက်ရင် ရွေးခဲတဲ့အတိုင်းပြန်သွား
            transaction.addToBackStack(null)
            //transaction ကိုအလုပ်လုပ်စေချင်ရင်
            transaction.commit()
        }

        btnTwo.setOnClickListener {
            val twoFragment = twoFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,twoFragment)
            transaction.addToBackStack(null)
            //transaction ကိုအလုပ်လုပ်စေချင်ရင်
            transaction.commit()
        }

        btnThree.setOnClickListener {
            val threeFragment = threeFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,threeFragment)
            transaction.addToBackStack(null)
            //transaction ကိုအလုပ်လုပ်စေချင်ရင်
            transaction.commit()
        }
    }
}