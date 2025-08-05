package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualExecutors;
import tb.bho;

/* loaded from: classes6.dex */
public class jqw implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f29718a;
    private final jqp b;

    static {
        kge.a(-129462631);
        kge.a(1352893937);
    }

    public static /* synthetic */ jrj a(jqw jqwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jrj) ipChange.ipc$dispatch("590434dc", new Object[]{jqwVar}) : jqwVar.f29718a;
    }

    public jqw(jrj jrjVar, jqp jqpVar) {
        this.f29718a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            bhm.a().a("rxandroid", new bho.a() { // from class: tb.jqw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bho.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (i != 3) {
                    } else {
                        if (jqw.a(jqw.this).a("useRxJavaVirtualThread", true)) {
                            rsz.a();
                            jrk.a("RxJavaTask", "commit");
                            return;
                        }
                        rsz.b();
                        jrk.b("RxJavaTask", "rollback");
                    }
                }
            }, VirtualExecutors.newSingleVirtualThreadExecutor());
        }
    }
}
