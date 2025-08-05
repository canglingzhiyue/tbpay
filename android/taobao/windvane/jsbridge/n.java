package android.taobao.windvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<j> f1669a;
    private static List<f> b;
    private static List<k> c;

    static {
        kge.a(1172510571);
        f1669a = new CopyOnWriteArrayList();
        b = new CopyOnWriteArrayList();
        c = new CopyOnWriteArrayList();
    }

    public static List<f> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : b;
    }

    public static List<j> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]) : f1669a;
    }

    public static void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec4c7e5", new Object[]{kVar});
        } else {
            c.add(kVar);
        }
    }

    public static List<k> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]) : c;
    }
}
