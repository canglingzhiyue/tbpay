package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.locator.callback.LocatorAction;
import com.taobao.android.trade.locator.callback.c;
import com.taobao.android.trade.locator.callback.d;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, jkd> f29592a = new ConcurrentHashMap<>();
    private d b;

    public jkd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkd) ipChange.ipc$dispatch("7c711b31", new Object[]{this, str});
        }
        if (!jkf.a(str) && !this.f29592a.isEmpty() && this.f29592a.containsKey(str)) {
            return this.f29592a.get(str);
        }
        return null;
    }

    public void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{this, str, str2, obj});
        } else if (jkf.a(str)) {
        } else {
            jkd a2 = a(str);
            if (a2 == null) {
                a2 = new jkd(str);
            }
            a2.a(obj);
            if (!jkf.a(str2)) {
                jkd a3 = a(str2);
                if (a3 == null) {
                    a3 = new jkd(str2);
                }
                a2.a(a3);
                a3.b(a2);
                a(a3);
            }
            a(a2);
        }
    }

    private void a(jkd jkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef88e8b5", new Object[]{this, jkdVar});
        } else if (jkdVar == null) {
        } else {
            this.f29592a.put(jkdVar.c(), jkdVar);
        }
    }

    public void a(LocatorAction locatorAction, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535e5850", new Object[]{this, locatorAction, dVar});
        } else if (LocatorAction.LOCATOR != locatorAction) {
        } else {
            this.b = dVar;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (jkf.a(str) || this.b == null) {
        } else {
            new c().a(str, this, this.b);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29592a.clear();
        }
    }
}
