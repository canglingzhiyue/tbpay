package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.android.detail2.core.framework.view.feeds.e;

/* loaded from: classes5.dex */
public class lnq extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-270026797);
    }

    public static /* synthetic */ Object ipc$super(lnq lnqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lnq(fmd fmdVar, b bVar, d dVar) {
        super(fmdVar, bVar, dVar);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b.h().C();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public boolean b(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1cf2bb88", new Object[]{this, new Integer(i), str})).booleanValue() : this.b.h().a(i, str);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : lnr.b(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : lnr.c(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.e
    public void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (i != i2 + 1 || !a(str)) {
        } else {
            g();
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f11592a.g(str) && this.f11592a.f(this.c.G()) != 0;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.b.h().b(this.c.F());
        a(this.c.F(), this.c.E(), false);
    }
}
