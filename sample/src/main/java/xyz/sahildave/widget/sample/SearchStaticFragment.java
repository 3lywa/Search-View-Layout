package xyz.sahildave.widget.sample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SearchStaticFragment extends Fragment {

    private RecyclerView stops;

    public SearchStaticFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_static, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        stops = (RecyclerView)getView().findViewById(android.R.id.list);
        stops.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        List<String> oList = new ArrayList<>();
        for(int i=0; i< 50; i++){
            oList.add("TEST " + i);
        }

        LStopAdapter adapter = new LStopAdapter(getActivity(), oList);
        stops.setAdapter(adapter);
    }
}