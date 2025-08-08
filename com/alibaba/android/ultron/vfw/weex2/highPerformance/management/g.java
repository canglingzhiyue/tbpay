package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import tb.abm;
import tb.iro;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class g implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private abm f2779a;

    static {
        kge.a(-1904058002);
        kge.a(718836347);
        kge.a(1900527407);
    }

    public g(abm abmVar) {
        this.f2779a = abmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        switch (str.hashCode()) {
            case -2096025532:
                if (str.equals(UltronTradeHybridStage.ON_MTOP_END)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1701402653:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_END)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1012605245:
                if (str.equals(UltronTradeHybridStage.ON_NAV)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -961315111:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_START)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -359179046:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_CREATE)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 58688523:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 72234379:
                if (str.equals(UltronTradeHybridStage.ON_MTOP_START)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 263594596:
                if (str.equals(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 285075351:
                if (str.equals(UltronTradeHybridStage.ON_DATA_PRE_LOAD)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776409915:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLLING)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1093956882:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_END)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1347699050:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_START)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                a(str2, jSONObject, UltronTradeHybridStage.ON_NAV);
                return;
            case 1:
                a(str2, jSONObject, UltronTradeHybridStage.ON_MTOP_START);
                return;
            case 2:
                a(str2, jSONObject, UltronTradeHybridStage.ON_MTOP_END);
                return;
            case 3:
                a(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_START);
                return;
            case 4:
                a(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_END);
                return;
            case 5:
                a(str2, jSONObject, UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER);
                return;
            case 6:
                a(str2, jSONObject, UltronTradeHybridStage.ON_DATA_PRE_LOAD);
                return;
            case 7:
                a(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_CREATE);
                return;
            case '\b':
                a(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_RESUME);
                return;
            case '\t':
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLL_START", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_START);
                    return;
                }
            case '\n':
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLLING", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLLING);
                    return;
                }
            case 11:
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestFrontEndManager", "ON_VIEW_SCROLL_END", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_END);
                    return;
                }
            default:
                jqg.a("UltronTradeHybridPreRequestFrontEndManager", "onStage", "unknown stage");
                return;
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : iro.b(str);
    }

    private void a(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490e348", new Object[]{this, str, jSONObject, str2});
        } else if (!a(str, null)) {
            jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("%s switcher is off", str));
        } else {
            abm abmVar = this.f2779a;
            if (abmVar == null) {
                jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: mConfig is null", str, str2));
                return;
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
            if (b == null || b.d == null) {
                jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: sceneModel or sceneModel.preRequestFrontEndModels is null", str, str2));
                return;
            }
            for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.g gVar : b.d) {
                if (gVar != null) {
                    if (!StringUtils.equals(gVar.c, str2)) {
                        jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: no match stage", str, str2));
                    } else if (StringUtils.isEmpty(gVar.b)) {
                        jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: frontEndUrl is empty", str, str2));
                    } else {
                        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = this.f2779a.c(gVar.b);
                        if (c == null) {
                            jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: preRenderModel is null", str, str2));
                        } else {
                            if (jSONObject != null && jSONObject.containsKey("context")) {
                                jSONObject.remove("context");
                            }
                            Object b2 = a.a().b(c.b);
                            if (b2 instanceof String) {
                                a.a().a(b2, jSONObject);
                                jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: backgroundPreRenderInstance is not ready(instance is string)", str, str2));
                            } else if (!(b2 instanceof p)) {
                                jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: backgroundPreRenderInstance is null", str, str2));
                            } else {
                                p pVar = (p) b2;
                                com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c b3 = com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c.b(pVar);
                                if (b3 == null || !b3.c()) {
                                    a.a().a(pVar, jSONObject);
                                    jqg.b("UltronTradeHybridPreRequestFrontEndManager.launchPreRequestByScene", String.format("onFailure: %s_%s: backgroundPreRenderInstance is not ready", str, str2));
                                } else {
                                    pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", jSONObject);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
