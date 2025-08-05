package android.taobao.windvane;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static c b;

    /* renamed from: a  reason: collision with root package name */
    private b f1547a;

    static {
        kge.a(-577729440);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cc1f65da", new Object[0]);
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e1082dfc", new Object[]{this});
        }
        if (this.f1547a == null) {
            this.f1547a = new b();
        }
        return this.f1547a;
    }
}
