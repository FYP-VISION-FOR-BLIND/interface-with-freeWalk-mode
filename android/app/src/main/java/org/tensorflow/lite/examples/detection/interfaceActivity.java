package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class interfaceActivity extends AppCompatActivity {

    Button btn1;
    TextToSpeech tts2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        btn1 = (Button) findViewById(R.id.free_walk_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), DetectorActivity.class);
                startActivity(intent);
            }
        });

        tts2 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    // replace this Locale with whatever you want
                    Locale localeToUse = new Locale("en", "US");
                    tts2.setLanguage(localeToUse);
                    tts2.speak("hello! welcome to vision for blind application" +
                            "speak the mode in which you want to enter" +"free walk mode" +
                                    "face recogniton mode" +
                                    "capture mode"
                            , TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });

    }
}