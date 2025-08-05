package com.taobao.android.detail.core.aura.extension.aspect;

import android.content.Context;
import android.util.Log;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.arc;
import tb.ard;
import tb.arn;
import tb.awq;
import tb.bbh;
import tb.dwj;
import tb.dwn;
import tb.dwq;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.aspect.lifecycle.renderComponents")
/* loaded from: classes4.dex */
public final class d extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9389a = "AliDetailRenderComponentsExtension";
    private final String b = "protocolCompare";
    private final ExecutorService c = bbh.a(2, 4, 1, TimeUnit.MINUTES, "protocolCompare");

    static {
        kge.a(518723780);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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

    public d() {
        emu.a("com.taobao.android.detail.core.aura.extension.aspect.AliDetailRenderComponentsExtension");
    }

    @Override // tb.arn, tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        List<AURARenderComponent> e;
        dwj dwjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(cVar, aVar, z);
        if (z || (e = e()) == null || (dwjVar = (dwj) a().a("detailAdapter", dwj.class, null)) == null) {
            return;
        }
        if ("aura.workflow.detailInfo.build".equals(aVar.d())) {
            dwjVar.a(e);
            a(cVar);
        } else if (!"aura.workflow.bottomBar.build".equals(aVar.d())) {
        } else {
            a(a().e(), dwjVar, e, false);
            a(cVar);
        }
    }

    private void a(Context context, dwj dwjVar, List<AURARenderComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82913ea", new Object[]{this, context, dwjVar, list, new Boolean(z)});
        } else if (com.taobao.android.detail.core.aura.utils.c.a(context, list)) {
            d().a(new com.alibaba.android.aura.b(0, dwq.AURA_MODULE_NAME, "downgradeOldProtocol", "checkEventsNeedToDowngrade"));
        } else {
            a(dwjVar, list, z);
        }
    }

    private void a(dwj dwjVar, List<AURARenderComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11da4e2", new Object[]{this, dwjVar, list, new Boolean(z)});
            return;
        }
        try {
            if (dwjVar.f()) {
                h.a(a().e(), new com.alibaba.android.aura.b(1, dwq.AURA_MODULE_NAME, "needProtocolCompare", "需要进行协议对比"));
            }
            final dwn a2 = dwjVar.a(list, z);
            if (a2.b()) {
                return;
            }
            com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(0, dwq.AURA_MODULE_NAME, "protocolCompareFailed", "协议对比失败");
            bVar.a(new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.aura.extension.aspect.AliDetailRenderComponentsExtension$1
                {
                    put("componentKey", a2.c());
                    put("errorKey", a2.d());
                    put("ultronValue", a2.e());
                    put("auraValue", a2.f());
                }
            });
            d().a(bVar);
        } catch (Throwable th) {
            ard a3 = arc.a();
            a3.c("AliDetailRenderComponentsExtension", "asyncLoad", "protocolCompare|异步协议对比失败,error=" + Log.getStackTraceString(th));
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

    private List<AURARenderComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        AURAGlobalData c = c();
        if (c != null) {
            return (List) c.get("render_view_item_models", List.class);
        }
        return null;
    }

    private void a(com.alibaba.android.aura.datamodel.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            return;
        }
        AURAGlobalData c = cVar.c();
        if (c == null) {
            arc.a().c("AliDetailRenderComponentsExtension", "resetExposureState", "globalData is null");
            return;
        }
        awq awqVar = (awq) c.get("exposureItemRecorder", awq.class);
        if (awqVar == null) {
            arc.a().c("AliDetailRenderComponentsExtension", "resetExposureState", "exposureItemRecorder is null");
        } else {
            awqVar.a();
        }
    }
}
