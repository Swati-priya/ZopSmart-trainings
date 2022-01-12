package com.example.retrofiltimplementation

import retrofit2.Response
import retrofit2.http.*

interface AlbumService {
    //for retrieving data items from server
    @GET("/albums")
    suspend fun getAlbums():Response<Album>

    //for performing certain query
    @GET("/albums")
    suspend fun getSortedAlbums(@Query(value = "userId") userId:Int):Response<Album>

    //for getting path
    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId:Int): Response<AlbumItem>

   @POST("/album")
   suspend fun  uploadAlbum(@Body album: AlbumItem):Response<AlbumItem>



}