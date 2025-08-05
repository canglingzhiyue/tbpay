package tb;

import android.content.Context;
import com.alibaba.android.nextrpc.request.b;
import com.alibaba.android.nextrpc.request.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.h;

/* loaded from: classes6.dex */
public class hzn implements hzk<job> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f28854a;
    private job b;

    static {
        kge.a(-569343898);
        kge.a(889019089);
    }

    @Override // tb.hzk
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.job, java.lang.Object] */
    @Override // tb.hzk
    public /* synthetic */ job b(Context context, com.taobao.android.ultron.datamodel.imp.b bVar, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("183ebdb8", new Object[]{this, context, bVar, hVar}) : a(context, bVar, hVar);
    }

    public hzn(Context context, String str) {
        this.f28854a = new c().a(context).a(str).a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = this.f28854a;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public job a(Context context, com.taobao.android.ultron.datamodel.imp.b bVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (job) ipChange.ipc$dispatch("d838166e", new Object[]{this, context, bVar, hVar});
        }
        jnw a2 = hzo.a(context, hVar);
        if (a2 != null) {
            return a2.a(bVar);
        }
        throw new IllegalArgumentException("context or request config can't be null");
    }

    @Override // tb.hzk
    public void a(job jobVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b3b795", new Object[]{this, jobVar, obj, jnvVar});
        } else if (jobVar == null) {
        } else {
            this.b = jobVar;
            jobVar.a(this.f28854a, obj, jnvVar);
        }
    }
}
