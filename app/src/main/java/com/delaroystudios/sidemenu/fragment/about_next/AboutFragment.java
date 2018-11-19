package com.delaroystudios.sidemenu.fragment.about_next;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.delaroystudios.sidemenu.R;
import com.delaroystudios.sidemenu.fragment.about_next.faculty_fragment;


import yalantis.com.sidemenu.interfaces.ScreenShotable;




public class AboutFragment extends android.support.v4.app.Fragment implements ScreenShotable {

   // private View containerView;
   // protected ImageView mImageView;
    protected int res;
    private Bitmap bitmap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about_fragment, container, false);
        //------
        Button btn_faculty=(Button)rootView.findViewById(R.id.btn_fac);
        Button btn_message=(Button)rootView.findViewById(R.id.btn_mes);
        Button btn_hku=(Button)rootView.findViewById(R.id.btn_hku);

        btn_faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(),faculty_fragment.class);
                startActivity(intent);

            }
        });
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(),message_fragment.class);
                startActivity(intent);
                //一定要修改manifest才能用！

            }
        });

        btn_hku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity().getApplicationContext(),hku_fragment.class);
                startActivity(intent);

            }
        });

        //------------

        //-------------------
        return rootView;
    }






    @Override
    public void takeScreenShot() {

    }

    @Override
    public Bitmap getBitmap() {
        return null;
    }



}

