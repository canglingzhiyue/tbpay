package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.b;
import com.taobao.phenix.cache.disk.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class niy implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f31493a = {17, 34, 51, 68, 85, 102};
    private static final String[] b = {"top1", "top2", "top3", "top4", "top5", "top6"};
    private static final int c = f31493a.length;
    private Map<Integer, b> d = new HashMap();

    @Override // com.taobao.phenix.cache.disk.e
    public /* synthetic */ b a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f4b51b01", new Object[]{this, new Integer(i)}) : b(i);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (com.taobao.alivfsadapter.b.a().f()) {
                return;
            }
            com.taobao.alivfsadapter.b.a().a((Application) com.taobao.phenix.intf.b.h().n());
        } catch (Throwable th) {
            niw.d("DiskCache", "alivfs inited error=%s", th);
        }
    }

    public synchronized nix b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nix) ipChange.ipc$dispatch("d4e82e8f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < c; i2++) {
            if (f31493a[i2] == i) {
                return (nix) a(i, i2);
            }
        }
        return null;
    }

    private synchronized b a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7308b634", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        nix nixVar = (nix) this.d.get(Integer.valueOf(i));
        if (nixVar == null) {
            nixVar = new nix(i, b[i2]);
            this.d.put(Integer.valueOf(i), nixVar);
        }
        return nixVar;
    }

    @Override // com.taobao.phenix.cache.disk.e
    public synchronized Collection<b> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this});
        }
        for (int i = 0; i < c; i++) {
            a(f31493a[i], i);
        }
        return this.d.values();
    }
}
