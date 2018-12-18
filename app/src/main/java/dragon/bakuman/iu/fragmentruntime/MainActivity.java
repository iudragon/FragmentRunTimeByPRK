package dragon.bakuman.iu.fragmentruntime;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //For adding a fragment, we have to get the object of Fragment Manager
        fragmentManager = getSupportFragmentManager();


        //here we check if the container is available or not
        if (findViewById(R.id.fragment_container) != null){

            //this means that the activity is resumed; means the fragment is already added.
            //if this condition is not added, it will lead to overlap of fragments.
            if (savedInstanceState != null){

                return;
            }

            /*

            Here we simply add the HomeFragment to the activity
             */

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            HomeFragment homeFragment = new HomeFragment();

            //now we can add the first fragment using this fragment transaction object
            fragmentTransaction.add(R.id.fragment_container, homeFragment, null );

            fragmentTransaction.commit();




        }




    }
}
