package com.taobao.tbpoplayer.view;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.utils.ConsoleLogger;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.jsbridge.a;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.qoc;

/* loaded from: classes9.dex */
public class PopLayerTrackingEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.tbpoplayer.view.jsbridge.a mJsBridgeAction;

    static {
        kge.a(815924243);
    }

    public static /* synthetic */ Object ipc$super(PopLayerTrackingEventModule popLayerTrackingEventModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private com.taobao.tbpoplayer.view.jsbridge.a getJsBridgeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbpoplayer.view.jsbridge.a) ipChange.ipc$dispatch("bf1121b6", new Object[]{this});
        }
        if (this.mJsBridgeAction == null) {
            this.mJsBridgeAction = new com.taobao.tbpoplayer.view.jsbridge.a(findRootView());
        }
        return this.mJsBridgeAction;
    }

    @WXModuleAnno
    public void display(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e70c21c", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().a(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "display.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void close(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddd5a6", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        if (map != null) {
            try {
                str = map.get("reason");
                str2 = map.get("errorMessage");
                str3 = map.get("errorInfo");
                str4 = map.get("prepareCostTime");
                str5 = map.get("requestCostTime");
                str6 = map.get("loadMaterialCostTime");
                str7 = map.get("mtopCostTime");
                str8 = map.get("userResult");
                str9 = map.get("contentId");
                str10 = map.get("onePopExtras");
            } catch (Throwable th) {
                dealException(th, "close.error", jSCallback2);
                return;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str10 = null;
            str8 = null;
            str9 = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "commonJsClose";
        }
        String str11 = str;
        String str12 = TextUtils.isEmpty(str2) ? null : str2;
        String str13 = TextUtils.isEmpty(str3) ? null : str3;
        long j = 0;
        long parseLong = !TextUtils.isEmpty(str4) ? Long.parseLong(str4) : 0L;
        long parseLong2 = !TextUtils.isEmpty(str5) ? Long.parseLong(str5) : 0L;
        long parseLong3 = !TextUtils.isEmpty(str6) ? Long.parseLong(str6) : 0L;
        if (!TextUtils.isEmpty(str7)) {
            j = Long.parseLong(str7);
        }
        getJsBridgeAction().a(str11, str12, str13, str10, str8, str9, parseLong, parseLong2, parseLong3, j, generateCallBack(jSCallback, jSCallback2));
    }

    @WXModuleAnno
    public void navToUrl(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80647c2d", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            PopLayerWeexView findRootView = findRootView();
            if (findRootView == null) {
                if (jSCallback2 == null) {
                    return;
                }
                jSCallback2.invoke(null);
            } else if (map == null) {
                if (jSCallback2 == null) {
                    return;
                }
                jSCallback2.invoke("urlEmpty");
            } else {
                String str = map.get("url");
                boolean parseBoolean = Boolean.parseBoolean(map.get("openNewPage"));
                findRootView.setUserResultInTrack(map.get("userResult"), false, null);
                a.InterfaceC0922a generateCallBack = generateCallBack(jSCallback, jSCallback2);
                if (getJsBridgeAction().a(str, map.get("jumpMode"), generateCallBack)) {
                    return;
                }
                if (parseBoolean) {
                    getJsBridgeAction().a(JSON.toJSONString(map), (IWVWebView) new com.alibaba.aliweex.adapter.module.c(this.mWXSDKInstance), str, generateCallBack);
                } else {
                    getJsBridgeAction().a(str, generateCallBack);
                }
            }
        } catch (Throwable th) {
            dealException(th, "navToUrl.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void increaseReadTimes(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d13530", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().b(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "increaseReadTimes.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void finishPop(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc86da0", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().c(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "finishPop.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void setModalThreshold(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bbc35e", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().a(Double.parseDouble(map.get("modalThreshold")), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setModalThreshold.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void updateMetaConfig(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eb0b4e", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(map);
            getJsBridgeAction().a(jSONObject.optString("modalThreshold"), jSONObject.optString("embed"), jSONObject.optString("showCloseBtn"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "updateMetaConfig.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void selectAndOperate(String str, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc7131a", new Object[]{this, str, jSCallback, jSCallback2});
        } else if (jSCallback2 == null) {
        } else {
            try {
                jSCallback2.invoke("notSupported");
            } catch (Throwable th) {
                dealException(th, "selectAndOperate.error", jSCallback2);
            }
        }
    }

    @WXModuleAnno
    public void getTriggerEventInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a64058", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().l(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getTriggerEventInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopLayerVersion(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8849dc", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().d(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopLayerVersion.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void fireEvent(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4efb1a", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 == null) {
        } else {
            try {
                jSCallback2.invoke(null);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("fireEvent error", th);
            }
        }
    }

    @WXModuleAnno
    public void operateTrackingView(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2900efe", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 == null) {
        } else {
            try {
                jSCallback2.invoke(null);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("operateTrackingView error", th);
            }
        }
    }

    @WXModuleAnno
    public void getTimeTravelSec(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3556c4a", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().e(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getTimeTravelSec.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void bindValueToNative(Map<String, String> map, final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae41998", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().c(map.get("value"), new a.b() { // from class: com.taobao.tbpoplayer.view.PopLayerTrackingEventModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -207205326) {
                        super.a((String) objArr[0]);
                        return null;
                    } else if (hashCode != 1514279453) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.a((Map) objArr[0]);
                        return null;
                    }
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(Map<String, Object> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map2});
                        return;
                    }
                    super.a(map2);
                    if (jSCallback == null) {
                        return;
                    }
                    jSCallback.invoke(new com.alibaba.fastjson.JSONObject(map2).toJSONString());
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    super.a(str);
                    JSCallback jSCallback3 = jSCallback2;
                    if (jSCallback3 == null) {
                        return;
                    }
                    jSCallback3.invoke(str);
                }
            });
        } catch (Throwable th) {
            dealException(th, "bindValueToNative.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void readValueFromNative(Map<String, String> map, final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba67e2", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().d(map.get("key"), new a.b() { // from class: com.taobao.tbpoplayer.view.PopLayerTrackingEventModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -207205326) {
                        super.a((String) objArr[0]);
                        return null;
                    } else if (hashCode != 1514279453) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.a((Map) objArr[0]);
                        return null;
                    }
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(Map<String, Object> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map2});
                        return;
                    }
                    super.a(map2);
                    if (jSCallback == null) {
                        return;
                    }
                    jSCallback.invoke(new com.alibaba.fastjson.JSONObject(map2).toJSONString());
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    super.a(str);
                    JSCallback jSCallback3 = jSCallback2;
                    if (jSCallback3 == null) {
                        return;
                    }
                    jSCallback3.invoke(str);
                }
            });
        } catch (Throwable th) {
            dealException(th, "readValueFromNative.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopCheckReturn(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d97c501", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().f(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopCheckReturn.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopConfigInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebc0273", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().g(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopConfigInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getFrequencyInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99318aaa", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().h(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getFrequencyInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getLocalCrowdReturn(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6081256", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().i(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getLocalCrowdReturn.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void trackTimeLineCostTime(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1515f038", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            String str = map.get("prepareCostTime");
            String str2 = map.get("requestCostTime");
            String str3 = map.get("loadMaterialCostTime");
            String str4 = map.get("mtopCostTime");
            long j = 0;
            long parseLong = !TextUtils.isEmpty(str) ? Long.parseLong(str) : 0L;
            long parseLong2 = !TextUtils.isEmpty(str2) ? Long.parseLong(str2) : 0L;
            long parseLong3 = !TextUtils.isEmpty(str3) ? Long.parseLong(str3) : 0L;
            if (!TextUtils.isEmpty(str4)) {
                j = Long.parseLong(str4);
            }
            getJsBridgeAction().a(parseLong, parseLong2, parseLong3, j, generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "trackTimeLineCostTime.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void setPopContentId(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c891e99", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().e(map.get("contentId"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setPopContentId.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopTemplatePageConfig(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851ae618", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 == null) {
        } else {
            try {
                jSCallback2.invoke("notSupport");
            } catch (Throwable th) {
                dealException(th, "getPopTemplatePageConfig.error", jSCallback2);
            }
        }
    }

    @WXModuleAnno
    public void putOnePopExtras(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ba6241", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().f(map.get("onePopExtras"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "putOnePopExtras.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void recordUserBehavior(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeb1630", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().g(map.get("userResult"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "recordUserBehavior.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void addPageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf699ad", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().b(map.get("sourceName"), map.get("events"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "addPageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void removePageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a62a290", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().c(map.get("sourceName"), map.get("events"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "removePageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void removeAllPageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b473f89", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().j(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "removeAllPageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void preRenderUrl(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19ce0c8", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().a(map.get("bizName"), JSON.parseObject(map.get("task")), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "preRenderUrl.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void setClickableArea(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4d7f1", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            this.mJsBridgeAction.a(map.get("enable"), map.get("width"), map.get("height"), map.get("layout"), map.get("left"), map.get("right"), map.get("top"), map.get("bottom"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setClickableArea.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void consoleLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c13ad3e", new Object[]{this, str});
            return;
        }
        PopLayerWeexView findRootView = findRootView();
        if (findRootView == null) {
            return;
        }
        findRootView.consoleLog(str, ConsoleLogger.Level.I);
    }

    private PopLayerWeexView findRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerWeexView) ipChange.ipc$dispatch("be5435d6", new Object[]{this});
        }
        if (this.mWXSDKInstance == null || !(this.mWXSDKInstance instanceof qoc)) {
            return null;
        }
        return (PopLayerWeexView) g.a(((qoc) this.mWXSDKInstance).f32972a);
    }

    private a.InterfaceC0922a generateCallBack(final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0922a) ipChange.ipc$dispatch("aee57b15", new Object[]{this, jSCallback, jSCallback2}) : new a.InterfaceC0922a() { // from class: com.taobao.tbpoplayer.view.PopLayerTrackingEventModule.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                JSCallback jSCallback3 = jSCallback;
                if (jSCallback3 == null) {
                    return;
                }
                jSCallback3.invoke(str);
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                JSCallback jSCallback3 = jSCallback;
                if (jSCallback3 == null) {
                    return;
                }
                jSCallback3.invoke(map);
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                JSCallback jSCallback3 = jSCallback2;
                if (jSCallback3 == null) {
                    return;
                }
                jSCallback3.invoke(str);
            }
        };
    }

    private void dealException(Throwable th, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88b3173", new Object[]{this, th, str, jSCallback});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a(str, th);
            if (jSCallback == null) {
                return;
            }
            jSCallback.invoke(null);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
