package com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bqa;
import tb.brh;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRaxJSBridgeApiPlugin extends RaxJSBridgeApiPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b mRuntimeContext;

    static {
        kge.a(-805472701);
    }

    public UMFRaxJSBridgeApiPlugin(bqa<String, AURARenderComponent> bqaVar, b bVar) {
        super(bqaVar);
        this.mRuntimeContext = bVar;
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba320ac5", new Object[]{this, uMFRuleIO, wVCallBackContext});
        } else {
            this.mRuntimeContext.b();
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97bb13d", new Object[]{this, list, aURARenderComponent, str, wVCallBackContext});
            return;
        }
        f fVar = (f) this.mRuntimeContext.a("eventHandler", (Class<Object>) f.class);
        if (fVar == null) {
            wVCallBackContext.error(new r("Native端事件中心为空，请找客户端同学排查"));
            return;
        }
        for (Event event : list) {
            e a2 = fVar.a();
            String type = event.getType();
            a2.a(type);
            HashMap hashMap = new HashMap();
            brh brhVar = new brh(type, this.mRuntimeContext, aURARenderComponent, new Object[]{str});
            brhVar.a(event.getFields());
            brhVar.a(event.getType());
            hashMap.put("umfEventModel", brhVar);
            a2.a((Map<? extends String, ? extends Object>) hashMap);
            fVar.a(a2);
        }
    }
}
