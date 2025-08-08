package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxJSBridgeWriteBackParams;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxJSBridgeWriteBackParamsData;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxRenderEventParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.bqa;
import tb.bqe;
import tb.bsu;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class RaxJSBridgeApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMF_JS_BRIDGE_CLASS_NAME = "UMFJsBridge";
    private final String TAG = "RaxJSBridgeApiPlugin";
    private final bqa<String, AURARenderComponent> mRenderComponentGetter;

    static {
        kge.a(-289147341);
    }

    public static /* synthetic */ Object ipc$super(RaxJSBridgeApiPlugin raxJSBridgeApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext);

    public abstract void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext);

    public RaxJSBridgeApiPlugin(bqa<String, AURARenderComponent> bqaVar) {
        this.mRenderComponentGetter = bqaVar;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public final boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (this.mRenderComponentGetter == null) {
            wVCallBackContext.error(new r("Native端RenderComponent为空，请找客户端同学排查"));
            return true;
        }
        ard a2 = arc.a();
        a2.a("RaxJSBridgeApiPlugin", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "call action:" + str);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1406875290) {
            if (hashCode != -75605984) {
                if (hashCode == 351862722 && str.equals("triggerEvent")) {
                    c = 2;
                }
            } else if (str.equals("getData")) {
                c = 0;
            }
        } else if (str.equals("writeBack")) {
            c = 1;
        }
        if (c == 0) {
            getData(wVCallBackContext);
            return true;
        } else if (c == 1) {
            writeBack(str2, wVCallBackContext);
            return true;
        } else if (c == 2) {
            triggerEvent(str2, wVCallBackContext);
            return true;
        } else {
            wVCallBackContext.error(r.RET_NO_METHOD);
            return false;
        }
    }

    private void writeBack(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdabd34", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error(new r("params为空"));
        } else {
            try {
                UMFRaxJSBridgeWriteBackParams uMFRaxJSBridgeWriteBackParams = (UMFRaxJSBridgeWriteBackParams) JSON.parseObject(str, UMFRaxJSBridgeWriteBackParams.class);
                if (uMFRaxJSBridgeWriteBackParams == null) {
                    wVCallBackContext.error(new r("解析params为空"));
                    return;
                }
                Map<String, UMFRaxJSBridgeWriteBackParamsData> map = uMFRaxJSBridgeWriteBackParams.data;
                if (map == null || map.isEmpty()) {
                    wVCallBackContext.error(new r("params中data为空"));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, UMFRaxJSBridgeWriteBackParamsData> entry : map.entrySet()) {
                    com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
                    aVar.b = entry.getKey();
                    aVar.d.f2137a = entry.getValue().fields;
                    aVar.c.f2137a = aVar.d.f2137a;
                    aVar.f2839a = RuleType.PROPS_WRITE_BACK;
                    arrayList.add(aVar);
                }
                doWriteBack(new UMFRuleIO(arrayList), wVCallBackContext);
                wVCallBackContext.success(r.RET_SUCCESS);
            } catch (Throwable th) {
                String str2 = "解析数据出错,errorMsg=" + th.getMessage();
                wVCallBackContext.error(new r(str2));
                bqe.a().c("RaxJSBridgeApiPlugin", "execute#" + str2);
            }
        }
    }

    private void getData(WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe64", new Object[]{this, wVCallBackContext});
            return;
        }
        AURARenderComponent a2 = this.mRenderComponentGetter.a("");
        if (a2 != null && (jSONObject = a2.protocol) != null) {
            wVCallBackContext.success(jSONObject.toJSONString());
        } else {
            wVCallBackContext.error(new r("组件协议信息不存在，请找客户端同学排查"));
        }
    }

    private void triggerEvent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4ad090", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error(new r("params参数为空，请确保传参了"));
        } else {
            try {
                UMFRaxRenderEventParams uMFRaxRenderEventParams = (UMFRaxRenderEventParams) JSON.parseObject(str, UMFRaxRenderEventParams.class);
                if (uMFRaxRenderEventParams == null) {
                    wVCallBackContext.error(new r("解析params报错，数据为空"));
                } else if (uMFRaxRenderEventParams.eventPayload == null || uMFRaxRenderEventParams.eventPayload.isEmpty()) {
                    wVCallBackContext.error(new r("eventPayload为空"));
                } else {
                    String str2 = uMFRaxRenderEventParams.componentKey;
                    if (StringUtils.isEmpty(str2)) {
                        wVCallBackContext.error(new r("componentKey为空"));
                        return;
                    }
                    doTriggerEvent(uMFRaxRenderEventParams.eventPayload, this.mRenderComponentGetter.a(str2), uMFRaxRenderEventParams.event, wVCallBackContext);
                    wVCallBackContext.success(r.RET_SUCCESS);
                }
            } catch (Throwable th) {
                bsu.a("UMFFramework", UMF_JS_BRIDGE_CLASS_NAME, "rax", th.getMessage());
                wVCallBackContext.error(new r("解析params报错，error=" + th.getMessage()));
            }
        }
    }
}
