package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.g;

/* loaded from: classes6.dex */
public class ima implements imi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29145a;
    private final ilw b;
    private final ilw c;
    private final ilw d;

    public ima(g gVar, String str) {
        this.b = gVar.b();
        this.c = gVar.c();
        this.d = gVar.g();
        this.f29145a = str;
    }

    @Override // tb.imi
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            if (this.b.a(this.f29145a) && this.c.a(this.f29145a)) {
                if (this.d.a("location")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
