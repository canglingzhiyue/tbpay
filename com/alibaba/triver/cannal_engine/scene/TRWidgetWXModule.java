package com.alibaba.triver.cannal_engine.scene;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(674973183);
    }

    @JSMethod
    public void requestWidgetInfos(JSONObject jSONObject, final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14134b7", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else {
            ((TRWidgetInfoGetter) RVProxy.get(TRWidgetInfoGetter.class)).request(jSONObject, true, new TRWidgetInfoGetter.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetWXModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                public void a(JSONArray jSONArray) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                    } else if (jSCallback == null) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", (Object) jSONArray);
                        jSCallback.invoke(jSONObject2);
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else if (jSCallback2 == null) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorCode", (Object) str);
                        jSONObject2.put("errorMsg", (Object) str2);
                        jSONObject2.put(InputFrame3.TYPE_RESPONSE, (Object) str3);
                        jSCallback2.invoke(jSONObject2);
                    }
                }
            });
        }
    }
}
