package tb;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.snk;
import tb.snr;

/* loaded from: classes5.dex */
public final class snp extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final snk f33749a;
    public final psw b;
    private final SparseArray<View> c;
    private final sno d;

    static {
        kge.a(-589273151);
    }

    public snp(View view, psw pswVar, sno snoVar, snk.a aVar, snr.a aVar2) {
        super(view);
        this.c = new SparseArray<>();
        this.b = pswVar;
        this.d = snoVar;
        this.f33749a = new snk(pswVar, aVar, aVar2);
    }

    public <T extends View> T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)}) : (T) b(i);
    }

    public sno b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sno) ipChange.ipc$dispatch("16bc3b89", new Object[]{this}) : this.d;
    }

    public snk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snk) ipChange.ipc$dispatch("f0a95ae", new Object[]{this}) : this.f33749a;
    }

    public psw c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("1e6c9788", new Object[]{this}) : this.b;
    }

    public <T extends View> T b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        T t = (T) this.c.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.c.put(i, t2);
        return t2;
    }
}
