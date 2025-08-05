package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.config.StubConfig;

/* loaded from: classes6.dex */
public class jrd implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f29728a;
    private final jqp b;

    static {
        kge.a(-1540673840);
        kge.a(1352893937);
    }

    public jrd(jrj jrjVar, jqp jqpVar) {
        this.f29728a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        StubConfig.setWorkThreadPoolConfig(jri.a(this.f29728a.a("work_thread_pool", this.b.b())));
        StubConfig.setStubToken(this.f29728a.a("virtual_thread_exp", this.b.a() ? 1 : 0));
        jrk.b("VirtualThreadConfigTask", "virtual_thread_exp", Integer.valueOf(StubConfig.stubToken));
    }
}
