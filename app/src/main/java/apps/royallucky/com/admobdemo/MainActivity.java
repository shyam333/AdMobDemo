package apps.royallucky.com.admobdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    AdView adView;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

        adView = (AdView)findViewById(R.id.adview);
        adRequest = new AdRequest.Builder().addTestDevice(adRequest.DEVICE_ID_EMULATOR).build();
        adView.loadAd(adRequest);
    }
}
