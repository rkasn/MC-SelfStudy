package rohan.com.selfstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class RRIntroActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrintro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.rr_intro);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.rr_intro) {
            startActivity(new Intent(RRIntroActivity.this,RRIntroActivity.class));
        } else if (id == R.id.rr_theory) {
            startActivity(new Intent(RRIntroActivity.this,RRTheoryActivity.class));
        } else if(id == R.id.rr_objective){
            startActivity(new Intent(RRIntroActivity.this,RRObjectiveActivity.class));
        } else if (id == R.id.rr_simulation){
            startActivity(new Intent(RRIntroActivity.this,RRSimulationActivity.class));
        } else if(id == R.id.srt_intro){
            startActivity(new Intent(RRIntroActivity.this,SRTIntroActivity.class));
        } else if(id == R.id.srt_theory){
            startActivity(new Intent(RRIntroActivity.this,SRTTheoryActivity.class));
        } else if(id == R.id.srt_objective){
            startActivity(new Intent(RRIntroActivity.this,SRTObjectiveActivity.class));
        } else if(id == R.id.srt_simulation){
            startActivity(new Intent(RRIntroActivity.this,SRTSimulationActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
