package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.mmad.data.a;

/* loaded from: classes7.dex */
public abstract class tiq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CODE = "TopShow";

    /* renamed from: a  reason: collision with root package name */
    private srq f34132a;
    private c b;
    private boolean c;

    static {
        kge.a(1317765139);
    }

    public abstract a d();

    public abstract tiv e();

    public abstract tjb f();

    public abstract tjj g();

    public tiq(srq srqVar) {
        this.f34132a = srqVar;
    }

    public srq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (srq) ipChange.ipc$dispatch("f0aa56c", new Object[]{this}) : this.f34132a;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7d9dff", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("684fdcc0", new Object[]{this}) : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
