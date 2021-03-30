package com.example.whatsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CALLS#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CALLS extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CALLS() {
        // Required empty public constructor
    }

    private List<DataItem2> list= new ArrayList<>();
    private RecyclerView recyclerView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CALLS.
     */
    // TODO: Rename and change types and number of parameters
    public static CALLS newInstance(String param1, String param2) {
        CALLS fragment = new CALLS();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c_a_l_l_s, container, false);

        recyclerView= view.findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getDataItem2();
        return view;
    }

    private void getDataItem2() {
        list.clear();
        list.add(new DataItem2("Akash Singh","(2) Yesterday,12:52","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Rahul Singh","(4) Today, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Umesh","(4) Yeterday, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Rishi","(4) Today, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Vineet","(4) Today, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Riya","(4) Yetserday, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        list.add(new DataItem2("Aman","(4) Today, 6:32","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD","https://www.pngitem.com/pimgs/m/499-4994239_telephone-green-phone-symbol-hd-png-download.png"));
        recyclerView.setAdapter(new Adapter2(list,getContext()));



    }
}