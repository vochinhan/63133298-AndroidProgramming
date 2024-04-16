package vcnhan.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<Landscape> list;

    public LandscapeAdapter(Context context, ArrayList<Landscape> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItem = layoutInflater.inflate(R.layout.item_landscape, parent, false);
        return new ItemLandHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        Landscape landscape = list.get(position);

        String caption = landscape.getName();
        String img = landscape.getImg();

        holder.caption.setText(caption);

        String packageName = holder.itemView.getContext().getPackageName();
        int imgId = holder.itemView.getResources().getIdentifier(img, "mipmap", packageName);
        holder.img.setImageResource(imgId);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder {
        TextView caption;
        ImageView img;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);

            caption = itemView.findViewById(R.id.tvCaption);
            img = itemView.findViewById(R.id.imgLand);
        }
    }
}
