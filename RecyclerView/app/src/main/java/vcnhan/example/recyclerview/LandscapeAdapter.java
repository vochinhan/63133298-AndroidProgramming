package vcnhan.example.recyclerview;

import android.content.Context;
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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static final class ItemLandHolder extends RecyclerView.ViewHolder {
        TextView caption;
        ImageView img;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);

            caption = itemView.findViewById(R.id.tvCaption);
            img = itemView.findViewById(R.id.imgLand);
        }
    }
}
