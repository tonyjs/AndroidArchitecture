package iammert.com.androidarchitecture.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import iammert.com.androidarchitecture.data.local.entity.MovieEntity;
import iammert.com.androidarchitecture.databinding.ItemMovieListBinding;
import iammert.com.androidarchitecture.ui.BaseAdapter;

/**
 * Created by mertsimsek on 20/05/2017.
 */

public class MovieListAdapter extends BaseAdapter<MovieListAdapter.MovieViewHolder, MovieEntity> {

    private final MovieListCallback movieListCallback;
    private List<MovieEntity> movieEntities;

    public MovieListAdapter(@NonNull MovieListCallback movieListCallback) {
        movieEntities = new ArrayList<>();
        this.movieListCallback = movieListCallback;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return MovieViewHolder.create(LayoutInflater.from(viewGroup.getContext()), viewGroup, movieListCallback);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder viewHolder, int i) {
        viewHolder.onBind(movieEntities.get(i));
    }

    @Override
    public int getItemCount() {
        return movieEntities.size();
    }

    @Override
    public void setData(@NotNull List<MovieEntity> movieEntities) {
        this.movieEntities = movieEntities;
        notifyDataSetChanged();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {

        ItemMovieListBinding binding;

        public MovieViewHolder(ItemMovieListBinding binding, MovieListCallback callback) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(v ->
                    callback.onMovieClicked(binding.getMovie(), binding.imageViewCover));
        }

        public static MovieViewHolder create(LayoutInflater inflater, ViewGroup parent, MovieListCallback callback) {
            ItemMovieListBinding itemMovieListBinding = ItemMovieListBinding.inflate(inflater, parent, false);
            return new MovieViewHolder(itemMovieListBinding, callback);
        }

        public void onBind(MovieEntity movieEntity) {
            binding.setMovie(movieEntity);
            binding.executePendingBindings();
        }
    }
}
