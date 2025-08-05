package com.taobao.android.detail.core.aura.extension.aspect;

import android.content.Context;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.arn;
import tb.bbh;
import tb.eiq;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.aspect.lifecycle.refreshCheckCollect")
/* loaded from: classes4.dex */
public final class c extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9388a = "AliDetailRefreshCheckCollectExtension";
    private final String b = "refreshCheckCollect";
    private final ExecutorService c = bbh.a(2, 4, 1, TimeUnit.MINUTES, "refreshCheckCollect");

    static {
        kge.a(2079154481);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1435706478) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.afterFlowExecute((com.alibaba.android.aura.datamodel.c) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        }
    }

    public c() {
        emu.a("com.taobao.android.detail.core.aura.extension.aspect.AliDetailRefreshCheckCollectExtension");
    }

    @Override // tb.arn, tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        AURARenderComponent e;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(cVar, aVar, z);
        if (!eiq.i) {
            i.c(l.a("AliDetailRefreshCheckCollectExtension"), "isEnableRefreshCheckCollect 关闭");
            return;
        }
        Context e2 = a().e();
        if (!(e2 instanceof DetailCoreActivity)) {
            return;
        }
        if (!((DetailCoreActivity) e2).k()) {
            i.c(l.a("AliDetailRefreshCheckCollectExtension"), "isPreload 关闭");
        } else if (z || !"aura.workflow.bottomBar.build".equals(aVar.d()) || (a2 = a((e = e()))) == null) {
        } else {
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(e);
            dVar.a("" + System.currentTimeMillis());
            dVar.a(a2);
            com.alibaba.android.aura.service.event.c.a(a().b(), "checkCollect", dVar);
            i.c(l.a("AliDetailRefreshCheckCollectExtension"), "分发checkCollect事件");
        }
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.c.isShutdown()) {
            return;
        }
        this.c.shutdownNow();
    }

    private AURARenderComponent e() {
        List<AURARenderComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("2662f0d7", new Object[]{this});
        }
        AURAGlobalData c = c();
        if (c == null || (list = (List) c.get("render_view_item_models", List.class)) == null || list.isEmpty()) {
            return null;
        }
        for (AURARenderComponent aURARenderComponent : list) {
            if ("tbDetailToolbar".equals(aURARenderComponent.key)) {
                return aURARenderComponent;
            }
        }
        return null;
    }

    private JSONObject a(AURARenderComponent aURARenderComponent) {
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e41c2f3", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent.data == null || (map = aURARenderComponent.data.events) == null || (list = map.get(AURAEventKey.exposureItem)) == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = null;
        for (Event event : list) {
            if ("checkCollect".equals(event.type)) {
                jSONObject = event.fields;
            }
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        return null;
    }
}
