package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static pfc f32582a;

    static {
        kge.a(-1605893530);
    }

    private pfc() {
    }

    public static pfc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfc) ipChange.ipc$dispatch("f091991", new Object[0]);
        }
        if (f32582a == null) {
            synchronized (pfc.class) {
                f32582a = new pfc();
            }
        }
        return f32582a;
    }
}
