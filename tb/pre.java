package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;

/* loaded from: classes8.dex */
public class pre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2096703275);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!prr.l()) {
        } else {
            b.h().a(str).bitmapProcessors(new com.taobao.phenix.compat.effects.b(prq.c(), 25, 2)).fetch();
        }
    }
}
