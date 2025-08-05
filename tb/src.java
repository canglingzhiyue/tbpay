package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.handler.HandlerThreadFactory32;
import com.taobao.android.virtual_thread.adapter.task.TBHandlerThreadFactory;
import com.taobao.android.virtual_thread.stub.config.StubConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class src implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f33850a;
    private final jqp b;

    static {
        kge.a(-625831120);
        kge.a(1352893937);
    }

    public src(jrj jrjVar, HashMap hashMap) {
        this.f33850a = jrjVar;
        this.b = a(jrjVar, hashMap == null ? new HashMap() : hashMap);
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f33850a.a("mergeTbExecutor", this.b.a())) {
        } else {
            if (jbg.f29445a instanceof TBHandlerThreadFactory) {
                ((TBHandlerThreadFactory) jbg.f29445a).a(this.f33850a);
                return;
            }
            jbg.f29445a = new TBHandlerThreadFactory(this.f33850a, this.b);
            jbk.f29449a = new jrb();
            jbk.b = new jra();
            jrk.a("TBExecutorTask", "succ");
            if (!this.f33850a.a("supportRedexVt32", this.b.a())) {
                return;
            }
            HandlerThreadFactory32.setFactory((TBHandlerThreadFactory) jbg.f29445a);
            StubConfig.setSupportRedexVt32(true);
        }
    }

    private static jqp a(jrj jrjVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqp) ipChange.ipc$dispatch("72b02a80", new Object[]{jrjVar, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        jrj jrjVar2 = new jrj(hashMap);
        if (jrjVar2.a("isDebuggable", false)) {
            return new jqo(jrjVar);
        }
        String a2 = jrjVar2.a("appVersion", "1.0.0");
        jrk.b("TBExecutorTask", a2);
        if (a2.split("\\.").length > 3) {
            return new jqo(jrjVar);
        }
        return new jqp(jrjVar);
    }
}
