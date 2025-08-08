package com.etao.feimagesearch.ui.coordinatorcard;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.X;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ctn;
import tb.cto;
import tb.ctq;
import tb.kge;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ctn> f7001a = new LinkedHashMap();
    private final Map<String, List<ctq>> b = new LinkedHashMap();

    static {
        kge.a(-1006055038);
    }

    public b() {
        this.f7001a.put("nt", new cto());
    }

    public final void a(Context context, a aVar, rul<? super ctq, t> successListener, ruw<? super Integer, ? super String, t> failureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73fbfe", new Object[]{this, context, aVar, successListener, failureListener});
            return;
        }
        q.c(context, "context");
        q.c(successListener, "successListener");
        q.c(failureListener, "failureListener");
        if (aVar == null) {
            failureListener.mo2423invoke(-1, X.a.d);
            return;
        }
        String a2 = aVar.a();
        if (StringUtils.isEmpty(a2)) {
            failureListener.mo2423invoke(-1, "Invalid Params");
            return;
        }
        List<ctq> list = this.b.get(a2);
        if (list == null || list.isEmpty()) {
            b(context, aVar, successListener, failureListener);
        } else {
            successListener.mo2421invoke(list.remove(0));
        }
    }

    private final void b(Context context, a aVar, rul<? super ctq, t> rulVar, ruw<? super Integer, ? super String, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09e84bf", new Object[]{this, context, aVar, rulVar, ruwVar});
            return;
        }
        ctn ctnVar = this.f7001a.get(FactoryType.a(aVar.a()));
        if (ctnVar == null) {
            ruwVar.mo2423invoke(-1, "Not Support Card Type");
        } else {
            ctnVar.a(context, aVar, rulVar, ruwVar);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, List<ctq>> entry : this.b.entrySet()) {
            List<ctq> value = entry.getValue();
            if (value != null) {
                for (ctq ctqVar : value) {
                    ctqVar.d();
                }
            }
        }
        this.b.clear();
        this.f7001a.clear();
    }
}
