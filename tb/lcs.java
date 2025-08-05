package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.sceneservice.a;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public final class lcs implements ljs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljr f30479a;
    private final ldx b;

    static {
        kge.a(-1779670909);
        kge.a(778708513);
    }

    public lcs(ljr ljrVar, ljv ljvVar) {
        ldf.d("InfoFlowContext", ljrVar.a() + " InfoFlowContext");
        this.f30479a = ljrVar;
        this.b = new ldx();
        a(this.b, ljvVar);
    }

    @Override // tb.ljs
    public ljr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljr) ipChange.ipc$dispatch("f0758ea", new Object[]{this}) : this.f30479a;
    }

    @Override // tb.ljs
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1eb717ab", new Object[]{this, cls});
        }
        long nanoTime = System.nanoTime();
        T t = (T) this.b.a(cls);
        if (t == null) {
            ldf.d("InfoFlowContext", "未找到服务：" + cls.getName());
            return null;
        }
        if (lcz.b()) {
            ldf.e("InfoFlowContext", this.f30479a.a() + " findSubService : " + t.getClass().getName() + " ，耗时：" + (System.nanoTime() - nanoTime) + " ns");
        }
        return t;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d("InfoFlowContext", this.f30479a.a() + " destroy");
        this.b.a();
    }

    private void a(ldx ldxVar, ljv ljvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9769e190", new Object[]{this, ldxVar, ljvVar});
            return;
        }
        a aVar = new a();
        ldxVar.a(aVar.a());
        if (ljvVar != null) {
            ldxVar.a(ljvVar.a().a());
        }
        ldxVar.a(this, aVar.b());
    }
}
