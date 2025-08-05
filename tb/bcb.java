package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.android.ultron.trade.presenter.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import tb.sxz;

/* loaded from: classes2.dex */
public abstract class bcb extends com.alibaba.android.ultron.trade.presenter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(-1392580957);
    }

    public abstract void a(RequestConfig requestConfig, jnv jnvVar);

    public abstract void a(a.InterfaceC0095a interfaceC0095a);

    public abstract void a(a.b bVar);

    public abstract void a(IDMComponent iDMComponent);

    public abstract void a(IDMComponent iDMComponent, boolean z);

    public abstract void a(String str);

    public abstract void a(Map<String, List<IDMComponent>> map);

    public abstract void a(a aVar);

    public abstract void a(jnv jnvVar);

    public abstract void a(sxz.a<byte[]> aVar);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract String b();

    public abstract void b(String str);

    public abstract void b(jnv jnvVar);

    public abstract String c();

    public abstract void c(String str);

    public abstract boolean d();

    public abstract boolean d(String str);

    public abstract IDMComponent e(String str);

    public abstract String e();

    public abstract boolean g();

    public abstract void h();

    public abstract bnv i();

    public abstract boolean j();

    public abstract void k();

    public abstract boolean l();

    public abstract CartGlobal m();

    public abstract bbz n();

    public abstract DataBizContext o();

    public abstract boolean p();

    public abstract List<IDMComponent> q();

    public abstract void r();

    public abstract void s();

    public abstract boolean t();

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        }
    }

    public bcb(c cVar) {
        super(cVar);
    }
}
