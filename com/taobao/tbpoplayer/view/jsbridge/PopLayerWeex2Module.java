package com.taobao.tbpoplayer.view.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tbpoplayer.view.PopLayerWeex2View;
import com.taobao.tbpoplayer.view.jsbridge.a;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.qnv;

/* loaded from: classes9.dex */
public class PopLayerWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a mJsBridgeAction;

    static {
        kge.a(-1440350724);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWeex2Module popLayerWeex2Module, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PopLayerWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mJsBridgeAction = new a((PopLayerWeex2View) getInstance().getTag(PopLayerWeex2View.WEEX_TAG_KEY));
    }

    @MUSMethod(uiThread = true)
    public void display(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b809d875", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.a(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "display.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void close(JSONObject jSONObject, b bVar, b bVar2) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16216eff", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("reason");
                string2 = jSONObject.getString("errorMessage");
                string3 = jSONObject.getString("errorInfo");
                String string9 = jSONObject.getString("contentId");
                string4 = jSONObject.getString("prepareCostTime");
                string5 = jSONObject.getString("requestCostTime");
                string6 = jSONObject.getString("loadMaterialCostTime");
                string7 = jSONObject.getString("mtopCostTime");
                String string10 = jSONObject.getString("onePopExtras");
                string8 = jSONObject.getString("userResult");
                str = string9;
                str2 = string10;
            } catch (Throwable th) {
                dealException(th, "close.error", bVar2);
                return;
            }
        } else {
            string = null;
            string2 = null;
            string3 = null;
            string4 = null;
            string5 = null;
            string6 = null;
            string7 = null;
            str2 = null;
            string8 = null;
            str = null;
        }
        if (TextUtils.isEmpty(string)) {
            string = "commonJsClose";
        }
        String str3 = string;
        String str4 = TextUtils.isEmpty(string2) ? null : string2;
        String str5 = TextUtils.isEmpty(string3) ? null : string3;
        long j = 0;
        long parseLong = !TextUtils.isEmpty(string4) ? Long.parseLong(string4) : 0L;
        long parseLong2 = !TextUtils.isEmpty(string5) ? Long.parseLong(string5) : 0L;
        long parseLong3 = !TextUtils.isEmpty(string6) ? Long.parseLong(string6) : 0L;
        if (!TextUtils.isEmpty(string7)) {
            j = Long.parseLong(string7);
        }
        this.mJsBridgeAction.a(str3, str4, str5, str2, string8, str, parseLong, parseLong2, parseLong3, j, generateCallBack(bVar, bVar2));
    }

    @MUSMethod(uiThread = true)
    public void navToUrl(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4d9e06", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            PopLayerWeex2View popLayerWeex2View = (PopLayerWeex2View) getInstance().getTag(PopLayerWeex2View.WEEX_TAG_KEY);
            if (popLayerWeex2View == null) {
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(new Object[0]);
            } else if (jSONObject == null) {
                if (bVar2 == null) {
                    return;
                }
                bVar2.a("urlEmpty");
            } else {
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("jumpMode");
                boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("openNewPage"));
                popLayerWeex2View.setUserResultInTrack(jSONObject.getString("userResult"), false, null);
                a.InterfaceC0922a generateCallBack = generateCallBack(bVar, bVar2);
                if (this.mJsBridgeAction.a(string, string2, generateCallBack)) {
                    return;
                }
                if (parseBoolean) {
                    this.mJsBridgeAction.a(JSON.toJSONString(jSONObject), new qnv(getInstance().getUIContext(), popLayerWeex2View, new HashMap(), ""), string, generateCallBack);
                } else {
                    this.mJsBridgeAction.a(string, generateCallBack);
                }
            }
        } catch (Throwable th) {
            dealException(th, "navToUrl.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void increaseReadTimes(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40895189", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.b(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "increaseReadTimes.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void finishPop(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b111f9", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.c(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "finishPop.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setModalThreshold(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aece0b7", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.a(Double.parseDouble(jSONObject.getString("modalThreshold")), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "setModalThreshold.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void updateMetaConfig(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9af0a7", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.a(jSONObject.getString("modalThreshold"), jSONObject.getString("embed"), jSONObject.getString("showCloseBtn"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "updateMetaConfig.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getTriggerEventInfo(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2de8b1", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.l(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getTriggerEventInfo.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopLayerVersion(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83088035", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.d(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getPopLayerVersion.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getTimeTravelSec(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58983a3", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.e(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getTimeTravelSec.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void bindValueToNative(JSONObject jSONObject, final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352821f1", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.c(jSONObject.getString("value"), new a.b() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerWeex2Module.1
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
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    super.a(map);
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(new JSONObject(map).toJSONString());
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    super.a(str);
                    b bVar3 = bVar2;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a(str);
                }
            });
        } catch (Throwable th) {
            dealException(th, "bindValueToNative.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void readValueFromNative(JSONObject jSONObject, final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af2933b", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.d(jSONObject.getString("key"), new a.b() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerWeex2Module.2
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
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    super.a(map);
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(new JSONObject(map).toJSONString());
                }

                @Override // com.taobao.tbpoplayer.view.jsbridge.a.b, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    super.a(str);
                    b bVar3 = bVar2;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a(str);
                }
            });
        } catch (Throwable th) {
            dealException(th, "readValueFromNative.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopCheckReturn(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4780cda", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.f(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getPopCheckReturn.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopConfigInfo(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bdf94c", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.g(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getPopConfigInfo.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getFrequencyInfo(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71df203", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.h(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getFrequencyInfo.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getLocalCrowdReturn(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863f13af", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.i(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "getLocalCrowdReturn.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void trackTimeLineCostTime(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8b2891", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            String string = jSONObject.getString("prepareCostTime");
            String string2 = jSONObject.getString("requestCostTime");
            String string3 = jSONObject.getString("loadMaterialCostTime");
            String string4 = jSONObject.getString("mtopCostTime");
            long j = 0;
            long parseLong = !TextUtils.isEmpty(string) ? Long.parseLong(string) : 0L;
            long parseLong2 = !TextUtils.isEmpty(string2) ? Long.parseLong(string2) : 0L;
            long parseLong3 = !TextUtils.isEmpty(string3) ? Long.parseLong(string3) : 0L;
            if (!TextUtils.isEmpty(string4)) {
                j = Long.parseLong(string4);
            }
            this.mJsBridgeAction.a(parseLong, parseLong2, parseLong3, j, generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "trackTimeLineCostTime.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setPopContentId(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3167a72", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.e(jSONObject.getString("contentId"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "setPopContentId.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void putOnePopExtras(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b450a1a", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.f(jSONObject.getString("onePopExtras"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "putOnePopExtras.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void recordUserBehavior(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de06b289", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.g(jSONObject.getString("userResult"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "recordUserBehavior.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void addPageEventListen(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbefb86", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.b(jSONObject.getString("sourceName"), jSONObject.getString("events"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "addPageEventListen.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void removePageEventListen(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20978ee9", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.c(jSONObject.getString("sourceName"), jSONObject.getString("events"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "removePageEventListen.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void removeAllPageEventListen(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29ae362", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.j(generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "removeAllPageEventListen.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void preRenderUrl(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c11121", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.a(jSONObject.getString("bizName"), jSONObject.getJSONObject("task"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "preRenderUrl.error", bVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setClickableArea(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a67ca", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            this.mJsBridgeAction.a(jSONObject.getString("enable"), jSONObject.getString("width"), jSONObject.getString("height"), jSONObject.getString("layout"), jSONObject.getString("left"), jSONObject.getString("right"), jSONObject.getString("top"), jSONObject.getString("bottom"), generateCallBack(bVar, bVar2));
        } catch (Throwable th) {
            dealException(th, "setClickableArea.error", bVar2);
        }
    }

    private a.InterfaceC0922a generateCallBack(final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0922a) ipChange.ipc$dispatch("f1176d83", new Object[]{this, bVar, bVar2}) : new a.InterfaceC0922a() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerWeex2Module.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a(str);
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a(map);
            }

            @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                b bVar3 = bVar2;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a(str);
            }
        };
    }

    private void dealException(Throwable th, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9174d78c", new Object[]{this, th, str, bVar});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a(str, th);
            if (bVar == null) {
                return;
            }
            bVar.a(new Object[0]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
