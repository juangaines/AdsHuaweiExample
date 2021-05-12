package com.exampledtse.adexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.huawei.hms.ads.AdParam
import com.huawei.hms.ads.HwAds
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HwAds.init(this)
       val parametros= AdParam.Builder().build()
        bannerView.loadAd( parametros )

    }
}