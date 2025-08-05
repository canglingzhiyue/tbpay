package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dgn implements dgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dgm f26735a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static dgn f26736a;

        static {
            kge.a(360834858);
            f26736a = new dgn();
        }
    }

    static {
        kge.a(1573145432);
        kge.a(-1348013832);
    }

    public static dgn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgn) ipChange.ipc$dispatch("f03aa33", new Object[0]) : a.f26736a;
    }

    public void a(dgm dgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5178e4e", new Object[]{this, dgmVar});
        } else {
            this.f26735a = dgmVar;
        }
    }

    @Override // tb.dgm
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        dha.a("KeyMonitor", str, str2, str3);
        dgm dgmVar = this.f26735a;
        if (dgmVar == null) {
            return;
        }
        dgmVar.a(str, str2, str3);
    }

    @Override // tb.dgm
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        dha.a(str, str2, str3, str4, str5);
        dgm dgmVar = this.f26735a;
        if (dgmVar == null) {
            return;
        }
        dgmVar.a(str, str2, str3, str4, str5);
    }
}
