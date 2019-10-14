package com.hagogamesdk.baserecyclerviewadapterhelper.adapter;

import com.hagogamesdk.baserecyclerviewadapterhelper.R;
import com.hagogamesdk.baserecyclerviewadapterhelper.entity.HomeItem;
import com.hagogamesdk.library.adapter.base.BaseQuickAdapter;
import com.hagogamesdk.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class HomeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public HomeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.icon, item.getImageResource());
    }
}
