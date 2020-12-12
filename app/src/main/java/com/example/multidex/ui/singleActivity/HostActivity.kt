package com.example.multidex.ui.singleActivity

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multidex.R
import com.permissionx.guolindev.PermissionX


class HostActivity : AppCompatActivity() {

    /* configuration appbar and other static's */


//    private lateinit var appBarConfiguration: AppBarConfiguration
//    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout_add_acc)

//        drawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)
//        val navController = findNavController(R.id.nav_host_fragment)
//        appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.frag1,
//                R.id.frag2
//            ),
//            drawerLayout
//        )
//
//        navView.setupWithNavController(navController)


    }
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }

//    fun openDrawer() {
//        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
//        drawer?.openDrawer(GravityCompat.START)
//    }
//
//    fun drawerDisable(state: Boolean){
//        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
//        drawer.setDrawerLockMode(if (state) DrawerLayout.LOCK_MODE_LOCKED_CLOSED else DrawerLayout.LOCK_MODE_LOCKED_OPEN)
//    }

//    override fun onBackPressed() {
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
//    }

}