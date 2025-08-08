package com.alibaba.triver.cannal_engine.scene;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.flat.widget.Widget;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetJsPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TRWidgetJsPlugin";

    static {
        kge.a(2064648014);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        final JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null || wVCallBackContext.getWebview() == null) {
            RVLogger.e(TAG, "execute: wvCallBackContext is null");
            return false;
        } else if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("invalid action");
            RVLogger.e(TAG, "execute: action is null");
            return false;
        } else {
            try {
                jSONObject = JSONObject.parseObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            char c = 65535;
            if (str.hashCode() == -408057966 && str.equals("requestWidgetInfos")) {
                c = 0;
            }
            if (c != 0) {
                return false;
            }
            try {
                com.alibaba.android.triver.base.api.b.a(Widget.TAG, "", ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, wVCallBackContext.getWebview().getContext(), new ITriverRemoteProxy.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            ((TRWidgetInfoGetter) RVProxy.get(TRWidgetInfoGetter.class)).request(jSONObject, true, new TRWidgetInfoGetter.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                                public void a(JSONArray jSONArray) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                                        return;
                                    }
                                    r rVar = new r();
                                    rVar.a("result", jSONArray);
                                    wVCallBackContext.success(rVar);
                                }

                                @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
                                public void a(String str3, String str4, String str5) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                                    } else {
                                        wVCallBackContext.error(str4);
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        } else {
                            wVCallBackContext.error("Invalid implementation");
                        }
                    }
                });
            } catch (Throwable th) {
                RVLogger.e(TAG, th);
                wVCallBackContext.error("Invalid implementation");
            }
            return true;
        }
    }
}
