package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/14/2017.
 */

public class AdapterInboxMessages extends RecyclerView.Adapter<AdapterInboxMessages.ViewHolderMessage> {

    //contain list of message
    private ArrayList<InboxMessage> mListInboxMessage = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private DateFormat mFormatter1 = new SimpleDateFormat("dd/mm/yy");
    private DateFormat mFormatter2 = new SimpleDateFormat("HH:mm");
    //keep track of the previous position for animations where scrolling down requires a different animation compared to scrolling up
    private int mPreviousPosition = 0;

    public AdapterInboxMessages(Context context){
        mInflater = LayoutInflater.from(context);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setInboxMessage(ArrayList<InboxMessage> listInboxMessage){
        this.mListInboxMessage = listInboxMessage;
        //update the adapter to reflect the new set of message
        notifyDataSetChanged();
    }

    @Override
    public AdapterInboxMessages.ViewHolderMessage onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_message_inbox, parent, false);
        ViewHolderMessage viewHolder = new ViewHolderMessage(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterInboxMessages.ViewHolderMessage holder, int position) {
        InboxMessage currentInboxMessage = mListInboxMessage.get(position);
        holder.messagePartnerName.setText(currentInboxMessage.getPartnerName());

        String urlThumbnailAvatarPartner = currentInboxMessage.getUrlPartnerAvatar();
        loadImages(urlThumbnailAvatarPartner, holder);

//        Date updateAt = currentInboxMessage.getUpdatedAt();
        holder.messageUpdateAt.setText(currentInboxMessage.getUpdatedAt());
//
        holder.messageLastMessage.setText(currentInboxMessage.getLastMessage());

    }

    private void loadImages(String urlThumbnail, final ViewHolderMessage holder) {
        if (!urlThumbnail.equals(Constants.NA)) {
            mImageLoader.get(urlThumbnail, new ImageLoader.ImageListener() {
                @Override
                public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {
                    holder.messagePartnerAvatar.setImageBitmap(response.getBitmap());
                }

                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mListInboxMessage.size();
    }

    static class ViewHolderMessage extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView messagePartnerAvatar;
        TextView messagePartnerName;
        TextView messageUpdateAt;
        TextView messageLastMessage;

        public ViewHolderMessage(View itemView) {
            super(itemView);
            messagePartnerAvatar = (ImageView)itemView.findViewById(R.id.imageview_avatar_partner);
            messagePartnerName = (TextView)itemView.findViewById(R.id.textview_partner_name);
            messageUpdateAt = (TextView)itemView.findViewById(R.id.textview_update_time_message);
            messageLastMessage =(TextView)itemView.findViewById(R.id.textview_last_message);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
//            Intent intent = new Intent(view.getContext(), zz.class);
//            intent.putExtra(FormResponse.columnUpdateId,itemUpdateId);
//            v.getContext().startActivity(intent);
        }

    }
}
