package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.t;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class syp extends syl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int e;
    private final int f;
    private SizeChartItemModel g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f33962a;
        public TextView b;
        public View c;
        public View d;

        static {
            kge.a(-771406754);
        }

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.tv_desc_size_chart_recommend);
            this.f33962a = (TextView) view.findViewById(R.id.tv_desc_size_chart_item);
            this.c = view.findViewById(R.id.v_detail_size_chart_top_div);
            this.d = view.findViewById(R.id.v_detail_size_chart_bottom_div);
        }
    }

    static {
        kge.a(1266714553);
    }

    public static /* synthetic */ Object ipc$super(syp sypVar, String str, Object... objArr) {
        if (str.hashCode() == 275888298) {
            super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : i == 0;
    }

    public syp(Context context, SizeChartItemModel sizeChartItemModel) {
        super(context);
        this.e = 0;
        this.f = 1;
        this.h = 0;
        this.i = t.DEFAULT_WIDTH;
        this.k = -1;
        this.g = sizeChartItemModel;
        try {
            this.h = sizeChartItemModel.rowData.size() + 1;
        } catch (Exception unused) {
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        notifyDataSetChanged();
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            return new b(LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_desc_measures_title_item, (ViewGroup) null));
        }
        return new a(LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_include_desc_size_chart_title_column, (ViewGroup) null));
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(viewHolder, i);
        int i2 = 8;
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.f33962a.setText(d(i));
            if (this.k == i) {
                TextView textView = aVar.b;
                if (this.l) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                aVar.itemView.setBackgroundResource(R.drawable.tt_detail_size_chart_recommend_line_bg);
                aVar.c.setVisibility(0);
                aVar.d.setVisibility(0);
            }
        } else if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            bVar.a().setText(d(i));
            if (!TextUtils.isEmpty(this.g.tip)) {
                TextView b2 = bVar.b();
                b2.setText(this.g.tip);
                b2.setVisibility(0);
            }
            if (this.j) {
                bVar.c().setVisibility(0);
            } else {
                bVar.c().setVisibility(8);
            }
        }
        int a2 = a();
        int i3 = this.i;
        if (i3 > a2) {
            a2 = i3;
        }
        a(viewHolder.itemView, a2);
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.h;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : c(i) ? 0 : 1;
    }

    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        int i2 = t.DEFAULT_HEIGHT;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{this, new Integer(i)});
        }
        try {
            if (i == 0) {
                return this.g.title;
            }
            return this.g.rowData.get((i % this.h) - 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        try {
            return (this.g.maxLength * t.DEFAULT_TEXT_SIZE) + t.DEFAULT_TEXT_PADDING + t.DEFAULT_TEXT_PADDING;
        } catch (Exception unused) {
            return t.DEFAULT_WIDTH;
        }
    }

    /* loaded from: classes5.dex */
    public class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TextView b;
        private TextView c;
        private View d;

        static {
            kge.a(136214046);
        }

        public b(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.item_tv);
            this.c = (TextView) view.findViewById(R.id.tip);
            this.d = view.findViewById(R.id.divider);
        }

        public TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.b;
        }

        public TextView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this}) : this.c;
        }

        public View c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.d;
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.k = i;
        this.l = z;
        notifyDataSetChanged();
    }
}
