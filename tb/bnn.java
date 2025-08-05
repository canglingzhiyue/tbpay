package tb;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class bnn extends RecyclerView.Adapter<h> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RecyclerViewAdapter";
    public bny b;
    public List<IDMComponent> c = new ArrayList();
    public j d;

    static {
        kge.a(1422866153);
        kge.a(766180776);
    }

    public static /* synthetic */ Object ipc$super(bnn bnnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, hVar, new Integer(i)});
        } else {
            a(hVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.alibaba.android.ultron.vfw.viewholder.h, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ h mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public bnn(bny bnyVar) {
        this.b = bnyVar;
        this.d = (j) bnyVar.a(j.class);
    }

    public void b(List<IDMComponent> list) {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (list != null) {
            this.c.clear();
            this.c.addAll(list);
        }
        if (!this.b.A() || (jVar = this.d) == null) {
            return;
        }
        jVar.a(this.c);
    }

    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (-1 == i) {
            return new h(bpl.a(this.b.k()));
        }
        return this.d.a(viewGroup, i);
    }

    public void a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266ab0d6", new Object[]{this, hVar, new Integer(i)});
        } else if (i >= this.c.size()) {
            jpr.a(jpu.a(this.b.r()).c(TAG).b("onBindViewHolder IndexOutOfBounds"));
        } else {
            IDMComponent iDMComponent = this.c.get(i);
            if (iDMComponent == null) {
                return;
            }
            a(iDMComponent, i);
            this.d.a(hVar, iDMComponent);
        }
    }

    private void a(IDMComponent iDMComponent, int i) {
        ConcurrentHashMap<String, Object> safeExtMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6480897", new Object[]{this, iDMComponent, new Integer(i)});
        } else if (iDMComponent == null || (safeExtMap = iDMComponent.getSafeExtMap()) == null) {
        } else {
            safeExtMap.put("ultronDMComponentIndex", Integer.valueOf(i));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.d.a(this.c.get(i));
    }
}
