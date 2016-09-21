package com.alejandrolora.testrealm.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.alejandrolora.testrealm.R;
import com.alejandrolora.testrealm.models.Dog;
import com.alejandrolora.testrealm.models.Person;

import java.util.List;

/**
 * Created by Alejandro on 18/9/16.
 */
public class MyAdapter extends BaseAdapter {

    private List<Person> list;
    private int layout;
    private Context context;


    public MyAdapter(List<Person> list, int layout, Context context) {
        this.list = list;
        this.layout = layout;
        this.context = context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Person getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();
            vh.id = (TextView) convertView.findViewById(R.id.textViewId);
            vh.name = (TextView) convertView.findViewById(R.id.textViewName);
            vh.dogs = (TextView) convertView.findViewById(R.id.textViewDogs);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Person p = list.get(position);

        vh.id.setText(p.getId() + "");
        vh.name.setText(p.getName());
        String dogsInfo = "";
        for (Dog dog : p.getDogs()) {
            dogsInfo += dog.getId() + "-" + dog.getName() + "\n";
        }
        vh.dogs.setText(dogsInfo);

        return convertView;
    }

    public class ViewHolder {
        TextView id;
        TextView name;
        TextView dogs;
    }
}
