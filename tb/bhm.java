package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.bho;

/* loaded from: classes.dex */
public class bhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bhp f25910a = new bhn();
    private final bhq b = new bhr((bhq) this.f25910a);

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static bhm f25911a;

        static {
            kge.a(1884953700);
            f25911a = new bhm();
        }

        public static /* synthetic */ bhm a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhm) ipChange.ipc$dispatch("f02c517", new Object[0]) : f25911a;
        }
    }

    static {
        kge.a(-277123828);
    }

    public static bhm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhm) ipChange.ipc$dispatch("f02c517", new Object[0]) : a.a();
    }

    public bhq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhq) ipChange.ipc$dispatch("16b46af2", new Object[]{this}) : this.b;
    }

    public void a(String str, bho.a aVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e114c99a", new Object[]{this, str, aVar, executor});
        } else {
            this.f25910a.a(str, aVar, executor);
        }
    }

    public void a(bho bhoVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed20ae7", new Object[]{this, bhoVar, executor});
        } else {
            this.f25910a.a(bhoVar, executor);
        }
    }

    public void a(bho.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cfbdb2", new Object[]{this, aVar});
        } else {
            this.f25910a.a(aVar);
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : this.f25910a.a(str);
    }
}
