package com.taobao.android.diagnose.collector;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.tinct.model.BaseChangeInfo;
import tb.kge;

/* loaded from: classes.dex */
public class d extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a d;

    static {
        kge.a(2112165405);
    }

    public d(Application application, com.taobao.android.diagnose.model.a aVar) {
        super(application, aVar);
    }

    @Override // com.taobao.android.diagnose.collector.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new a(this.b);
            com.taobao.tinct.impl.collect.b.a().a(this.d);
        }
        this.b.a(com.taobao.tinct.impl.collect.b.a().d());
    }

    /* loaded from: classes.dex */
    public static class a implements com.taobao.tinct.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.android.diagnose.model.a f11693a;

        static {
            kge.a(2040696007);
            kge.a(-1538271875);
        }

        public a(com.taobao.android.diagnose.model.a aVar) {
            this.f11693a = aVar;
        }

        @Override // com.taobao.tinct.b
        public void a(BaseChangeInfo baseChangeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("316ecbec", new Object[]{this, baseChangeInfo});
                return;
            }
            v.a("ChangeCollector", String.format("Tinct changed. Type: %s", baseChangeInfo.getChangeType().toString()));
            this.f11693a.a(com.taobao.tinct.impl.collect.b.a().d());
        }
    }
}
