package com.hagogamesdk.baserecyclerviewadapterhelper.adapter;

import com.hagogamesdk.baserecyclerviewadapterhelper.R;
import com.hagogamesdk.baserecyclerviewadapterhelper.data.DataServer;
import com.hagogamesdk.baserecyclerviewadapterhelper.entity.Status;
import com.hagogamesdk.library.adapter.base.BaseQuickAdapter;
import com.hagogamesdk.library.adapter.base.BaseViewHolder;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class HeaderAndFooterAdapter extends BaseQuickAdapter<Status, BaseViewHolder> {

    public HeaderAndFooterAdapter(int dataSize) {
        super(R.layout.item_header_and_footer, DataServer.getSampleData(dataSize));
    }

    @Override
    protected void convert(BaseViewHolder helper, Status item) {
        switch (helper.getLayoutPosition()%
                3){
            case 0:
                helper.setImageResource(R.id.iv,R.mipmap.animation_img1);
                break;
            case 1:
                helper.setImageResource(R.id.iv,R.mipmap.animation_img2);
                break;
            case 2:
                helper.setImageResource(R.id.iv,R.mipmap.animation_img3);
                break;
        }
    }


}
