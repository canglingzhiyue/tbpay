package com.alibaba.android.ultron.common.page;

import com.alibaba.android.ultron.ext.event.j;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2526a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(259618830);
    }

    public e(a aVar) {
        this.f2526a = aVar;
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
            return;
        }
        d(eVar);
        if (!(eVar.h() instanceof com.alibaba.android.ultron.vfw.instance.d)) {
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) eVar.h();
        JSONObject c = eVar.c("key$event_data");
        if (c != null) {
            dVar.a(c, (d.c) null);
        }
        a aVar = this.f2526a;
        if (aVar == null) {
            return;
        }
        aVar.a(c);
    }
}
