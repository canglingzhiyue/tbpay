package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final s f2188a;

    static {
        kge.a(1853154709);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(s sVar, com.alibaba.android.umf.taobao.adapter.widget.floatview.a aVar) {
        super(aVar);
        this.f2188a = sVar;
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.d
    public boolean a(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e138cc6", new Object[]{this, list, aURARenderComponent})).booleanValue();
        }
        for (Event event : list) {
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(event.getId());
            dVar.a(aURARenderComponent);
            dVar.a(event.getFields());
            a(dVar);
            com.alibaba.android.aura.service.event.c.a(this.f2188a, event.getType(), dVar);
        }
        return true;
    }

    private void a(com.alibaba.android.aura.service.event.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb347aad", new Object[]{this, dVar});
            return;
        }
        JSONObject c = dVar.c();
        if (c == null) {
            c = new JSONObject();
            dVar.a(c);
        }
        String string = c.getString("option");
        if (!"cancel".equals(string) && !StringUtils.isEmpty(string)) {
            return;
        }
        c.put("isCancel", (Object) true);
    }
}
