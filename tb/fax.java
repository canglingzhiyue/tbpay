package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.c;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fbe;

/* loaded from: classes5.dex */
public class fax extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<fbe.a> f27725a;
    private Context b;
    private int c = epo.b(160);

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f27726a;
        public View b;
        public LinearLayout c;

        static {
            kge.a(969148009);
        }

        public a(View view) {
            super(view);
            this.f27726a = (TextView) view.findViewById(R.id.wear_item_title);
            this.b = view.findViewById(R.id.wear_item_title_line);
            this.c = (LinearLayout) view.findViewById(R.id.wear_item_content_lt);
        }
    }

    static {
        kge.a(-68857586);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public fax(Context context, ArrayList<fbe.a> arrayList) {
        this.b = context;
        this.f27725a = arrayList;
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.ModelWearAdapter");
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        a aVar = new a(LayoutInflater.from(this.b).inflate(R.layout.x_detail_desc_model_wear_item, (ViewGroup) null));
        int i2 = this.c;
        if (this.f27725a.size() * this.c <= epo.b) {
            i2 = epo.b / this.f27725a.size();
        }
        aVar.itemView.setLayoutParams(new ViewGroup.LayoutParams(i2, -2));
        return aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        a aVar = (a) viewHolder;
        fbe.a aVar2 = this.f27725a.get(i);
        aVar.f27726a.setText(aVar2.f27739a);
        if (i % 2 == 0) {
            aVar.b.setBackgroundColor(c.a("#FFB63F"));
            aVar.itemView.setBackgroundColor(c.a("#F5F5F5"));
        } else {
            aVar.b.setBackgroundColor(c.a("#FF7485"));
            aVar.itemView.setBackgroundColor(c.a("#F9F9F9"));
        }
        if (getItemCount() == 1) {
            TextView textView = new TextView(this.b);
            textView.setTextSize(1, 14.0f);
            textView.setPadding(3, 3, 3, 3);
            Iterator<Pair<String, String>> it = aVar2.b.iterator();
            while (it.hasNext()) {
                Pair<String, String> next = it.next();
                String charSequence = textView.getText().toString();
                if (!rjq.a(charSequence)) {
                    charSequence = charSequence + "   ";
                }
                textView.setText(charSequence + ((String) next.first) + ":  " + ((String) next.second));
            }
            aVar.c.addView(textView);
        } else if (aVar.c.getChildCount() > 0) {
            View view = new View(this.b);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
            aVar.c.addView(view);
        } else {
            Iterator<Pair<String, String>> it2 = aVar2.b.iterator();
            while (it2.hasNext()) {
                Pair<String, String> next2 = it2.next();
                TextView textView2 = new TextView(this.b);
                textView2.setTextSize(1, 12.0f);
                textView2.setPadding(3, 3, 3, 3);
                textView2.setText(((String) next2.first) + ":  " + ((String) next2.second));
                aVar.c.addView(textView2);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<fbe.a> list = this.f27725a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
