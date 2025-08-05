package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.goq;

/* loaded from: classes5.dex */
public class gop implements goj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private gmv<goq> f28411a = new gor(new gov(new gou(null)));

    static {
        kge.a(-1951105727);
        kge.a(1160862778);
    }

    @Override // tb.goj
    public boolean b(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a565debb", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return false;
    }

    @Override // tb.goj
    public boolean a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2febb87a", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.f28411a.a(new goq.a().a(gof.a(recyclerView, i)).b(gof.a(recyclerView, i2)).a(gof.a(recyclerView)).a());
    }
}
