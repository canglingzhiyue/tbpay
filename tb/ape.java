package tb;

import android.content.Context;
import com.alibaba.analytics.core.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class ape implements apd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1692500027);
        kge.a(1116571026);
    }

    public ape(Context context) {
    }

    @Override // tb.apd
    public synchronized boolean a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        aob.a().G().a(list);
        return true;
    }

    @Override // tb.apd
    public synchronized int b(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{this, list})).intValue();
        }
        return aob.a().G().b(list);
    }

    @Override // tb.apd
    public synchronized List<a> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        return aob.a().G().a(a.class, null, "priority DESC , time DESC ", i);
    }

    @Override // tb.apd
    public synchronized int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return aob.a().G().b(a.class);
    }

    @Override // tb.apd
    public synchronized int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        apr.c();
        aoe G = aob.a().G();
        return G.a(a.class, str + "< ?", new String[]{str2});
    }

    @Override // tb.apd
    public synchronized int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        apr.c();
        String a2 = aob.a().G().a(a.class);
        aoe G = aob.a().G();
        return G.a(a.class, " _id in ( select _id from " + a2 + "  ORDER BY priority ASC , _id ASC LIMIT " + i + " )", (String[]) null);
    }

    @Override // tb.apd
    public synchronized void c(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            aob.a().G().d(list);
        }
    }
}
