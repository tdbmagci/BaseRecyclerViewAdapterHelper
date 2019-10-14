package com.hagogamesdk.baserecyclerviewadapterhelper.adapter;

import com.hagogamesdk.baserecyclerviewadapterhelper.R;
import com.hagogamesdk.baserecyclerviewadapterhelper.base.BaseDataBindingAdapter;
import com.hagogamesdk.baserecyclerviewadapterhelper.databinding.ItemMovieBinding;
import com.hagogamesdk.baserecyclerviewadapterhelper.entity.Movie;

/**
 * Created by tysheng
 * Date: 2017/5/25 10:47.
 * Email: tyshengsx@gmail.com
 */

public class UpFetchAdapter extends BaseDataBindingAdapter<Movie, ItemMovieBinding> {
    public UpFetchAdapter() {
        super(R.layout.item_movie, null);
    }

    @Override
    protected void convert(ItemMovieBinding binding, Movie item) {
        binding.setMovie(item);
    }
}
