package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.Monitor;

/* loaded from: classes4.dex */
public class tcr implements Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Monitor f34029a;

    /* loaded from: classes4.dex */
    public static class a {
        public static final tcr INSTANCE;

        static {
            kge.a(-2031290878);
            INSTANCE = new tcr();
        }
    }

    static {
        kge.a(-1551300306);
        kge.a(260520199);
    }

    public static tcr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcr) ipChange.ipc$dispatch("f0ae19b", new Object[0]) : a.INSTANCE;
    }

    private tcr() {
        this.f34029a = new Monitor() { // from class: tb.tcr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
            public void a(String str, String str2, String str3, String str4, String str5, long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5d81e7aa", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
                }
            }
        };
    }

    @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
    public void a(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d81e7aa", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            return;
        }
        tco.c("FastSpMonitor", str, str2, str3, str4, str5, Long.valueOf(j));
        this.f34029a.a(str, str2, str3, str4, str5, j);
    }

    public Monitor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Monitor) ipChange.ipc$dispatch("1452fdd5", new Object[]{this}) : this.f34029a;
    }

    public void a(Monitor monitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3376f30", new Object[]{this, monitor});
        } else if (monitor == null) {
            tco.b(new IllegalArgumentException("monitor is null"));
        } else {
            this.f34029a = monitor;
        }
    }
}
