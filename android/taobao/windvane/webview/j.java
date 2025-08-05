package android.taobao.windvane.webview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static k f1724a;

    static {
        kge.a(-539017679);
        f1724a = null;
    }

    public static void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b745e8", new Object[]{kVar});
            return;
        }
        android.taobao.windvane.util.m.e("Processor", "register processor=[" + kVar.getClass().getName() + riy.ARRAY_END_STR);
        f1724a = kVar;
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("c76d6aa8", new Object[0]) : f1724a;
    }
}
