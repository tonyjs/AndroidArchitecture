//package iammert.com.androidarchitecture.ui.main
//
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import iammert.com.androidarchitecture.data.local.entity.MovieEntity
//import iammert.com.androidarchitecture.databinding.ItemMovieListBinding
//import iammert.com.androidarchitecture.ui.BaseAdapter
//
//class MovieListAdapter(val movieListCallback: MovieListCallback) :
//        BaseAdapter<MovieListAdapter.MovieViewHolder, MovieEntity>() {
//
//    private lateinit var movieEntities: List<MovieEntity>
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
//        return MovieViewHolder.create(LayoutInflater.from(parent.context), parent, movieListCallback)
//    }
//
//    override fun onBindViewHolder(p0: MovieViewHolder?, p1: Int) {
//        //TODO("not implemented")
//    }
//
//    override fun getItemCount(): Int {
//        return movieEntities.size
//    }
//
//    override fun setData(data: List<MovieEntity>) {
//        movieEntities = data
//        notifyDataSetChanged()
//    }
//
//    class MovieViewHolder(view: View,
//                          val callback: MovieListCallback) : RecyclerView.ViewHolder(view) {
//        companion object {
//            fun create(inflater: LayoutInflater, parent: ViewGroup, callback: MovieListCallback): MovieViewHolder {
//                val binding = ItemMovieListBinding.inflate(inflater, parent, false)
//                return MovieViewHolder(binding.root, callback)
//            }
//        }
//    }
//}