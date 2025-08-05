package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.isr;

/* loaded from: classes6.dex */
public class ioc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static isr.c.a f29182a;

    static {
        kge.a(832522294);
    }

    public static void a(isr.c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ac2614", new Object[]{aVar});
            return;
        }
        b();
        f29182a = aVar;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        isr.c.a aVar = f29182a;
        if (aVar == null) {
            return;
        }
        aVar.a(null);
        f29182a = null;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }
}
