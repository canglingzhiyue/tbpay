package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.utils.HprofDumpUtils;

/* loaded from: classes6.dex */
public class krp implements scy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final jdy f30279a;

    public static /* synthetic */ void lambda$6Of3ZOhu0QBuaPVEvFw0BRNZvFc(krp krpVar) {
        krpVar.b();
    }

    public krp(jdy jdyVar) {
        this.f30279a = jdyVar;
    }

    @Override // tb.scy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            jgb.a(new Runnable() { // from class: tb.-$$Lambda$krp$6Of3ZOhu0QBuaPVEvFw0BRNZvFc
                @Override // java.lang.Runnable
                public final void run() {
                    krp.lambda$6Of3ZOhu0QBuaPVEvFw0BRNZvFc(krp.this);
                }
            }).a(jgb.sScheduler).a();
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            HprofDumpUtils.a(this.f30279a);
        } catch (Throwable th) {
            jfj.b(th);
        }
    }
}
