package com.leapfrog_list.nikil.daaatabaase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ContactAdapter adapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listview);
        contactList= new ArrayList<>();
        contactList.add(new Contact("ram","thimi","2","male"));
        contactList.add(new Contact("ram","thimi","2","male"));
        contactList.add(new Contact("ram","thimi","2","male"));
        contactList.add(new Contact("ram","thimi","2","male"));
        contactList.add(new Contact("ram","thimi","2","male"));
        contactList.add(new Contact("ram","thimi","2","male"));
        adapter=new ContactAdapter(getApplicationContext(),contactList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Name of contact ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
