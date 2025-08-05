package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.g;
import com.taobao.android.revisionswitch.utils.LocationHelper;

/* loaded from: classes.dex */
public class imb implements imi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilw f29146a;
    private final ilw b;
    private final ilw c;
    private final g d;

    public imb(g gVar) {
        this.f29146a = gVar.b();
        this.b = gVar.c();
        this.c = gVar.g();
        this.d = gVar;
    }

    @Override // tb.imi
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : LocationHelper.b(this.d.d()) || LocationHelper.d(this.d.d());
    }
}
