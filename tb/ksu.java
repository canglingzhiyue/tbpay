package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.manager.a;

/* loaded from: classes7.dex */
public class ksu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long ONE_DAY = 0;

    /* renamed from: a  reason: collision with root package name */
    private static a f30294a;

    static {
        kge.a(1475926160);
        f30294a = kgh.b();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cef275b8", new Object[0]) : f30294a;
    }
}
