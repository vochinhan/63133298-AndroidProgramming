package vcnhan.example.customlistview_appmonan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    ArrayList<MonAn> list;
    LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(Context _context, ArrayList<MonAn> _list) {
        this.list = _list;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View curView = convertView;
        if (curView == null)
            curView = layoutInflater.inflate(R.layout.item_monan, null);

        MonAn curMonAn = list.get(position);


        TextView textView_TenMonAn = (TextView) curView.findViewById(R.id.tvTenMonAn);
        TextView textView_GiaMonAn = (TextView) curView.findViewById(R.id.tvGiaMonAn);
        TextView textView_MoTa = (TextView) curView.findViewById(R.id.tvMoTa);
        ImageView img_AnhDaiDien = (ImageView) curView.findViewById(R.id.imgAnhDaiDien);

        textView_TenMonAn.setText(curMonAn.getTenMonAn());
        textView_GiaMonAn.setText(String.valueOf(curMonAn.getDonGia()) + "$");
        textView_MoTa.setText(curMonAn.getMoTa());
        img_AnhDaiDien.setImageResource(curMonAn.getAnhMinhHoa());

        return curView;
    }
}
