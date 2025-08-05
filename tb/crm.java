package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class crm extends crn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ruk<? extends crl> f26474a;

    static {
        kge.a(-286027692);
    }

    public final ruk<crl> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("f0a3b96", new Object[]{this}) : this.f26474a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crm(String str, ruk<? extends crl> holdRunnable) {
        super(str);
        q.c(holdRunnable, "holdRunnable");
        this.f26474a = holdRunnable;
    }
}
