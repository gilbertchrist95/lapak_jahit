package cilok.com.lapakjahit.callback;

import java.util.List;

import cilok.com.lapakjahit.entity.Favorite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Gilbert on 5/19/2017.
 */

public interface FavoriteService {
    @GET("favorites.json")
    Call<Favorite> getFavorites(@Query("page") int page);

    @GET("favorites.json")
    Call<Favorite> getFavorites();
}
