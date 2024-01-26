package com.pau.moviesdatabaseapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.widget.Toast
import com.pau.moviesdatabaseapi.databinding.ActivityMainBinding

import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.ConnectionSpec
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.TlsVersion
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        searchMost_pop_movies()
        binding.btnSiguiente.setOnClickListener {
            searchMost_pop_movies()
        }
    }

    fun provideRetrofitMovieInstance(): Retrofit {
        val client = OkHttpClient.Builder()
        client.connectTimeout(35, TimeUnit.SECONDS)
        client.readTimeout(35, TimeUnit.SECONDS)
        client.writeTimeout(35, TimeUnit.SECONDS)

        val specs: MutableList<ConnectionSpec> = ArrayList()

        specs.add(
            ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                .tlsVersions(TlsVersion.TLS_1_2)
                .build())
        specs.add(ConnectionSpec.COMPATIBLE_TLS)
        specs.add(ConnectionSpec.CLEARTEXT)
        client.connectionSpecs(specs)
        client.hostnameVerifier { _, _ -> true }

        client.addInterceptor(Interceptor { chain ->
            val original: Request = chain.request()
            val request = original.newBuilder()
                .header("x-rapidapi-host", "moviesdatabase.p.rapidapi.com/")
                .header("x-rapidapi-key", "369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c1a5")
                .method(original.method(), original.body())
                .build()

            return@Interceptor chain.proceed(request)
        })

        return Retrofit.Builder()
            .baseUrl("https://moviesdatabase.p.rapidapi.com/titles/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()

            .baseUrl("https://moviesdatabase.p.rapidapi.com/")//Parte fija de la URL, la que no varia
            .addConverterFactory(GsonConverterFactory.create())//Libreria de GsonConverter, convierte JSON a ComicResponse
            .build()

    }

    private fun searchMost_pop_movies() {

        val apiKey = "369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c1a5"
        CoroutineScope(Dispatchers.IO).launch {
            //Opcio 1
            val client = OkHttpClient()

            val request = Request.Builder()
                .url("https://moviesdatabase.p.rapidapi.com/titles/random?list=top_rated_series_250")
                .get()
                .addHeader("X-RapidAPI-Key", apiKey)
                .addHeader("X-RapidAPI-Host", "moviesdatabase.p.rapidapi.com")
                .build()

            val response = client.newCall(request).execute()
            Log.i("JSON pop series:", response.toString()) //   I  Response{protocol=h2, code=401, message=, url=https://moviesdatabase.p.rapidapi.com/titles/random?list=most_pop_series&api_key=369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c}

            //Opcio 2

            val apiService = createApiService(apiKey).getMovies("most_pop_series")
            Log.i("JSON apyKey:", apiService.toString()) //   I  Response{protocol=h2, code=401, message=, url=https://moviesdatabase.p.rapidapi.com/titles/random?list=most_pop_series&api_key=369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c}

            //Opcio 3
            val call = provideRetrofitMovieInstance()
                .create(APIService::class.java)
                .getMovies("most_pop_series", "","")
            Log.i("JSON retrofit:", call.toString()) //   I  Response{protocol=h2, code=401, message=, url=https://moviesdatabase.p.rapidapi.com/titles/random?list=most_pop_series&api_key=369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c}

            val listaPeliculas = call.body()?.result//en el body es donde está la respuesta
            Log.i("Lista Peliculas:", listaPeliculas.toString()) //   I  Response{protocol=h2, code=401, message=, url=https://moviesdatabase.p.rapidapi.com/titles/random?list=most_pop_series&api_key=369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c}

            runOnUiThread {
                if(response.isSuccessful){ //Si hay contenido dentro //Response, request, call...
                    val img: String = listaPeliculas?.get(0)?.primaryImage?.url ?: ""
                    val title: String = listaPeliculas?.get(0)?.originalTitleText?.text ?: ""

                    showImage(img, title)

                }else{
                    showToast("Fallo al cargar imagen")
                }
            }
        }

    }

    //API:  https://rapidapi.com/iframe-apps/api-playground/latest/Playground.html?brand=default&locale=en-US&mode=light&apiId=api_f21e64d2-3fb6-4d55-8aa8-e98734551288&date=1706113728615&owner=SAdrian&slug=moviesdatabase&preSelectedEntity=8620513
    //Codi de prova segons la web:
    /*
val client = OkHttpClient()

val request = Request.Builder()
	.url("https://moviesdatabase.p.rapidapi.com/titles/random?list=most_pop_movies")
	.get()
	.addHeader("X-RapidAPI-Key", "369325d9eemsh3aead09ccc37ad0p1f07d3jsn7ed26875c1a5")
	.addHeader("X-RapidAPI-Host", "moviesdatabase.p.rapidapi.com")
	.build()

val response = client.newCall(request).execute()
     */

    private fun showToast(mensaje: String) {
        Toast.makeText(this ,mensaje, Toast.LENGTH_SHORT).show()
    }

    private fun showImage(img: String?, title: String?) {
        if (img != null && img != "") {
            Picasso.get().load(img).into(binding.tvImagen)
            binding.tvDesc.text = title
        }

    }


}