package com.taobao.phenix.compat.stat;

import android.content.Context;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.niw;

/* loaded from: classes.dex */
public class h implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f18923a;
    private final com.alibaba.ha.bizerrorreporter.e b = com.alibaba.ha.bizerrorreporter.e.a();

    public h(Context context) {
        this.f18923a = context;
    }

    @Override // com.taobao.phenix.compat.stat.d
    public void a(String str, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f667a22", new Object[]{this, str, th, map});
        } else if (th == null) {
        } else {
            try {
                com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
                aVar.b = AggregationType.CONTENT;
                aVar.f3119a = "IMAGE_ERROR";
                aVar.d = str;
                aVar.i = map;
                aVar.k = th;
                this.b.a(this.f18923a, aVar);
            } catch (Exception unused) {
                niw.d("TBNonCriticalErrorReporter", "onNonCriticalErrorHappen error", new Object[0]);
            }
        }
    }
}
