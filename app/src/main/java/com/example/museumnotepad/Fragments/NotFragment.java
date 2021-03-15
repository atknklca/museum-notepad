package com.example.museumnotepad.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.museumnotepad.Database.VeriKaynagi;
import com.example.museumnotepad.Nesne.not;
import com.example.museumnotepad.NotDetay;
import com.example.museumnotepad.R;
import java.util.ArrayList;
import java.util.List;


public class NotFragment extends Fragment {

    ListView listViewNot;
    List<not> notlar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_not,container,false);

        listViewNot = view.findViewById(R.id.NotList);

        final VeriKaynagi vk = new VeriKaynagi(getActivity());
        vk.ac();

        notlar = vk.listeleNot();
        ArrayList notMenuItem = new ArrayList();

        for(int i=0 ; i<notlar.size() ; i++){
            notMenuItem.add(notlar.get(i).getNot_basligi());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,notMenuItem);


        listViewNot.setAdapter(adapter);

        listViewNot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //int notId = notlar.get(i).getId();
                Intent intent = new Intent(getActivity(), NotDetay.class);
                intent.putExtra("notId",i);
                System.out.println("burdayız");
                startActivity(intent);
            }
        });



        return view;
    }


}