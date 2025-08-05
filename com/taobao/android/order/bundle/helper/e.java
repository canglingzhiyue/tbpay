package com.taobao.android.order.bundle.helper;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import tb.hzp;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LinkedList<hzp> f14543a;

    static {
        kge.a(-1267717460);
        f14543a = new LinkedList<>();
    }

    public static void a(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf80c7a", new Object[]{hzpVar});
        } else {
            f14543a.push(hzpVar);
        }
    }

    public static hzp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzp) ipChange.ipc$dispatch("f05c340", new Object[0]) : f14543a.peek();
    }

    public static hzp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hzp) ipChange.ipc$dispatch("16b7689f", new Object[0]);
        }
        if (f14543a.size() <= 0) {
            return null;
        }
        return f14543a.pop();
    }
}
