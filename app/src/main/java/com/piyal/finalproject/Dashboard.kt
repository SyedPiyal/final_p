package com.piyal.finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.piyal.finalproject.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val navView: BottomNavigationView = binding.navView

        //val navController = findNavController(R.id.nav_host_fragment_activity_dashboard)
        /*// Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_list, R.id.navigation_sell, R.id.navigation_user
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/


        val navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_dashboard)
        binding.navView.itemIconTintList = null
        NavigationUI.setupWithNavController(binding.navView, navController)

        binding.buttonAdd.setOnClickListener {

            val intent = Intent(this, AddProperty::class.java)
            startActivity(intent)
            finish()

        }
    }
}