package com.taobao.android.diagnose;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.b;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.scene.a;
import com.taobao.android.x;
import java.util.Map;
import tb.fmx;
import tb.kge;

/* loaded from: classes.dex */
public class d extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private a f11707a = null;
    private com.taobao.android.diagnose.model.a b = null;
    private x.a c;

    static {
        kge.a(614033202);
    }

    public static /* synthetic */ void lambda$BBQPaDukuX1lCYhscasqy0i6rP0(d dVar, String str, fmx fmxVar) {
        dVar.b(str, fmxVar);
    }

    public void a(a aVar, com.taobao.android.diagnose.model.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a01f28b", new Object[]{this, aVar, aVar2});
            return;
        }
        this.f11707a = aVar;
        this.b = aVar2;
        if (aVar == null) {
            return;
        }
        aVar.a(this.c);
    }

    @Override // com.taobao.android.x
    public void a(final String str, final fmx fmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c54271", new Object[]{this, str, fmxVar});
        } else if (this.f11707a == null) {
        } else {
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.-$$Lambda$d$BBQPaDukuX1lCYhscasqy0i6rP0
                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$BBQPaDukuX1lCYhscasqy0i6rP0(d.this, str, fmxVar);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, fmx fmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dae0ab2", new Object[]{this, str, fmxVar});
        } else {
            this.f11707a.b(str, fmxVar);
        }
    }

    @Override // com.taobao.android.x
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            b.a().a(str, map);
        }
    }

    @Override // com.taobao.android.x
    public PageInfo b() {
        PageInfo d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("2ed8d2bb", new Object[]{this});
        }
        com.taobao.android.diagnose.model.a aVar = this.b;
        if (aVar != null && (d = aVar.d()) != null) {
            return d.m910clone();
        }
        return null;
    }
}
