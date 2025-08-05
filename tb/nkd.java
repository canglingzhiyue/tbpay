package tb;

import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class nkd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_MODULE = "TBPrivacyGuard";

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<nke> f31529a = new LinkedList<>();

    static {
        kge.a(-1020275866);
    }

    public nkd() {
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        Iterator<nke> it = this.f31529a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f31529a.add(new nkh());
        this.f31529a.addLast(new nkf());
        String str = "registerReporter: the num of reporters is: " + this.f31529a.size();
    }

    public void a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afdd1f1", new Object[]{this, invocation});
            return;
        }
        Iterator<nke> it = this.f31529a.iterator();
        while (it.hasNext()) {
            nke next = it.next();
            if (next.a(invocation)) {
                next.b(invocation);
                return;
            }
        }
    }
}
