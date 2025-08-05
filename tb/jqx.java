package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.f;

/* loaded from: classes6.dex */
public class jqx implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f29720a;
    private final jqp b;

    static {
        kge.a(1059162656);
        kge.a(1352893937);
    }

    public jqx(jrj jrjVar, jqp jqpVar) {
        this.f29720a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f29720a.a("useVirtualThread", this.b.a())) {
            jrk.b("StubVirtualThreadTask", "failed", Boolean.valueOf(this.f29720a.a("useVirtualThread", this.b.a())), Boolean.valueOf(this.b.a()));
        } else {
            f.a();
            jrk.a("StubVirtualThreadTask", "succ");
        }
    }
}
