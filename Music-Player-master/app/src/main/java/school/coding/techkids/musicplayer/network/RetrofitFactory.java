package school.coding.techkids.musicplayer.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HoangLong on 7/15/2017.
 */

public class RetrofitFactory {
    private static Retrofit retrofit;
    public static RetrofitFactory instance = new RetrofitFactory();
    public static RetrofitFactory getInstance(){
        return instance;
    }

    private RetrofitFactory() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://music-api-for-tk.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T create(final Class<T> service){
        return retrofit.create(service);
    }
}
