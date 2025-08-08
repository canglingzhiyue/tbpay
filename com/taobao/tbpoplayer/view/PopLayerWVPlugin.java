package com.taobao.tbpoplayer.view;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.jsbridge.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONTokener;
import tb.kge;

/* loaded from: classes9.dex */
public class PopLayerWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.tbpoplayer.view.jsbridge.a mJsBridgeAction;
    private final WeakReference<PopLayerBaseView> viewWeakReference;

    static {
        kge.a(-1585650770);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWVPlugin popLayerWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PopLayerWVPlugin(PopLayerBaseView popLayerBaseView) {
        this.viewWeakReference = new WeakReference<>(popLayerBaseView);
        this.mJsBridgeAction = new com.taobao.tbpoplayer.view.jsbridge.a(popLayerBaseView);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        long j2;
        long j3;
        long j4;
        JSONObject parseObject;
        String string;
        String str7 = "commonJsClose";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            PopLayerBaseView popLayerBaseView = this.viewWeakReference.get();
            if (popLayerBaseView == null) {
                return false;
            }
            String str8 = null;
            if ("close".equals(str)) {
                try {
                    parseObject = JSON.parseObject(str2);
                    string = parseObject.getString("reason");
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    str4 = parseObject.getString("errorMessage");
                    try {
                        str5 = parseObject.getString("errorInfo");
                        try {
                            str6 = parseObject.getString("userResult");
                            try {
                                if (!StringUtils.isEmpty(string)) {
                                    str7 = string;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str7 = string;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str7 = string;
                            str3 = null;
                            str6 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str7 = string;
                        str3 = null;
                        str5 = null;
                        str6 = str5;
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                        com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                        this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                        return true;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str7 = string;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = str5;
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                    com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                    this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                    return true;
                }
                try {
                    if (StringUtils.isEmpty(str4)) {
                        str4 = null;
                    }
                    if (StringUtils.isEmpty(str5)) {
                        str5 = null;
                    }
                    str3 = parseObject.getString("contentId");
                } catch (Throwable th6) {
                    th = th6;
                    str3 = null;
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                    com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                    this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                    return true;
                }
                try {
                    j2 = parseObject.getLongValue("prepareCostTime");
                    try {
                        j4 = parseObject.getLongValue("requestCostTime");
                        try {
                            j = parseObject.getLongValue("loadMaterialCostTime");
                        } catch (Throwable th7) {
                            th = th7;
                            j = 0;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j = 0;
                        j3 = 0;
                        j4 = 0;
                        com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                        this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                        return true;
                    }
                    try {
                        j3 = parseObject.getLongValue("mtopCostTime");
                    } catch (Throwable th9) {
                        th = th9;
                        j3 = 0;
                        com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                        this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                        return true;
                    }
                    try {
                        str8 = parseObject.getString("onePopExtras");
                    } catch (Throwable th10) {
                        th = th10;
                        com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                        this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                        return true;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                    com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.close.parseParam.error.", th);
                    this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                    return true;
                }
                this.mJsBridgeAction.a(str7, str4, str5, str8, str6, str3, j2, j4, j, j3, generateCallBack(wVCallBackContext));
                return true;
            } else if ("navToUrl".equals(str)) {
                com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.jsNavToUrl?params=%s", str2);
                JSONObject parseObject2 = JSON.parseObject(str2);
                String string2 = parseObject2.getString("url");
                String string3 = parseObject2.getString("jumpMode");
                boolean booleanValue = parseObject2.getBooleanValue("openNewPage");
                popLayerBaseView.setUserResultInTrack(parseObject2.getString("userResult"), false, null);
                a.InterfaceC0922a generateCallBack = generateCallBack(wVCallBackContext);
                if (!this.mJsBridgeAction.a(string2, string3, generateCallBack)) {
                    if (booleanValue) {
                        if (popLayerBaseView instanceof PopLayerWebView) {
                            this.mJsBridgeAction.a(parseObject2.toJSONString(), ((PopLayerWebView) popLayerBaseView).getWebView(), string2, generateCallBack);
                        }
                    } else {
                        this.mJsBridgeAction.a(string2, generateCallBack);
                    }
                }
                return true;
            } else if ("increaseReadTimes".equals(str)) {
                this.mJsBridgeAction.b(generateCallBack(wVCallBackContext));
                return true;
            } else if ("finishPop".equals(str)) {
                this.mJsBridgeAction.c(generateCallBack(wVCallBackContext));
                return true;
            } else if ("setModalThreshold".equals(str)) {
                this.mJsBridgeAction.a(((org.json.JSONObject) new JSONTokener(str2).nextValue()).getDouble("modalThreshold"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("display".equals(str)) {
                this.mJsBridgeAction.a(generateCallBack(wVCallBackContext));
                return true;
            } else if ("updateMetaConfig".equals(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                this.mJsBridgeAction.a(jSONObject.optString("modalThreshold"), jSONObject.optString("embed"), jSONObject.optString("showCloseBtn"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("getTriggerEventInfo".equals(str)) {
                this.mJsBridgeAction.l(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopLayerVersion".equals(str)) {
                this.mJsBridgeAction.d(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getTimeTravelSec".equals(str)) {
                this.mJsBridgeAction.e(generateCallBack(wVCallBackContext));
                return true;
            } else if ("bindValueToNative".equals(str)) {
                this.mJsBridgeAction.c(new org.json.JSONObject(str2).optString("value"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("readValueFromNative".equals(str)) {
                this.mJsBridgeAction.d(new org.json.JSONObject(str2).optString("key"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopCheckReturn".equals(str)) {
                this.mJsBridgeAction.f(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopConfigInfo".equals(str)) {
                this.mJsBridgeAction.g(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getFrequencyInfo".equals(str)) {
                this.mJsBridgeAction.h(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getLocalCrowdReturn".equals(str)) {
                this.mJsBridgeAction.i(generateCallBack(wVCallBackContext));
                return true;
            } else if ("trackTimeLineCostTime".equals(str)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                this.mJsBridgeAction.a(jSONObject2.optLong("prepareCostTime"), jSONObject2.optLong("requestCostTime"), jSONObject2.optLong("loadMaterialCostTime"), jSONObject2.optLong("mtopCostTime"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("setPopContentId".equals(str)) {
                this.mJsBridgeAction.e(new org.json.JSONObject(str2).optString("contentId"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("putOnePopExtras".equals(str)) {
                this.mJsBridgeAction.f(new org.json.JSONObject(str2).optString("onePopExtras"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("recordUserBehavior".equals(str)) {
                this.mJsBridgeAction.g(JSON.parseObject(str2).getString("userResult"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("addPageEventListen".equals(str)) {
                JSONObject parseObject3 = JSON.parseObject(str2);
                this.mJsBridgeAction.b(parseObject3.getString("sourceName"), parseObject3.getString("events"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("removePageEventListen".equals(str)) {
                JSONObject parseObject4 = JSON.parseObject(str2);
                this.mJsBridgeAction.c(parseObject4.getString("sourceName"), parseObject4.getString("events"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("removeAllPageEventListen".equals(str)) {
                this.mJsBridgeAction.j(generateCallBack(wVCallBackContext));
                return true;
            } else if ("preRenderUrl".equals(str)) {
                JSONObject parseObject5 = JSON.parseObject(str2);
                this.mJsBridgeAction.a(parseObject5.getString("bizName"), parseObject5.getJSONObject("task"), generateCallBack(wVCallBackContext));
                return true;
            } else if (!"setClickableArea".equals(str)) {
                return false;
            } else {
                JSONObject parseObject6 = JSON.parseObject(str2);
                this.mJsBridgeAction.a(parseObject6.getString("enable"), parseObject6.getString("width"), parseObject6.getString("height"), parseObject6.getString("layout"), parseObject6.getString("left"), parseObject6.getString("right"), parseObject6.getString("top"), parseObject6.getString("bottom"), generateCallBack(wVCallBackContext));
                return true;
            }
        } catch (Throwable th12) {
            com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.error", th12);
            return false;
        }
    }

    private a.InterfaceC0922a generateCallBack(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0922a) ipChange.ipc$dispatch("3ed60c92", new Object[]{this, wVCallBackContext}) : new a.InterfaceC0922a() { // from class: com.taobao.tbpoplayer.view.PopLayerWVPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                try {
                    if (wVCallBackContext == null) {
                        return;
                    }
                    if (StringUtils.isEmpty(str)) {
                        wVCallBackContext.success();
                    } else {
                        wVCallBackContext.success(str);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                try {
                    if (wVCallBackContext == null) {
                        return;
                    }
                    r rVar = new r();
                    rVar.a(new org.json.JSONObject(map));
                    wVCallBackContext.success(rVar);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                try {
                    if (wVCallBackContext == null) {
                        return;
                    }
                    if (StringUtils.isEmpty(str)) {
                        wVCallBackContext.error();
                    } else {
                        wVCallBackContext.error(str);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
    }
}
