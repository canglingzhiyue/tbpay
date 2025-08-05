package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class akx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private akr f25413a;

    public akx(akr akrVar) {
        this.f25413a = akrVar;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int a2 = akr.a(this.f25413a.b());
        if (a2 == -2 || a2 == -3) {
            a2 = aks.a().g().a();
            String str = "get device level using outline, level = " + a2;
        } else {
            String str2 = "get device level using ai, level = " + a2;
        }
        if (!alf.c && a2 >= 0) {
            return 2;
        }
        return a2;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        float b = this.f25413a.b();
        if (b < 0.0f) {
            b = 80.0f;
        }
        if (!alf.c && b >= 70.0f) {
            b = 60.0f;
        }
        return (int) b;
    }
}
