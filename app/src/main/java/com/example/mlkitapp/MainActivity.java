package com.example.mlkitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnTextRecognition, btnFaceDetection, btnBarcodeScanning, btnObjectDetection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnTextRecognition = findViewById(R.id.btn_text_recognition);
        btnFaceDetection = findViewById(R.id.btn_face_detection);
        btnBarcodeScanning = findViewById(R.id.btn_barcode_scanning);

        btnObjectDetection = findViewById(R.id.btn_object_detection);
        btnTextRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextRecognitionActivity.class);
                startActivity(intent);
            }
        });

        // Face Detection implementation
        btnFaceDetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FaceDetectionActivity.class);
                startActivity(intent);
            }
        });

        btnBarcodeScanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BarcodeScanningActivity.class);
                startActivity(intent);
            }
        });

        btnObjectDetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObjectDetectionActivity.class);
                startActivity(intent);
            }
        });
    }
}