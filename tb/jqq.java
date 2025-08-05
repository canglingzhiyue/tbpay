package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jqq implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f29713a;
    private final jqp b;

    static {
        kge.a(1249978458);
        kge.a(1352893937);
    }

    public jqq(jrj jrjVar, jqp jqpVar) {
        this.f29713a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f29713a.a("useVtAsyncTaskThread", false)) {
            jrk.b("AsyncTaskTask", "failed");
        } else {
            jqn.a();
            jrk.a("AsyncTaskTask", "succ");
        }
    }
}
