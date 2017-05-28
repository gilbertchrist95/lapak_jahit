package cilok.com.lapakjahit;

/**
 * Created by Alhaura on 07/05/2017.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class FragmentCustomPria extends Fragment implements View.OnClickListener {

    ImageView imageViewKemeja;
    ImageView imageViewBajukoko;
    ImageView imageViewCelanaDasar;
    ImageView imageViewTuxedo;
    ImageView imageViewSweater;
    ImageView imageViewTopi;
    ImageView imageViewKaos;
    ImageView imageViewJeans;
    ImageView imageViewJaket;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_custom_pria, container, false);
        imageViewKemeja = (ImageView)v.findViewById(R.id.ic_fp_kemeja);
        imageViewBajukoko = (ImageView)v.findViewById(R.id.ic_fp_baju_koko);
        imageViewCelanaDasar = (ImageView)v.findViewById(R.id.ic_fp_celanadasar);
        imageViewTuxedo = (ImageView)v.findViewById(R.id.ic_fp_tuxedo);
        imageViewSweater = (ImageView)v.findViewById(R.id.ic_fp_sweater);
        imageViewTopi = (ImageView)v.findViewById(R.id.ic_fp_topi);
        imageViewKaos = (ImageView)v.findViewById(R.id.ic_fp_kaos);
        imageViewJeans = (ImageView)v.findViewById(R.id.ic_fp_jeans);
        imageViewJaket = (ImageView)v.findViewById(R.id.ic_fp_jaket);
        imageViewKemeja.setOnClickListener(this);
        imageViewBajukoko.setOnClickListener(this);
        imageViewCelanaDasar.setOnClickListener(this);
        imageViewTuxedo.setOnClickListener(this);
        imageViewSweater.setOnClickListener(this);
        imageViewTopi.setOnClickListener(this);
        imageViewKaos.setOnClickListener(this);
        imageViewJeans.setOnClickListener(this);
        imageViewJaket.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ic_fp_kemeja:
                Intent intentKemeja = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentKemeja.putExtra("ID_CATEGORY",getIdCategory("kemeja"));
                startActivity(intentKemeja);
                break;
            case R.id.ic_fp_baju_koko:
                Intent intentBajuKoko = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentBajuKoko.putExtra("ID_CATEGORY",getIdCategory("baju_koko"));
                startActivity(intentBajuKoko);
                break;
            case R.id.ic_fp_celanadasar:
                Intent intentCelanaDasar = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentCelanaDasar.putExtra("ID_CATEGORY",getIdCategory("celana_dasar"));
                startActivity(intentCelanaDasar);
                break;
            case R.id.ic_fp_sweater:
                Intent intentSweater = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentSweater.putExtra("ID_CATEGORY",getIdCategory("sweater"));
                startActivity(intentSweater);
                break;
            case R.id.ic_fp_tuxedo:
                Intent intentTuxedo = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentTuxedo.putExtra("ID_CATEGORY",getIdCategory("tuxedo"));
                startActivity(intentTuxedo);
                break;
            case R.id.ic_fp_topi:
                Intent intentTopi = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentTopi.putExtra("ID_CATEGORY",getIdCategory("topi"));
                startActivity(intentTopi);
                break;
            case R.id.ic_fp_kaos:
                Intent intentKaos = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentKaos.putExtra("ID_CATEGORY",getIdCategory("kaos"));
                startActivity(intentKaos);
                break;
            case R.id.ic_fp_jeans:
                Intent intentJeans= new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentJeans.putExtra("ID_CATEGORY",getIdCategory("jeans"));
                startActivity(intentJeans);
                break;
            case R.id.ic_fp_jaket:
                Intent intentJaket = new Intent(getActivity(),ActivityListCustomProduk1.class);
                intentJaket.putExtra("ID_CATEGORY",getIdCategory("jaket"));
                startActivity(intentJaket);
                break;
        }

    }

    int getIdCategory(String jenis){
        switch (jenis){
            case "kemeja": return 1;
            case "baju_koko": return 2;
            case "celana_dasar": return 3;
            case "tuxedo": return 4;
            case "sweater": return 5;
            case "topi": return 6;
            case "kaos": return 7;
            case "jeans": return 8;
            case "jaket": return 9;
        }
        return 0;
    }


}
