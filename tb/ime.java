package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.g;

/* loaded from: classes.dex */
public class ime implements imi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ilw f29149a;
    private ilw b;
    private ilw c;

    public ime(g gVar) {
        this.f29149a = gVar.b();
        this.b = gVar.c();
        this.c = gVar.g();
    }

    @Override // tb.imi
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
