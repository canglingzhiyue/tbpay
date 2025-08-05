package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class dhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f26750a = 500;
        public int b = 5;

        static {
            kge.a(-420770564);
        }
    }

    static {
        kge.a(-1538494675);
    }

    public abstract dhi a(dho dhoVar);

    public static dhg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhg) ipChange.ipc$dispatch("f03ad1b", new Object[0]) : dhh.b();
    }
}
