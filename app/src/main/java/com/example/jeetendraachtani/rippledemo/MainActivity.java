package com.example.jeetendraachtani.rippledemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private ArrayList<FilterModel> filterModelArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        initialize();
        setAdapterData();

    }

    private void initialize() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapterData() {
        try {

            filterModelArrayList = StaticDataList.getFilterList();
            ListAdapter listAdapter = new ListAdapter(this, filterModelArrayList);

            recyclerView.setAdapter(listAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class ListAdapter extends RecyclerView.Adapter<ListAdapter.VersionViewHolder> {
        ArrayList<FilterModel> mArrayList;
        Context mContext;


        public ListAdapter(Context context, ArrayList<FilterModel> arrayListFollowers) {
            mArrayList = arrayListFollowers;
            mContext = context;
        }

        @Override
        public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_filter, viewGroup, false);
            VersionViewHolder viewHolder = new VersionViewHolder(view);
            return viewHolder;
        }


        @SuppressLint("ResourceAsColor")
        @Override
        public void onBindViewHolder(final VersionViewHolder versionViewHolder, final int i) {
            try {
                FilterModel mCasesListModel = mArrayList.get(i);

                versionViewHolder.tvTitle.setText(mCasesListModel.title);
                versionViewHolder.tvID.setText(mCasesListModel.id);

                versionViewHolder.tvID.setClickable(true);
                versionViewHolder.tvID.setFocusable(true);

                versionViewHolder.tvTitle.setClickable(true);
                versionViewHolder.tvTitle.setFocusable(true);



            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public int getItemCount() {
            return mArrayList.size();
        }


        class VersionViewHolder extends RecyclerView.ViewHolder {
            TextView tvTitle, tvID;
            RelativeLayout rlLayout;


            public VersionViewHolder(View itemView) {
                super(itemView);

                tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
                tvID = (TextView) itemView.findViewById(R.id.tvID);
                rlLayout = (RelativeLayout) itemView.findViewById(R.id.rlLayout);


            }

        }


    }
}

