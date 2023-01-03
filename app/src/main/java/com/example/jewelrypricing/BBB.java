package com.example.jewelrypricing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BBB extends AppCompatActivity {

    ListView listView;
    String[] mTitle = {"No Diamond Bracelet", "With Diamond Bracelet"};
    int[] images = {R.drawable.ndb, R.drawable.db};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb);

        listView = findViewById(R.id.list_view);

        MyAdapter adapter = new MyAdapter(this, mTitle, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if(position==0){
                startActivity(new Intent(BBB.this,NDB.class));
            }else if(position==1){
                startActivity(new Intent(BBB.this,DB.class));
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] topTitle;
        int[] topImgs;

        MyAdapter (Context c, String[] title, int[] imgs) {
            super(c, R.layout.topborder, R.id.textView1, title);
            this.context = c;
            this.topTitle = title;
            this.topImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View topborder = layoutInflater.inflate(R.layout.topborder, parent, false);
            ImageView images = topborder.findViewById(R.id.image);
            TextView myTitle = topborder.findViewById(R.id.textView1);

            images.setImageResource(topImgs[position]);
            myTitle.setText(topTitle[position]);

            return topborder;
        }
    }
}
