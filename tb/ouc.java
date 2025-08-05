package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;
import java.util.List;

/* loaded from: classes8.dex */
public class ouc<T extends b> extends RecyclerView.Adapter<ouf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f32424a;
    public List<T> b;
    public boolean c;
    public JSONObject d;

    static {
        kge.a(-617464214);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(ouf oufVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, oufVar, new Integer(i)});
        } else {
            a(oufVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, tb.ouf] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ ouf mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public ouc(Context context, List<T> list) {
        this(context, list, false, null);
    }

    public ouc(Context context, List<T> list, boolean z, JSONObject jSONObject) {
        this.f32424a = context;
        this.b = list;
        this.c = z;
        this.d = jSONObject;
    }

    public void a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public ouf a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ouf) ipChange.ipc$dispatch("56b50c8a", new Object[]{this, viewGroup, new Integer(i)}) : oue.a(this.f32424a, i, this.c, this.d);
    }

    public void a(ouf oufVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b406e6b", new Object[]{this, oufVar, new Integer(i)});
        } else {
            oufVar.a(this.b.get(i), i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.b.get(i).c().index;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.b.size();
    }
}
