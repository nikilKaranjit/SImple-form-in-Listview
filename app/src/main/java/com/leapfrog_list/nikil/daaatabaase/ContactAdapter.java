package com.leapfrog_list.nikil.daaatabaase;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nikil on 9/1/2016.
 */
public class ContactAdapter extends BaseAdapter {
    private Context context;
    private List<Contact>contactList;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(context,R.layout.contactform,null);
        TextView tvname= (TextView)view.findViewById(R.id.tvname);
        TextView tvAddress= (TextView)view.findViewById(R.id.tvAddress);
        TextView tvid= (TextView)view.findViewById(R.id.tvid);
        TextView tvGender= (TextView)view.findViewById(R.id.tvGender);

        tvname.setText(contactList.get(position).getName());
        tvAddress.setText(contactList.get(position).getAddress());
        tvid.setText(contactList.get(position).getContactID());
        tvGender.setText(contactList.get(position).getGender());
        return view;
    }
}
