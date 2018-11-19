package com.delaroystudios.sidemenu.fragment.about_next;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.delaroystudios.sidemenu.R;


public class faculty_image extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;

    //---------
//    private Button button;
//    private String context = Hello;
    //---------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_faculty_image_slide);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);


       //-----------------------
//
//                   new Intent();
//                    data.putExtra(data,context);
//                    setResult(2,data);
//                    //销毁这个页面
//                    finish();
//
//            });
//        }
        //-------------
//        Intent intent=this.getIntent();
//        ArrayList<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
//        ArrayList<String> photos = intent.getStringArrayListExtra("photos");
//        ArrayList<String> descriptions = intent.getStringArrayListExtra("decriptions");
//        for(int i = 0; i <photos.size();i++){
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put( "photos", photos.get(i) );
//            map.put( "descriptions", descriptions.get(i) );
//            list.add(map);
//            //---------------------------
//            SimpleAdapter adapter = new SimpleAdapter( this, list, R.layout.about_faculty_image, new String[]{"photos","decriptions"},
//                    new int[]{R.id.slideimg, R.id.txtdescription} );
//            setListAdapter(adapter);

        }


    }





