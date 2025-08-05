package com.alibaba.android.aura;

import android.content.Context;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.aqq;
import tb.arc;
import tb.baw;
import tb.bbm;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends aqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2144a = "AURAFlowDispatcherManagerCallback";
    private com.alibaba.android.aura.nodemodel.workflow.a b;
    private aqq c;
    private i d;
    private a e;
    private d f;
    private WeakReference<Context> g;

    static {
        kge.a(1981840015);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public h(com.alibaba.android.aura.nodemodel.workflow.a aVar, aqq aqqVar, i iVar, a aVar2, d dVar, Context context) {
        this.b = aVar;
        this.c = aqqVar;
        this.d = iVar;
        this.e = aVar2;
        this.f = dVar;
        this.g = new WeakReference<>(context);
    }

    @Override // tb.aqq
    public void a(com.alibaba.android.aura.datamodel.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
        } else {
            this.c.a(cVar);
        }
    }

    @Override // tb.aqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.c.a();
    }

    @Override // tb.aqq, tb.aqs
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        this.c.a(bVar);
        c e = bVar.e();
        if (e == null) {
            String str = this.b.f2156a;
            e = new c(str, "", new AURAFlowData(str), this.d.a());
        }
        this.e.a(this.b, AURAAspectServiceInput.error(bVar, false), e.a(), e.b(), this.f);
        b(bVar);
    }

    private void b(b bVar) {
        WeakReference<Context> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3ecd81", new Object[]{this, bVar});
            return;
        }
        String str = "AURAException#" + bVar.b();
        String str2 = "AURADefaultDomain".equals(bVar.f()) ? "请设置你的error domain!!!!!!!! # " : "";
        arc.a().c("AURAFlowDispatcherManagerCallback", "dispatcherCallback#onError", str2 + str);
        if (!g.f2141a || !baw.a() || (weakReference = this.g) == null) {
            return;
        }
        Context context = weakReference.get();
        if (context != null) {
            bbm.a(context, "AURA框架错误(详情过滤 #AURA_LOGGER# 查看报错堆栈日志)：" + str, 0);
        }
        arc.a().a("AURA框架错误(详情过滤 #AURA_LOGGER# 查看报错堆栈日志)：" + str, arc.a.a().a("AURA/error").b());
    }
}
