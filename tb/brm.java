package tb;

import android.content.Context;
import com.alibaba.android.umf.datamodel.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class brm implements brj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public b f26061a;
    public brk b;
    public String c;
    public Context d;

    static {
        kge.a(824856403);
        kge.a(1638029425);
    }

    @Override // tb.brj
    @Deprecated
    public void a(b bVar, brk brkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12724de", new Object[]{this, bVar, brkVar});
            return;
        }
        this.f26061a = bVar;
        this.b = brkVar;
        this.c = bVar.d();
        this.d = bVar.c();
    }
}
