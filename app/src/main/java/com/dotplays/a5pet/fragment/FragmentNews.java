package com.dotplays.a5pet.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dotplays.a5pet.R;
import com.dotplays.a5pet.adapter.FeedAdapter;
import com.dotplays.a5pet.ion.Constant;
import com.dotplays.a5pet.model.Feed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MAC2015 on 3/13/17.
 */

public class FragmentNews extends MFragment {
    private RecyclerView lv_list;
    private FeedAdapter feedAdapter;


    public static MFragment instance(int position) {
        FragmentNews fragmentNews = new FragmentNews();
        Bundle bundle = new Bundle();
        bundle.putInt(Constant.DATA, position);
        fragmentNews.setArguments(bundle);
        return fragmentNews;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lv_list = (RecyclerView) view.findViewById(R.id.lv_list);
        List<Feed> feeds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            feeds.add(new Feed());
        }
        feedAdapter = new FeedAdapter(getActivity(), feeds);
        lv_list.setAdapter(feedAdapter);
        lv_list.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
}
