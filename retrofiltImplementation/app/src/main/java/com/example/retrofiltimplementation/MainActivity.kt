package com.example.retrofiltimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retService: AlbumService = RetrofitInstance.getRetrofitInstance().create(AlbumService::class.java)

        val responseLiveData: LiveData<Response<Album>> = liveData{
          // val listOfAlbum = retService.getSortedAlbums(3) //for query
            val listOfAlbum = retService.getAlbums() //for retrieving data items
            emit(listOfAlbum)
        }
        responseLiveData.observe(this, Observer {
            val albumsList: MutableListIterator<AlbumItem>? =it.body()?.listIterator()
            if(albumsList != null){
                while (albumsList.hasNext()){
                    val albumItem:AlbumItem= albumsList.next()
                    Log.i("MY_TAG_QUERY",albumItem.id.toString())
                    Log.i("My_Tag_Query",albumItem.title)
                }
            }
        })
        //for path
     /*   val responseLiveDataForPath:LiveData<Response<AlbumItem>> = liveData {
            val albumItem = retService.getAlbum(3)
            emit(albumItem)

        }
        responseLiveDataForPath.observe(this, Observer {
            val albumItem = it.body()
            albumItem?.let { it1 ->
                Log.i("MY_TAG_PATH", albumItem.title)
            }
        })*/
        //uploadAlbum(retService)
  /*  }
   private fun uploadAlbum(retService: AlbumService) {
        val album = AlbumItem(0, "My title", 3)
        val postResponse: LiveData<Response<AlbumItem>> = liveData {
            val response = retService.uploadAlbum(album)
            emit(response)
        }
        postResponse.observe(this, Observer {

        }) */
    }
}