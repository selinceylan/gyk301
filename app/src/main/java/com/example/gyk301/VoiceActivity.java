package com.example.gyk301;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static android.Manifest.permission.RECORD_AUDIO;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class VoiceActivity extends AppCompatActivity {

    Button recordVoiceButton;
    Button stopVoiceButton;
    Button playVoiceButton;
    private MediaRecorder recorder;
    private MediaPlayer player;
    private final String filepath = Environment.getExternalStorageDirectory().getPath() + "/record.3gp";

    private static final int REQUEST_AUDIO_PERMISSION_CODE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);


    }

}
