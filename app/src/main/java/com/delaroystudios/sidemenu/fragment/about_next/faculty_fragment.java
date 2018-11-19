package com.delaroystudios.sidemenu.fragment.about_next;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.delaroystudios.sidemenu.R;

import java.util.ArrayList;

public class faculty_fragment extends AppCompatActivity {

//    private Context context;

//    Button btn_seefac;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_faculty);
        Button btn_seefac = (Button) findViewById(R.id.btn_seeFacImage);
//        context=this;
        btn_seefac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openFaultyImage();

                Intent intent = new Intent(getBaseContext(), faculty_image.class);
                //只需进入faculty_image 即可
                startActivity(intent);

            }

        });

//        private void openFaultyImage(){
//            Intent intent = new Intent(getBaseContext(), faculty_image.class);
//            //只需进入faculty_image 即可
//            startActivity(intent);
//        }
//        }


    }
}
