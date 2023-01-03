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

public class RRR extends AppCompatActivity {

    ListView listView;
    String[] mTitle = {"No Diamond Ring", "With Diamond Ring"};
    int[] images = {R.drawable.ndr, R.drawable.dr};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrr);

        listView = findViewById(R.id.list_view);

        MyAdapter adapter = new MyAdapter(this, mTitle, images);
        listView.setAdapter(adapter);

           listView.setOnItemClickListener((parent, view, position, id) -> {
               if(position==0){
                   startActivity(new Intent(RRR.this,NDR.class));
               }else if(position==1){
                   startActivity(new Intent(RRR.this,DR.class));
               }
           });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] rTitle;
        int[] rImgs;

        MyAdapter (Context c, String[] title, int[] imgs) {
            super(c, R.layout.topborder, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View topborder = layoutInflater.inflate(R.layout.topborder, parent, false);
            ImageView images = topborder.findViewById(R.id.image);
            TextView myTitle = topborder.findViewById(R.id.textView1);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);

            return topborder;
        }
    }
}
