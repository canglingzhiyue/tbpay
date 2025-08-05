package tb;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.app.Fragment;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.e;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.android.ultron.trade.presenter.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bbz extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ifu f25790a;
    private String b;

    static {
        kge.a(1464806760);
    }

    public abstract bdo Q();

    public abstract adz S();

    public abstract alu T();

    public abstract void a();

    public abstract void a(long j);

    public abstract void a(Fragment fragment);

    public abstract void a(IDMComponent iDMComponent, bmz bmzVar, boolean z, jnv jnvVar, Object obj);

    public abstract void a(adz adzVar);

    public abstract void a(jnv jnvVar, boolean z);

    public abstract void a(boolean z);

    public abstract void a(boolean z, Map<String, String> map, jnv jnvVar);

    public abstract void b(IDMComponent iDMComponent, bmz bmzVar, boolean z, jnv jnvVar, Object obj);

    public abstract void b(String str);

    public abstract void b(boolean z);

    public abstract void b(boolean z, Map<String, String> map, jnv jnvVar);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract e h();

    public abstract boolean j();

    public abstract void k();

    public abstract bff l();

    @Override // com.alibaba.android.ultron.trade.presenter.b, com.alibaba.android.ultron.trade.presenter.c
    public abstract Activity m();

    public abstract bcb n();

    public abstract bdp o();

    public abstract bdq p();

    public abstract bfb r();

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public abstract String s();

    public abstract Handler t();

    public abstract Fragment u();

    public abstract QueryParamsManager v();

    public abstract void z();

    @Override // com.alibaba.android.ultron.trade.presenter.b, com.alibaba.android.ultron.trade.presenter.c
    public /* synthetic */ a w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7b0d3f2", new Object[]{this}) : n();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b, com.alibaba.android.ultron.trade.presenter.c
    public /* synthetic */ BaseViewManager y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseViewManager) ipChange.ipc$dispatch("30227b3a", new Object[]{this}) : x();
    }

    public bbz(Activity activity) {
        super(activity);
        this.f25790a = null;
        this.b = null;
    }

    public final ifu i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifu) ipChange.ipc$dispatch("4c93181e", new Object[]{this});
        }
        if (this.f25790a == null) {
            this.f25790a = new ifu(this);
        }
        return this.f25790a;
    }

    public bez x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bez) ipChange.ipc$dispatch("bff896f0", new Object[]{this}) : (bez) this.i;
    }

    public final String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        Activity m = m();
        if (m != null) {
            this.b = String.valueOf(m.hashCode());
        } else {
            this.b = String.valueOf(hashCode());
        }
        return this.b;
    }
}
