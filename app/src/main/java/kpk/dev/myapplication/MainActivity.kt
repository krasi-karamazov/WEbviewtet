package kpk.dev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.*
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //webview.settings.javaScriptCanOpenWindowsAutomatically = true;
        webview.run {
           // this.settings.setSupportMultipleWindows(true)
            this.settings.javaScriptEnabled = true
            /*this.settings.setAppCacheEnabled(true)
            this.settings.setAppCacheMaxSize(10 * 1024 * 1024)
            this.settings.setAppCachePath("")
            this.settings.databaseEnabled = true
            this.settings.domStorageEnabled = true
            this.settings.setGeolocationEnabled(true)
            this.settings.saveFormData = false
            this.settings.savePassword = false
            this.settings.useWideViewPort = true
            this.settings.loadWithOverviewMode = true*/
            this.loadDataWithBaseURL("https://auth.skybetservices.com/openid/v1/authorize?client_id=racing_post_web&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fbetslip-api-v3.apps.production.global.rp-cloudinfra.com%2Fv3%2Fredirect%2Fskybet&state=eyJjbGllbnRfaWQiOiJwcm9kdWN0aW9uIiwic3RhdGUiOiIxVllsRHNjeFRDdGJxdmZPSVBOSHBoUkVtakFKQnladSIsImFjdGlvbiI6IiJ9")
        }
        webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return false
            }
        }
    }
}
