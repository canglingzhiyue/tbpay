package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public class rjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f33180a = new CopyOnWriteArrayList();

    static {
        kge.a(1918056987);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this) {
            Iterator<Object> it = this.f33180a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this) {
            Iterator<Object> it = this.f33180a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
