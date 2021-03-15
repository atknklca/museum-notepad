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
import com.example.museumnotepad.MuzeDetay;
import com.example.museumnotepad.Nesne.muze;
import com.example.museumnotepad.R;
import java.util.ArrayList;
import java.util.List;


public class TumFragment extends Fragment {

    ListView listViewTum;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tum,container,false);
        listViewTum=view.findViewById(R.id.TumMuzeList);

        final VeriKaynagi vk = new VeriKaynagi(getActivity());
        vk.ac();
        //vk.muzeOlustur();
        //System.out.println(vk.listele());

        List<muze> muzeler = vk.listeleMuze();

        ArrayList menuItem = new ArrayList() ;

        for(int i=0;i<muzeler.size();i++){
            menuItem.add(muzeler.get(i).getMuzeAdi());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,menuItem);
        listViewTum.setAdapter(adapter);

       listViewTum.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent intent = new Intent(getActivity(),MuzeDetay.class);
               intent.putExtra("MuzeId",i);
               startActivity(intent);
           }
       });



        return view;
        // inflater.inflate(R.layout.fragment_tum,container,false);
    }


}