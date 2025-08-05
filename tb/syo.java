package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.t;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class syo extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33960a;
    private ArrayList<SizeChartItemModel> b;
    private int d;
    private int c = t.DEFAULT_WIDTH;
    private int e = -1;

    static {
        kge.a(387647471);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public syo(Context context, ArrayList<SizeChartItemModel> arrayList) {
        this.f33960a = context;
        this.b = arrayList;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        RecyclerView recyclerView = new RecyclerView(this.f33960a);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        return new a(recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!(viewHolder instanceof a)) {
        } else {
            int c = c(i);
            int i2 = this.c;
            if (i2 > c) {
                c = i2;
            }
            a(viewHolder.itemView, c, this.d);
            RecyclerView a2 = ((a) viewHolder).a();
            a2.setLayoutManager(new LinearLayoutManager(this.f33960a, 1, false));
            syp sypVar = new syp(this.f33960a, this.b.get(i));
            sypVar.b(c);
            sypVar.a(true);
            sypVar.a(this.e, false);
            a2.setAdapter(sypVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<SizeChartItemModel> arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return (this.b.get(i).maxLength * t.DEFAULT_TEXT_SIZE) + t.DEFAULT_TEXT_PADDING + t.DEFAULT_TEXT_PADDING;
        } catch (Exception unused) {
            return t.DEFAULT_WIDTH;
        }
    }

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RecyclerView b;

        static {
            kge.a(-1562406552);
        }

        public a(RecyclerView recyclerView) {
            super(recyclerView);
            this.b = recyclerView;
        }

        public RecyclerView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this}) : this.b;
        }
    }
}
