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

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CHATS#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CHATS extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CHATS() {
        // Required empty public constructor
    }

    private List<DataItem> list= new ArrayList<>();
    private RecyclerView recyclerView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CHATS.
     */
    // TODO: Rename and change types and number of parameters
    public static CHATS newInstance(String param1, String param2) {
        CHATS fragment = new CHATS();
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c_h_a_t_s, container, false);

        recyclerView= view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getDataItem();
        return view;
    }

    private void getDataItem() {
        list.clear();
        list.add(new DataItem("Akash Singh","Hye","10:23","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Rahul Singh","Can we meet","20:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Naman Shrama","Good Night","20:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Ishu Bansal","Whats Up","22:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Riya Jain","hello","18:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Akash Verma","good Morning","24:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        list.add(new DataItem("Ashish Singh","Whats Up","20:29","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FArtStory-Beautiful-Scenery-Fabulous-Sticker%2Fdp%2FB01KHXVIWS&psig=AOvVaw3HrV-onWRjqNzXHuSCgZPl&ust=1616782316100000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIij9MyFzO8CFQAAAAAdAAAAABAD"));
        recyclerView.setAdapter(new Adapter(list,getContext()));


    }


}

