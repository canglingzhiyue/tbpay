package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private big f25922a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final bif f25923a;

        static {
            kge.a(1126972050);
            f25923a = new bif();
        }

        public static /* synthetic */ bif a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bif) ipChange.ipc$dispatch("f02c7ff", new Object[0]) : f25923a;
        }
    }

    static {
        kge.a(-1605450082);
    }

    private bif() {
        this.f25922a = new bie();
    }

    public static bif a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bif) ipChange.ipc$dispatch("f02c7ff", new Object[0]) : a.a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f25922a.a(str);
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue() : this.f25922a.b(str);
    }
}
