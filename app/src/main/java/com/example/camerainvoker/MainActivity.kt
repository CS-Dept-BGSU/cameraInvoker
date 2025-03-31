package com.example.camerainvoker

// import android.Manifest
// import android.content.Intent
// import android.content.pm.PackageManager
// import android.provider.MediaStore
// import android.widget.Button
// import android.widget.Toast
// import androidx.activity.result.contract.ActivityResultContracts
// import androidx.core.content.ContextCompat
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    // TODO: Set up the permission launcher
    // HINT: Create a launcher that handles permission requests
    // private val requestPermissionLauncher = registerForActivityResult(
    //     ActivityResultContracts.RequestPermission()
    // ) { isGranted: Boolean ->
    //     if (isGranted) {
    //         // Permission was granted - what should you do now?
    //     } else {
    //         // Permission was denied - how should you handle this?
    //     }
    // }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Find the camera button and set its click listener
        // HINT: You'll need to find the button and set up a click handler
        // findViewById<Button>(R.id.buttonCamera).setOnClickListener {
        //     // Which function from below should you call when the button is clicked?
        // }
    }

    // TODO: Create a function to open the camera
    // HINT: Use MediaStore.ACTION_IMAGE_CAPTURE intent
    // private fun openCamera() {
    //     // Create and start the camera intent
    // }

    // TODO: Create a function to check for camera permission
    // HINT: Check if permission is granted, and if not, request it
    // private fun checkCameraPermission() {
    //     when {
    //         ContextCompat.checkSelfPermission(
    //             this,
    //             Manifest.permission.CAMERA
    //         ) == PackageManager.PERMISSION_GRANTED -> {
    //             // Permission is already granted, what should you do?
    //         }
    //         else -> {
    //             // Permission is not granted, how do you request it?
    //         }
    //     }
    // }
}