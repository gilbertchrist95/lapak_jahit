package cilok.com.lapakjahit.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.callback.FavoriteService;
import cilok.com.lapakjahit.entity.Favorite;
import cilok.com.lapakjahit.extras.FavoritesUtils;
import cilok.com.lapakjahit.log.L;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFavorit extends Fragment {
    List<Favorite.ProductsBean> product;
    private FavoriteService mFavoriteService;
    String userId, token;
    public FragmentFavorit() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout =inflater.inflate(R.layout.fragment_favorit, container, false);;
//        FileInputStream fileInputStream=null;
//        try {
//            fileInputStream =getActivity().openFileInput("User.txt");
//            InputStreamReader in = new InputStreamReader(fileInputStream);
//            BufferedReader bufferedReader = new BufferedReader(in);
//            String line =  null;
//            String str = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                str += line;
//            }
//
//
////            StringBuffer buffer = new StringBuffer();
////            while((read=fileInputStream.read())!=-1){
////                buffer.append((char)read);
////            }
////            L.m(buffer+"");
//            Toast.makeText(getActivity(), ""+str, Toast.LENGTH_SHORT).show();
////            userId = buffer.substring(0,buffer.indexOf(" "));
////            token = buffer.substring(buffer.indexOf(" "+1));
////            Toast.makeText(getActivity(), userId+" "+token, Toast.LENGTH_SHORT).show();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mFavoriteService = FavoritesUtils.getFavoitesService("", "");
        mFavoriteService = FavoritesUtils.getFavoitesService(getActivity());
        mFavoriteService.getFavorites().enqueue(new Callback<Favorite>() {
            @Override
            public void onResponse(Call<Favorite> call, Response<Favorite> response) {
//                product = new ArrayList<Favorite.ItemProducts>();
//                Favorite result = response.body();
//                product = result.getProducts();
//
//                for (int i = 0; i < product.size(); i++) {
//                    L.m(product.get(i).getId());
//                }
                L.m(""+response.code());
            }

            @Override
            public void onFailure(Call<Favorite> call, Throwable t) {

            }
        });
        test();
        return layout;
    }

    private void test() {


    }
}
