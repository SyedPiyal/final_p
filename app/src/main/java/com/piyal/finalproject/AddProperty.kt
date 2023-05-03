package com.piyal.finalproject

import android.content.ContentValues.TAG
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.piyal.finalproject.databinding.AddPropertyBinding


class AddProperty : AppCompatActivity() {

    private lateinit var binding: AddPropertyBinding

    private var fr= Firebase.firestore
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddPropertyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            binding.btnSubmit.setBackgroundColor(Color.BLUE)

            Log.d(TAG, "onCreate: ")
            val name = binding.etAddName.text.toString().trim()
            val phone = binding.etAddPhone.text.toString().trim()
            val email = binding.etAddEmail.text.toString().trim()

            val usermap = hashMapOf(
                "name" to name,
                "phone_Number" to phone,
                "email" to email

            )
            val userId = FirebaseAuth.getInstance().currentUser!!.uid

            Log.d("userId",usermap.toString())


            fr.collection("user").document(userId).set(usermap)
                .addOnSuccessListener {
                    binding.btnSubmit.setBackgroundColor(Color.GREEN)

                    Toast.makeText(this,"Successfully Added",Toast.LENGTH_SHORT).show()
                    binding.etAddName.text.clear()
                    binding.etAddPhone.text.clear()
                    binding.etAddEmail.text.clear()
                }
                .addOnFailureListener {
                    Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
                }
        }
    }
}