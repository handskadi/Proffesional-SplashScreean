package com.elegantappstore.etssartup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.ads.consent.ConsentStatus
import com.google.ads.consent.ConsentInfoUpdateListener
import com.google.ads.consent.ConsentInformation
import com.google.ads.consent.ConsentFormListener
import com.google.ads.consent.ConsentForm
import java.net.MalformedURLException
import java.net.URL


class MainActivity : AppCompatActivity() {
     // This App made by www.elegantappstore.com

    // Instance variables
    var form: ConsentForm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*** Start of GDPR Code - General Data Protection Regulation   ***/
        val consentInformation = ConsentInformation.getInstance(this)
        val publisherIds = arrayOf("pub-0123456789012345")
        consentInformation.requestConsentInfoUpdate(publisherIds, object : ConsentInfoUpdateListener {
            override fun onConsentInfoUpdated(consentStatus: ConsentStatus) {
                // User's consent status successfully updated.
            }

            override fun onFailedToUpdateConsentInfo(errorDescription: String) {
                // User's consent status failed to update.
            }
        })
        var privacyUrl: URL? = null
        try {
             privacyUrl = URL("http://www.elegantappstore.com/privacy-policy-google-play-apps/")
         } catch (e: MalformedURLException) {
             e.printStackTrace()
             // Handle error.
         }
        form = ConsentForm.Builder(this, privacyUrl).withListener(object : ConsentFormListener() {
                     override fun onConsentFormLoaded() {
                         // Consent form loaded successfully.
                         form!!.show()
                     }

                     override fun onConsentFormOpened() {
                         // Consent form was displayed.
                     }

                     override fun onConsentFormClosed(
                             consentStatus: ConsentStatus?, userPrefersAdFree: Boolean?) {
                         // Consent form was closed.
                     }

                     override fun onConsentFormError(errorDescription: String?) {
                         // Consent form error.
                     }
                 }).withPersonalizedAdsOption().withNonPersonalizedAdsOption().withAdFreeOption().build()
        form!!.load()
         /*** End of GDPR Code - General Data Protection Regulation   ***/

    }

}
