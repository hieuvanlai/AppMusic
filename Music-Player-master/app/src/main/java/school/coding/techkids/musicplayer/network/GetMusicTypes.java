package school.coding.techkids.musicplayer.network;

import retrofit2.Call;
import retrofit2.http.GET;
import school.coding.techkids.musicplayer.model.AllMusicTypesJSONModel;

/**
 * Created by HoangLong on 7/15/2017.
 */

public interface GetMusicTypes {
    @GET("api")
    Call<AllMusicTypesJSONModel> getMusicTypes();
}
