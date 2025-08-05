package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bqa;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARaxJSBridgeApiPlugin extends RaxJSBridgeApiPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final s mAuraInstance;

    static {
        kge.a(863089558);
    }

    public static /* synthetic */ Object ipc$super(AURARaxJSBridgeApiPlugin aURARaxJSBridgeApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AURARaxJSBridgeApiPlugin(bqa<String, AURARenderComponent> bqaVar) throws IllegalAccessException {
        super(bqaVar);
        throw new IllegalAccessException("调用两个参数的构造方案");
    }

    public AURARaxJSBridgeApiPlugin(s sVar, bqa<String, AURARenderComponent> bqaVar) {
        super(bqaVar);
        this.mAuraInstance = sVar;
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba320ac5", new Object[]{this, uMFRuleIO, wVCallBackContext});
        } else {
            this.mAuraInstance.a("aura.workflow.syncState", uMFRuleIO, null);
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97bb13d", new Object[]{this, list, aURARenderComponent, str, wVCallBackContext});
            return;
        }
        for (Event event : list) {
            String type = event.getType();
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(event.getId());
            dVar.a(event.getFields());
            dVar.a(aURARenderComponent);
            appendConfirmFlagWhenAdjust(event, type, dVar);
            com.alibaba.android.aura.service.event.c.a(this.mAuraInstance, type, dVar);
        }
    }

    private void appendConfirmFlagWhenAdjust(Event event, String str, com.alibaba.android.aura.service.event.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6d2aee", new Object[]{this, event, str, dVar});
        } else if (!"adjust".equals(str)) {
        } else {
            JSONObject fields = event.getFields();
            if (fields == null) {
                fields = new JSONObject();
                event.setFields(fields);
            }
            String string = fields.getString("option");
            if ("confirm".equals(string) || TextUtils.isEmpty(string)) {
                fields.put("isConfirm", (Object) true);
            }
            dVar.a(fields);
        }
    }
}
